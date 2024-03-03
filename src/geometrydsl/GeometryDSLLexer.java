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
		T__0=1, T__1=2, T__2=3, EQUALS=4, COMMA=5, LPAREN=6, RPAREN=7, SEMI=8, 
		FROM=9, TO=10, CENTER=11, RADIUS=12, FUNCTION=13, ID=14, NUMBER=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "EQUALS", "COMMA", "LPAREN", "RPAREN", "SEMI", 
			"FROM", "TO", "CENTER", "RADIUS", "FUNCTION", "ID", "NUMBER", "WS"
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
		"\u0004\u0000\u0010w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\r_\b\r\n\r\f\rb\t\r\u0001\u000e\u0004\u000ee\b\u000e\u000b\u000e"+
		"\f\u000ef\u0001\u000e\u0001\u000e\u0004\u000ek\b\u000e\u000b\u000e\f\u000e"+
		"l\u0003\u000eo\b\u000e\u0001\u000f\u0004\u000fr\b\u000f\u000b\u000f\f"+
		"\u000fs\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001"+
		"\u0000\u0004\u0003\u0000--AZaz\u0004\u0000--09AZaz\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  {\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0001!\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000"+
		"\u0005,\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001"+
		"\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013"+
		"B\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017L\u0001"+
		"\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000"+
		"\u0000\u0000\u001dd\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000"+
		"!\"\u0005p\u0000\u0000\"#\u0005o\u0000\u0000#$\u0005i\u0000\u0000$%\u0005"+
		"n\u0000\u0000%&\u0005t\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005"+
		"l\u0000\u0000()\u0005i\u0000\u0000)*\u0005n\u0000\u0000*+\u0005e\u0000"+
		"\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005c\u0000\u0000-.\u0005i\u0000"+
		"\u0000./\u0005r\u0000\u0000/0\u0005c\u0000\u000001\u0005l\u0000\u0000"+
		"12\u0005e\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005=\u0000\u0000"+
		"4\b\u0001\u0000\u0000\u000056\u0005,\u0000\u00006\n\u0001\u0000\u0000"+
		"\u000078\u0005(\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005)\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0010\u0001"+
		"\u0000\u0000\u0000=>\u0005f\u0000\u0000>?\u0005r\u0000\u0000?@\u0005o"+
		"\u0000\u0000@A\u0005m\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005"+
		"t\u0000\u0000CD\u0005o\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0005"+
		"c\u0000\u0000FG\u0005e\u0000\u0000GH\u0005n\u0000\u0000HI\u0005t\u0000"+
		"\u0000IJ\u0005e\u0000\u0000JK\u0005r\u0000\u0000K\u0016\u0001\u0000\u0000"+
		"\u0000LM\u0005r\u0000\u0000MN\u0005a\u0000\u0000NO\u0005d\u0000\u0000"+
		"OP\u0005i\u0000\u0000PQ\u0005u\u0000\u0000QR\u0005s\u0000\u0000R\u0018"+
		"\u0001\u0000\u0000\u0000ST\u0005f\u0000\u0000TU\u0005u\u0000\u0000UV\u0005"+
		"n\u0000\u0000VW\u0005c\u0000\u0000WX\u0005t\u0000\u0000XY\u0005i\u0000"+
		"\u0000YZ\u0005o\u0000\u0000Z[\u0005n\u0000\u0000[\u001a\u0001\u0000\u0000"+
		"\u0000\\`\u0007\u0000\u0000\u0000]_\u0007\u0001\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u001c\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gn\u0001"+
		"\u0000\u0000\u0000hj\u0005.\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o\u001e\u0001\u0000\u0000\u0000pr\u0007"+
		"\u0003\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0006\u000f\u0000\u0000v \u0001\u0000\u0000\u0000\u0006\u0000"+
		"`flns\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}