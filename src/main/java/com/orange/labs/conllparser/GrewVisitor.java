/* This library is under the 3-Clause BSD License

Copyright (c) 2018-2023, Orange S.A.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  1. Redistributions of source code must retain the above copyright notice,
     this list of conditions and the following disclaimer.

  2. Redistributions in binary form must reproduce the above copyright notice,
     this list of conditions and the following disclaimer in the documentation
     and/or other materials provided with the distribution.

  3. Neither the name of the copyright holder nor the names of its contributors
     may be used to endorse or promote products derived from this software without
     specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 @author Johannes Heinecke
 @version 2.20.0 as of 15th January 2023
 */
package com.orange.labs.conllparser;

import com.orange.labs.conllparser.GrewmatchParser.DeprelContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GrewVisitor extends GrewmatchBaseVisitor<Boolean> {

    //ConllWord cword = null; // all conditions are checked on this word
    //ConllWord pointedWord = null; // child/head etc are followed here
    int level = 0; // -1 head, -2 head's head
    int sequence = 0; // -1 word to the left, 1 word to the right etc

    Map<String, Node> nodes; // id: Node
    List<Map<String, Rel>> relations; // dep: Rel each map are AND combined, each list element OR
    Map<String, Rel> localrelations; // dep: Rel each map are AND combined, each list element OR
    Node curnode = null;
    Rel currel = null;
    Map<String, String> identicalnodes;
    Map<String, String> differentnodes;

    Map<String, Set<String>> wordlists; // stores lists for Form and Lemma: "filename": (words)
    Map<String, String> before;
    Map<String, String> strictlybefore;

    List<Compare> equals;

    boolean without = false; // whether or not we parse "without" expressions

    List<String> globals;

    public GrewVisitor(//ConllWord cword,
            Map<String, Set<String>> wordlists) {
        //this.cword = cword;
        //pointedWord = cword;
        this.wordlists = wordlists;
        nodes = new TreeMap<>();
        relations = new ArrayList<>();

        identicalnodes = new HashMap<>();
        differentnodes = new HashMap<>();
        before = new HashMap<>();
        strictlybefore = new HashMap<>();
        globals = new ArrayList<>();
        equals = new ArrayList<>();
    }

    // TODO put into CheckGrewmatch ?
    // TODO optimize
    public List<List<ConllWord>> match(ConllSentence csent) throws ConllException {
        final boolean debug = true;

        List<List<ConllWord>> final_node_combinations = new ArrayList<>();
        if (!globals.isEmpty()) {
            for (String gl : globals) {
                if ("is_not_projective".equals(gl)) {
                    // sentence must not be projective
                    List<ConllWord> unproj = new ArrayList<>();
                    boolean rtc = csent.isProjective(unproj);
                    if (!rtc) {

                        final_node_combinations.add(unproj);
                        //return final_node_combinations;
                    } else {
                        return null;
                    }
                } else if ("is_projective".equals(gl)) {
                    boolean rtc = csent.isProjective(null);
                    if (rtc) {
                        List<ConllWord> proj = new ArrayList<>();
                        proj.addAll(csent.getWords());
                        final_node_combinations.add(proj);
                        //return final_node_combinations;
                    } else {
                        return null;
                    }
                } else {
                    List<ConllWord> roots = new ArrayList<>();
                    for (ConllWord cw : csent.getWords()) {
                        //System.out.println("qqqq " + cw.getHead() + " " + cw);
                        if (cw.getHead() < 1) roots.add(cw);
                    }

                    if ("is_not_tree".equals(gl)) {
                        if (roots.size() > 1) {
                            final_node_combinations.add(roots);
                            //return final_node_combinations;
                        } else {
                            return null;
                        }
                    } else if ("is_tree".equals(gl)) {
                        if (csent.getHeads().size() == 1) {
                            final_node_combinations.add(roots);
                            //return final_node_combinations;
                        } else {
                            return null; //final_node_combinations;
                        }
                    }
                }
            }
        }

        // find list of nodes which match
        // check whether all relations of query can be established between nodes
        // delete relations if order constraints exist
        // find nodes which match every variable
        Map<String, List<ConllWord>> matchednodes = new TreeMap<>(); // nodename (in rule): CW
        List<ConllWord>allwords = csent.getAllWords();
        ConllWord root = new ConllWord("__0__");
        root.setId(0);

        allwords.add(root);
        for (ConllWord cw : allwords) {
            List<Node> rtc = match(cw);
            for (Node node : rtc) {
                String nodename = node.id;
                List<ConllWord> cws = matchednodes.get(nodename);
                if (cws == null) {
                    cws = new ArrayList<>();
                    matchednodes.put(nodename, cws);
                }
                cws.add(cw);
                //id2node.put(cw.getId(), nodename);
            }
            if (debug) {
                System.out.println("CW " + cw);
                System.out.println("   " + rtc);
            }
        }

        if (debug) {
            System.out.println("MATCHEDNODES " + matchednodes);
        }

        // check whether every nodename matches a CW
        if (matchednodes.size() != nodes.size()) {
            return null;
        }

        if (debug) {
            printmap2(matchednodes);
        }

        List<String> node_order = new ArrayList<>();
        for (String nodename : matchednodes.keySet()) {
            node_order.add(nodename);
        }
        //System.out.println("NODE ORDER " + node_order);
        if (!nodes.isEmpty() && matchednodes.isEmpty()) {
            return null; // nothing found
        }

        // check for all possible combinations of nodes, whether some combinations
        // are impossible due to relation/order constraints
        // first create a list of combinations
        List<List<ConllWord>> node_combinations = new ArrayList<>();
        for (List<ConllWord> lcw : matchednodes.values()) {
            node_combinations.add(lcw);
        }
        node_combinations = cartesianProduct(node_combinations);

        // /*List<List<ConllWord>> */final_node_combinations = new ArrayList<>();
        // List<List<Node>> final_nodes = new ArrayList<>();
        int num_nodes = matchednodes.size();
        //System.out.println("dsd" + num_nodes);

        // do relations and order constraint inhibit a n-tuple of nodes ?
        if (debug) {
            System.out.println("COMBIS " + node_combinations.size());
        }
        for (List<ConllWord> lcw : node_combinations) {
            Set<ConllWord> tmp = new HashSet<>(lcw);
            if (tmp.size() == num_nodes) {
                //System.out.println("COMBINATION");
                Map<String, ConllWord> node2cw = new HashMap<>();
                Map<Integer, String> cw2node = new HashMap<>();
                int i = 0;
                for (ConllWord cw : lcw) {
                    node2cw.put(node_order.get(i), cw);
                    //System.out.println("   " + node_order.get(i) + " " + cw.getFullId());
                    cw2node.put(cw.getId(), node_order.get(i));
                    i++;
                }

                // for all order constraints
                boolean ok = true;
                for (String former : before.keySet()) {
                    String latter = before.get(former);
                    //find CWs associated with nodenames (in current tuple)
                    ConllWord formerid = node2cw.get(former);
                    ConllWord latterid = node2cw.get(latter);
                    if (debug) {
                        System.out.println("ORDER CHECK " + formerid + " " + former + " before " + latterid + " " + latter);
                    }
                    if (formerid.getId() >= latterid.getId()) {
                        ok = false;
                        if (debug) {
                            System.out.println(" ORDER FAILED");
                        }
                        break;
                    }
                    //System.out.println(" TTTT");
                }
                if (!ok) {
                    continue;
                }

                // for all strict order constraints
                for (String former : strictlybefore.keySet()) {
                    String latter = strictlybefore.get(former);
                    //find CWs associated with nodenames (in current tuple)
                    ConllWord formerid = node2cw.get(former);
                    ConllWord latterid = node2cw.get(latter);

                    if (debug) {
                        System.out.println("ORDER CHECK " + formerid + " " + former + " strictlybefore " + latterid + " " + latter);
                    }

                    if (formerid.getId() + 1 != latterid.getId()) {
                        ok = false;
                        if (debug) {
                            System.out.println(" STRICT ORDER FAILED");
                        }
                        break;
                    }
                    //System.out.println(" TTTT");
                }
                if (!ok) {
                    continue;
                }

                // check field comparisons
                for (Compare cp : equals) {
                    if (debug) System.out.println("CONSTRAINT " + cp);
                    Node n1 = nodes.get(cp.node1);
                    if (n1 == null) {
                        throw new ConllException("Identifier " + cp.node1 + " not found");
                    }
                    Node n2 = nodes.get(cp.node2);
                    if (n2 == null) {
                        throw new ConllException("Identifier " + cp.node2 + " not found");
                    }
                    ConllWord cw1 = node2cw.get(n1.id);
                    ConllWord cw2 = node2cw.get(n2.id);
                    //System.out.println("AA1 " + n1.id + " " + cw1);
                    //System.out.println("AA2 " + n2.id + " " + cw2);

                    String val1;
                    switch (cp.field1) {
                        case "upos":
                            val1 = cw1.getUpostag();
                            break;
                        case "xpos":
                            val1 = cw1.getXpostag();
                            break;
                        case "form":
                            val1 = cw1.getForm();
                            break;
                        case "lemma":
                            val1 = cw1.getLemma();
                            break;
                        default:
                            val1 = cw1.getFeatures().get(cp.field1);
                    }
                    if (val1 == null) {
                        ok = false;
                        continue;
                    }
                    String val2;
                    switch (cp.field2) {
                        case "upos":
                            val2 = cw2.getUpostag();
                            break;
                        case "xpos":
                            val2 = cw2.getXpostag();
                            break;
                        case "form":
                            val2 = cw2.getForm();
                            break;
                        case "lemma":
                            val2 = cw2.getLemma();
                            break;
                        default:
                            val2 = cw2.getFeatures().get(cp.field2);
                    }
                    if (val2 == null) {
                        ok = false;
                        continue;
                    }
                    //System.out.println("VALS " + val1 + " " + val2);
                    if (cp.equal != cp.without) {
                        // features must be present and equal
                        if (val1 == null || val2 == null || !val1.endsWith(val2)) {
                            ok = false;
                            continue;
                        }
                    } else {
                        // features must be present and unequal
                        if (val1 == null || val2 == null || val1.endsWith(val2)) {
                            ok = false;
                            continue;
                        }
                    }

                }

                // check relation constraints
                for (Map<String, Rel> m : relations) {
                    // all relation groups must be true
                    // without == true: at least one of the relations in m mist be true
                    boolean allnegok = false;
                    //System.out.println("ABC " + m);
                    for (String rid : m.keySet()) {
                        Rel rel = m.get(rid);
                        ConllWord head = node2cw.get(rel.head);
                        ConllWord dep = node2cw.get(rel.dep);

                        if (debug) {
                            System.out.println("CHECK REL " + rel);
                            System.out.println("  head " + head);
                            System.out.println("  dep  " + dep);
                        }

                        if (!rel.without) {
                            if (dep.getHeadWord() != head && !(dep.getHead() == 0 && (head != null && head.getId() == 0))
                                    ) {
                                // the head is not the head requred
                                ok = false;
                                allnegok = false;
                                if (debug) {
                                    System.out.println("BAD HEAD");
                                }
                                break;
                            }

                            //System.out.println("AAAAAAAAAAA " + rel.deprels + " " + dep.getDeplabel() + " " + rel.notdeprels);
                            if (rel.deprels != null
                                    //&& !rel.deprel.equals(dep.getDeplabel())
                                    && ((!rel.deprels.contains(dep.getDeplabel()) && !rel.notdeprels)
                                    || rel.deprels.contains(dep.getDeplabel()) && rel.notdeprels)) {
                                // dependant does not have the deprel required
                                ok = false;
                                if (debug) {
                                    System.out.println("NOT REQUIRED DEPREL");
                                }
                                break;
                            }
                        } else {
                            // without == true
                            ok = true;
                            if (dep == null) {
                                // no dep node defined as node, so check whether the head does not
                                // have a dependent with forbidden relation
                                for (ConllWord d : head.getDependents()) {
                                    //if (d.getDeplabel().equals(rel.deprel)) {
                                    if (rel.deprels.contains(d.getDeplabel())) {
                                        ok = false;

                                        if (debug) {
                                            System.out.println("FORBIDDEN DEPREL");
                                        }
                                    }
                                }
                            } else if ((dep.getHeadWord() == head || head == null)
                                    && rel.deprels != null
                                    //&& rel.deprel.equals(dep.getDeplabel())
                                    && rel.deprels.contains(dep.getDeplabel())) {
                                // dependant hase the forbidden deprel
                                ok = false;
                                if (debug) {
                                    System.out.println("FORBIDDEN  DEPREL");
                                }
                                break;
                            }
                            if (ok) {
                                //allnegok = true;
                                break;
                            }
                            //System.out.println("ZZZZZZ " + ok + " " + allnegok);
                        }
                    }
                    //System.out.println("ZZZZZZ2 " + ok + " " + allnegok);
                    if (!ok) break;
//                    if (!allnegok) {
//                       continue;
//                    } else {
//                        ok = true;
//                    }
                }
                //System.out.println("zzzzzz " + ok);
                if (!ok) {
                    continue;
                }
                //System.out.println("ADDED " + lcw);
                if (!lcw.isEmpty()) {
                    final_node_combinations.add(lcw);
                }
                //               List<Node> ln = new ArrayList<>();
                //               for (ConllWord cw : lcw) {
                //                   Node nn = new Node();
                //               }

            }
        }

        if (!final_node_combinations.isEmpty()) {
            return final_node_combinations;
        } else {
            return null;
        }
    }

    //https://stackoverflow.com/questions/714108/cartesian-product-of-an-arbitrary-number-of-sets
    private <T> List<List<T>> cartesianProduct(List<List<T>> lists) {
        List<List<T>> resultLists = new ArrayList<>();
        if (lists.isEmpty()) {
            resultLists.add(new ArrayList<>());
            return resultLists;
        } else {
            List<T> firstList = lists.get(0);
            List<List<T>> remainingLists = cartesianProduct(lists.subList(1, lists.size()));
            for (T condition : firstList) {
                for (List<T> remainingList : remainingLists) {
                    ArrayList<T> resultList = new ArrayList<>();
                    resultList.add(condition);
                    resultList.addAll(remainingList);
                    resultLists.add(resultList);
                    //System.out.println("zzzz " + resultList.size() + " " + resultList);
                }
            }
        }
        return resultLists;
    }

    private void printmap(Map m) {
        for (Object k : m.keySet()) {
            System.out.println("===" + k + "\t" + m.get(k));
        }
    }

    private void printmap2(Map<?, ?> m) {
        for (Object k : m.keySet()) {
            System.out.println("===" + k);
            for (Object k2 : (List) m.get(k)) {
                System.out.println("\t" + k2);
            }
        }
    }

    private List<Node> match(ConllWord cw) {
        final boolean debug = false;
        boolean ok = true; // empty expression matches always

        // for all nodes
        List<Node> matched = new ArrayList<>();
        if (debug) {
            System.out.println("Try to match " + cw);
        }
        for (String n : nodes.keySet()) {
            if (debug) {
                System.out.println("..NODE " + n + " == " + nodes.get(n));
            }
            ok = true;
            Node nd = nodes.get(n);
            for (String f : nd.must_feats.keySet()) {
                boolean featok = false;
                for (String val : nd.must_feats.get(f)) {
                    // positive: one of all must be ok
                    if (debug) {
                        System.out.println("CHECKING " + f + "=" + val);
                    }
                    switch (f) {
                        case "upos":
                            if (cw.getUpostag().equals(val)) {
                                // feature OK
                                featok = true;
                            }
                            break;
                        case "xpos":
                            if (cw.getXpostag().equals(val)) {
                                // feature OK
                                featok = true;
                            }
                            break;
                        case "form":
                            if (cw.getForm().equals(val)) {
                                // feature OK
                                featok = true;
                            }
                            break;
                        case "lemma":
                            if (cw.getLemma().equals(val)) {
                                // feature OK
                                featok = true;
                            }
                            break;
                        case "deprels":
                            if (cw.getDeplabel().equals(val)) {
                                // feature OK
                                featok = true;

                            }
                            break;
                        default:
                            if (val.isEmpty()) {
                                // feature must be there
                                if (cw.hasFeature(f)) {
                                    featok = true;
                                }
                            } else {
                                if (cw.hasFeature(f, val)) {
                                    featok = true;
                                }
                            }
                    }
                    if (debug) {
                        System.out.println("checkresult " + featok);
                    }
                }
                if (!featok) {
                    // node invalid
                    ok = false;
                    break;
                }

            }
            if (ok) {
                for (String f : nd.must_not_feats.keySet()) {
                    boolean featok = true;
                    for (String val : nd.must_not_feats.get(f)) {
                        // negative, non feat must fit
                        if (debug) {
                            System.out.println("CHECKING NEGATIV " + f + "<>" + val + "   " + featok);
                        }
                        switch (f) {
                            case "upos":
                                if (cw.getUpostag().equals(val)) {
                                    // feature present
                                    featok = false;
                                }
                                break;
                            case "xpos":
                                if (cw.getXpostag().equals(val)) {
                                    // feature present
                                    featok = false;
                                }
                                break;
                            case "lemma":
                                if (cw.getLemma().equals(val)) {
                                    // feature present
                                    featok = false;
                                }
                                break;
                            case "form":
                                if (cw.getForm().equals(val)) {
                                    // feature present
                                    featok = false;
                                }
                                break;
                            case "deprels":
                                if (cw.getDeplabel().equals(val)) {
                                    featok = false;
                                }
                                break;
                            default:
                                //System.out.println("WWWWWW " + f + " <" + val + "> " + cw.hasFeature(f));
                                if (val.isEmpty()) {
                                    if (cw.hasFeature(f)) {
                                        featok = false;
                                    }
                                } else {
                                    // N [Number<>Sing] is true, when feature Number is present but with a value different than Sing
                                    if (!cw.hasFeature(f) || cw.hasFeature(f, val)) {
                                        featok = false;
                                    }
                                }
                        }
                        if (debug) {
                            System.out.println("neg checking result " + featok);
                        }
                    }
                    if (!featok) {
                        // node invalid
                        ok = false;
                        break;
                    }

                }
            }
            if (ok) {
                matched.add(nodes.get(n));
            }

        }
        return matched;
    }

    public void out() {
        System.out.println("=================== start");
        for (String n : nodes.keySet()) {
            System.out.println("NODE: " + n + " " + nodes.get(n).toString());
        }
        for (String n : identicalnodes.keySet()) {
            System.out.println("ID: " + n + " " + identicalnodes.get(n).toString());
        }
        for (String n : differentnodes.keySet()) {
            System.out.println("NOT ID: " + n + " " + differentnodes.get(n).toString());
        }
        for (String n : before.keySet()) {
            System.out.println("BEFORE: " + n + " before " + before.get(n).toString());
        }
        for (String n : strictlybefore.keySet()) {
            System.out.println("STRICTLYBEFORE: " + n + " before " + strictlybefore.get(n).toString());
        }
        for(Compare c : equals) {
            System.out.println("CONSTRAINT " + c);
        }
        for (Map<String, Rel> m : relations) {
            System.out.println("RELS");
            for (String n : m.keySet()) {
                System.out.print(" REL " + m.get(n).toString());
            }
            System.out.println();
        }
        System.out.println("=================== end");
    }

    @Override
    public Boolean visitFinal(GrewmatchParser.FinalContext ctx) {
        boolean value = true;
        //boolean value = visit(ctx.pattern());
        if (ctx.pattern() != null) {
            for (GrewmatchParser.PatternContext cc : ctx.pattern()) {
                value = value && visit(cc);
            }
        }
        if (ctx.without() != null) {
            for (GrewmatchParser.WithoutContext cc : ctx.without()) {
                value = value && visit(cc);
            }
        }
        if (ctx.globals() != null) {
            for (GrewmatchParser.GlobalsContext cc : ctx.globals()) {
                value = value && visit(cc);
            }
        }
        return value;
    }

    @Override
    public Boolean visitPatternlist(GrewmatchParser.PatternlistContext ctx) {
        boolean value = true;
        for (GrewmatchParser.RheolContext rc : ctx.rheol()) {
            //value = value &&
            visit(rc);
        }

        return value;
    }

    @Override
    public Boolean visitWithoutlist(GrewmatchParser.WithoutlistContext ctx) {
        boolean value = true;
        without = true;
        localrelations = new TreeMap<>();
        for (GrewmatchParser.RheolContext rc : ctx.rheol()) {
            //value = value &&
            visit(rc);
        }

        without = false;
        relations.add(localrelations);
        localrelations = null;
        return value;
    }

    @Override
    public Boolean visitCondlist(GrewmatchParser.CondlistContext ctx) {
        // for each condition in pattern
        String nodename = ctx.nodename().getText();
        curnode = nodes.get(nodename);
        if (curnode == null) {
            curnode = new Node(nodename);
            nodes.put(nodename, curnode);
        }
        //System.out.println("NN " + nodename);
        for (GrewmatchParser.ConditionContext cc : ctx.condition()) {
            //System.out.println("COND " + cc.getText());
            visit(cc);
        }
        curnode = null;

        return true;
    }

    @Override
    public Boolean visitCond(GrewmatchParser.CondContext ctx) {
        // for each condition in pattern
        String left = ctx.conllucolumn().getText();
        //System.out.println("left " + left);

        boolean neg = without;
        if (ctx.NOT() != null) {
            neg = !neg;
        }
        curnode.addfeat(left, "", neg);

        curnode.seal(left);
        //System.out.println("SEAL " + left);
        //boolean value = visit(ctx.pattern()); // evaluate the expression child
        return true; //value;
    }

    @Override
    public Boolean visitCond2(GrewmatchParser.Cond2Context ctx) {
        // for each condition in pattern
        String left = ctx.conllucolumn().getText();
        //System.out.println("left " + left);
        String cp = ctx.eq().getText();
        boolean neg = without;
        if (cp.equals("<>")) {
            neg = !neg;
        }
        //System.out.println("qqqq " + cp + " " + without + " " + neg);
        for (GrewmatchParser.StringContext cc : ctx.string()) {
            //System.out.println("STRING " + left + " " + cc.getText());
            curnode.addfeat(left, cc.getText(), neg);
            visit(cc);
        }
        for (GrewmatchParser.UtfstringContext cc : ctx.utfstring()) {
            //System.out.println("USTRING " + left + " " + cc.getText());
            String us = cc.getText();
            curnode.addfeat(left, us.substring(1, us.length() - 1), neg);
            visit(cc);
        }
        curnode.seal(left);
        //System.out.println("SEAL " + left);
        //boolean value = visit(ctx.pattern()); // evaluate the expression child
        return true; //value;
    }

    @Override
    public Boolean visitOrder(GrewmatchParser.OrderContext ctx) {
        String one = ctx.nodename(0).getText();
        String two = ctx.nodename(1).getText();

        Node cn = nodes.get(one);
        if (cn == null) {
            cn = new Node(one);
            nodes.put(one, cn);
        }
        cn = nodes.get(two);
        if (cn == null) {
            cn = new Node(two);
            nodes.put(two, cn);
        }

        String cp;
        if (ctx.eq() != null) {
            cp = ctx.eq().getText();
        } else {
            cp = ctx.comp().getText();
        }
        switch (cp) {
            case "<<":
                before.put(one, two);
                break;
            case ">>":
                before.put(two, one);
                break;
            case "<":
                strictlybefore.put(one, two);
                break;
            case ">":
                strictlybefore.put(two, one);
                break;
        }
        return true;
    }

    @Override
    public Boolean visitOrder2(GrewmatchParser.Order2Context ctx) {
        String one = ctx.nodenamefield(0).getText();
        String two = ctx.nodenamefield(1).getText();
        //System.out.println("ooooooooooooooooooooooo " + one);
        String[] oneparts = one.split("\\.", 2);
        String[] twoparts = two.split("\\.", 2);

        String cp;
        if (ctx.eq() != null) {
            cp = ctx.eq().getText();
        } else {
            cp = ctx.comp().getText();
        }
        switch (cp) {
            case "<>":
                equals.add(new Compare(oneparts[0], oneparts[1], twoparts[0], twoparts[1], false, without));
                break;
            case "=":
                equals.add(new Compare(oneparts[0], oneparts[1], twoparts[0], twoparts[1], true, without));
                break;
        }

        return true;
    }

    @Override
    public Boolean visitRelation(GrewmatchParser.RelationContext ctx) {
        String head = ctx.nodename(0).getText();
        String dep = ctx.nodename(1).getText();

        if (!without) {
            Node cn = nodes.get(head);
            if (cn == null) {
                cn = new Node(head);
                nodes.put(head, cn);
            }
            cn = nodes.get(dep);
            if (cn == null) {
                cn = new Node(dep);
                nodes.put(dep, cn);
            }
        }
        String relval = null;
        if (ctx.relval() != null) {
            relval = ctx.relval().getText();
        }
        currel = new Rel(relval, head, dep, null, without, false);
        if (localrelations == null) {
            localrelations = new TreeMap<>();
            localrelations.put(dep, currel);
            relations.add(localrelations);
        } else {
            localrelations.put(dep, currel);
        }
        return true;
    }

    @Override
    public Boolean visitNamedrelation(GrewmatchParser.NamedrelationContext ctx) {
        String head = ctx.nodename(0).getText();
        String dep = ctx.nodename(1).getText();
        List<String> deprels = new ArrayList<>();

        for (DeprelContext c : ctx.deprel()) {
            deprels.add(c.getText());
        }

        boolean neg = false;
        if (ctx.NOT() != null) {
            neg = true;
        }

        if (!without) {
            Node cn = nodes.get(head);
            if (cn == null) {
                cn = new Node(head);
                nodes.put(head, cn);
            }
            cn = nodes.get(dep);
            if (cn == null) {
                cn = new Node(dep);
                nodes.put(dep, cn);
                cn.addfeats("deprels", deprels, without || neg);
            }
        }
        String relval = null;
        if (ctx.relval() != null) {
            relval = ctx.relval().getText();
        }
        currel = new Rel(relval, head, dep, deprels, without, neg);
        //relations.put(dep, currel);
        if (localrelations == null) {
            localrelations = new TreeMap<>();
            localrelations.put(dep, currel);
            relations.add(localrelations);
        } else {
            localrelations.put(dep, currel);
        }
        return true;
    }

//    @Override
//    public Boolean visitGlobalrule(GrewmatchParser.GlobalruleContext ctx) {
//        boolean value = visit(ctx.globals());
//        return value;
//    }

    @Override
    public Boolean visitGloballist(GrewmatchParser.GloballistContext ctx) {
        boolean value = visit(ctx.globalconds());
        return value;
    }

    @Override
    public Boolean visitGlobalcond(GrewmatchParser.GlobalcondContext ctx) {
        globals.add(ctx.IS_SOMETHING().toString());
        return true;
    }

    class Node {

        String id;

        Map<String, List<String>> must_feats;
        Map<String, List<String>> must_not_feats;
        Set<String> sealed; // to avoid { N [upos=1]; N [upos=2] }

        public Node(String id) {
            this.id = id;
            must_feats = new HashMap<>();
            must_not_feats = new HashMap<>();
            sealed = new HashSet<>();
        }

        public Node(Node o) {
            id = o.id;
            must_feats = new HashMap<>();
            for (String k : o.must_feats.keySet()) {
                must_feats.put(k, new ArrayList<>(must_feats.get(k)));
            }
            must_not_feats = new HashMap<>();
            for (String k : o.must_not_feats.keySet()) {
                must_not_feats.put(k, new ArrayList<>(must_not_feats.get(k)));
            }
            sealed = new HashSet<>(o.sealed);
        }

        public void seal(String cat) {
            sealed.add(cat);
        }

        public void addfeat(String k, String v, boolean negated) throws GrewException {
            if (sealed.contains(k)) {
                throw new GrewException("inconsistent nodes");
            }
            //System.out.println("ADDFEAT " + k + " " + v);
            if (negated) {
                List<String> vals = must_not_feats.get(k);
                if (vals == null) {
                    vals = new ArrayList<>();
                    must_not_feats.put(k, vals);
                }
                vals.add(v);
            } else {
                List<String> vals = must_feats.get(k);
                if (vals == null) {
                    vals = new ArrayList<>();
                    must_feats.put(k, vals);
                }
                vals.add(v);
            }
        }

        public void addfeats(String k, List<String> v, boolean negated) throws GrewException {
            if (sealed.contains(k)) {
                throw new GrewException("inconsistent nodes");
            }
            //System.out.println("ADDFEAT " + k + " " + v);
            if (negated) {
                List<String> vals = must_not_feats.get(k);
                if (vals == null) {
                    vals = new ArrayList<>();
                    must_not_feats.put(k, vals);
                }
                vals.addAll(v);
            } else {
                List<String> vals = must_feats.get(k);
                if (vals == null) {
                    vals = new ArrayList<>();
                    must_feats.put(k, vals);
                }
                vals.addAll(v);
            }
        }

        public String toString() {
            StringBuilder tmp = new StringBuilder();
            tmp.append(id).append("::");
            for (String k : must_feats.keySet()) {
                tmp.append(k).append(':').append(must_feats.get(k)).append('/');
            }
            for (String k : must_not_feats.keySet()) {
                tmp.append(k).append(":!").append(must_not_feats.get(k)).append('/');
            }
            return tmp.toString();

        }
    }

    class Rel {

        String id;
        List<String> deprels;
        boolean notdeprels = false;
        String head;
        String dep;
        boolean without = false;

        public Rel(String id, String head, String dep, List<String> deprels, boolean without, boolean notdeprels) {
            this.id = id;
            this.head = head;
            this.dep = dep;
            this.deprels = deprels;
            this.notdeprels = notdeprels;
            this.without = without;
        }

        public String toString() {
            return (id != null ? id + " " : "") + (without ? '!' : "") + head + " --" + (notdeprels ? "^" : "") + deprels + "--> " + dep;
        }
    }

    class Compare {

        String node1;
        String node2;
        String field1;
        String field2;
        boolean equal;
        boolean without;

        public Compare(String n1, String f1, String n2, String f2, boolean e, boolean w) {
            node1 = n1;
            node2 = n2;
            field1 = f1;
            field2 = f2;
            equal = e;
            without = w;
        }

        public String toString() {
            return node1 + "." + field1 + (equal ? "=" : "<>") + node2 + "." + field2;
        }
    }

}
