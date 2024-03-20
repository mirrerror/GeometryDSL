// Generated from D:/IdeaProjects/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
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
		LESS=23, EQUAL=24, GREATER_EQ=25, LESS_EQ=26, ID=27, NUMBER=28, WS=29;
	public static final int
		RULE_geometry = 0, RULE_statement = 1, RULE_singleStatement = 2, RULE_blockStatement = 3, 
		RULE_assignStmt = 4, RULE_pointStmt = 5, RULE_lineStmt = 6, RULE_circleStmt = 7, 
		RULE_functionCall = 8, RULE_args = 9, RULE_expr = 10, RULE_forLoop = 11, 
		RULE_whileLoop = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"geometry", "statement", "singleStatement", "blockStatement", "assignStmt", 
			"pointStmt", "lineStmt", "circleStmt", "functionCall", "args", "expr", 
			"forLoop", "whileLoop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'point'", "'line'", "'circle'", "'='", "','", "'('", "')'", "'{'", 
			"'}'", "';'", "'from'", "'to'", "'center'", "'radius'", "'function'", 
			"'for'", "'while'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", 
			"'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "FROM", "TO", "CENTER", "RADIUS", "FUNCTION", "FOR", 
			"WHILE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "GREATER", "LESS", "EQUAL", 
			"GREATER_EQ", "LESS_EQ", "ID", "NUMBER", "WS"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 402850062L) != 0) );
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case FOR:
			case WHILE:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				singleStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				blockStatement();
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
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35);
				pointStmt();
				}
				break;
			case 2:
				{
				setState(36);
				lineStmt();
				}
				break;
			case 3:
				{
				setState(37);
				circleStmt();
				}
				break;
			case 4:
				{
				setState(38);
				functionCall();
				}
				break;
			case 5:
				{
				setState(39);
				assignStmt();
				}
				break;
			case 6:
				{
				setState(40);
				forLoop();
				}
				break;
			case 7:
				{
				setState(41);
				whileLoop();
				}
				break;
			case 8:
				{
				setState(42);
				expr(0);
				}
				break;
			}
			setState(45);
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
			setState(47);
			match(LBRACE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402850062L) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(56);
			match(ID);
			setState(57);
			match(EQUALS);
			setState(58);
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
			setState(60);
			match(T__0);
			setState(61);
			match(ID);
			setState(62);
			match(EQUALS);
			setState(63);
			match(LPAREN);
			setState(64);
			((PointStmtContext)_localctx).x = expr(0);
			setState(65);
			match(COMMA);
			setState(66);
			((PointStmtContext)_localctx).y = expr(0);
			setState(67);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__1);
				setState(70);
				match(ID);
				setState(71);
				match(EQUALS);
				setState(72);
				match(FROM);
				setState(73);
				match(LPAREN);
				setState(74);
				((LineStmtContext)_localctx).e1 = expr(0);
				setState(75);
				match(COMMA);
				setState(76);
				((LineStmtContext)_localctx).e2 = expr(0);
				setState(77);
				match(RPAREN);
				setState(78);
				match(TO);
				setState(79);
				match(LPAREN);
				setState(80);
				((LineStmtContext)_localctx).e3 = expr(0);
				setState(81);
				match(COMMA);
				setState(82);
				((LineStmtContext)_localctx).e4 = expr(0);
				setState(83);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__1);
				setState(86);
				match(ID);
				setState(87);
				match(EQUALS);
				setState(88);
				match(FROM);
				setState(89);
				match(LPAREN);
				setState(90);
				((LineStmtContext)_localctx).p1 = match(ID);
				setState(91);
				match(RPAREN);
				setState(92);
				match(TO);
				setState(93);
				match(LPAREN);
				setState(94);
				((LineStmtContext)_localctx).p2 = match(ID);
				setState(95);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				((CircleStmtContext)_localctx).e1 = expr(0);
				setState(104);
				match(COMMA);
				setState(105);
				((CircleStmtContext)_localctx).e2 = expr(0);
				setState(106);
				match(RPAREN);
				setState(107);
				match(RADIUS);
				setState(108);
				match(EQUALS);
				setState(109);
				((CircleStmtContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__2);
				setState(112);
				match(ID);
				setState(113);
				match(EQUALS);
				setState(114);
				match(CENTER);
				setState(115);
				match(LPAREN);
				setState(116);
				((CircleStmtContext)_localctx).p = match(ID);
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
			setState(123);
			match(ID);
			setState(124);
			match(LPAREN);
			setState(125);
			args();
			setState(126);
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(128);
				expr(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					expr(0);
					}
					}
					setState(135);
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
		public TerminalNode GREATER() { return getToken(GeometryDSLParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(GeometryDSLParser.LESS, 0); }
		public TerminalNode EQUAL() { return getToken(GeometryDSLParser.EQUAL, 0); }
		public TerminalNode GREATER_EQ() { return getToken(GeometryDSLParser.GREATER_EQ, 0); }
		public TerminalNode LESS_EQ() { return getToken(GeometryDSLParser.LESS_EQ, 0); }
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(139);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(140);
				match(ID);
				}
				break;
			case 3:
				{
				setState(141);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(145);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(148);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130023424L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class ForLoopContext extends ParserRuleContext {
		public AssignStmtContext init;
		public ExprContext condition;
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 22, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(FOR);
			setState(156);
			match(LPAREN);
			setState(157);
			((ForLoopContext)_localctx).init = assignStmt();
			setState(158);
			match(SEMI);
			setState(159);
			((ForLoopContext)_localctx).condition = expr(0);
			setState(160);
			match(SEMI);
			setState(161);
			((ForLoopContext)_localctx).update = assignStmt();
			setState(162);
			match(RPAREN);
			setState(163);
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
		public ExprContext condition;
		public TerminalNode WHILE() { return getToken(GeometryDSLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryDSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryDSLParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(WHILE);
			setState(166);
			match(LPAREN);
			setState(167);
			((WhileLoopContext)_localctx).condition = expr(0);
			setState(168);
			match(RPAREN);
			setState(169);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000"+
		"\u001d\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006a\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007z\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0084\b\t\n\t\f\t\u0087\t\t\u0003\t\u0089\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u008f\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0097\b\n\n\n\f\n\u009a\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0000\u0001\u0014\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000\u0012\u0015\u0001"+
		"\u0000\u0016\u001a\u00b0\u0000\u001b\u0001\u0000\u0000\u0000\u0002!\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000"+
		"\u0000\b8\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\f`\u0001"+
		"\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000"+
		"\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u008e\u0001\u0000\u0000"+
		"\u0000\u0016\u009b\u0001\u0000\u0000\u0000\u0018\u00a5\u0001\u0000\u0000"+
		"\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0003\u0004\u0002\u0000 \"\u0003\u0006\u0003\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000"+
		"\u0000\u0000#,\u0003\n\u0005\u0000$,\u0003\f\u0006\u0000%,\u0003\u000e"+
		"\u0007\u0000&,\u0003\u0010\b\u0000\',\u0003\b\u0004\u0000(,\u0003\u0016"+
		"\u000b\u0000),\u0003\u0018\f\u0000*,\u0003\u0014\n\u0000+#\u0001\u0000"+
		"\u0000\u0000+$\u0001\u0000\u0000\u0000+%\u0001\u0000\u0000\u0000+&\u0001"+
		"\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0005\n\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/3\u0005\b"+
		"\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"46\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\t\u0000\u0000"+
		"7\u0007\u0001\u0000\u0000\u000089\u0005\u001b\u0000\u00009:\u0005\u0004"+
		"\u0000\u0000:;\u0003\u0014\n\u0000;\t\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0001\u0000\u0000=>\u0005\u001b\u0000\u0000>?\u0005\u0004\u0000\u0000"+
		"?@\u0005\u0006\u0000\u0000@A\u0003\u0014\n\u0000AB\u0005\u0005\u0000\u0000"+
		"BC\u0003\u0014\n\u0000CD\u0005\u0007\u0000\u0000D\u000b\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0002\u0000\u0000FG\u0005\u001b\u0000\u0000GH\u0005\u0004"+
		"\u0000\u0000HI\u0005\u000b\u0000\u0000IJ\u0005\u0006\u0000\u0000JK\u0003"+
		"\u0014\n\u0000KL\u0005\u0005\u0000\u0000LM\u0003\u0014\n\u0000MN\u0005"+
		"\u0007\u0000\u0000NO\u0005\f\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0003"+
		"\u0014\n\u0000QR\u0005\u0005\u0000\u0000RS\u0003\u0014\n\u0000ST\u0005"+
		"\u0007\u0000\u0000Ta\u0001\u0000\u0000\u0000UV\u0005\u0002\u0000\u0000"+
		"VW\u0005\u001b\u0000\u0000WX\u0005\u0004\u0000\u0000XY\u0005\u000b\u0000"+
		"\u0000YZ\u0005\u0006\u0000\u0000Z[\u0005\u001b\u0000\u0000[\\\u0005\u0007"+
		"\u0000\u0000\\]\u0005\f\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0005"+
		"\u001b\u0000\u0000_a\u0005\u0007\u0000\u0000`E\u0001\u0000\u0000\u0000"+
		"`U\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u0003\u0000"+
		"\u0000cd\u0005\u001b\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005\r\u0000"+
		"\u0000fg\u0005\u0006\u0000\u0000gh\u0003\u0014\n\u0000hi\u0005\u0005\u0000"+
		"\u0000ij\u0003\u0014\n\u0000jk\u0005\u0007\u0000\u0000kl\u0005\u000e\u0000"+
		"\u0000lm\u0005\u0004\u0000\u0000mn\u0003\u0014\n\u0000nz\u0001\u0000\u0000"+
		"\u0000op\u0005\u0003\u0000\u0000pq\u0005\u001b\u0000\u0000qr\u0005\u0004"+
		"\u0000\u0000rs\u0005\r\u0000\u0000st\u0005\u0006\u0000\u0000tu\u0005\u001b"+
		"\u0000\u0000uv\u0005\u0007\u0000\u0000vw\u0005\u000e\u0000\u0000wx\u0005"+
		"\u0004\u0000\u0000xz\u0003\u0014\n\u0000yb\u0001\u0000\u0000\u0000yo\u0001"+
		"\u0000\u0000\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005\u001b\u0000"+
		"\u0000|}\u0005\u0006\u0000\u0000}~\u0003\u0012\t\u0000~\u007f\u0005\u0007"+
		"\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0085\u0003\u0014"+
		"\n\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0084\u0003\u0014\n"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008b\u0006\n\uffff\uffff"+
		"\u0000\u008b\u008f\u0005\u001c\u0000\u0000\u008c\u008f\u0005\u001b\u0000"+
		"\u0000\u008d\u008f\u0003\u0010\b\u0000\u008e\u008a\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0098\u0001\u0000\u0000\u0000\u0090\u0091\n\u0002\u0000\u0000\u0091"+
		"\u0092\u0007\u0000\u0000\u0000\u0092\u0097\u0003\u0014\n\u0003\u0093\u0094"+
		"\n\u0001\u0000\u0000\u0094\u0095\u0007\u0001\u0000\u0000\u0095\u0097\u0003"+
		"\u0014\n\u0002\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0010"+
		"\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u009e\u0003\b\u0004"+
		"\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0003\u0014\n\u0000"+
		"\u00a0\u00a1\u0005\n\u0000\u0000\u00a1\u00a2\u0003\b\u0004\u0000\u00a2"+
		"\u00a3\u0005\u0007\u0000\u0000\u00a3\u00a4\u0003\u0002\u0001\u0000\u00a4"+
		"\u0017\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0011\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0003\u0014\n\u0000\u00a8\u00a9"+
		"\u0005\u0007\u0000\u0000\u00a9\u00aa\u0003\u0002\u0001\u0000\u00aa\u0019"+
		"\u0001\u0000\u0000\u0000\u000b\u001d!+3`y\u0085\u0088\u008e\u0096\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}