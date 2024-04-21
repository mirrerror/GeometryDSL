// Generated from D:/IdeaProjects/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, EQUALS=4, COMMA=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, SEMI=10, FROM=11, TO=12, CENTER=13, RADIUS=14, FUNCTION=15, 
		FOR=16, WHILE=17, PLUS=18, MINUS=19, MULTIPLY=20, DIVIDE=21, GREATER=22, 
		LESS=23, EQUAL=24, GREATER_EQ=25, LESS_EQ=26, ID=27, NUMBER=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "FROM", "TO", "CENTER", "RADIUS", "FUNCTION", "FOR", 
			"WHILE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "GREATER", "LESS", "EQUAL", 
			"GREATER_EQ", "LESS_EQ", "ID", "NUMBER", "WS"
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
		"\u0004\u0000\u001d\u00b4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u009c\b\u001a\n\u001a"+
		"\f\u001a\u009f\t\u001a\u0001\u001b\u0004\u001b\u00a2\b\u001b\u000b\u001b"+
		"\f\u001b\u00a3\u0001\u001b\u0001\u001b\u0004\u001b\u00a8\b\u001b\u000b"+
		"\u001b\f\u001b\u00a9\u0003\u001b\u00ac\b\u001b\u0001\u001c\u0004\u001c"+
		"\u00af\b\u001c\u000b\u001c\f\u001c\u00b0\u0001\u001c\u0001\u001c\u0000"+
		"\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0004\u0003"+
		"\u0000--AZaz\u0004\u0000--09AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00b8"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003A"+
		"\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007M\u0001\u0000"+
		"\u0000\u0000\tO\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000"+
		"\rS\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001"+
		"\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000"+
		"\u0000\u0017`\u0001\u0000\u0000\u0000\u0019c\u0001\u0000\u0000\u0000\u001b"+
		"j\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000\u001fz\u0001"+
		"\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000"+
		"\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000"+
		")\u008a\u0001\u0000\u0000\u0000+\u008c\u0001\u0000\u0000\u0000-\u008e"+
		"\u0001\u0000\u0000\u0000/\u0090\u0001\u0000\u0000\u00001\u0093\u0001\u0000"+
		"\u0000\u00003\u0096\u0001\u0000\u0000\u00005\u0099\u0001\u0000\u0000\u0000"+
		"7\u00a1\u0001\u0000\u0000\u00009\u00ae\u0001\u0000\u0000\u0000;<\u0005"+
		"p\u0000\u0000<=\u0005o\u0000\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000"+
		"\u0000?@\u0005t\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005l\u0000"+
		"\u0000BC\u0005i\u0000\u0000CD\u0005n\u0000\u0000DE\u0005e\u0000\u0000"+
		"E\u0004\u0001\u0000\u0000\u0000FG\u0005c\u0000\u0000GH\u0005i\u0000\u0000"+
		"HI\u0005r\u0000\u0000IJ\u0005c\u0000\u0000JK\u0005l\u0000\u0000KL\u0005"+
		"e\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005=\u0000\u0000N\b\u0001"+
		"\u0000\u0000\u0000OP\u0005,\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005"+
		"(\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000T\u000e\u0001"+
		"\u0000\u0000\u0000UV\u0005{\u0000\u0000V\u0010\u0001\u0000\u0000\u0000"+
		"WX\u0005}\u0000\u0000X\u0012\u0001\u0000\u0000\u0000YZ\u0005;\u0000\u0000"+
		"Z\u0014\u0001\u0000\u0000\u0000[\\\u0005f\u0000\u0000\\]\u0005r\u0000"+
		"\u0000]^\u0005o\u0000\u0000^_\u0005m\u0000\u0000_\u0016\u0001\u0000\u0000"+
		"\u0000`a\u0005t\u0000\u0000ab\u0005o\u0000\u0000b\u0018\u0001\u0000\u0000"+
		"\u0000cd\u0005c\u0000\u0000de\u0005e\u0000\u0000ef\u0005n\u0000\u0000"+
		"fg\u0005t\u0000\u0000gh\u0005e\u0000\u0000hi\u0005r\u0000\u0000i\u001a"+
		"\u0001\u0000\u0000\u0000jk\u0005r\u0000\u0000kl\u0005a\u0000\u0000lm\u0005"+
		"d\u0000\u0000mn\u0005i\u0000\u0000no\u0005u\u0000\u0000op\u0005s\u0000"+
		"\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005f\u0000\u0000rs\u0005u\u0000"+
		"\u0000st\u0005n\u0000\u0000tu\u0005c\u0000\u0000uv\u0005t\u0000\u0000"+
		"vw\u0005i\u0000\u0000wx\u0005o\u0000\u0000xy\u0005n\u0000\u0000y\u001e"+
		"\u0001\u0000\u0000\u0000z{\u0005f\u0000\u0000{|\u0005o\u0000\u0000|}\u0005"+
		"r\u0000\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005w\u0000\u0000\u007f"+
		"\u0080\u0005h\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005"+
		"l\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\"\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005+\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005-\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"*\u0000\u0000\u0089(\u0001\u0000\u0000\u0000\u008a\u008b\u0005/\u0000"+
		"\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008d\u0005>\u0000\u0000\u008d"+
		",\u0001\u0000\u0000\u0000\u008e\u008f\u0005<\u0000\u0000\u008f.\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005=\u0000\u0000\u0091\u0092\u0005=\u0000"+
		"\u0000\u00920\u0001\u0000\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094"+
		"\u0095\u0005=\u0000\u0000\u00952\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"<\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u00984\u0001\u0000\u0000"+
		"\u0000\u0099\u009d\u0007\u0000\u0000\u0000\u009a\u009c\u0007\u0001\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e6\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0007\u0002\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0005.\u0000\u0000\u00a6\u00a8\u0007\u0002\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac8\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0007\u0003\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0006\u001c\u0000\u0000\u00b3:\u0001\u0000\u0000\u0000\u0006\u0000\u009d"+
		"\u00a3\u00a9\u00ab\u00b0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}