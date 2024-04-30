// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1

    package geometrydsl;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GeometryDSLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "POINT", 
			"LINE", "CIRCLE", "TRIANGLE", "RECTANGLE", "POLYGON", "FROM", "TO", "CENTER", 
			"RADIUS", "FUNCTION", "FOR", "WHILE", "IF", "ELSE", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "GREATER", "LESS", "EQUAL", "NOT_EQUAL", "GREATER_EQ", 
			"LESS_EQ", "ID", "NUMBER", "STRING", "WS", "COMMENT"
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


	public GeometryDSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GeometryDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000%\u00fe\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u00d2\b \n \f \u00d5\t \u0001!\u0004!\u00d8\b!\u000b!\f!\u00d9"+
		"\u0001!\u0001!\u0004!\u00de\b!\u000b!\f!\u00df\u0003!\u00e2\b!\u0001\""+
		"\u0001\"\u0005\"\u00e6\b\"\n\"\f\"\u00e9\t\"\u0001\"\u0001\"\u0001#\u0004"+
		"#\u00ee\b#\u000b#\f#\u00ef\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u00f8\b$\n$\f$\u00fb\t$\u0001$\u0001$\u0000\u0000%\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%\u0001\u0000\u0006\u0003"+
		"\u0000--AZaz\u0004\u0000--09AZaz\u0001\u000009\u0001\u0000\"\"\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000\n\n\r\r\u0104\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0001K\u0001\u0000\u0000\u0000\u0003M\u0001"+
		"\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000"+
		"\u0000\tS\u0001\u0000\u0000\u0000\u000bU\u0001\u0000\u0000\u0000\rW\u0001"+
		"\u0000\u0000\u0000\u000fY\u0001\u0000\u0000\u0000\u0011_\u0001\u0000\u0000"+
		"\u0000\u0013d\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017"+
		"t\u0001\u0000\u0000\u0000\u0019~\u0001\u0000\u0000\u0000\u001b\u0086\u0001"+
		"\u0000\u0000\u0000\u001d\u008b\u0001\u0000\u0000\u0000\u001f\u008e\u0001"+
		"\u0000\u0000\u0000!\u0095\u0001\u0000\u0000\u0000#\u009c\u0001\u0000\u0000"+
		"\u0000%\u00a5\u0001\u0000\u0000\u0000\'\u00a9\u0001\u0000\u0000\u0000"+
		")\u00af\u0001\u0000\u0000\u0000+\u00b2\u0001\u0000\u0000\u0000-\u00b7"+
		"\u0001\u0000\u0000\u0000/\u00b9\u0001\u0000\u0000\u00001\u00bb\u0001\u0000"+
		"\u0000\u00003\u00bd\u0001\u0000\u0000\u00005\u00bf\u0001\u0000\u0000\u0000"+
		"7\u00c1\u0001\u0000\u0000\u00009\u00c3\u0001\u0000\u0000\u0000;\u00c6"+
		"\u0001\u0000\u0000\u0000=\u00c9\u0001\u0000\u0000\u0000?\u00cc\u0001\u0000"+
		"\u0000\u0000A\u00cf\u0001\u0000\u0000\u0000C\u00d7\u0001\u0000\u0000\u0000"+
		"E\u00e3\u0001\u0000\u0000\u0000G\u00ed\u0001\u0000\u0000\u0000I\u00f3"+
		"\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000L\u0002\u0001\u0000\u0000"+
		"\u0000MN\u0005,\u0000\u0000N\u0004\u0001\u0000\u0000\u0000OP\u0005(\u0000"+
		"\u0000P\u0006\u0001\u0000\u0000\u0000QR\u0005)\u0000\u0000R\b\u0001\u0000"+
		"\u0000\u0000ST\u0005{\u0000\u0000T\n\u0001\u0000\u0000\u0000UV\u0005}"+
		"\u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005;\u0000\u0000X\u000e\u0001"+
		"\u0000\u0000\u0000YZ\u0005p\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005"+
		"i\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005t\u0000\u0000^\u0010\u0001"+
		"\u0000\u0000\u0000_`\u0005l\u0000\u0000`a\u0005i\u0000\u0000ab\u0005n"+
		"\u0000\u0000bc\u0005e\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005"+
		"c\u0000\u0000ef\u0005i\u0000\u0000fg\u0005r\u0000\u0000gh\u0005c\u0000"+
		"\u0000hi\u0005l\u0000\u0000ij\u0005e\u0000\u0000j\u0014\u0001\u0000\u0000"+
		"\u0000kl\u0005t\u0000\u0000lm\u0005r\u0000\u0000mn\u0005i\u0000\u0000"+
		"no\u0005a\u0000\u0000op\u0005n\u0000\u0000pq\u0005g\u0000\u0000qr\u0005"+
		"l\u0000\u0000rs\u0005e\u0000\u0000s\u0016\u0001\u0000\u0000\u0000tu\u0005"+
		"r\u0000\u0000uv\u0005e\u0000\u0000vw\u0005c\u0000\u0000wx\u0005t\u0000"+
		"\u0000xy\u0005a\u0000\u0000yz\u0005n\u0000\u0000z{\u0005g\u0000\u0000"+
		"{|\u0005l\u0000\u0000|}\u0005e\u0000\u0000}\u0018\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005p\u0000\u0000\u007f\u0080\u0005o\u0000\u0000\u0080\u0081"+
		"\u0005l\u0000\u0000\u0081\u0082\u0005y\u0000\u0000\u0082\u0083\u0005g"+
		"\u0000\u0000\u0083\u0084\u0005o\u0000\u0000\u0084\u0085\u0005n\u0000\u0000"+
		"\u0085\u001a\u0001\u0000\u0000\u0000\u0086\u0087\u0005f\u0000\u0000\u0087"+
		"\u0088\u0005r\u0000\u0000\u0088\u0089\u0005o\u0000\u0000\u0089\u008a\u0005"+
		"m\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000\u008b\u008c\u0005t\u0000"+
		"\u0000\u008c\u008d\u0005o\u0000\u0000\u008d\u001e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005c\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0091"+
		"\u0005n\u0000\u0000\u0091\u0092\u0005t\u0000\u0000\u0092\u0093\u0005e"+
		"\u0000\u0000\u0093\u0094\u0005r\u0000\u0000\u0094 \u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005r\u0000\u0000\u0096\u0097\u0005a\u0000\u0000\u0097\u0098"+
		"\u0005d\u0000\u0000\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005u"+
		"\u0000\u0000\u009a\u009b\u0005s\u0000\u0000\u009b\"\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005f\u0000\u0000\u009d\u009e\u0005u\u0000\u0000\u009e"+
		"\u009f\u0005n\u0000\u0000\u009f\u00a0\u0005c\u0000\u0000\u00a0\u00a1\u0005"+
		"t\u0000\u0000\u00a1\u00a2\u0005i\u0000\u0000\u00a2\u00a3\u0005o\u0000"+
		"\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4$\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005f\u0000\u0000\u00a6\u00a7\u0005o\u0000\u0000\u00a7\u00a8\u0005"+
		"r\u0000\u0000\u00a8&\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005w\u0000"+
		"\u0000\u00aa\u00ab\u0005h\u0000\u0000\u00ab\u00ac\u0005i\u0000\u0000\u00ac"+
		"\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae(\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005i\u0000\u0000\u00b0\u00b1\u0005f\u0000"+
		"\u0000\u00b1*\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005e\u0000\u0000\u00b3"+
		"\u00b4\u0005l\u0000\u0000\u00b4\u00b5\u0005s\u0000\u0000\u00b5\u00b6\u0005"+
		"e\u0000\u0000\u00b6,\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005+\u0000"+
		"\u0000\u00b8.\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005-\u0000\u0000\u00ba"+
		"0\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005*\u0000\u0000\u00bc2\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be4\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c06\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005<\u0000\u0000\u00c28\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"=\u0000\u0000\u00c4\u00c5\u0005=\u0000\u0000\u00c5:\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7\u00c8\u0005=\u0000\u0000\u00c8"+
		"<\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005>\u0000\u0000\u00ca\u00cb\u0005"+
		"=\u0000\u0000\u00cb>\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005<\u0000"+
		"\u0000\u00cd\u00ce\u0005=\u0000\u0000\u00ce@\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d3\u0007\u0000\u0000\u0000\u00d0\u00d2\u0007\u0001\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"B\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0007\u0002\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00e1\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0005.\u0000\u0000\u00dc\u00de\u0007\u0002\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2D\u0001\u0000\u0000\u0000\u00e3\u00e7\u0005\""+
		"\u0000\u0000\u00e4\u00e6\b\u0003\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\"\u0000\u0000"+
		"\u00ebF\u0001\u0000\u0000\u0000\u00ec\u00ee\u0007\u0004\u0000\u0000\u00ed"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0006#\u0000\u0000\u00f2H\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005/\u0000\u0000\u00f4\u00f5\u0005/\u0000"+
		"\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f8\b\u0005\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0006$\u0000\u0000\u00fdJ\u0001\u0000\u0000\u0000\b\u0000"+
		"\u00d3\u00d9\u00df\u00e1\u00e7\u00ef\u00f9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}