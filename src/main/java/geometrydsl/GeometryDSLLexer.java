package geometrydsl;// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
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
		LINE=9, CIRCLE=10, FROM=11, TO=12, CENTER=13, RADIUS=14, FUNCTION=15, 
		FOR=16, WHILE=17, IF=18, ELSE=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, 
		GREATER=24, LESS=25, EQUAL=26, NOT_EQUAL=27, GREATER_EQ=28, LESS_EQ=29, 
		ID=30, NUMBER=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "POINT", 
			"LINE", "CIRCLE", "FROM", "TO", "CENTER", "RADIUS", "FUNCTION", "FOR", 
			"WHILE", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "GREATER", 
			"LESS", "EQUAL", "NOT_EQUAL", "GREATER_EQ", "LESS_EQ", "ID", "NUMBER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'('", "')'", "'{'", "'}'", "';'", "'point'", "'line'", 
			"'circle'", "'from'", "'to'", "'center'", "'radius'", "'function'", "'for'", 
			"'while'", "'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'=='", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
			"POINT", "LINE", "CIRCLE", "FROM", "TO", "CENTER", "RADIUS", "FUNCTION", 
			"FOR", "WHILE", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"GREATER", "LESS", "EQUAL", "NOT_EQUAL", "GREATER_EQ", "LESS_EQ", "ID", 
			"NUMBER", "WS"
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
		"\u0004\u0000 \u00c5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u00ad"+
		"\b\u001d\n\u001d\f\u001d\u00b0\t\u001d\u0001\u001e\u0004\u001e\u00b3\b"+
		"\u001e\u000b\u001e\f\u001e\u00b4\u0001\u001e\u0001\u001e\u0004\u001e\u00b9"+
		"\b\u001e\u000b\u001e\f\u001e\u00ba\u0003\u001e\u00bd\b\u001e\u0001\u001f"+
		"\u0004\u001f\u00c0\b\u001f\u000b\u001f\f\u001f\u00c1\u0001\u001f\u0001"+
		"\u001f\u0000\u0000 \u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? \u0001\u0000\u0004\u0003\u0000--AZaz\u0004\u0000--09AZaz\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00c9\u0000\u0001\u0001\u0000\u0000\u0000"+
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
		"\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003C\u0001\u0000\u0000"+
		"\u0000\u0005E\u0001\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000\t"+
		"I\u0001\u0000\u0000\u0000\u000bK\u0001\u0000\u0000\u0000\rM\u0001\u0000"+
		"\u0000\u0000\u000fO\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000"+
		"\u0013Z\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017f"+
		"\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bp\u0001\u0000"+
		"\u0000\u0000\u001dw\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000\u0000"+
		"\u0000!\u0084\u0001\u0000\u0000\u0000#\u008a\u0001\u0000\u0000\u0000%"+
		"\u008d\u0001\u0000\u0000\u0000\'\u0092\u0001\u0000\u0000\u0000)\u0094"+
		"\u0001\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-\u0098\u0001\u0000"+
		"\u0000\u0000/\u009a\u0001\u0000\u0000\u00001\u009c\u0001\u0000\u0000\u0000"+
		"3\u009e\u0001\u0000\u0000\u00005\u00a1\u0001\u0000\u0000\u00007\u00a4"+
		"\u0001\u0000\u0000\u00009\u00a7\u0001\u0000\u0000\u0000;\u00aa\u0001\u0000"+
		"\u0000\u0000=\u00b2\u0001\u0000\u0000\u0000?\u00bf\u0001\u0000\u0000\u0000"+
		"AB\u0005=\u0000\u0000B\u0002\u0001\u0000\u0000\u0000CD\u0005,\u0000\u0000"+
		"D\u0004\u0001\u0000\u0000\u0000EF\u0005(\u0000\u0000F\u0006\u0001\u0000"+
		"\u0000\u0000GH\u0005)\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005{"+
		"\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005}\u0000\u0000L\f\u0001"+
		"\u0000\u0000\u0000MN\u0005;\u0000\u0000N\u000e\u0001\u0000\u0000\u0000"+
		"OP\u0005p\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005i\u0000\u0000RS\u0005"+
		"n\u0000\u0000ST\u0005t\u0000\u0000T\u0010\u0001\u0000\u0000\u0000UV\u0005"+
		"l\u0000\u0000VW\u0005i\u0000\u0000WX\u0005n\u0000\u0000XY\u0005e\u0000"+
		"\u0000Y\u0012\u0001\u0000\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005i\u0000"+
		"\u0000\\]\u0005r\u0000\u0000]^\u0005c\u0000\u0000^_\u0005l\u0000\u0000"+
		"_`\u0005e\u0000\u0000`\u0014\u0001\u0000\u0000\u0000ab\u0005f\u0000\u0000"+
		"bc\u0005r\u0000\u0000cd\u0005o\u0000\u0000de\u0005m\u0000\u0000e\u0016"+
		"\u0001\u0000\u0000\u0000fg\u0005t\u0000\u0000gh\u0005o\u0000\u0000h\u0018"+
		"\u0001\u0000\u0000\u0000ij\u0005c\u0000\u0000jk\u0005e\u0000\u0000kl\u0005"+
		"n\u0000\u0000lm\u0005t\u0000\u0000mn\u0005e\u0000\u0000no\u0005r\u0000"+
		"\u0000o\u001a\u0001\u0000\u0000\u0000pq\u0005r\u0000\u0000qr\u0005a\u0000"+
		"\u0000rs\u0005d\u0000\u0000st\u0005i\u0000\u0000tu\u0005u\u0000\u0000"+
		"uv\u0005s\u0000\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005f\u0000\u0000"+
		"xy\u0005u\u0000\u0000yz\u0005n\u0000\u0000z{\u0005c\u0000\u0000{|\u0005"+
		"t\u0000\u0000|}\u0005i\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005n"+
		"\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005f\u0000"+
		"\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083\u0005r\u0000\u0000\u0083"+
		" \u0001\u0000\u0000\u0000\u0084\u0085\u0005w\u0000\u0000\u0085\u0086\u0005"+
		"h\u0000\u0000\u0086\u0087\u0005i\u0000\u0000\u0087\u0088\u0005l\u0000"+
		"\u0000\u0088\u0089\u0005e\u0000\u0000\u0089\"\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005i\u0000\u0000\u008b\u008c\u0005f\u0000\u0000\u008c$"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e\u008f\u0005"+
		"l\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090\u0091\u0005e\u0000"+
		"\u0000\u0091&\u0001\u0000\u0000\u0000\u0092\u0093\u0005+\u0000\u0000\u0093"+
		"(\u0001\u0000\u0000\u0000\u0094\u0095\u0005-\u0000\u0000\u0095*\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005*\u0000\u0000\u0097,\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005/\u0000\u0000\u0099.\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005>\u0000\u0000\u009b0\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"<\u0000\u0000\u009d2\u0001\u0000\u0000\u0000\u009e\u009f\u0005=\u0000"+
		"\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a04\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005!\u0000\u0000\u00a2\u00a3\u0005=\u0000\u0000\u00a36\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005>\u0000\u0000\u00a5\u00a6\u0005=\u0000"+
		"\u0000\u00a68\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005<\u0000\u0000\u00a8"+
		"\u00a9\u0005=\u0000\u0000\u00a9:\u0001\u0000\u0000\u0000\u00aa\u00ae\u0007"+
		"\u0000\u0000\u0000\u00ab\u00ad\u0007\u0001\u0000\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af<\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3\u0007\u0002"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00bc\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005.\u0000"+
		"\u0000\u00b7\u00b9\u0007\u0002\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd>\u0001\u0000\u0000\u0000\u00be\u00c0\u0007\u0003\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006\u001f\u0000\u0000"+
		"\u00c4@\u0001\u0000\u0000\u0000\u0006\u0000\u00ae\u00b4\u00ba\u00bc\u00c1"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}