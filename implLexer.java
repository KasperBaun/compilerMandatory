// Generated from impl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, FLOAT=15, ALPHA=16, NUM=17, 
		WHITESPACE=18, COMMENT=19, COMMENT2=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", 
			"COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'+'", "'*'", "'/'", "'-'", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17S\n\17"+
		"\f\17\16\17V\13\17\3\20\5\20Y\n\20\3\20\6\20\\\n\20\r\20\16\20]\3\20\3"+
		"\20\6\20b\n\20\r\20\16\20c\5\20f\n\20\3\21\3\21\3\22\3\22\3\23\6\23m\n"+
		"\23\r\23\16\23n\3\23\3\23\3\24\3\24\3\24\3\24\7\24w\n\24\f\24\16\24z\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0084\n\25\f\25\16\25"+
		"\u0087\13\25\3\25\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\b\t\2C\\aac|\u00c7\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2"+
		"\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u0096\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2"+
		"\13\63\3\2\2\2\r:\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2"+
		"\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37X\3\2\2\2!g\3\2"+
		"\2\2#i\3\2\2\2%l\3\2\2\2\'r\3\2\2\2)}\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7"+
		"\177\2\2.\6\3\2\2\2/\60\7?\2\2\60\b\3\2\2\2\61\62\7=\2\2\62\n\3\2\2\2"+
		"\63\64\7q\2\2\64\65\7w\2\2\65\66\7v\2\2\66\67\7r\2\2\678\7w\2\289\7v\2"+
		"\29\f\3\2\2\2:;\7y\2\2;<\7j\2\2<=\7k\2\2=>\7n\2\2>?\7g\2\2?\16\3\2\2\2"+
		"@A\7*\2\2A\20\3\2\2\2BC\7+\2\2C\22\3\2\2\2DE\7-\2\2E\24\3\2\2\2FG\7,\2"+
		"\2G\26\3\2\2\2HI\7\61\2\2I\30\3\2\2\2JK\7/\2\2K\32\3\2\2\2LM\7#\2\2MN"+
		"\7?\2\2N\34\3\2\2\2OT\5!\21\2PS\5!\21\2QS\5#\22\2RP\3\2\2\2RQ\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\36\3\2\2\2VT\3\2\2\2WY\7/\2\2XW\3\2\2"+
		"\2XY\3\2\2\2Y[\3\2\2\2Z\\\5#\22\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^e\3\2\2\2_a\7\60\2\2`b\5#\22\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2e_\3\2\2\2ef\3\2\2\2f \3\2\2\2gh\t\2\2\2h\"\3\2\2\2ij"+
		"\t\3\2\2j$\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o"+
		"p\3\2\2\2pq\b\23\2\2q&\3\2\2\2rs\7\61\2\2st\7\61\2\2tx\3\2\2\2uw\n\5\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\b\24"+
		"\2\2|(\3\2\2\2}~\7\61\2\2~\177\7,\2\2\177\u0085\3\2\2\2\u0080\u0084\n"+
		"\6\2\2\u0081\u0082\7,\2\2\u0082\u0084\n\7\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7,\2\2\u0089"+
		"\u008a\7\61\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\25\2\2\u008c*\3\2\2"+
		"\2\r\2RTX]cenx\u0083\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}