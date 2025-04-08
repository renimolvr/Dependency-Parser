// Generated from com/orange/labs/conllparser/Replacements.g4 by ANTLR 4.13.1
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
public class ReplacementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, QUOTE=9, 
		OPEN=10, CLOSE=11, THIS=12, HEADKW=13, COLUMN=14, NUMBER=15, CHARS=16, 
		WS=17;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_token = 2, RULE_head = 3, RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "token", "head", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'+'", "'substring'", "','", "'replace'", "'cap'", "'upper'", 
			"'lower'", "'\"'", "'('", "')'", "'this'", "'head'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "QUOTE", "OPEN", 
			"CLOSE", "THIS", "HEADKW", "COLUMN", "NUMBER", "CHARS", "WS"
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
	public String getGrammarFileName() { return "Replacements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReplacementsParser(TokenStream input) {
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
		public TerminalNode EOF() { return getToken(ReplacementsParser.EOF, 0); }
		public PrintResultContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitPrintResult(this);
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
			setState(10);
			expression();
			setState(11);
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
	public static class ElementContext extends ExpressionContext {
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public ElementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			_localctx = new ElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			token();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(14);
					match(T__0);
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(20);
				match(T__1);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(21);
					match(T__0);
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27);
				token();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TokenContext extends ParserRuleContext {
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
	 
		public TokenContext() { }
		public void copyFrom(TokenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrossContext extends TokenContext {
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public GrossContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitGross(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KopfContext extends TokenContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public KopfContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitKopf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReplContext extends TokenContext {
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public ReplContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitRepl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends TokenContext {
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public BlockContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpalteContext extends TokenContext {
		public TerminalNode THIS() { return getToken(ReplacementsParser.THIS, 0); }
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TerminalNode COLUMN() { return getToken(ReplacementsParser.COLUMN, 0); }
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public SpalteContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitSpalte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WortContext extends TokenContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public WortContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitWort(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubstrContext extends TokenContext {
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReplacementsParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReplacementsParser.NUMBER, i);
		}
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public SubstrContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitSubstr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KleinContext extends TokenContext {
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public KleinContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitKlein(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_token);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				_localctx = new SpalteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(THIS);
				setState(34);
				match(OPEN);
				setState(35);
				match(COLUMN);
				setState(36);
				match(CLOSE);
				}
				break;
			case HEADKW:
				_localctx = new KopfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				head();
				}
				break;
			case CHARS:
				_localctx = new WortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				value();
				}
				break;
			case T__2:
				_localctx = new SubstrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(T__2);
				setState(40);
				match(OPEN);
				setState(41);
				token();
				setState(42);
				match(T__3);
				setState(43);
				match(NUMBER);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(44);
					match(T__3);
					setState(45);
					match(NUMBER);
					}
				}

				setState(48);
				match(CLOSE);
				}
				break;
			case T__4:
				_localctx = new ReplContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__4);
				setState(51);
				match(OPEN);
				setState(52);
				token();
				setState(53);
				match(T__3);
				setState(54);
				value();
				setState(55);
				match(T__3);
				setState(56);
				value();
				setState(57);
				match(CLOSE);
				}
				break;
			case T__5:
				_localctx = new GrossContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(T__5);
				setState(60);
				match(OPEN);
				setState(61);
				token();
				setState(62);
				match(CLOSE);
				}
				break;
			case T__6:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(T__6);
				setState(65);
				match(OPEN);
				setState(66);
				token();
				setState(67);
				match(CLOSE);
				}
				break;
			case T__7:
				_localctx = new KleinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				match(T__7);
				setState(70);
				match(OPEN);
				setState(71);
				token();
				setState(72);
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
	public static class HeadContext extends ParserRuleContext {
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
	 
		public HeadContext() { }
		public void copyFrom(HeadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KopfspalteContext extends HeadContext {
		public TerminalNode HEADKW() { return getToken(ReplacementsParser.HEADKW, 0); }
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TerminalNode COLUMN() { return getToken(ReplacementsParser.COLUMN, 0); }
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public KopfspalteContext(HeadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitKopfspalte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KopfkopfContext extends HeadContext {
		public HeadContext inner;
		public TerminalNode HEADKW() { return getToken(ReplacementsParser.HEADKW, 0); }
		public TerminalNode OPEN() { return getToken(ReplacementsParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(ReplacementsParser.CLOSE, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public KopfkopfContext(HeadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitKopfkopf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new KopfspalteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(HEADKW);
				setState(77);
				match(OPEN);
				setState(78);
				match(COLUMN);
				setState(79);
				match(CLOSE);
				}
				break;
			case 2:
				_localctx = new KopfkopfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(HEADKW);
				setState(81);
				match(OPEN);
				setState(82);
				((KopfkopfContext)_localctx).inner = head();
				setState(83);
				match(CLOSE);
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
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WortohneContext extends ValueContext {
		public TerminalNode CHARS() { return getToken(ReplacementsParser.CHARS, 0); }
		public WortohneContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReplacementsVisitor ) return ((ReplacementsVisitor<? extends T>)visitor).visitWortohne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			_localctx = new WortohneContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CHARS);
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
		"\u0004\u0001\u0011Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0010"+
		"\b\u0001\n\u0001\f\u0001\u0013\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0001\u0005\u0001\u001d"+
		"\b\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003V\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000`\u0000\n\u0001"+
		"\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004J\u0001\u0000"+
		"\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001"+
		"\u0001\u0000\u0000\u0000\r\u001e\u0003\u0004\u0002\u0000\u000e\u0010\u0005"+
		"\u0001\u0000\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0018\u0005\u0002\u0000\u0000\u0015\u0017\u0005"+
		"\u0001\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001"+
		"\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c\u0011\u0001"+
		"\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0005\f\u0000\u0000\"#"+
		"\u0005\n\u0000\u0000#$\u0005\u000e\u0000\u0000$K\u0005\u000b\u0000\u0000"+
		"%K\u0003\u0006\u0003\u0000&K\u0003\b\u0004\u0000\'(\u0005\u0003\u0000"+
		"\u0000()\u0005\n\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005\u0004\u0000"+
		"\u0000+.\u0005\u000f\u0000\u0000,-\u0005\u0004\u0000\u0000-/\u0005\u000f"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0005\u000b\u0000\u00001K\u0001\u0000\u0000\u0000"+
		"23\u0005\u0005\u0000\u000034\u0005\n\u0000\u000045\u0003\u0004\u0002\u0000"+
		"56\u0005\u0004\u0000\u000067\u0003\b\u0004\u000078\u0005\u0004\u0000\u0000"+
		"89\u0003\b\u0004\u00009:\u0005\u000b\u0000\u0000:K\u0001\u0000\u0000\u0000"+
		";<\u0005\u0006\u0000\u0000<=\u0005\n\u0000\u0000=>\u0003\u0004\u0002\u0000"+
		">?\u0005\u000b\u0000\u0000?K\u0001\u0000\u0000\u0000@A\u0005\u0007\u0000"+
		"\u0000AB\u0005\n\u0000\u0000BC\u0003\u0004\u0002\u0000CD\u0005\u000b\u0000"+
		"\u0000DK\u0001\u0000\u0000\u0000EF\u0005\b\u0000\u0000FG\u0005\n\u0000"+
		"\u0000GH\u0003\u0004\u0002\u0000HI\u0005\u000b\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000J!\u0001\u0000\u0000\u0000J%\u0001\u0000\u0000\u0000J&\u0001"+
		"\u0000\u0000\u0000J\'\u0001\u0000\u0000\u0000J2\u0001\u0000\u0000\u0000"+
		"J;\u0001\u0000\u0000\u0000J@\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000"+
		"\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0005\r\u0000\u0000MN\u0005\n"+
		"\u0000\u0000NO\u0005\u000e\u0000\u0000OV\u0005\u000b\u0000\u0000PQ\u0005"+
		"\r\u0000\u0000QR\u0005\n\u0000\u0000RS\u0003\u0006\u0003\u0000ST\u0005"+
		"\u000b\u0000\u0000TV\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000"+
		"UP\u0001\u0000\u0000\u0000V\u0007\u0001\u0000\u0000\u0000WX\u0005\u0010"+
		"\u0000\u0000X\t\u0001\u0000\u0000\u0000\u0006\u0011\u0018\u001e.JU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}