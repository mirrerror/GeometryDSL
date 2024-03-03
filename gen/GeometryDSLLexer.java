// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, ID=4, NUMBER=5, WS=6, EQUALS=7, COMMA=8, LPAREN=9, 
		RPAREN=10, SEMI=11, FROM=12, TO=13, CENTER=14, RADIUS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "NUMBER", "WS", "EQUALS", "COMMA", "LPAREN", 
			"RPAREN", "SEMI", "FROM", "TO", "CENTER", "RADIUS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'point'", "'line'", "'circle'", null, null, null, "'='", "','", 
			"'('", "')'", "';'", "'from'", "'to'", "'center'", "'radius'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "NUMBER", "WS", "EQUALS", "COMMA", "LPAREN", 
			"RPAREN", "SEMI", "FROM", "TO", "CENTER", "RADIUS"
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
		"\u0004\u0000\u000fl\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001"+
		"\u0004\u0004\u0004:\b\u0004\u000b\u0004\f\u0004;\u0001\u0004\u0001\u0004"+
		"\u0004\u0004@\b\u0004\u000b\u0004\f\u0004A\u0003\u0004D\b\u0004\u0001"+
		"\u0005\u0004\u0005G\b\u0005\u000b\u0005\f\u0005H\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004"+
		"\u0004\u0000--AZ__az\u0005\u0000--09AZ__az\u0001\u000009\u0003\u0000\t"+
		"\n\r\r  p\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003%\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u00071"+
		"\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000bF\u0001\u0000"+
		"\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000"+
		"\u0011P\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015T"+
		"\u0001\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019[\u0001\u0000"+
		"\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001de\u0001\u0000\u0000\u0000"+
		"\u001f \u0005p\u0000\u0000 !\u0005o\u0000\u0000!\"\u0005i\u0000\u0000"+
		"\"#\u0005n\u0000\u0000#$\u0005t\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005l\u0000\u0000&\'\u0005i\u0000\u0000\'(\u0005n\u0000\u0000()\u0005"+
		"e\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005c\u0000\u0000+,\u0005"+
		"i\u0000\u0000,-\u0005r\u0000\u0000-.\u0005c\u0000\u0000./\u0005l\u0000"+
		"\u0000/0\u0005e\u0000\u00000\u0006\u0001\u0000\u0000\u000015\u0007\u0000"+
		"\u0000\u000024\u0007\u0001\u0000\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\b\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0007\u0002\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<C\u0001\u0000\u0000\u0000=?\u0005"+
		".\u0000\u0000>@\u0007\u0002\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BD\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\n\u0001\u0000\u0000\u0000EG\u0007\u0003\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\u0005\u0000\u0000"+
		"K\f\u0001\u0000\u0000\u0000LM\u0005=\u0000\u0000M\u000e\u0001\u0000\u0000"+
		"\u0000NO\u0005,\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005(\u0000"+
		"\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000S\u0014\u0001"+
		"\u0000\u0000\u0000TU\u0005;\u0000\u0000U\u0016\u0001\u0000\u0000\u0000"+
		"VW\u0005f\u0000\u0000WX\u0005r\u0000\u0000XY\u0005o\u0000\u0000YZ\u0005"+
		"m\u0000\u0000Z\u0018\u0001\u0000\u0000\u0000[\\\u0005t\u0000\u0000\\]"+
		"\u0005o\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005c\u0000\u0000"+
		"_`\u0005e\u0000\u0000`a\u0005n\u0000\u0000ab\u0005t\u0000\u0000bc\u0005"+
		"e\u0000\u0000cd\u0005r\u0000\u0000d\u001c\u0001\u0000\u0000\u0000ef\u0005"+
		"r\u0000\u0000fg\u0005a\u0000\u0000gh\u0005d\u0000\u0000hi\u0005i\u0000"+
		"\u0000ij\u0005u\u0000\u0000jk\u0005s\u0000\u0000k\u001e\u0001\u0000\u0000"+
		"\u0000\u0006\u00005;ACH\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}