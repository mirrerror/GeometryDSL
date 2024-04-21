package geometrydsl;// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
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
		EQUALS=1, COMMA=2, LPAREN=3, RPAREN=4, LBRACE=5, RBRACE=6, SEMI=7, POINT=8, 
		LINE=9, CIRCLE=10, TRIANGLE=11, RECTANGLE=12, FROM=13, TO=14, CENTER=15, 
		RADIUS=16, FUNCTION=17, FOR=18, WHILE=19, IF=20, ELSE=21, PLUS=22, MINUS=23, 
		MULTIPLY=24, DIVIDE=25, GREATER=26, LESS=27, EQUAL=28, NOT_EQUAL=29, GREATER_EQ=30, 
		LESS_EQ=31, ID=32, NUMBER=33, WS=34;
	public static final int
		RULE_geometry = 0, RULE_statement = 1, RULE_singleStatement = 2, RULE_blockStatement = 3, 
		RULE_assignStmt = 4, RULE_pointStmt = 5, RULE_lineStmt = 6, RULE_circleStmt = 7, 
		RULE_triangleStmt = 8, RULE_rectangleStmt = 9, RULE_functionCall = 10, 
		RULE_args = 11, RULE_expr = 12, RULE_booleanExpr = 13, RULE_forLoop = 14, 
		RULE_whileLoop = 15, RULE_ifStmt = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"geometry", "statement", "singleStatement", "blockStatement", "assignStmt", 
			"pointStmt", "lineStmt", "circleStmt", "triangleStmt", "rectangleStmt", 
			"functionCall", "args", "expr", "booleanExpr", "forLoop", "whileLoop", 
			"ifStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'('", "')'", "'{'", "'}'", "';'", "'point'", "'line'", 
			"'circle'", "'triangle'", "'rectangle'", "'from'", "'to'", "'center'", 
			"'radius'", "'function'", "'for'", "'while'", "'if'", "'else'", "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
			"POINT", "LINE", "CIRCLE", "TRIANGLE", "RECTANGLE", "FROM", "TO", "CENTER", 
			"RADIUS", "FUNCTION", "FOR", "WHILE", "IF", "ELSE", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "GREATER", "LESS", "EQUAL", "NOT_EQUAL", "GREATER_EQ", 
			"LESS_EQ", "ID", "NUMBER", "WS"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 12886744864L) != 0) );
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
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
			case LINE:
			case CIRCLE:
			case TRIANGLE:
			case RECTANGLE:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				singleStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				blockStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				whileLoop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				ifStmt();
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
	public static class SingleStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(GeometryDSLParser.SEMI, 0); }
		public PointStmtContext pointStmt() {
			return getRuleContext(PointStmtContext.class,0);
		}
		public LineStmtContext lineStmt() {
			return getRuleContext(LineStmtContext.class,0);
		}
		public CircleStmtContext circleStmt() {
			return getRuleContext(CircleStmtContext.class,0);
		}
		public TriangleStmtContext triangleStmt() {
			return getRuleContext(TriangleStmtContext.class,0);
		}
		public RectangleStmtContext rectangleStmt() {
			return getRuleContext(RectangleStmtContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(46);
				pointStmt();
				}
				break;
			case 2:
				{
				setState(47);
				lineStmt();
				}
				break;
			case 3:
				{
				setState(48);
				circleStmt();
				}
				break;
			case 4:
				{
				setState(49);
				triangleStmt();
				}
				break;
			case 5:
				{
				setState(50);
				rectangleStmt();
				}
				break;
			case 6:
				{
				setState(51);
				functionCall();
				}
				break;
			case 7:
				{
				setState(52);
				assignStmt();
				}
				break;
			case 8:
				{
				setState(53);
				expr(0);
				}
				break;
			}
			setState(56);
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
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GeometryDSLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GeometryDSLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(LBRACE);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12886744864L) != 0)) {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(RBRACE);
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
		enterRule(_localctx, 8, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(EQUALS);
			setState(69);
			expr(0);
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
		public TerminalNode POINT() { return getToken(GeometryDSLParser.POINT, 0); }
		public TerminalNode ID() { return getToken(GeometryDSLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GeometryDSLParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
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
		enterRule(_localctx, 10, RULE_pointStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(POINT);
			setState(72);
			match(ID);
			setState(73);
			match(EQUALS);
			setState(74);
			match(LPAREN);
			setState(75);
			((PointStmtContext)_localctx).x = expr(0);
			setState(76);
			match(COMMA);
			setState(77);
			((PointStmtContext)_localctx).y = expr(0);
			setState(78);
			match(RPAREN);
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
		public TerminalNode LINE() { return getToken(GeometryDSLParser.LINE, 0); }
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
		enterRule(_localctx, 12, RULE_lineStmt);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(LINE);
				setState(81);
				match(ID);
				setState(82);
				match(EQUALS);
				setState(83);
				match(FROM);
				setState(84);
				match(LPAREN);
				setState(85);
				((LineStmtContext)_localctx).e1 = expr(0);
				setState(86);
				match(COMMA);
				setState(87);
				((LineStmtContext)_localctx).e2 = expr(0);
				setState(88);
				match(RPAREN);
				setState(89);
				match(TO);
				setState(90);
				match(LPAREN);
				setState(91);
				((LineStmtContext)_localctx).e3 = expr(0);
				setState(92);
				match(COMMA);
				setState(93);
				((LineStmtContext)_localctx).e4 = expr(0);
				setState(94);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(LINE);
				setState(97);
				match(ID);
				setState(98);
				match(EQUALS);
				setState(99);
				match(FROM);
				setState(100);
				match(LPAREN);
				setState(101);
				((LineStmtContext)_localctx).p1 = match(ID);
				setState(102);
				match(RPAREN);
				setState(103);
				match(TO);
				setState(104);
				match(LPAREN);
				setState(105);
				((LineStmtContext)_localctx).p2 = match(ID);
				setState(106);
				match(RPAREN);
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
		public TerminalNode CIRCLE() { return getToken(GeometryDSLParser.CIRCLE, 0); }
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
		enterRule(_localctx, 14, RULE_circleStmt);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(CIRCLE);
				setState(110);
				match(ID);
				setState(111);
				match(EQUALS);
				setState(112);
				match(CENTER);
				setState(113);
				match(LPAREN);
				setState(114);
				((CircleStmtContext)_localctx).e1 = expr(0);
				setState(115);
				match(COMMA);
				setState(116);
				((CircleStmtContext)_localctx).e2 = expr(0);
				setState(117);
				match(RPAREN);
				setState(118);
				match(RADIUS);
				setState(119);
				match(EQUALS);
				setState(120);
				((CircleStmtContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(CIRCLE);
				setState(123);
				match(ID);
				setState(124);
				match(EQUALS);
				setState(125);
				match(CENTER);
				setState(126);
				match(LPAREN);
				setState(127);
				((CircleStmtContext)_localctx).p = match(ID);
				setState(128);
				match(RPAREN);
				setState(129);
				match(RADIUS);
				setState(130);
				match(EQUALS);
				setState(131);
				((CircleStmtContext)_localctx).r = expr(0);
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
	public static class TriangleStmtContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public ExprContext e4;
		public ExprContext e5;
		public ExprContext e6;
		public Token p1;
		public Token p2;
		public Token p3;
		public TerminalNode TRIANGLE() { return getToken(GeometryDSLParser.TRIANGLE, 0); }
		public List<TerminalNode> ID() { return getTokens(GeometryDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeometryDSLParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GeometryDSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GeometryDSLParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TriangleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triangleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterTriangleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitTriangleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitTriangleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriangleStmtContext triangleStmt() throws RecognitionException {
		TriangleStmtContext _localctx = new TriangleStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_triangleStmt);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(TRIANGLE);
				setState(135);
				match(ID);
				setState(136);
				match(EQUALS);
				setState(137);
				match(LPAREN);
				setState(138);
				((TriangleStmtContext)_localctx).e1 = expr(0);
				setState(139);
				match(COMMA);
				setState(140);
				((TriangleStmtContext)_localctx).e2 = expr(0);
				setState(141);
				match(COMMA);
				setState(142);
				((TriangleStmtContext)_localctx).e3 = expr(0);
				setState(143);
				match(COMMA);
				setState(144);
				((TriangleStmtContext)_localctx).e4 = expr(0);
				setState(145);
				match(COMMA);
				setState(146);
				((TriangleStmtContext)_localctx).e5 = expr(0);
				setState(147);
				match(COMMA);
				setState(148);
				((TriangleStmtContext)_localctx).e6 = expr(0);
				setState(149);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(TRIANGLE);
				setState(152);
				match(ID);
				setState(153);
				match(EQUALS);
				setState(154);
				match(LPAREN);
				setState(155);
				((TriangleStmtContext)_localctx).p1 = match(ID);
				setState(156);
				match(COMMA);
				setState(157);
				((TriangleStmtContext)_localctx).p2 = match(ID);
				setState(158);
				match(COMMA);
				setState(159);
				((TriangleStmtContext)_localctx).p3 = match(ID);
				setState(160);
				match(RPAREN);
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
	public static class RectangleStmtContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public ExprContext e4;
		public Token p;
		public TerminalNode RECTANGLE() { return getToken(GeometryDSLParser.RECTANGLE, 0); }
		public List<TerminalNode> ID() { return getTokens(GeometryDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeometryDSLParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GeometryDSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GeometryDSLParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RectangleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterRectangleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitRectangleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitRectangleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectangleStmtContext rectangleStmt() throws RecognitionException {
		RectangleStmtContext _localctx = new RectangleStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rectangleStmt);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(RECTANGLE);
				setState(164);
				match(ID);
				setState(165);
				match(EQUALS);
				setState(166);
				match(LPAREN);
				setState(167);
				((RectangleStmtContext)_localctx).e1 = expr(0);
				setState(168);
				match(COMMA);
				setState(169);
				((RectangleStmtContext)_localctx).e2 = expr(0);
				setState(170);
				match(COMMA);
				setState(171);
				((RectangleStmtContext)_localctx).e3 = expr(0);
				setState(172);
				match(COMMA);
				setState(173);
				((RectangleStmtContext)_localctx).e4 = expr(0);
				setState(174);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(RECTANGLE);
				setState(177);
				match(ID);
				setState(178);
				match(EQUALS);
				setState(179);
				match(LPAREN);
				setState(180);
				((RectangleStmtContext)_localctx).p = match(ID);
				setState(181);
				match(COMMA);
				setState(182);
				((RectangleStmtContext)_localctx).e1 = expr(0);
				setState(183);
				match(COMMA);
				setState(184);
				((RectangleStmtContext)_localctx).e2 = expr(0);
				setState(185);
				match(RPAREN);
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
		enterRule(_localctx, 20, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			match(LPAREN);
			setState(191);
			args();
			setState(192);
			match(RPAREN);
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
		enterRule(_localctx, 22, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(194);
				expr(0);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					expr(0);
					}
					}
					setState(201);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GeometryDSLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GeometryDSLParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(GeometryDSLParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GeometryDSLParser.DIVIDE, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(205);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(206);
				match(ID);
				}
				break;
			case 3:
				{
				setState(207);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(211);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(212);
					expr(2);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class BooleanExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(GeometryDSLParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(GeometryDSLParser.LESS, 0); }
		public TerminalNode EQUAL() { return getToken(GeometryDSLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GeometryDSLParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_EQ() { return getToken(GeometryDSLParser.GREATER_EQ, 0); }
		public TerminalNode LESS_EQ() { return getToken(GeometryDSLParser.LESS_EQ, 0); }
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			expr(0);
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			expr(0);
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
	public static class ForLoopContext extends ParserRuleContext {
		public AssignStmtContext init;
		public BooleanExprContext condition;
		public AssignStmtContext update;
		public TerminalNode FOR() { return getToken(GeometryDSLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(GeometryDSLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GeometryDSLParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<AssignStmtContext> assignStmt() {
			return getRuleContexts(AssignStmtContext.class);
		}
		public AssignStmtContext assignStmt(int i) {
			return getRuleContext(AssignStmtContext.class,i);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(FOR);
			setState(223);
			match(LPAREN);
			setState(224);
			((ForLoopContext)_localctx).init = assignStmt();
			setState(225);
			match(SEMI);
			setState(226);
			((ForLoopContext)_localctx).condition = booleanExpr();
			setState(227);
			match(SEMI);
			setState(228);
			((ForLoopContext)_localctx).update = assignStmt();
			setState(229);
			match(RPAREN);
			setState(230);
			statement();
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
	public static class WhileLoopContext extends ParserRuleContext {
		public BooleanExprContext condition;
		public TerminalNode WHILE() { return getToken(GeometryDSLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHILE);
			setState(233);
			match(LPAREN);
			setState(234);
			((WhileLoopContext)_localctx).condition = booleanExpr();
			setState(235);
			match(RPAREN);
			setState(236);
			statement();
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
	public static class IfStmtContext extends ParserRuleContext {
		public BooleanExprContext condition;
		public TerminalNode IF() { return getToken(GeometryDSLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GeometryDSLParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IF);
			setState(239);
			match(LPAREN);
			setState(240);
			((IfStmtContext)_localctx).condition = booleanExpr();
			setState(241);
			match(RPAREN);
			setState(242);
			statement();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(243);
				match(ELSE);
				setState(244);
				statement();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b\u0000"+
		"\f\u0000%\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003=\b\u0003"+
		"\n\u0003\f\u0003@\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0085\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00a2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bc"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00c6\b\u000b\n\u000b\f\u000b\u00c9\t\u000b\u0003\u000b"+
		"\u00cb\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d1\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00d6\b\f\n\f\f\f\u00d9\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00f6\b\u0010\u0001\u0010\u0000\u0001\u0018\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0002\u0001\u0000\u0016\u0019\u0001\u0000\u001a\u001f\u00fd"+
		"\u0000#\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u00046"+
		"\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\bC\u0001\u0000"+
		"\u0000\u0000\nG\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000e"+
		"\u0084\u0001\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012"+
		"\u00bb\u0001\u0000\u0000\u0000\u0014\u00bd\u0001\u0000\u0000\u0000\u0016"+
		"\u00ca\u0001\u0000\u0000\u0000\u0018\u00d0\u0001\u0000\u0000\u0000\u001a"+
		"\u00da\u0001\u0000\u0000\u0000\u001c\u00de\u0001\u0000\u0000\u0000\u001e"+
		"\u00e8\u0001\u0000\u0000\u0000 \u00ee\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000"+
		"\u0000\u0000\'-\u0003\u0004\u0002\u0000(-\u0003\u0006\u0003\u0000)-\u0003"+
		"\u001c\u000e\u0000*-\u0003\u001e\u000f\u0000+-\u0003 \u0010\u0000,\'\u0001"+
		"\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0003\u0001\u0000"+
		"\u0000\u0000.7\u0003\n\u0005\u0000/7\u0003\f\u0006\u000007\u0003\u000e"+
		"\u0007\u000017\u0003\u0010\b\u000027\u0003\u0012\t\u000037\u0003\u0014"+
		"\n\u000047\u0003\b\u0004\u000057\u0003\u0018\f\u00006.\u0001\u0000\u0000"+
		"\u00006/\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u000061\u0001\u0000"+
		"\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0005\u0007\u0000\u00009\u0005\u0001\u0000\u0000\u0000:>\u0005\u0005"+
		"\u0000\u0000;=\u0003\u0002\u0001\u0000<;\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0006\u0000"+
		"\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0005 \u0000\u0000DE\u0005\u0001"+
		"\u0000\u0000EF\u0003\u0018\f\u0000F\t\u0001\u0000\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0005 \u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0003\u0018\f\u0000LM\u0005\u0002\u0000\u0000MN\u0003"+
		"\u0018\f\u0000NO\u0005\u0004\u0000\u0000O\u000b\u0001\u0000\u0000\u0000"+
		"PQ\u0005\t\u0000\u0000QR\u0005 \u0000\u0000RS\u0005\u0001\u0000\u0000"+
		"ST\u0005\r\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0003\u0018\f\u0000"+
		"VW\u0005\u0002\u0000\u0000WX\u0003\u0018\f\u0000XY\u0005\u0004\u0000\u0000"+
		"YZ\u0005\u000e\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0003\u0018\f"+
		"\u0000\\]\u0005\u0002\u0000\u0000]^\u0003\u0018\f\u0000^_\u0005\u0004"+
		"\u0000\u0000_l\u0001\u0000\u0000\u0000`a\u0005\t\u0000\u0000ab\u0005 "+
		"\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0005\r\u0000\u0000de\u0005\u0003"+
		"\u0000\u0000ef\u0005 \u0000\u0000fg\u0005\u0004\u0000\u0000gh\u0005\u000e"+
		"\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u0005 \u0000\u0000jl\u0005\u0004"+
		"\u0000\u0000kP\u0001\u0000\u0000\u0000k`\u0001\u0000\u0000\u0000l\r\u0001"+
		"\u0000\u0000\u0000mn\u0005\n\u0000\u0000no\u0005 \u0000\u0000op\u0005"+
		"\u0001\u0000\u0000pq\u0005\u000f\u0000\u0000qr\u0005\u0003\u0000\u0000"+
		"rs\u0003\u0018\f\u0000st\u0005\u0002\u0000\u0000tu\u0003\u0018\f\u0000"+
		"uv\u0005\u0004\u0000\u0000vw\u0005\u0010\u0000\u0000wx\u0005\u0001\u0000"+
		"\u0000xy\u0003\u0018\f\u0000y\u0085\u0001\u0000\u0000\u0000z{\u0005\n"+
		"\u0000\u0000{|\u0005 \u0000\u0000|}\u0005\u0001\u0000\u0000}~\u0005\u000f"+
		"\u0000\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0005 \u0000\u0000"+
		"\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0005\u0010\u0000\u0000"+
		"\u0082\u0083\u0005\u0001\u0000\u0000\u0083\u0085\u0003\u0018\f\u0000\u0084"+
		"m\u0001\u0000\u0000\u0000\u0084z\u0001\u0000\u0000\u0000\u0085\u000f\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u000b\u0000\u0000\u0087\u0088\u0005"+
		" \u0000\u0000\u0088\u0089\u0005\u0001\u0000\u0000\u0089\u008a\u0005\u0003"+
		"\u0000\u0000\u008a\u008b\u0003\u0018\f\u0000\u008b\u008c\u0005\u0002\u0000"+
		"\u0000\u008c\u008d\u0003\u0018\f\u0000\u008d\u008e\u0005\u0002\u0000\u0000"+
		"\u008e\u008f\u0003\u0018\f\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090"+
		"\u0091\u0003\u0018\f\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0093"+
		"\u0003\u0018\f\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094\u0095\u0003"+
		"\u0018\f\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u00a2\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u000b\u0000\u0000\u0098\u0099\u0005 \u0000"+
		"\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b\u0005\u0003\u0000"+
		"\u0000\u009b\u009c\u0005 \u0000\u0000\u009c\u009d\u0005\u0002\u0000\u0000"+
		"\u009d\u009e\u0005 \u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000\u009f"+
		"\u00a0\u0005 \u0000\u0000\u00a0\u00a2\u0005\u0004\u0000\u0000\u00a1\u0086"+
		"\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a2\u0011"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00a5\u0005"+
		" \u0000\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7\u0005\u0003"+
		"\u0000\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9\u0005\u0002\u0000"+
		"\u0000\u00a9\u00aa\u0003\u0018\f\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000"+
		"\u00ab\u00ac\u0003\u0018\f\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0018\f\u0000\u00ae\u00af\u0005\u0004\u0000\u0000\u00af\u00bc"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0005"+
		" \u0000\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4\u0005\u0003"+
		"\u0000\u0000\u00b4\u00b5\u0005 \u0000\u0000\u00b5\u00b6\u0005\u0002\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0018\f\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000"+
		"\u00b8\u00b9\u0003\u0018\f\u0000\u00b9\u00ba\u0005\u0004\u0000\u0000\u00ba"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bb\u00a3\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b0\u0001\u0000\u0000\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005 \u0000\u0000\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c0"+
		"\u0003\u0016\u000b\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u0015"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u0018\f\u0000\u00c3\u00c4\u0005"+
		"\u0002\u0000\u0000\u00c4\u00c6\u0003\u0018\f\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0017\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0006\f\uffff\uffff\u0000\u00cd\u00d1\u0005!"+
		"\u0000\u0000\u00ce\u00d1\u0005 \u0000\u0000\u00cf\u00d1\u0003\u0014\n"+
		"\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\n\u0001\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000\u0000"+
		"\u00d4\u00d6\u0003\u0018\f\u0002\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u0019\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0018\f\u0000\u00db\u00dc"+
		"\u0007\u0001\u0000\u0000\u00dc\u00dd\u0003\u0018\f\u0000\u00dd\u001b\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005\u0012\u0000\u0000\u00df\u00e0\u0005"+
		"\u0003\u0000\u0000\u00e0\u00e1\u0003\b\u0004\u0000\u00e1\u00e2\u0005\u0007"+
		"\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000\u00e3\u00e4\u0005\u0007\u0000"+
		"\u0000\u00e4\u00e5\u0003\b\u0004\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000"+
		"\u00e6\u00e7\u0003\u0002\u0001\u0000\u00e7\u001d\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\u0013\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000"+
		"\u00ea\u00eb\u0003\u001a\r\u0000\u00eb\u00ec\u0005\u0004\u0000\u0000\u00ec"+
		"\u00ed\u0003\u0002\u0001\u0000\u00ed\u001f\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0014\u0000\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0"+
		"\u00f1\u0003\u001a\r\u0000\u00f1\u00f2\u0005\u0004\u0000\u0000\u00f2\u00f5"+
		"\u0003\u0002\u0001\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f6"+
		"\u0003\u0002\u0001\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6!\u0001\u0000\u0000\u0000\r%,6>k\u0084\u00a1"+
		"\u00bb\u00c7\u00ca\u00d0\u00d7\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}