// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1

    package geometrydsl;

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
		LINE=9, CIRCLE=10, TRIANGLE=11, RECTANGLE=12, POLYGON=13, FROM=14, TO=15, 
		CENTER=16, RADIUS=17, FUNCTION=18, FOR=19, WHILE=20, IF=21, ELSE=22, PLUS=23, 
		MINUS=24, MULTIPLY=25, DIVIDE=26, GREATER=27, LESS=28, EQUAL=29, NOT_EQUAL=30, 
		GREATER_EQ=31, LESS_EQ=32, ID=33, NUMBER=34, STRING=35, WS=36, COMMENT=37;
	public static final int
		RULE_geometry = 0, RULE_statement = 1, RULE_singleStatement = 2, RULE_blockStatement = 3, 
		RULE_assignStmt = 4, RULE_pointStmt = 5, RULE_lineStmt = 6, RULE_circleStmt = 7, 
		RULE_triangleStmt = 8, RULE_rectangleStmt = 9, RULE_polygonStmt = 10, 
		RULE_functionCall = 11, RULE_args = 12, RULE_expr = 13, RULE_booleanExpr = 14, 
		RULE_forLoop = 15, RULE_whileLoop = 16, RULE_ifStmt = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"geometry", "statement", "singleStatement", "blockStatement", "assignStmt", 
			"pointStmt", "lineStmt", "circleStmt", "triangleStmt", "rectangleStmt", 
			"polygonStmt", "functionCall", "args", "expr", "booleanExpr", "forLoop", 
			"whileLoop", "ifStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'('", "')'", "'{'", "'}'", "';'", "'point'", "'line'", 
			"'circle'", "'triangle'", "'rectangle'", "'polygon'", "'from'", "'to'", 
			"'center'", "'radius'", "'function'", "'for'", "'while'", "'if'", "'else'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
			"POINT", "LINE", "CIRCLE", "TRIANGLE", "RECTANGLE", "POLYGON", "FROM", 
			"TO", "CENTER", "RADIUS", "FUNCTION", "FOR", "WHILE", "IF", "ELSE", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "GREATER", "LESS", "EQUAL", "NOT_EQUAL", 
			"GREATER_EQ", "LESS_EQ", "ID", "NUMBER", "STRING", "WS", "COMMENT"
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 60133228320L) != 0) );
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
			case LINE:
			case CIRCLE:
			case TRIANGLE:
			case RECTANGLE:
			case POLYGON:
			case ID:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				singleStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				blockStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				whileLoop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
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
		public PolygonStmtContext polygonStmt() {
			return getRuleContext(PolygonStmtContext.class,0);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48);
				pointStmt();
				}
				break;
			case 2:
				{
				setState(49);
				lineStmt();
				}
				break;
			case 3:
				{
				setState(50);
				circleStmt();
				}
				break;
			case 4:
				{
				setState(51);
				triangleStmt();
				}
				break;
			case 5:
				{
				setState(52);
				rectangleStmt();
				}
				break;
			case 6:
				{
				setState(53);
				polygonStmt();
				}
				break;
			case 7:
				{
				setState(54);
				functionCall();
				}
				break;
			case 8:
				{
				setState(55);
				assignStmt();
				}
				break;
			case 9:
				{
				setState(56);
				expr(0);
				}
				break;
			}
			setState(59);
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
			setState(61);
			match(LBRACE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60133228320L) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(70);
			match(ID);
			setState(71);
			match(EQUALS);
			setState(72);
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
			setState(74);
			match(POINT);
			setState(75);
			match(ID);
			setState(76);
			match(EQUALS);
			setState(77);
			match(LPAREN);
			setState(78);
			((PointStmtContext)_localctx).x = expr(0);
			setState(79);
			match(COMMA);
			setState(80);
			((PointStmtContext)_localctx).y = expr(0);
			setState(81);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(LINE);
				setState(84);
				match(ID);
				setState(85);
				match(EQUALS);
				setState(86);
				match(FROM);
				setState(87);
				match(LPAREN);
				setState(88);
				((LineStmtContext)_localctx).e1 = expr(0);
				setState(89);
				match(COMMA);
				setState(90);
				((LineStmtContext)_localctx).e2 = expr(0);
				setState(91);
				match(RPAREN);
				setState(92);
				match(TO);
				setState(93);
				match(LPAREN);
				setState(94);
				((LineStmtContext)_localctx).e3 = expr(0);
				setState(95);
				match(COMMA);
				setState(96);
				((LineStmtContext)_localctx).e4 = expr(0);
				setState(97);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(LINE);
				setState(100);
				match(ID);
				setState(101);
				match(EQUALS);
				setState(102);
				match(FROM);
				setState(103);
				match(LPAREN);
				setState(104);
				((LineStmtContext)_localctx).p1 = match(ID);
				setState(105);
				match(RPAREN);
				setState(106);
				match(TO);
				setState(107);
				match(LPAREN);
				setState(108);
				((LineStmtContext)_localctx).p2 = match(ID);
				setState(109);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(CIRCLE);
				setState(113);
				match(ID);
				setState(114);
				match(EQUALS);
				setState(115);
				match(CENTER);
				setState(116);
				match(LPAREN);
				setState(117);
				((CircleStmtContext)_localctx).e1 = expr(0);
				setState(118);
				match(COMMA);
				setState(119);
				((CircleStmtContext)_localctx).e2 = expr(0);
				setState(120);
				match(RPAREN);
				setState(121);
				match(RADIUS);
				setState(122);
				match(EQUALS);
				setState(123);
				((CircleStmtContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(CIRCLE);
				setState(126);
				match(ID);
				setState(127);
				match(EQUALS);
				setState(128);
				match(CENTER);
				setState(129);
				match(LPAREN);
				setState(130);
				((CircleStmtContext)_localctx).p = match(ID);
				setState(131);
				match(RPAREN);
				setState(132);
				match(RADIUS);
				setState(133);
				match(EQUALS);
				setState(134);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(TRIANGLE);
				setState(138);
				match(ID);
				setState(139);
				match(EQUALS);
				setState(140);
				match(LPAREN);
				setState(141);
				((TriangleStmtContext)_localctx).e1 = expr(0);
				setState(142);
				match(COMMA);
				setState(143);
				((TriangleStmtContext)_localctx).e2 = expr(0);
				setState(144);
				match(COMMA);
				setState(145);
				((TriangleStmtContext)_localctx).e3 = expr(0);
				setState(146);
				match(COMMA);
				setState(147);
				((TriangleStmtContext)_localctx).e4 = expr(0);
				setState(148);
				match(COMMA);
				setState(149);
				((TriangleStmtContext)_localctx).e5 = expr(0);
				setState(150);
				match(COMMA);
				setState(151);
				((TriangleStmtContext)_localctx).e6 = expr(0);
				setState(152);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(TRIANGLE);
				setState(155);
				match(ID);
				setState(156);
				match(EQUALS);
				setState(157);
				match(LPAREN);
				setState(158);
				((TriangleStmtContext)_localctx).p1 = match(ID);
				setState(159);
				match(COMMA);
				setState(160);
				((TriangleStmtContext)_localctx).p2 = match(ID);
				setState(161);
				match(COMMA);
				setState(162);
				((TriangleStmtContext)_localctx).p3 = match(ID);
				setState(163);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(RECTANGLE);
				setState(167);
				match(ID);
				setState(168);
				match(EQUALS);
				setState(169);
				match(LPAREN);
				setState(170);
				((RectangleStmtContext)_localctx).e1 = expr(0);
				setState(171);
				match(COMMA);
				setState(172);
				((RectangleStmtContext)_localctx).e2 = expr(0);
				setState(173);
				match(COMMA);
				setState(174);
				((RectangleStmtContext)_localctx).e3 = expr(0);
				setState(175);
				match(COMMA);
				setState(176);
				((RectangleStmtContext)_localctx).e4 = expr(0);
				setState(177);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(RECTANGLE);
				setState(180);
				match(ID);
				setState(181);
				match(EQUALS);
				setState(182);
				match(LPAREN);
				setState(183);
				((RectangleStmtContext)_localctx).p = match(ID);
				setState(184);
				match(COMMA);
				setState(185);
				((RectangleStmtContext)_localctx).e1 = expr(0);
				setState(186);
				match(COMMA);
				setState(187);
				((RectangleStmtContext)_localctx).e2 = expr(0);
				setState(188);
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
	public static class PolygonStmtContext extends ParserRuleContext {
		public TerminalNode POLYGON() { return getToken(GeometryDSLParser.POLYGON, 0); }
		public List<TerminalNode> ID() { return getTokens(GeometryDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeometryDSLParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(GeometryDSLParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
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
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public PolygonStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygonStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).enterPolygonStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryDSLListener ) ((GeometryDSLListener)listener).exitPolygonStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryDSLVisitor ) return ((GeometryDSLVisitor<? extends T>)visitor).visitPolygonStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolygonStmtContext polygonStmt() throws RecognitionException {
		PolygonStmtContext _localctx = new PolygonStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_polygonStmt);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(POLYGON);
				setState(193);
				match(ID);
				setState(194);
				match(EQUALS);
				setState(195);
				match(LPAREN);
				setState(196);
				expr(0);
				setState(197);
				match(COMMA);
				setState(198);
				expr(0);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(199);
					match(COMMA);
					setState(200);
					expr(0);
					setState(201);
					match(COMMA);
					setState(202);
					expr(0);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(POLYGON);
				setState(212);
				match(ID);
				setState(213);
				match(EQUALS);
				setState(214);
				match(LPAREN);
				setState(215);
				match(ID);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					setState(217);
					match(ID);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
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
		enterRule(_localctx, 22, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			match(LPAREN);
			setState(228);
			args();
			setState(229);
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
		enterRule(_localctx, 24, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
				{
				setState(231);
				expr(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					expr(0);
					}
					}
					setState(238);
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
		public TerminalNode STRING() { return getToken(GeometryDSLParser.STRING, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(242);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(243);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(244);
				match(ID);
				}
				break;
			case 4:
				{
				setState(245);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(248);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(249);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(250);
					expr(2);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 28, RULE_booleanExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expr(0);
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
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
		enterRule(_localctx, 30, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FOR);
			setState(261);
			match(LPAREN);
			setState(262);
			((ForLoopContext)_localctx).init = assignStmt();
			setState(263);
			match(SEMI);
			setState(264);
			((ForLoopContext)_localctx).condition = booleanExpr();
			setState(265);
			match(SEMI);
			setState(266);
			((ForLoopContext)_localctx).update = assignStmt();
			setState(267);
			match(RPAREN);
			setState(268);
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
		enterRule(_localctx, 32, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(WHILE);
			setState(271);
			match(LPAREN);
			setState(272);
			((WhileLoopContext)_localctx).condition = booleanExpr();
			setState(273);
			match(RPAREN);
			setState(274);
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
		enterRule(_localctx, 34, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(IF);
			setState(277);
			match(LPAREN);
			setState(278);
			((IfStmtContext)_localctx).condition = booleanExpr();
			setState(279);
			match(RPAREN);
			setState(280);
			statement();
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(281);
				match(ELSE);
				setState(282);
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
		case 13:
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
		"\u0004\u0001%\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002:\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006o\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0088\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00a5\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00bf\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cd\b\n\n"+
		"\n\f\n\u00d0\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00db\b\n\n\n\f\n\u00de\t\n\u0001\n\u0003\n"+
		"\u00e1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00eb\b\f\n\f\f\f\u00ee\t\f\u0003\f\u00f0"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f7\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00fc\b\r\n\r\f\r\u00ff\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u011c\b\u0011\u0001\u0011\u0000\u0001\u001a"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0002\u0001\u0000\u0017\u001a\u0001\u0000"+
		"\u001b \u0127\u0000%\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000"+
		"\u0000\u00049\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\b"+
		"F\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000"+
		"\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u00a4\u0001\u0000\u0000"+
		"\u0000\u0012\u00be\u0001\u0000\u0000\u0000\u0014\u00e0\u0001\u0000\u0000"+
		"\u0000\u0016\u00e2\u0001\u0000\u0000\u0000\u0018\u00ef\u0001\u0000\u0000"+
		"\u0000\u001a\u00f6\u0001\u0000\u0000\u0000\u001c\u0100\u0001\u0000\u0000"+
		"\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u010e\u0001\u0000\u0000\u0000"+
		"\"\u0114\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)/\u0003\u0004"+
		"\u0002\u0000*/\u0003\u0006\u0003\u0000+/\u0003\u001e\u000f\u0000,/\u0003"+
		" \u0010\u0000-/\u0003\"\u0011\u0000.)\u0001\u0000\u0000\u0000.*\u0001"+
		"\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u00000:\u0003\n\u0005"+
		"\u00001:\u0003\f\u0006\u00002:\u0003\u000e\u0007\u00003:\u0003\u0010\b"+
		"\u00004:\u0003\u0012\t\u00005:\u0003\u0014\n\u00006:\u0003\u0016\u000b"+
		"\u00007:\u0003\b\u0004\u00008:\u0003\u001a\r\u000090\u0001\u0000\u0000"+
		"\u000091\u0001\u0000\u0000\u000092\u0001\u0000\u0000\u000093\u0001\u0000"+
		"\u0000\u000094\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u000096\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0005\u0007\u0000\u0000<\u0005\u0001\u0000"+
		"\u0000\u0000=A\u0005\u0005\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0006\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005"+
		"!\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0003\u001a\r\u0000I\t\u0001"+
		"\u0000\u0000\u0000JK\u0005\b\u0000\u0000KL\u0005!\u0000\u0000LM\u0005"+
		"\u0001\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0003\u001a\r\u0000OP\u0005"+
		"\u0002\u0000\u0000PQ\u0003\u001a\r\u0000QR\u0005\u0004\u0000\u0000R\u000b"+
		"\u0001\u0000\u0000\u0000ST\u0005\t\u0000\u0000TU\u0005!\u0000\u0000UV"+
		"\u0005\u0001\u0000\u0000VW\u0005\u000e\u0000\u0000WX\u0005\u0003\u0000"+
		"\u0000XY\u0003\u001a\r\u0000YZ\u0005\u0002\u0000\u0000Z[\u0003\u001a\r"+
		"\u0000[\\\u0005\u0004\u0000\u0000\\]\u0005\u000f\u0000\u0000]^\u0005\u0003"+
		"\u0000\u0000^_\u0003\u001a\r\u0000_`\u0005\u0002\u0000\u0000`a\u0003\u001a"+
		"\r\u0000ab\u0005\u0004\u0000\u0000bo\u0001\u0000\u0000\u0000cd\u0005\t"+
		"\u0000\u0000de\u0005!\u0000\u0000ef\u0005\u0001\u0000\u0000fg\u0005\u000e"+
		"\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0005!\u0000\u0000ij\u0005\u0004"+
		"\u0000\u0000jk\u0005\u000f\u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005"+
		"!\u0000\u0000mo\u0005\u0004\u0000\u0000nS\u0001\u0000\u0000\u0000nc\u0001"+
		"\u0000\u0000\u0000o\r\u0001\u0000\u0000\u0000pq\u0005\n\u0000\u0000qr"+
		"\u0005!\u0000\u0000rs\u0005\u0001\u0000\u0000st\u0005\u0010\u0000\u0000"+
		"tu\u0005\u0003\u0000\u0000uv\u0003\u001a\r\u0000vw\u0005\u0002\u0000\u0000"+
		"wx\u0003\u001a\r\u0000xy\u0005\u0004\u0000\u0000yz\u0005\u0011\u0000\u0000"+
		"z{\u0005\u0001\u0000\u0000{|\u0003\u001a\r\u0000|\u0088\u0001\u0000\u0000"+
		"\u0000}~\u0005\n\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0080\u0005"+
		"\u0001\u0000\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005"+
		"\u0003\u0000\u0000\u0082\u0083\u0005!\u0000\u0000\u0083\u0084\u0005\u0004"+
		"\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086\u0005\u0001"+
		"\u0000\u0000\u0086\u0088\u0003\u001a\r\u0000\u0087p\u0001\u0000\u0000"+
		"\u0000\u0087}\u0001\u0000\u0000\u0000\u0088\u000f\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u008b\u0005!\u0000\u0000\u008b"+
		"\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d"+
		"\u008e\u0003\u001a\r\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0090"+
		"\u0003\u001a\r\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091\u0092\u0003"+
		"\u001a\r\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093\u0094\u0003\u001a"+
		"\r\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096\u0003\u001a\r"+
		"\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0098\u0003\u001a\r\u0000"+
		"\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u00a5\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005\u000b\u0000\u0000\u009b\u009c\u0005!\u0000\u0000\u009c"+
		"\u009d\u0005\u0001\u0000\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e"+
		"\u009f\u0005!\u0000\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a1"+
		"\u0005!\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3\u0005"+
		"!\u0000\u0000\u00a3\u00a5\u0005\u0004\u0000\u0000\u00a4\u0089\u0001\u0000"+
		"\u0000\u0000\u00a4\u009a\u0001\u0000\u0000\u0000\u00a5\u0011\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00a8\u0005!\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0001\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000"+
		"\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0005\u0002\u0000\u0000"+
		"\u00ac\u00ad\u0003\u001a\r\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000\u00ae"+
		"\u00af\u0003\u001a\r\u0000\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b1"+
		"\u0003\u001a\r\u0000\u00b1\u00b2\u0005\u0004\u0000\u0000\u00b2\u00bf\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\f\u0000\u0000\u00b4\u00b5\u0005!"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0001\u0000\u0000\u00b6\u00b7\u0005\u0003"+
		"\u0000\u0000\u00b7\u00b8\u0005!\u0000\u0000\u00b8\u00b9\u0005\u0002\u0000"+
		"\u0000\u00b9\u00ba\u0003\u001a\r\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000"+
		"\u00bb\u00bc\u0003\u001a\r\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00a6\u0001\u0000\u0000\u0000\u00be"+
		"\u00b3\u0001\u0000\u0000\u0000\u00bf\u0013\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\r\u0000\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3"+
		"\u0005\u0001\u0000\u0000\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5"+
		"\u0003\u001a\r\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6\u00ce\u0003"+
		"\u001a\r\u0000\u00c7\u00c8\u0005\u0002\u0000\u0000\u00c8\u00c9\u0003\u001a"+
		"\r\u0000\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca\u00cb\u0003\u001a\r"+
		"\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0004\u0000"+
		"\u0000\u00d2\u00e1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\r\u0000\u0000"+
		"\u00d4\u00d5\u0005!\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6"+
		"\u00d7\u0005\u0003\u0000\u0000\u00d7\u00dc\u0005!\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0002\u0000\u0000\u00d9\u00db\u0005!\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e1\u0005"+
		"\u0004\u0000\u0000\u00e0\u00c0\u0001\u0000\u0000\u0000\u00e0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00e1\u0015\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"!\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0003\u0018"+
		"\f\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u0017\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ec\u0003\u001a\r\u0000\u00e8\u00e9\u0005\u0002\u0000\u0000"+
		"\u00e9\u00eb\u0003\u001a\r\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ef\u00e7\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u0019\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0006\r\uffff\uffff\u0000\u00f2\u00f7\u0005\"\u0000\u0000\u00f3"+
		"\u00f7\u0005#\u0000\u0000\u00f4\u00f7\u0005!\u0000\u0000\u00f5\u00f7\u0003"+
		"\u0016\u000b\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00fd\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u0001"+
		"\u0000\u0000\u00f9\u00fa\u0007\u0000\u0000\u0000\u00fa\u00fc\u0003\u001a"+
		"\r\u0002\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u001b\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0003\u001a\r\u0000\u0101\u0102\u0007\u0001\u0000\u0000"+
		"\u0102\u0103\u0003\u001a\r\u0000\u0103\u001d\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005\u0013\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106"+
		"\u0107\u0003\b\u0004\u0000\u0107\u0108\u0005\u0007\u0000\u0000\u0108\u0109"+
		"\u0003\u001c\u000e\u0000\u0109\u010a\u0005\u0007\u0000\u0000\u010a\u010b"+
		"\u0003\b\u0004\u0000\u010b\u010c\u0005\u0004\u0000\u0000\u010c\u010d\u0003"+
		"\u0002\u0001\u0000\u010d\u001f\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"\u0014\u0000\u0000\u010f\u0110\u0005\u0003\u0000\u0000\u0110\u0111\u0003"+
		"\u001c\u000e\u0000\u0111\u0112\u0005\u0004\u0000\u0000\u0112\u0113\u0003"+
		"\u0002\u0001\u0000\u0113!\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0015"+
		"\u0000\u0000\u0115\u0116\u0005\u0003\u0000\u0000\u0116\u0117\u0003\u001c"+
		"\u000e\u0000\u0117\u0118\u0005\u0004\u0000\u0000\u0118\u011b\u0003\u0002"+
		"\u0001\u0000\u0119\u011a\u0005\u0016\u0000\u0000\u011a\u011c\u0003\u0002"+
		"\u0001\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c#\u0001\u0000\u0000\u0000\u0010\'.9An\u0087\u00a4\u00be"+
		"\u00ce\u00dc\u00e0\u00ec\u00ef\u00f6\u00fd\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}