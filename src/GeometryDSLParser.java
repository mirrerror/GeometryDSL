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
		RULE_geometry = 0, RULE_statement = 1, RULE_assignStmt = 2, RULE_pointStmt = 3, 
		RULE_lineStmt = 4, RULE_circleStmt = 5, RULE_functionCall = 6, RULE_args = 7, 
		RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"geometry", "statement", "assignStmt", "pointStmt", "lineStmt", "circleStmt", 
			"functionCall", "args", "expr"
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
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
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
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
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				pointStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				lineStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				circleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				assignStmt();
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
	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(ID);
			setState(31);
			match(EQUALS);
			setState(32);
			expr();
			setState(33);
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
	public static class PointStmtContext extends ParserRuleContext {
		public ExprContext x;
		public ExprContext y;
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GeometryDSLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 6, RULE_pointStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(ID);
			setState(37);
			match(EQUALS);
			setState(38);
			match(LPAREN);
			setState(39);
			((PointStmtContext)_localctx).x = expr();
			setState(40);
			match(COMMA);
			setState(41);
			((PointStmtContext)_localctx).y = expr();
			setState(42);
			match(RPAREN);
			setState(43);
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
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public ExprContext e4;
		public Token p1;
		public Token p2;
		public List<TerminalNode> ID() { return getTokens(GeometryDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeometryDSLParser.ID, i);
		}
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 8, RULE_lineStmt);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__1);
				setState(46);
				match(ID);
				setState(47);
				match(EQUALS);
				setState(48);
				match(FROM);
				setState(49);
				match(LPAREN);
				setState(50);
				((LineStmtContext)_localctx).e1 = expr();
				setState(51);
				match(COMMA);
				setState(52);
				((LineStmtContext)_localctx).e2 = expr();
				setState(53);
				match(RPAREN);
				setState(54);
				match(TO);
				setState(55);
				match(LPAREN);
				setState(56);
				((LineStmtContext)_localctx).e3 = expr();
				setState(57);
				match(COMMA);
				setState(58);
				((LineStmtContext)_localctx).e4 = expr();
				setState(59);
				match(RPAREN);
				setState(60);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__1);
				setState(63);
				match(ID);
				setState(64);
				match(EQUALS);
				setState(65);
				match(FROM);
				setState(66);
				match(LPAREN);
				setState(67);
				((LineStmtContext)_localctx).p1 = match(ID);
				setState(68);
				match(RPAREN);
				setState(69);
				match(TO);
				setState(70);
				match(LPAREN);
				setState(71);
				((LineStmtContext)_localctx).p2 = match(ID);
				setState(72);
				match(RPAREN);
				setState(73);
				match(SEMI);
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
	public static class CircleStmtContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext r;
		public Token p;
		public List<TerminalNode> ID() { return getTokens(GeometryDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeometryDSLParser.ID, i);
		}
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 10, RULE_circleStmt);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__2);
				setState(77);
				match(ID);
				setState(78);
				match(EQUALS);
				setState(79);
				match(CENTER);
				setState(80);
				match(LPAREN);
				setState(81);
				((CircleStmtContext)_localctx).e1 = expr();
				setState(82);
				match(COMMA);
				setState(83);
				((CircleStmtContext)_localctx).e2 = expr();
				setState(84);
				match(RPAREN);
				setState(85);
				match(RADIUS);
				setState(86);
				match(EQUALS);
				setState(87);
				((CircleStmtContext)_localctx).r = expr();
				setState(88);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__2);
				setState(91);
				match(ID);
				setState(92);
				match(EQUALS);
				setState(93);
				match(CENTER);
				setState(94);
				match(LPAREN);
				setState(95);
				((CircleStmtContext)_localctx).p = match(ID);
				setState(96);
				match(RPAREN);
				setState(97);
				match(RADIUS);
				setState(98);
				match(EQUALS);
				setState(99);
				((CircleStmtContext)_localctx).r = expr();
				setState(100);
				match(SEMI);
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
		enterRule(_localctx, 12, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			match(LPAREN);
			setState(106);
			args();
			setState(107);
			match(RPAREN);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(108);
				match(SEMI);
				}
				break;
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
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(111);
				expr();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(112);
					match(COMMA);
					setState(113);
					expr();
					}
					}
					setState(118);
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
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
		"\u0004\u0001\u0010\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000"+
		"\u0015\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007s\b\u0007\n\u0007\f\u0007v\t\u0007\u0003"+
		"\u0007x\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b}\b\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000\u0081\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004\u001e"+
		"\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\bJ\u0001\u0000"+
		"\u0000\u0000\nf\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000e"+
		"w\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u001d\u0003"+
		"\u0006\u0003\u0000\u0018\u001d\u0003\b\u0004\u0000\u0019\u001d\u0003\n"+
		"\u0005\u0000\u001a\u001d\u0003\f\u0006\u0000\u001b\u001d\u0003\u0004\u0002"+
		"\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000\u0000"+
		"\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u000e\u0000\u0000\u001f \u0005\u0004\u0000\u0000"+
		" !\u0003\u0010\b\u0000!\"\u0005\b\u0000\u0000\"\u0005\u0001\u0000\u0000"+
		"\u0000#$\u0005\u0001\u0000\u0000$%\u0005\u000e\u0000\u0000%&\u0005\u0004"+
		"\u0000\u0000&\'\u0005\u0006\u0000\u0000\'(\u0003\u0010\b\u0000()\u0005"+
		"\u0005\u0000\u0000)*\u0003\u0010\b\u0000*+\u0005\u0007\u0000\u0000+,\u0005"+
		"\b\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-.\u0005\u0002\u0000\u0000"+
		"./\u0005\u000e\u0000\u0000/0\u0005\u0004\u0000\u000001\u0005\t\u0000\u0000"+
		"12\u0005\u0006\u0000\u000023\u0003\u0010\b\u000034\u0005\u0005\u0000\u0000"+
		"45\u0003\u0010\b\u000056\u0005\u0007\u0000\u000067\u0005\n\u0000\u0000"+
		"78\u0005\u0006\u0000\u000089\u0003\u0010\b\u00009:\u0005\u0005\u0000\u0000"+
		":;\u0003\u0010\b\u0000;<\u0005\u0007\u0000\u0000<=\u0005\b\u0000\u0000"+
		"=K\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005\u000e\u0000"+
		"\u0000@A\u0005\u0004\u0000\u0000AB\u0005\t\u0000\u0000BC\u0005\u0006\u0000"+
		"\u0000CD\u0005\u000e\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0005\n\u0000"+
		"\u0000FG\u0005\u0006\u0000\u0000GH\u0005\u000e\u0000\u0000HI\u0005\u0007"+
		"\u0000\u0000IK\u0005\b\u0000\u0000J-\u0001\u0000\u0000\u0000J>\u0001\u0000"+
		"\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005"+
		"\u000e\u0000\u0000NO\u0005\u0004\u0000\u0000OP\u0005\u000b\u0000\u0000"+
		"PQ\u0005\u0006\u0000\u0000QR\u0003\u0010\b\u0000RS\u0005\u0005\u0000\u0000"+
		"ST\u0003\u0010\b\u0000TU\u0005\u0007\u0000\u0000UV\u0005\f\u0000\u0000"+
		"VW\u0005\u0004\u0000\u0000WX\u0003\u0010\b\u0000XY\u0005\b\u0000\u0000"+
		"Yg\u0001\u0000\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0005\u000e\u0000"+
		"\u0000\\]\u0005\u0004\u0000\u0000]^\u0005\u000b\u0000\u0000^_\u0005\u0006"+
		"\u0000\u0000_`\u0005\u000e\u0000\u0000`a\u0005\u0007\u0000\u0000ab\u0005"+
		"\f\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0003\u0010\b\u0000de\u0005"+
		"\b\u0000\u0000eg\u0001\u0000\u0000\u0000fL\u0001\u0000\u0000\u0000fZ\u0001"+
		"\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0005\u000e\u0000"+
		"\u0000ij\u0005\u0006\u0000\u0000jk\u0003\u000e\u0007\u0000km\u0005\u0007"+
		"\u0000\u0000ln\u0005\b\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n\r\u0001\u0000\u0000\u0000ot\u0003\u0010\b\u0000pq\u0005"+
		"\u0005\u0000\u0000qs\u0003\u0010\b\u0000rp\u0001\u0000\u0000\u0000sv\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wo\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000y}\u0005"+
		"\u000f\u0000\u0000z}\u0005\u000e\u0000\u0000{}\u0003\f\u0006\u0000|y\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000\b\u0015\u001cJfmtw|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}