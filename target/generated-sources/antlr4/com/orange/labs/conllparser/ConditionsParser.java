// Generated from com/orange/labs/conllparser/Conditions.g4 by ANTLR 4.13.1
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
public class ConditionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, UPOS=5, LEMMA=6, FORM=7, XPOS=8, DEPREL=9, 
		FEAT=10, MISC=11, ID=12, MWT=13, HEADID=14, RELEUD=15, ABSEUD=16, ISEMPTY=17, 
		ISMWT=18, AND=19, OR=20, NOT=21, OPEN=22, CLOSE=23, AT=24, EQUALS=25, 
		COMPATIBLE=26, CUPOS=27, CXPOS=28, CDEPREL=29, CFEAT=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_columnname = 2, RULE_field = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "columnname", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'head'", "'child'", "'prec'", "'next'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'IsEmpty'", "'IsMWT'", 
			null, null, null, "'('", "')'", "'@'", "'='", "'~'", "'@Upos'", "'@Xpos'", 
			"'@Deprel'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "UPOS", "LEMMA", "FORM", "XPOS", "DEPREL", 
			"FEAT", "MISC", "ID", "MWT", "HEADID", "RELEUD", "ABSEUD", "ISEMPTY", 
			"ISMWT", "AND", "OR", "NOT", "OPEN", "CLOSE", "AT", "EQUALS", "COMPATIBLE", 
			"CUPOS", "CXPOS", "CDEPREL", "CFEAT", "WS"
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
	public String getGrammarFileName() { return "Conditions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConditionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintResultContext extends ProgContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ConditionsParser.EOF, 0); }
		public PrintResultContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitPrintResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new PrintResultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expression(0);
			setState(9);
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
	public static class FieldnameContext extends ExpressionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldnameContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitFieldname(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VorherContext extends ExpressionContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public VorherContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitVorher(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OderContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ConditionsParser.OR, 0); }
		public OderContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitOder(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValcompatibleContext extends ExpressionContext {
		public List<ColumnnameContext> columnname() {
			return getRuleContexts(ColumnnameContext.class);
		}
		public ColumnnameContext columnname(int i) {
			return getRuleContext(ColumnnameContext.class,i);
		}
		public TerminalNode COMPATIBLE() { return getToken(ConditionsParser.COMPATIBLE, 0); }
		public ValcompatibleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitValcompatible(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KlammernContext extends ExpressionContext {
		public ExpressionContext inner;
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KlammernContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitKlammern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KopfContext extends ExpressionContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public KopfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitKopf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NachherContext extends ExpressionContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public NachherContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitNachher(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValcompareContext extends ExpressionContext {
		public List<ColumnnameContext> columnname() {
			return getRuleContexts(ColumnnameContext.class);
		}
		public ColumnnameContext columnname(int i) {
			return getRuleContext(ColumnnameContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ConditionsParser.EQUALS, 0); }
		public ValcompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitValcompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UndContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ConditionsParser.AND, 0); }
		public UndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitUnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NichtContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(ConditionsParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NichtContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitNicht(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildContext extends ExpressionContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public ChildContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new FieldnameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(12);
				field();
				}
				break;
			case 2:
				{
				_localctx = new NichtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(NOT);
				setState(14);
				expression(10);
				}
				break;
			case 3:
				{
				_localctx = new KlammernContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(OPEN);
				setState(16);
				((KlammernContext)_localctx).inner = expression(0);
				setState(17);
				match(CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new KopfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(T__0);
				setState(20);
				match(OPEN);
				setState(21);
				expression(0);
				setState(22);
				match(CLOSE);
				}
				break;
			case 5:
				{
				_localctx = new ChildContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__1);
				setState(25);
				match(OPEN);
				setState(26);
				expression(0);
				setState(27);
				match(CLOSE);
				}
				break;
			case 6:
				{
				_localctx = new VorherContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(T__2);
				setState(30);
				match(OPEN);
				setState(31);
				expression(0);
				setState(32);
				match(CLOSE);
				}
				break;
			case 7:
				{
				_localctx = new NachherContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__3);
				setState(35);
				match(OPEN);
				setState(36);
				expression(0);
				setState(37);
				match(CLOSE);
				}
				break;
			case 8:
				{
				_localctx = new ValcompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				columnname();
				setState(40);
				match(EQUALS);
				setState(41);
				columnname();
				}
				break;
			case 9:
				{
				_localctx = new ValcompatibleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				columnname();
				setState(44);
				match(COMPATIBLE);
				setState(45);
				columnname();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new UndContext(new ExpressionContext(_parentctx, _parentState));
						((UndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						((UndContext)_localctx).operator = match(AND);
						setState(51);
						((UndContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new OderContext(new ExpressionContext(_parentctx, _parentState));
						((OderContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(53);
						((OderContext)_localctx).operator = match(OR);
						setState(54);
						((OderContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnnameContext extends ParserRuleContext {
		public ColumnnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnname; }
	 
		public ColumnnameContext() { }
		public void copyFrom(ColumnnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetkopfContext extends ColumnnameContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ColumnnameContext columnname() {
			return getRuleContext(ColumnnameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public GetkopfContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitGetkopf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueDeprelContext extends ColumnnameContext {
		public TerminalNode CDEPREL() { return getToken(ConditionsParser.CDEPREL, 0); }
		public ValueDeprelContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitValueDeprel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetchildContext extends ColumnnameContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ColumnnameContext columnname() {
			return getRuleContext(ColumnnameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public GetchildContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitGetchild(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueXposContext extends ColumnnameContext {
		public TerminalNode CXPOS() { return getToken(ConditionsParser.CXPOS, 0); }
		public ValueXposContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitValueXpos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueFeatContext extends ColumnnameContext {
		public TerminalNode CFEAT() { return getToken(ConditionsParser.CFEAT, 0); }
		public ValueFeatContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitValueFeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetnachherContext extends ColumnnameContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ColumnnameContext columnname() {
			return getRuleContext(ColumnnameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public GetnachherContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitGetnachher(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueUposContext extends ColumnnameContext {
		public TerminalNode CUPOS() { return getToken(ConditionsParser.CUPOS, 0); }
		public ValueUposContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitValueUpos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetvorherContext extends ColumnnameContext {
		public TerminalNode OPEN() { return getToken(ConditionsParser.OPEN, 0); }
		public ColumnnameContext columnname() {
			return getRuleContext(ColumnnameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ConditionsParser.CLOSE, 0); }
		public GetvorherContext(ColumnnameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitGetvorher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnnameContext columnname() throws RecognitionException {
		ColumnnameContext _localctx = new ColumnnameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columnname);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUPOS:
				_localctx = new ValueUposContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(CUPOS);
				}
				break;
			case CXPOS:
				_localctx = new ValueXposContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(CXPOS);
				}
				break;
			case CDEPREL:
				_localctx = new ValueDeprelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(CDEPREL);
				}
				break;
			case CFEAT:
				_localctx = new ValueFeatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(CFEAT);
				}
				break;
			case T__0:
				_localctx = new GetkopfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(T__0);
				setState(65);
				match(OPEN);
				setState(66);
				columnname();
				setState(67);
				match(CLOSE);
				}
				break;
			case T__2:
				_localctx = new GetvorherContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				match(T__2);
				setState(70);
				match(OPEN);
				setState(71);
				columnname();
				setState(72);
				match(CLOSE);
				}
				break;
			case T__3:
				_localctx = new GetnachherContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				match(T__3);
				setState(75);
				match(OPEN);
				setState(76);
				columnname();
				setState(77);
				match(CLOSE);
				}
				break;
			case T__1:
				_localctx = new GetchildContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(T__1);
				setState(80);
				match(OPEN);
				setState(81);
				columnname();
				setState(82);
				match(CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CheckFeatContext extends FieldContext {
		public TerminalNode FEAT() { return getToken(ConditionsParser.FEAT, 0); }
		public CheckFeatContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckFeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckUposContext extends FieldContext {
		public TerminalNode UPOS() { return getToken(ConditionsParser.UPOS, 0); }
		public CheckUposContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckUpos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckXposContext extends FieldContext {
		public TerminalNode XPOS() { return getToken(ConditionsParser.XPOS, 0); }
		public CheckXposContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckXpos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckRelEUDContext extends FieldContext {
		public TerminalNode RELEUD() { return getToken(ConditionsParser.RELEUD, 0); }
		public CheckRelEUDContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckRelEUD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckLemmaContext extends FieldContext {
		public TerminalNode LEMMA() { return getToken(ConditionsParser.LEMMA, 0); }
		public CheckLemmaContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckLemma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckMiscContext extends FieldContext {
		public TerminalNode MISC() { return getToken(ConditionsParser.MISC, 0); }
		public CheckMiscContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckMisc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckHeadIDContext extends FieldContext {
		public TerminalNode HEADID() { return getToken(ConditionsParser.HEADID, 0); }
		public CheckHeadIDContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckHeadID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckEmptyContext extends FieldContext {
		public TerminalNode ISEMPTY() { return getToken(ConditionsParser.ISEMPTY, 0); }
		public CheckEmptyContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckDeprelContext extends FieldContext {
		public TerminalNode DEPREL() { return getToken(ConditionsParser.DEPREL, 0); }
		public CheckDeprelContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckDeprel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckAbsEUDContext extends FieldContext {
		public TerminalNode ABSEUD() { return getToken(ConditionsParser.ABSEUD, 0); }
		public CheckAbsEUDContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckAbsEUD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckFormContext extends FieldContext {
		public TerminalNode FORM() { return getToken(ConditionsParser.FORM, 0); }
		public CheckFormContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckForm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckMWTContext extends FieldContext {
		public TerminalNode MWT() { return getToken(ConditionsParser.MWT, 0); }
		public CheckMWTContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckMWT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckIsMWTContext extends FieldContext {
		public TerminalNode ISMWT() { return getToken(ConditionsParser.ISMWT, 0); }
		public CheckIsMWTContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckIsMWT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckIDContext extends FieldContext {
		public TerminalNode ID() { return getToken(ConditionsParser.ID, 0); }
		public CheckIDContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConditionsVisitor ) return ((ConditionsVisitor<? extends T>)visitor).visitCheckID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPOS:
				_localctx = new CheckUposContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(UPOS);
				}
				break;
			case LEMMA:
				_localctx = new CheckLemmaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(LEMMA);
				}
				break;
			case FORM:
				_localctx = new CheckFormContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(FORM);
				}
				break;
			case XPOS:
				_localctx = new CheckXposContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(XPOS);
				}
				break;
			case DEPREL:
				_localctx = new CheckDeprelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(DEPREL);
				}
				break;
			case FEAT:
				_localctx = new CheckFeatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(FEAT);
				}
				break;
			case MISC:
				_localctx = new CheckMiscContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(MISC);
				}
				break;
			case ID:
				_localctx = new CheckIDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(ID);
				}
				break;
			case HEADID:
				_localctx = new CheckHeadIDContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				match(HEADID);
				}
				break;
			case ABSEUD:
				_localctx = new CheckAbsEUDContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				match(ABSEUD);
				}
				break;
			case RELEUD:
				_localctx = new CheckRelEUDContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				match(RELEUD);
				}
				break;
			case MWT:
				_localctx = new CheckMWTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				match(MWT);
				}
				break;
			case ISEMPTY:
				_localctx = new CheckEmptyContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(98);
				match(ISEMPTY);
				}
				break;
			case ISMWT:
				_localctx = new CheckIsMWTContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(99);
				match(ISMWT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001fg\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00010\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001\n\u0001\f\u0001;\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003e\b"+
		"\u0003\u0001\u0003\u0000\u0001\u0002\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0000\u0080\u0000\b\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000"+
		"\u0000\u0004T\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\b"+
		"\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000"+
		"\u0000\u0000\u000b\f\u0006\u0001\uffff\uffff\u0000\f0\u0003\u0006\u0003"+
		"\u0000\r\u000e\u0005\u0015\u0000\u0000\u000e0\u0003\u0002\u0001\n\u000f"+
		"\u0010\u0005\u0016\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011"+
		"\u0012\u0005\u0017\u0000\u0000\u00120\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u0001\u0000\u0000\u0014\u0015\u0005\u0016\u0000\u0000\u0015\u0016"+
		"\u0003\u0002\u0001\u0000\u0016\u0017\u0005\u0017\u0000\u0000\u00170\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0005"+
		"\u0016\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005"+
		"\u0017\u0000\u0000\u001c0\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0003"+
		"\u0000\u0000\u001e\u001f\u0005\u0016\u0000\u0000\u001f \u0003\u0002\u0001"+
		"\u0000 !\u0005\u0017\u0000\u0000!0\u0001\u0000\u0000\u0000\"#\u0005\u0004"+
		"\u0000\u0000#$\u0005\u0016\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005"+
		"\u0017\u0000\u0000&0\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000"+
		"()\u0005\u0019\u0000\u0000)*\u0003\u0004\u0002\u0000*0\u0001\u0000\u0000"+
		"\u0000+,\u0003\u0004\u0002\u0000,-\u0005\u001a\u0000\u0000-.\u0003\u0004"+
		"\u0002\u0000.0\u0001\u0000\u0000\u0000/\u000b\u0001\u0000\u0000\u0000"+
		"/\r\u0001\u0000\u0000\u0000/\u000f\u0001\u0000\u0000\u0000/\u0013\u0001"+
		"\u0000\u0000\u0000/\u0018\u0001\u0000\u0000\u0000/\u001d\u0001\u0000\u0000"+
		"\u0000/\"\u0001\u0000\u0000\u0000/\'\u0001\u0000\u0000\u0000/+\u0001\u0000"+
		"\u0000\u000009\u0001\u0000\u0000\u000012\n\u0004\u0000\u000023\u0005\u0013"+
		"\u0000\u000038\u0003\u0002\u0001\u000545\n\u0003\u0000\u000056\u0005\u0014"+
		"\u0000\u000068\u0003\u0002\u0001\u000471\u0001\u0000\u0000\u000074\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<U\u0005\u001b\u0000\u0000=U\u0005\u001c\u0000\u0000>U\u0005"+
		"\u001d\u0000\u0000?U\u0005\u001e\u0000\u0000@A\u0005\u0001\u0000\u0000"+
		"AB\u0005\u0016\u0000\u0000BC\u0003\u0004\u0002\u0000CD\u0005\u0017\u0000"+
		"\u0000DU\u0001\u0000\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0005\u0016"+
		"\u0000\u0000GH\u0003\u0004\u0002\u0000HI\u0005\u0017\u0000\u0000IU\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0005\u0016\u0000\u0000"+
		"LM\u0003\u0004\u0002\u0000MN\u0005\u0017\u0000\u0000NU\u0001\u0000\u0000"+
		"\u0000OP\u0005\u0002\u0000\u0000PQ\u0005\u0016\u0000\u0000QR\u0003\u0004"+
		"\u0002\u0000RS\u0005\u0017\u0000\u0000SU\u0001\u0000\u0000\u0000T<\u0001"+
		"\u0000\u0000\u0000T=\u0001\u0000\u0000\u0000T>\u0001\u0000\u0000\u0000"+
		"T?\u0001\u0000\u0000\u0000T@\u0001\u0000\u0000\u0000TE\u0001\u0000\u0000"+
		"\u0000TJ\u0001\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000U\u0005\u0001"+
		"\u0000\u0000\u0000Ve\u0005\u0005\u0000\u0000We\u0005\u0006\u0000\u0000"+
		"Xe\u0005\u0007\u0000\u0000Ye\u0005\b\u0000\u0000Ze\u0005\t\u0000\u0000"+
		"[e\u0005\n\u0000\u0000\\e\u0005\u000b\u0000\u0000]e\u0005\f\u0000\u0000"+
		"^e\u0005\u000e\u0000\u0000_e\u0005\u0010\u0000\u0000`e\u0005\u000f\u0000"+
		"\u0000ae\u0005\r\u0000\u0000be\u0005\u0011\u0000\u0000ce\u0005\u0012\u0000"+
		"\u0000dV\u0001\u0000\u0000\u0000dW\u0001\u0000\u0000\u0000dX\u0001\u0000"+
		"\u0000\u0000dY\u0001\u0000\u0000\u0000dZ\u0001\u0000\u0000\u0000d[\u0001"+
		"\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000d]\u0001\u0000\u0000\u0000"+
		"d^\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000"+
		"\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000e\u0007\u0001\u0000\u0000\u0000\u0005/79Td";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}