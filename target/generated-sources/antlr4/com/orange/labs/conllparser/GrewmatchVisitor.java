// Generated from com/orange/labs/conllparser/Grewmatch.g4 by ANTLR 4.13.1
package com.orange.labs.conllparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrewmatchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrewmatchVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code final}
	 * labeled alternative in {@link GrewmatchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal(GrewmatchParser.FinalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globallist}
	 * labeled alternative in {@link GrewmatchParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGloballist(GrewmatchParser.GloballistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalcond}
	 * labeled alternative in {@link GrewmatchParser#globalconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalcond(GrewmatchParser.GlobalcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternlist}
	 * labeled alternative in {@link GrewmatchParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternlist(GrewmatchParser.PatternlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withoutlist}
	 * labeled alternative in {@link GrewmatchParser#without}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithoutlist(GrewmatchParser.WithoutlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condlist}
	 * labeled alternative in {@link GrewmatchParser#rheol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondlist(GrewmatchParser.CondlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relation}
	 * labeled alternative in {@link GrewmatchParser#rheol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(GrewmatchParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedrelation}
	 * labeled alternative in {@link GrewmatchParser#rheol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedrelation(GrewmatchParser.NamedrelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code order2}
	 * labeled alternative in {@link GrewmatchParser#rheol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder2(GrewmatchParser.Order2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code order}
	 * labeled alternative in {@link GrewmatchParser#rheol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(GrewmatchParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link GrewmatchParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(GrewmatchParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond2}
	 * labeled alternative in {@link GrewmatchParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond2(GrewmatchParser.Cond2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrewmatchParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(GrewmatchParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrewmatchParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(GrewmatchParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationvar}
	 * labeled alternative in {@link GrewmatchParser#relval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationvar(GrewmatchParser.RelationvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel}
	 * labeled alternative in {@link GrewmatchParser#deprel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(GrewmatchParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrewmatchParser#conllucolumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConllucolumn(GrewmatchParser.ConllucolumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code node}
	 * labeled alternative in {@link GrewmatchParser#nodename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(GrewmatchParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodefield}
	 * labeled alternative in {@link GrewmatchParser#nodenamefield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodefield(GrewmatchParser.NodefieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldname}
	 * labeled alternative in {@link GrewmatchParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldname(GrewmatchParser.FieldnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrewmatchParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GrewmatchParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrewmatchParser#utfstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtfstring(GrewmatchParser.UtfstringContext ctx);
}