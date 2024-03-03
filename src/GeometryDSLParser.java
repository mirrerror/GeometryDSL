// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GeometryDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EQUALS=4, COMMA=5, LPAREN=6, RPAREN=7, SEMI=8, 
		FROM=9, TO=10, CENTER=11, RADIUS=12, FUNCTION=13, ID=14, NUMBER=15, WS=16;
	public static final int
		RULE_geometry = 0, RULE_statement = 1, RULE_pointStmt = 2, RULE_lineStmt = 3, 
		RULE_circleStmt = 4, RULE_functionCall = 5, RULE_args = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"geometry", "statement", "pointStmt", "lineStmt", "circleStmt", "functionCall", 
			"args", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'point'", "'line'", "'circle'", "'='", "','", "'('", "')'", "';'", 
			"'from'", "'to'", "'center'", "'radius'", "'function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS", "COMMA", "LPAREN", "RPAREN", "SEMI", 
			"FROM", "TO", "CENTER", "RADIUS", "FUNCTION", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "GeometryDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeometryDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeometryContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public GeometryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterGeometry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitGeometry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitGeometry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeometryContext geometry() throws RecognitionException {
		GeometryContext _localctx = new GeometryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_geometry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16398L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public PointStmtContext pointStmt() {
			return getRuleContext(PointStmtContext.class,0);
		}
		public LineStmtContext lineStmt() {
			return getRuleContext(LineStmtContext.class,0);
		}
		public CircleStmtContext circleStmt() {
			return getRuleContext(CircleStmtContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				pointStmt();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				lineStmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				circleStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				functionCall();
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
	public static class PointStmtContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GeometryDSLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GeometryDSLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GeometryDSLParser.NUMBER, i);
		}
		public PointStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterPointStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitPointStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitPointStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointStmtContext pointStmt() throws RecognitionException {
		PointStmtContext _localctx = new PointStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pointStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			match(ID);
			setState(29);
			match(EQUALS);
			setState(30);
			match(LPAREN);
			setState(31);
			((PointStmtContext)_localctx).x = match(NUMBER);
			setState(32);
			match(COMMA);
			setState(33);
			((PointStmtContext)_localctx).y = match(NUMBER);
			setState(34);
			match(RPAREN);
			setState(35);
			match(SEMI);
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
	public static class LineStmtContext extends ParserRuleContext {
		public Token x1;
		public Token y1;
		public Token x2;
		public Token y2;
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(GeometryDSLParser.FROM, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(GeometryDSLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(GeometryDSLParser.LPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GeometryDSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GeometryDSLParser.COMMA, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(GeometryDSLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(GeometryDSLParser.RPAREN, i);
		}
		public TerminalNode TO() { return getToken(GeometryDSLParser.TO, 0); }
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GeometryDSLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GeometryDSLParser.NUMBER, i);
		}
		public LineStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterLineStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitLineStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitLineStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStmtContext lineStmt() throws RecognitionException {
		LineStmtContext _localctx = new LineStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lineStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(38);
			match(ID);
			setState(39);
			match(EQUALS);
			setState(40);
			match(FROM);
			setState(41);
			match(LPAREN);
			setState(42);
			((LineStmtContext)_localctx).x1 = match(NUMBER);
			setState(43);
			match(COMMA);
			setState(44);
			((LineStmtContext)_localctx).y1 = match(NUMBER);
			setState(45);
			match(RPAREN);
			setState(46);
			match(TO);
			setState(47);
			match(LPAREN);
			setState(48);
			((LineStmtContext)_localctx).x2 = match(NUMBER);
			setState(49);
			match(COMMA);
			setState(50);
			((LineStmtContext)_localctx).y2 = match(NUMBER);
			setState(51);
			match(RPAREN);
			setState(52);
			match(SEMI);
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
	public static class CircleStmtContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public Token r;
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(GeometryDSLParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(GeometryDSLParser.EQUALS, i);
		}
		public TerminalNode CENTER() { return getToken(GeometryDSLParser.CENTER, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GeometryDSLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public TerminalNode RADIUS() { return getToken(GeometryDSLParser.RADIUS, 0); }
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GeometryDSLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GeometryDSLParser.NUMBER, i);
		}
		public CircleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterCircleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitCircleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitCircleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleStmtContext circleStmt() throws RecognitionException {
		CircleStmtContext _localctx = new CircleStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_circleStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(55);
			match(ID);
			setState(56);
			match(EQUALS);
			setState(57);
			match(CENTER);
			setState(58);
			match(LPAREN);
			setState(59);
			((CircleStmtContext)_localctx).x = match(NUMBER);
			setState(60);
			match(COMMA);
			setState(61);
			((CircleStmtContext)_localctx).y = match(NUMBER);
			setState(62);
			match(RPAREN);
			setState(63);
			match(RADIUS);
			setState(64);
			match(EQUALS);
			setState(65);
			((CircleStmtContext)_localctx).r = match(NUMBER);
			setState(66);
			match(SEMI);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(LPAREN);
			setState(70);
			args();
			setState(71);
			match(RPAREN);
			setState(72);
			match(SEMI);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GeometryDSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GeometryDSLParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(74);
				expr();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(75);
					match(COMMA);
					setState(76);
					expr();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GeometryDSLParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				functionCall();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t\u0006\u0003\u0006"+
		"S\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007X\b\u0007\u0001"+
		"\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000Y"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000"+
		"\u0004\u001b\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b"+
		"6\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000"+
		"\u0000\u000eW\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u001a\u0003\u0004\u0002\u0000"+
		"\u0016\u001a\u0003\u0006\u0003\u0000\u0017\u001a\u0003\b\u0004\u0000\u0018"+
		"\u001a\u0003\n\u0005\u0000\u0019\u0015\u0001\u0000\u0000\u0000\u0019\u0016"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005\u0001\u0000\u0000\u001c\u001d\u0005\u000e\u0000\u0000\u001d\u001e"+
		"\u0005\u0004\u0000\u0000\u001e\u001f\u0005\u0006\u0000\u0000\u001f \u0005"+
		"\u000f\u0000\u0000 !\u0005\u0005\u0000\u0000!\"\u0005\u000f\u0000\u0000"+
		"\"#\u0005\u0007\u0000\u0000#$\u0005\b\u0000\u0000$\u0005\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0002\u0000\u0000&\'\u0005\u000e\u0000\u0000\'(\u0005\u0004"+
		"\u0000\u0000()\u0005\t\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005\u000f"+
		"\u0000\u0000+,\u0005\u0005\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0005"+
		"\u0007\u0000\u0000./\u0005\n\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005"+
		"\u000f\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u000f\u0000\u0000"+
		"34\u0005\u0007\u0000\u000045\u0005\b\u0000\u00005\u0007\u0001\u0000\u0000"+
		"\u000067\u0005\u0003\u0000\u000078\u0005\u000e\u0000\u000089\u0005\u0004"+
		"\u0000\u00009:\u0005\u000b\u0000\u0000:;\u0005\u0006\u0000\u0000;<\u0005"+
		"\u000f\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0005\u000f\u0000\u0000"+
		">?\u0005\u0007\u0000\u0000?@\u0005\f\u0000\u0000@A\u0005\u0004\u0000\u0000"+
		"AB\u0005\u000f\u0000\u0000BC\u0005\b\u0000\u0000C\t\u0001\u0000\u0000"+
		"\u0000DE\u0005\u000e\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0003\f\u0006"+
		"\u0000GH\u0005\u0007\u0000\u0000HI\u0005\b\u0000\u0000I\u000b\u0001\u0000"+
		"\u0000\u0000JO\u0003\u000e\u0007\u0000KL\u0005\u0005\u0000\u0000LN\u0003"+
		"\u000e\u0007\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RJ\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000S\r\u0001\u0000\u0000\u0000TX\u0005\u000f\u0000\u0000UX\u0005"+
		"\u000e\u0000\u0000VX\u0003\n\u0005\u0000WT\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X\u000f\u0001\u0000\u0000"+
		"\u0000\u0005\u0013\u0019ORW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}