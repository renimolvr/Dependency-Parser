// Generated from com/orange/labs/conllparser/Grewmatch.g4 by ANTLR 4.13.1
package com.orange.labs.conllparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrewmatchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, PATTERN=11, WITHOUT=12, GLOBAL=13, IS_SOMETHING=14, COMMA=15, SEMICOLON=16, 
		COLON=17, OPEN=18, CLOSE=19, BOPEN=20, BCLOSE=21, ARROWOPEN=22, ARROWCLOSE=23, 
		ARROW=24, NOT=25, LOWER=26, ALPHANUM=27, UTFSTRING=28;
	public static final int
		RULE_expression = 0, RULE_globals = 1, RULE_globalconds = 2, RULE_pattern = 3, 
		RULE_without = 4, RULE_rheol = 5, RULE_condition = 6, RULE_eq = 7, RULE_comp = 8, 
		RULE_relval = 9, RULE_deprel = 10, RULE_conllucolumn = 11, RULE_nodename = 12, 
		RULE_nodenamefield = 13, RULE_field = 14, RULE_string = 15, RULE_utfstring = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "globals", "globalconds", "pattern", "without", "rheol", 
			"condition", "eq", "comp", "relval", "deprel", "conllucolumn", "nodename", 
			"nodenamefield", "field", "string", "utfstring"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'='", "'<>'", "'<'", "'<<'", "'>'", "'>>'", "'_'", "'.'", 
			null, "'pattern'", "'without'", "'global'", null, "','", "';'", "':'", 
			"'{'", "'}'", "'['", "']'", "'-['", "']->'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "PATTERN", 
			"WITHOUT", "GLOBAL", "IS_SOMETHING", "COMMA", "SEMICOLON", "COLON", "OPEN", 
			"CLOSE", "BOPEN", "BCLOSE", "ARROWOPEN", "ARROWCLOSE", "ARROW", "NOT", 
			"LOWER", "ALPHANUM", "UTFSTRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grewmatch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrewmatchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FinalContext extends ExpressionContext {
		public TerminalNode EOF() { return getToken(GrewmatchParser.EOF, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<WithoutContext> without() {
			return getRuleContexts(WithoutContext.class);
		}
		public WithoutContext without(int i) {
			return getRuleContext(WithoutContext.class,i);
		}
		public List<GlobalsContext> globals() {
			return getRuleContexts(GlobalsContext.class);
		}
		public GlobalsContext globals(int i) {
			return getRuleContext(GlobalsContext.class,i);
		}
		public FinalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			_localctx = new FinalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PATTERN:
					{
					setState(34);
					pattern();
					}
					break;
				case WITHOUT:
					{
					setState(35);
					without();
					}
					break;
				case GLOBAL:
					{
					setState(36);
					globals();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) );
			setState(41);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalsContext extends ParserRuleContext {
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
	 
		public GlobalsContext() { }
		public void copyFrom(GlobalsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GloballistContext extends GlobalsContext {
		public TerminalNode GLOBAL() { return getToken(GrewmatchParser.GLOBAL, 0); }
		public TerminalNode OPEN() { return getToken(GrewmatchParser.OPEN, 0); }
		public GlobalcondsContext globalconds() {
			return getRuleContext(GlobalcondsContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrewmatchParser.CLOSE, 0); }
		public GloballistContext(GlobalsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitGloballist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globals);
		try {
			_localctx = new GloballistContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(GLOBAL);
			setState(44);
			match(OPEN);
			setState(45);
			globalconds();
			setState(46);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalcondsContext extends ParserRuleContext {
		public GlobalcondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalconds; }
	 
		public GlobalcondsContext() { }
		public void copyFrom(GlobalcondsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalcondContext extends GlobalcondsContext {
		public TerminalNode IS_SOMETHING() { return getToken(GrewmatchParser.IS_SOMETHING, 0); }
		public GlobalcondContext(GlobalcondsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitGlobalcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalcondsContext globalconds() throws RecognitionException {
		GlobalcondsContext _localctx = new GlobalcondsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalconds);
		try {
			_localctx = new GlobalcondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IS_SOMETHING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternlistContext extends PatternContext {
		public TerminalNode PATTERN() { return getToken(GrewmatchParser.PATTERN, 0); }
		public TerminalNode OPEN() { return getToken(GrewmatchParser.OPEN, 0); }
		public List<RheolContext> rheol() {
			return getRuleContexts(RheolContext.class);
		}
		public RheolContext rheol(int i) {
			return getRuleContext(RheolContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(GrewmatchParser.CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrewmatchParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrewmatchParser.SEMICOLON, i);
		}
		public PatternlistContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitPatternlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pattern);
		int _la;
		try {
			int _alt;
			_localctx = new PatternlistContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(PATTERN);
			setState(51);
			match(OPEN);
			setState(52);
			rheol();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(SEMICOLON);
					setState(54);
					rheol();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(60);
				match(SEMICOLON);
				}
			}

			setState(63);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithoutContext extends ParserRuleContext {
		public WithoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_without; }
	 
		public WithoutContext() { }
		public void copyFrom(WithoutContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithoutlistContext extends WithoutContext {
		public TerminalNode WITHOUT() { return getToken(GrewmatchParser.WITHOUT, 0); }
		public TerminalNode OPEN() { return getToken(GrewmatchParser.OPEN, 0); }
		public List<RheolContext> rheol() {
			return getRuleContexts(RheolContext.class);
		}
		public RheolContext rheol(int i) {
			return getRuleContext(RheolContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(GrewmatchParser.CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrewmatchParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrewmatchParser.SEMICOLON, i);
		}
		public WithoutlistContext(WithoutContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitWithoutlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithoutContext without() throws RecognitionException {
		WithoutContext _localctx = new WithoutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_without);
		int _la;
		try {
			int _alt;
			_localctx = new WithoutlistContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(WITHOUT);
			setState(66);
			match(OPEN);
			setState(67);
			rheol();
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					match(SEMICOLON);
					setState(69);
					rheol();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(75);
				match(SEMICOLON);
				}
			}

			setState(78);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RheolContext extends ParserRuleContext {
		public RheolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rheol; }
	 
		public RheolContext() { }
		public void copyFrom(RheolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondlistContext extends RheolContext {
		public NodenameContext nodename() {
			return getRuleContext(NodenameContext.class,0);
		}
		public TerminalNode BOPEN() { return getToken(GrewmatchParser.BOPEN, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode BCLOSE() { return getToken(GrewmatchParser.BCLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrewmatchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrewmatchParser.COMMA, i);
		}
		public CondlistContext(RheolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitCondlist(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedrelationContext extends RheolContext {
		public List<NodenameContext> nodename() {
			return getRuleContexts(NodenameContext.class);
		}
		public NodenameContext nodename(int i) {
			return getRuleContext(NodenameContext.class,i);
		}
		public TerminalNode ARROWOPEN() { return getToken(GrewmatchParser.ARROWOPEN, 0); }
		public List<DeprelContext> deprel() {
			return getRuleContexts(DeprelContext.class);
		}
		public DeprelContext deprel(int i) {
			return getRuleContext(DeprelContext.class,i);
		}
		public TerminalNode ARROWCLOSE() { return getToken(GrewmatchParser.ARROWCLOSE, 0); }
		public RelvalContext relval() {
			return getRuleContext(RelvalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrewmatchParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(GrewmatchParser.NOT, 0); }
		public NamedrelationContext(RheolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitNamedrelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Order2Context extends RheolContext {
		public List<NodenamefieldContext> nodenamefield() {
			return getRuleContexts(NodenamefieldContext.class);
		}
		public NodenamefieldContext nodenamefield(int i) {
			return getRuleContext(NodenamefieldContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public Order2Context(RheolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitOrder2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends RheolContext {
		public List<NodenameContext> nodename() {
			return getRuleContexts(NodenameContext.class);
		}
		public NodenameContext nodename(int i) {
			return getRuleContext(NodenameContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(GrewmatchParser.ARROW, 0); }
		public RelvalContext relval() {
			return getRuleContext(RelvalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrewmatchParser.COLON, 0); }
		public RelationContext(RheolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrderContext extends RheolContext {
		public List<NodenameContext> nodename() {
			return getRuleContexts(NodenameContext.class);
		}
		public NodenameContext nodename(int i) {
			return getRuleContext(NodenameContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public OrderContext(RheolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RheolContext rheol() throws RecognitionException {
		RheolContext _localctx = new RheolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rheol);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CondlistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				nodename();
				setState(81);
				match(BOPEN);
				setState(82);
				condition();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83);
					match(COMMA);
					setState(84);
					condition();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(BCLOSE);
				}
				break;
			case 2:
				_localctx = new RelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOWER) {
					{
					setState(92);
					relval();
					setState(93);
					match(COLON);
					}
				}

				setState(97);
				nodename();
				setState(98);
				match(ARROW);
				setState(99);
				nodename();
				}
				break;
			case 3:
				_localctx = new NamedrelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOWER) {
					{
					setState(101);
					relval();
					setState(102);
					match(COLON);
					}
				}

				setState(106);
				nodename();
				setState(107);
				match(ARROWOPEN);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(108);
					match(NOT);
					}
				}

				setState(111);
				deprel();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(112);
					match(T__0);
					setState(113);
					deprel();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(ARROWCLOSE);
				setState(120);
				nodename();
				}
				break;
			case 4:
				_localctx = new Order2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				nodenamefield();
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__4:
				case T__5:
				case T__6:
					{
					setState(123);
					comp();
					}
					break;
				case T__1:
				case T__2:
					{
					setState(124);
					eq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				nodenamefield();
				}
				break;
			case 5:
				_localctx = new OrderContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				nodename();
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__4:
				case T__5:
				case T__6:
					{
					setState(130);
					comp();
					}
					break;
				case T__1:
				case T__2:
					{
					setState(131);
					eq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				nodename();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cond2Context extends ConditionContext {
		public ConllucolumnContext conllucolumn() {
			return getRuleContext(ConllucolumnContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<UtfstringContext> utfstring() {
			return getRuleContexts(UtfstringContext.class);
		}
		public UtfstringContext utfstring(int i) {
			return getRuleContext(UtfstringContext.class,i);
		}
		public Cond2Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitCond2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ConditionContext {
		public ConllucolumnContext conllucolumn() {
			return getRuleContext(ConllucolumnContext.class,0);
		}
		public TerminalNode NOT() { return getToken(GrewmatchParser.NOT, 0); }
		public CondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new CondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(138);
					match(NOT);
					}
				}

				setState(141);
				conllucolumn();
				}
				break;
			case 2:
				_localctx = new Cond2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				conllucolumn();
				setState(143);
				eq();
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOWER:
				case ALPHANUM:
					{
					setState(144);
					string();
					}
					break;
				case UTFSTRING:
					{
					setState(145);
					utfstring();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(148);
					match(T__0);
					setState(151);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case UTFSTRING:
						{
						setState(149);
						utfstring();
						}
						break;
					case LOWER:
					case ALPHANUM:
						{
						setState(150);
						string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelvalContext extends ParserRuleContext {
		public RelvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relval; }
	 
		public RelvalContext() { }
		public void copyFrom(RelvalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationvarContext extends RelvalContext {
		public TerminalNode LOWER() { return getToken(GrewmatchParser.LOWER, 0); }
		public RelationvarContext(RelvalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitRelationvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelvalContext relval() throws RecognitionException {
		RelvalContext _localctx = new RelvalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relval);
		try {
			_localctx = new RelationvarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LOWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeprelContext extends ParserRuleContext {
		public DeprelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deprel; }
	 
		public DeprelContext() { }
		public void copyFrom(DeprelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelContext extends DeprelContext {
		public List<TerminalNode> LOWER() { return getTokens(GrewmatchParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(GrewmatchParser.LOWER, i);
		}
		public TerminalNode COLON() { return getToken(GrewmatchParser.COLON, 0); }
		public RelContext(DeprelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeprelContext deprel() throws RecognitionException {
		DeprelContext _localctx = new DeprelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deprel);
		int _la;
		try {
			_localctx = new RelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LOWER);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(167);
				match(COLON);
				setState(168);
				match(LOWER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConllucolumnContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(GrewmatchParser.LOWER, 0); }
		public TerminalNode ALPHANUM() { return getToken(GrewmatchParser.ALPHANUM, 0); }
		public ConllucolumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conllucolumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitConllucolumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConllucolumnContext conllucolumn() throws RecognitionException {
		ConllucolumnContext _localctx = new ConllucolumnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conllucolumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==LOWER || _la==ALPHANUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodenameContext extends ParserRuleContext {
		public NodenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodename; }
	 
		public NodenameContext() { }
		public void copyFrom(NodenameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends NodenameContext {
		public List<TerminalNode> ALPHANUM() { return getTokens(GrewmatchParser.ALPHANUM); }
		public TerminalNode ALPHANUM(int i) {
			return getToken(GrewmatchParser.ALPHANUM, i);
		}
		public NodeContext(NodenameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodenameContext nodename() throws RecognitionException {
		NodenameContext _localctx = new NodenameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nodename);
		int _la;
		try {
			_localctx = new NodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==ALPHANUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==ALPHANUM );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodenamefieldContext extends ParserRuleContext {
		public NodenamefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodenamefield; }
	 
		public NodenamefieldContext() { }
		public void copyFrom(NodenamefieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodefieldContext extends NodenamefieldContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<TerminalNode> ALPHANUM() { return getTokens(GrewmatchParser.ALPHANUM); }
		public TerminalNode ALPHANUM(int i) {
			return getToken(GrewmatchParser.ALPHANUM, i);
		}
		public NodefieldContext(NodenamefieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitNodefield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodenamefieldContext nodenamefield() throws RecognitionException {
		NodenamefieldContext _localctx = new NodenamefieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nodenamefield);
		int _la;
		try {
			_localctx = new NodefieldContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==ALPHANUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==ALPHANUM );
			setState(183);
			match(T__8);
			setState(184);
			field();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldnameContext extends FieldContext {
		public List<TerminalNode> ALPHANUM() { return getTokens(GrewmatchParser.ALPHANUM); }
		public TerminalNode ALPHANUM(int i) {
			return getToken(GrewmatchParser.ALPHANUM, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(GrewmatchParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(GrewmatchParser.LOWER, i);
		}
		public FieldnameContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitFieldname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_field);
		int _la;
		try {
			_localctx = new FieldnameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 201326848L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 201326848L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(GrewmatchParser.LOWER, 0); }
		public TerminalNode ALPHANUM() { return getToken(GrewmatchParser.ALPHANUM, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==LOWER || _la==ALPHANUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UtfstringContext extends ParserRuleContext {
		public TerminalNode UTFSTRING() { return getToken(GrewmatchParser.UTFSTRING, 0); }
		public UtfstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utfstring; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrewmatchVisitor ) return ((GrewmatchVisitor<? extends T>)visitor).visitUtfstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UtfstringContext utfstring() throws RecognitionException {
		UtfstringContext _localctx = new UtfstringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_utfstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(UTFSTRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"8\b\u0003\n\u0003\f\u0003;\t\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004\u0001\u0004\u0003"+
		"\u0004M\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005V\b\u0005\n\u0005\f\u0005Y\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005`\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005s\b\u0005\n\u0005\f\u0005v\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005~\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0085\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005"+
		"\u0001\u0006\u0003\u0006\u008c\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0098\b\u0006\u0005\u0006\u009a\b\u0006\n\u0006"+
		"\f\u0006\u009d\t\u0006\u0003\u0006\u009f\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00aa"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u00af\b\f\u000b\f\f\f\u00b0"+
		"\u0001\r\u0004\r\u00b4\b\r\u000b\r\f\r\u00b5\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000e\u00bc\b\u000e\u000b\u000e\f\u000e\u00bd\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0005\u0001\u0000\u0002\u0003\u0001\u0000\u0004\u0007\u0001"+
		"\u0000\u001a\u001b\u0002\u0000\b\b\u001b\u001b\u0002\u0000\b\b\u001a\u001b"+
		"\u00cd\u0000%\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004"+
		"0\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\bA\u0001\u0000"+
		"\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u009e\u0001\u0000\u0000"+
		"\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00a2\u0001\u0000\u0000"+
		"\u0000\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000\u0000"+
		"\u0000\u0016\u00ab\u0001\u0000\u0000\u0000\u0018\u00ae\u0001\u0000\u0000"+
		"\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000"+
		"\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000\u0000"+
		"\"&\u0003\u0006\u0003\u0000#&\u0003\b\u0004\u0000$&\u0003\u0002\u0001"+
		"\u0000%\"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000"+
		"\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0005\r\u0000\u0000,-\u0005\u0012"+
		"\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0005\u0013\u0000\u0000/\u0003"+
		"\u0001\u0000\u0000\u000001\u0005\u000e\u0000\u00001\u0005\u0001\u0000"+
		"\u0000\u000023\u0005\u000b\u0000\u000034\u0005\u0012\u0000\u000049\u0003"+
		"\n\u0005\u000056\u0005\u0010\u0000\u000068\u0003\n\u0005\u000075\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<>\u0005\u0010\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0013\u0000\u0000@\u0007"+
		"\u0001\u0000\u0000\u0000AB\u0005\f\u0000\u0000BC\u0005\u0012\u0000\u0000"+
		"CH\u0003\n\u0005\u0000DE\u0005\u0010\u0000\u0000EG\u0003\n\u0005\u0000"+
		"FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KM\u0005\u0010\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0013\u0000\u0000"+
		"O\t\u0001\u0000\u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005\u0014\u0000"+
		"\u0000RW\u0003\f\u0006\u0000ST\u0005\u000f\u0000\u0000TV\u0003\f\u0006"+
		"\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0015\u0000\u0000[\u0089\u0001\u0000\u0000"+
		"\u0000\\]\u0003\u0012\t\u0000]^\u0005\u0011\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_\\\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0003\u0018\f\u0000bc\u0005\u0018\u0000\u0000cd\u0003"+
		"\u0018\f\u0000d\u0089\u0001\u0000\u0000\u0000ef\u0003\u0012\t\u0000fg"+
		"\u0005\u0011\u0000\u0000gi\u0001\u0000\u0000\u0000he\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0003\u0018"+
		"\f\u0000km\u0005\u0016\u0000\u0000ln\u0005\u0019\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000ot\u0003"+
		"\u0014\n\u0000pq\u0005\u0001\u0000\u0000qs\u0003\u0014\n\u0000rp\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0017\u0000\u0000xy\u0003\u0018\f\u0000y\u0089\u0001\u0000"+
		"\u0000\u0000z}\u0003\u001a\r\u0000{~\u0003\u0010\b\u0000|~\u0003\u000e"+
		"\u0007\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u001a\r\u0000\u0080\u0089\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0003\u0018\f\u0000\u0082\u0085\u0003\u0010"+
		"\b\u0000\u0083\u0085\u0003\u000e\u0007\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0003\u0018\f\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088P\u0001\u0000\u0000\u0000\u0088_\u0001\u0000\u0000\u0000\u0088h"+
		"\u0001\u0000\u0000\u0000\u0088z\u0001\u0000\u0000\u0000\u0088\u0081\u0001"+
		"\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u008c\u0005"+
		"\u0019\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u009f\u0003"+
		"\u0016\u000b\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0092\u0003"+
		"\u000e\u0007\u0000\u0090\u0093\u0003\u001e\u000f\u0000\u0091\u0093\u0003"+
		" \u0010\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u009b\u0001\u0000\u0000\u0000\u0094\u0097\u0005\u0001"+
		"\u0000\u0000\u0095\u0098\u0003 \u0010\u0000\u0096\u0098\u0003\u001e\u000f"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u008b\u0001\u0000\u0000"+
		"\u0000\u009e\u008e\u0001\u0000\u0000\u0000\u009f\r\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0007\u0001\u0000\u0000\u00a3\u0011\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\u001a\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0005\u001a\u0000\u0000\u00a7\u00a8\u0005\u0011\u0000\u0000"+
		"\u00a8\u00aa\u0005\u001a\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0015\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0007\u0002\u0000\u0000\u00ac\u0017\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0007\u0003\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0007\u0003\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\t\u0000\u0000\u00b8\u00b9\u0003\u001c\u000e\u0000\u00b9"+
		"\u001b\u0001\u0000\u0000\u0000\u00ba\u00bc\u0007\u0004\u0000\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u001d\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0002\u0000\u0000\u00c0"+
		"\u001f\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2"+
		"!\u0001\u0000\u0000\u0000\u0017%\'9=HLW_hmt}\u0084\u0088\u008b\u0092\u0097"+
		"\u009b\u009e\u00a9\u00b0\u00b5\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}