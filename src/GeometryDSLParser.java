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
		public Token x;
		public Token y;
		public Token v1;
		public Token v2;
		public List<TerminalNode> ID() { return getTokens(GeometryDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeometryDSLParser.ID, i);
		}
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
		enterRule(_localctx, 6, RULE_pointStmt);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
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
				((PointStmtContext)_localctx).x = match(NUMBER);
				setState(40);
				match(COMMA);
				setState(41);
				((PointStmtContext)_localctx).y = match(NUMBER);
				setState(42);
				match(RPAREN);
				setState(43);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__0);
				setState(45);
				match(ID);
				setState(46);
				match(EQUALS);
				setState(47);
				match(LPAREN);
				setState(48);
				((PointStmtContext)_localctx).v1 = match(ID);
				setState(49);
				match(COMMA);
				setState(50);
				((PointStmtContext)_localctx).v2 = match(ID);
				setState(51);
				match(RPAREN);
				setState(52);
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
	public static class LineStmtContext extends ParserRuleContext {
		public Token x1;
		public Token y1;
		public Token x2;
		public Token y2;
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
		enterRule(_localctx, 8, RULE_lineStmt);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__1);
				setState(56);
				match(ID);
				setState(57);
				match(EQUALS);
				setState(58);
				match(FROM);
				setState(59);
				match(LPAREN);
				setState(60);
				((LineStmtContext)_localctx).x1 = match(NUMBER);
				setState(61);
				match(COMMA);
				setState(62);
				((LineStmtContext)_localctx).y1 = match(NUMBER);
				setState(63);
				match(RPAREN);
				setState(64);
				match(TO);
				setState(65);
				match(LPAREN);
				setState(66);
				((LineStmtContext)_localctx).x2 = match(NUMBER);
				setState(67);
				match(COMMA);
				setState(68);
				((LineStmtContext)_localctx).y2 = match(NUMBER);
				setState(69);
				match(RPAREN);
				setState(70);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__1);
				setState(72);
				match(ID);
				setState(73);
				match(EQUALS);
				setState(74);
				match(FROM);
				setState(75);
				match(LPAREN);
				setState(76);
				((LineStmtContext)_localctx).p1 = match(ID);
				setState(77);
				match(RPAREN);
				setState(78);
				match(TO);
				setState(79);
				match(LPAREN);
				setState(80);
				((LineStmtContext)_localctx).p2 = match(ID);
				setState(81);
				match(RPAREN);
				setState(82);
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
		public Token x;
		public Token y;
		public Token r;
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
		enterRule(_localctx, 10, RULE_circleStmt);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__2);
				setState(86);
				match(ID);
				setState(87);
				match(EQUALS);
				setState(88);
				match(CENTER);
				setState(89);
				match(LPAREN);
				setState(90);
				((CircleStmtContext)_localctx).x = match(NUMBER);
				setState(91);
				match(COMMA);
				setState(92);
				((CircleStmtContext)_localctx).y = match(NUMBER);
				setState(93);
				match(RPAREN);
				setState(94);
				match(RADIUS);
				setState(95);
				match(EQUALS);
				setState(96);
				((CircleStmtContext)_localctx).r = match(NUMBER);
				setState(97);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__2);
				setState(99);
				match(ID);
				setState(100);
				match(EQUALS);
				setState(101);
				match(CENTER);
				setState(102);
				match(LPAREN);
				setState(103);
				((CircleStmtContext)_localctx).p = match(ID);
				setState(104);
				match(RPAREN);
				setState(105);
				match(RADIUS);
				setState(106);
				match(EQUALS);
				setState(107);
				((CircleStmtContext)_localctx).r = match(NUMBER);
				setState(108);
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
			setState(111);
			match(ID);
			setState(112);
			match(LPAREN);
			setState(113);
			args();
			setState(114);
			match(RPAREN);
			setState(115);
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
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(117);
				expr();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					expr();
					}
					}
					setState(124);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
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
		"\u0004\u0001\u0010\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000"+
		"\u0015\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004T\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007\u0003"+
		"\u0007~\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b\b\u0001\b\u0000"+
		"\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000\u0087\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004"+
		"\u001e\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\bS\u0001"+
		"\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000"+
		"\u000e}\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012"+
		"\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017"+
		"\u001d\u0003\u0006\u0003\u0000\u0018\u001d\u0003\b\u0004\u0000\u0019\u001d"+
		"\u0003\n\u0005\u0000\u001a\u001d\u0003\f\u0006\u0000\u001b\u001d\u0003"+
		"\u0004\u0002\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001"+
		"\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u000e\u0000\u0000\u001f \u0005\u0004"+
		"\u0000\u0000 !\u0003\u0010\b\u0000!\"\u0005\b\u0000\u0000\"\u0005\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0005\u000e\u0000\u0000"+
		"%&\u0005\u0004\u0000\u0000&\'\u0005\u0006\u0000\u0000\'(\u0005\u000f\u0000"+
		"\u0000()\u0005\u0005\u0000\u0000)*\u0005\u000f\u0000\u0000*+\u0005\u0007"+
		"\u0000\u0000+6\u0005\b\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0005\u000e"+
		"\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005"+
		"\u000e\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u000e\u0000\u0000"+
		"34\u0005\u0007\u0000\u000046\u0005\b\u0000\u00005#\u0001\u0000\u0000\u0000"+
		"5,\u0001\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u0005\u0002"+
		"\u0000\u000089\u0005\u000e\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0005"+
		"\t\u0000\u0000;<\u0005\u0006\u0000\u0000<=\u0005\u000f\u0000\u0000=>\u0005"+
		"\u0005\u0000\u0000>?\u0005\u000f\u0000\u0000?@\u0005\u0007\u0000\u0000"+
		"@A\u0005\n\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0005\u000f\u0000\u0000"+
		"CD\u0005\u0005\u0000\u0000DE\u0005\u000f\u0000\u0000EF\u0005\u0007\u0000"+
		"\u0000FT\u0005\b\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u000e\u0000"+
		"\u0000IJ\u0005\u0004\u0000\u0000JK\u0005\t\u0000\u0000KL\u0005\u0006\u0000"+
		"\u0000LM\u0005\u000e\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0005\n\u0000"+
		"\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\u000e\u0000\u0000QR\u0005\u0007"+
		"\u0000\u0000RT\u0005\b\u0000\u0000S7\u0001\u0000\u0000\u0000SG\u0001\u0000"+
		"\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005"+
		"\u000e\u0000\u0000WX\u0005\u0004\u0000\u0000XY\u0005\u000b\u0000\u0000"+
		"YZ\u0005\u0006\u0000\u0000Z[\u0005\u000f\u0000\u0000[\\\u0005\u0005\u0000"+
		"\u0000\\]\u0005\u000f\u0000\u0000]^\u0005\u0007\u0000\u0000^_\u0005\f"+
		"\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0005\u000f\u0000\u0000an\u0005"+
		"\b\u0000\u0000bc\u0005\u0003\u0000\u0000cd\u0005\u000e\u0000\u0000de\u0005"+
		"\u0004\u0000\u0000ef\u0005\u000b\u0000\u0000fg\u0005\u0006\u0000\u0000"+
		"gh\u0005\u000e\u0000\u0000hi\u0005\u0007\u0000\u0000ij\u0005\f\u0000\u0000"+
		"jk\u0005\u0004\u0000\u0000kl\u0005\u000f\u0000\u0000ln\u0005\b\u0000\u0000"+
		"mU\u0001\u0000\u0000\u0000mb\u0001\u0000\u0000\u0000n\u000b\u0001\u0000"+
		"\u0000\u0000op\u0005\u000e\u0000\u0000pq\u0005\u0006\u0000\u0000qr\u0003"+
		"\u000e\u0007\u0000rs\u0005\u0007\u0000\u0000st\u0005\b\u0000\u0000t\r"+
		"\u0001\u0000\u0000\u0000uz\u0003\u0010\b\u0000vw\u0005\u0005\u0000\u0000"+
		"wy\u0003\u0010\b\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u000f\u0000"+
		"\u0000\u0080\u0083\u0005\u000e\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000"+
		"\b\u0015\u001c5Smz}\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}