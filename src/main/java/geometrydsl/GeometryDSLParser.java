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
		T__0=1, T__1=2, T__2=3, EQUALS=4, COMMA=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, SEMI=10, FROM=11, TO=12, CENTER=13, RADIUS=14, FUNCTION=15, 
		FOR=16, WHILE=17, PLUS=18, MINUS=19, MULTIPLY=20, DIVIDE=21, GREATER=22, 
		LESS=23, EQUAL=24, NOT_EQUAL=25, GREATER_EQ=26, LESS_EQ=27, ID=28, NUMBER=29, 
		WS=30;
	public static final int
		RULE_geometry = 0, RULE_statement = 1, RULE_singleStatement = 2, RULE_blockStatement = 3, 
		RULE_assignStmt = 4, RULE_pointStmt = 5, RULE_lineStmt = 6, RULE_circleStmt = 7, 
		RULE_functionCall = 8, RULE_args = 9, RULE_expr = 10, RULE_booleanExpr = 11, 
		RULE_forLoop = 12, RULE_whileLoop = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"geometry", "statement", "singleStatement", "blockStatement", "assignStmt", 
			"pointStmt", "lineStmt", "circleStmt", "functionCall", "args", "expr", 
			"booleanExpr", "forLoop", "whileLoop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'point'", "'line'", "'circle'", "'='", "','", "'('", "')'", "'{'", 
			"'}'", "';'", "'from'", "'to'", "'center'", "'radius'", "'function'", 
			"'for'", "'while'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", 
			"'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "FROM", "TO", "CENTER", "RADIUS", "FUNCTION", "FOR", 
			"WHILE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "GREATER", "LESS", "EQUAL", 
			"NOT_EQUAL", "GREATER_EQ", "LESS_EQ", "ID", "NUMBER", "WS"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 805503246L) != 0) );
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				singleStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				blockStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				whileLoop();
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(39);
				pointStmt();
				}
				break;
			case 2:
				{
				setState(40);
				lineStmt();
				}
				break;
			case 3:
				{
				setState(41);
				circleStmt();
				}
				break;
			case 4:
				{
				setState(42);
				functionCall();
				}
				break;
			case 5:
				{
				setState(43);
				assignStmt();
				}
				break;
			case 6:
				{
				setState(44);
				expr(0);
				}
				break;
			}
			setState(47);
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
			setState(49);
			match(LBRACE);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805503246L) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(58);
			match(ID);
			setState(59);
			match(EQUALS);
			setState(60);
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
			setState(62);
			match(T__0);
			setState(63);
			match(ID);
			setState(64);
			match(EQUALS);
			setState(65);
			match(LPAREN);
			setState(66);
			((PointStmtContext)_localctx).x = expr(0);
			setState(67);
			match(COMMA);
			setState(68);
			((PointStmtContext)_localctx).y = expr(0);
			setState(69);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				((LineStmtContext)_localctx).e1 = expr(0);
				setState(77);
				match(COMMA);
				setState(78);
				((LineStmtContext)_localctx).e2 = expr(0);
				setState(79);
				match(RPAREN);
				setState(80);
				match(TO);
				setState(81);
				match(LPAREN);
				setState(82);
				((LineStmtContext)_localctx).e3 = expr(0);
				setState(83);
				match(COMMA);
				setState(84);
				((LineStmtContext)_localctx).e4 = expr(0);
				setState(85);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__1);
				setState(88);
				match(ID);
				setState(89);
				match(EQUALS);
				setState(90);
				match(FROM);
				setState(91);
				match(LPAREN);
				setState(92);
				((LineStmtContext)_localctx).p1 = match(ID);
				setState(93);
				match(RPAREN);
				setState(94);
				match(TO);
				setState(95);
				match(LPAREN);
				setState(96);
				((LineStmtContext)_localctx).p2 = match(ID);
				setState(97);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__2);
				setState(101);
				match(ID);
				setState(102);
				match(EQUALS);
				setState(103);
				match(CENTER);
				setState(104);
				match(LPAREN);
				setState(105);
				((CircleStmtContext)_localctx).e1 = expr(0);
				setState(106);
				match(COMMA);
				setState(107);
				((CircleStmtContext)_localctx).e2 = expr(0);
				setState(108);
				match(RPAREN);
				setState(109);
				match(RADIUS);
				setState(110);
				match(EQUALS);
				setState(111);
				((CircleStmtContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__2);
				setState(114);
				match(ID);
				setState(115);
				match(EQUALS);
				setState(116);
				match(CENTER);
				setState(117);
				match(LPAREN);
				setState(118);
				((CircleStmtContext)_localctx).p = match(ID);
				setState(119);
				match(RPAREN);
				setState(120);
				match(RADIUS);
				setState(121);
				match(EQUALS);
				setState(122);
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
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(LPAREN);
			setState(127);
			args();
			setState(128);
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
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(130);
				expr(0);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					expr(0);
					}
					}
					setState(137);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(141);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(142);
				match(ID);
				}
				break;
			case 3:
				{
				setState(143);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(146);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(147);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(148);
					expr(2);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 22, RULE_booleanExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			expr(0);
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
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
		enterRule(_localctx, 24, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FOR);
			setState(159);
			match(LPAREN);
			setState(160);
			((ForLoopContext)_localctx).init = assignStmt();
			setState(161);
			match(SEMI);
			setState(162);
			((ForLoopContext)_localctx).condition = booleanExpr();
			setState(163);
			match(SEMI);
			setState(164);
			((ForLoopContext)_localctx).update = assignStmt();
			setState(165);
			match(RPAREN);
			setState(166);
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
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			match(LPAREN);
			setState(170);
			((WhileLoopContext)_localctx).condition = booleanExpr();
			setState(171);
			match(RPAREN);
			setState(172);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
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
		"\u0004\u0001\u001e\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006c\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007|\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u0086\b\t\n\t\f\t\u0089\t\t\u0003\t"+
		"\u008b\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0096\b\n\n\n\f\n\u0099\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0000\u0001\u0014\u000e\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002\u0001\u0000\u0012"+
		"\u0015\u0001\u0000\u0016\u001b\u00b1\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00061"+
		"\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000"+
		"\u0000\fb\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000\u0000\u0010"+
		"}\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u0090"+
		"\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009e"+
		"\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!&\u0003\u0004\u0002"+
		"\u0000\"&\u0003\u0006\u0003\u0000#&\u0003\u0018\f\u0000$&\u0003\u001a"+
		"\r\u0000%!\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'.\u0003\n\u0005\u0000(.\u0003\f\u0006\u0000).\u0003\u000e\u0007"+
		"\u0000*.\u0003\u0010\b\u0000+.\u0003\b\u0004\u0000,.\u0003\u0014\n\u0000"+
		"-\'\u0001\u0000\u0000\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000"+
		"\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\n\u0000\u00000\u0005\u0001"+
		"\u0000\u0000\u000015\u0005\b\u0000\u000024\u0003\u0002\u0001\u000032\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000089\u0005\t\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u001c"+
		"\u0000\u0000;<\u0005\u0004\u0000\u0000<=\u0003\u0014\n\u0000=\t\u0001"+
		"\u0000\u0000\u0000>?\u0005\u0001\u0000\u0000?@\u0005\u001c\u0000\u0000"+
		"@A\u0005\u0004\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0003\u0014\n\u0000"+
		"CD\u0005\u0005\u0000\u0000DE\u0003\u0014\n\u0000EF\u0005\u0007\u0000\u0000"+
		"F\u000b\u0001\u0000\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u001c"+
		"\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u0005\u000b\u0000\u0000KL\u0005"+
		"\u0006\u0000\u0000LM\u0003\u0014\n\u0000MN\u0005\u0005\u0000\u0000NO\u0003"+
		"\u0014\n\u0000OP\u0005\u0007\u0000\u0000PQ\u0005\f\u0000\u0000QR\u0005"+
		"\u0006\u0000\u0000RS\u0003\u0014\n\u0000ST\u0005\u0005\u0000\u0000TU\u0003"+
		"\u0014\n\u0000UV\u0005\u0007\u0000\u0000Vc\u0001\u0000\u0000\u0000WX\u0005"+
		"\u0002\u0000\u0000XY\u0005\u001c\u0000\u0000YZ\u0005\u0004\u0000\u0000"+
		"Z[\u0005\u000b\u0000\u0000[\\\u0005\u0006\u0000\u0000\\]\u0005\u001c\u0000"+
		"\u0000]^\u0005\u0007\u0000\u0000^_\u0005\f\u0000\u0000_`\u0005\u0006\u0000"+
		"\u0000`a\u0005\u001c\u0000\u0000ac\u0005\u0007\u0000\u0000bG\u0001\u0000"+
		"\u0000\u0000bW\u0001\u0000\u0000\u0000c\r\u0001\u0000\u0000\u0000de\u0005"+
		"\u0003\u0000\u0000ef\u0005\u001c\u0000\u0000fg\u0005\u0004\u0000\u0000"+
		"gh\u0005\r\u0000\u0000hi\u0005\u0006\u0000\u0000ij\u0003\u0014\n\u0000"+
		"jk\u0005\u0005\u0000\u0000kl\u0003\u0014\n\u0000lm\u0005\u0007\u0000\u0000"+
		"mn\u0005\u000e\u0000\u0000no\u0005\u0004\u0000\u0000op\u0003\u0014\n\u0000"+
		"p|\u0001\u0000\u0000\u0000qr\u0005\u0003\u0000\u0000rs\u0005\u001c\u0000"+
		"\u0000st\u0005\u0004\u0000\u0000tu\u0005\r\u0000\u0000uv\u0005\u0006\u0000"+
		"\u0000vw\u0005\u001c\u0000\u0000wx\u0005\u0007\u0000\u0000xy\u0005\u000e"+
		"\u0000\u0000yz\u0005\u0004\u0000\u0000z|\u0003\u0014\n\u0000{d\u0001\u0000"+
		"\u0000\u0000{q\u0001\u0000\u0000\u0000|\u000f\u0001\u0000\u0000\u0000"+
		"}~\u0005\u001c\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0080"+
		"\u0003\u0012\t\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0011\u0001"+
		"\u0000\u0000\u0000\u0082\u0087\u0003\u0014\n\u0000\u0083\u0084\u0005\u0005"+
		"\u0000\u0000\u0084\u0086\u0003\u0014\n\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0013\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0006\n\uffff\uffff\u0000\u008d\u0091\u0005\u001d\u0000"+
		"\u0000\u008e\u0091\u0005\u001c\u0000\u0000\u008f\u0091\u0003\u0010\b\u0000"+
		"\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0097\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\n\u0001\u0000\u0000\u0093\u0094\u0007\u0000\u0000\u0000\u0094"+
		"\u0096\u0003\u0014\n\u0002\u0095\u0092\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u0014\n\u0000\u009b\u009c\u0007"+
		"\u0001\u0000\u0000\u009c\u009d\u0003\u0014\n\u0000\u009d\u0017\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0010\u0000\u0000\u009f\u00a0\u0005\u0006"+
		"\u0000\u0000\u00a0\u00a1\u0003\b\u0004\u0000\u00a1\u00a2\u0005\n\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3\u00a4\u0005\n\u0000\u0000"+
		"\u00a4\u00a5\u0003\b\u0004\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0002\u0001\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0011\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa"+
		"\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0002\u0001\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\n\u001f"+
		"%-5b{\u0087\u008a\u0090\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}