// Generated from TrigExpr.g4 by ANTLR 4.9.2

    import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrigExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, NUMBER=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "NUMBER", "WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "NUMBER", "WS"
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


	    Map<String, Double> variables = new HashMap<>();


	public TrigExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TrigExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b>\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\6\5\31\n\5\r\5\16\5\32\3\6\5\6\36\n\6\3\6\6\6!\n\6\r\6\16\6\"\3\6"+
		"\3\6\7\6\'\n\6\f\6\16\6*\13\6\5\6,\n\6\3\6\3\6\6\6\60\n\6\r\6\16\6\61"+
		"\5\6\64\n\6\3\7\6\7\67\n\7\r\7\16\78\3\7\3\7\3\b\3\b\2\2\t\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\2\3\2\5\4\2C\\c|\5\2\13\f\17\17\"\"\3\2\62;\2D\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3"+
		"\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2\2\t\30\3\2\2\2\13\35\3\2\2\2\r\66"+
		"\3\2\2\2\17<\3\2\2\2\21\22\7*\2\2\22\4\3\2\2\2\23\24\7+\2\2\24\6\3\2\2"+
		"\2\25\26\7?\2\2\26\b\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\30\3\2\2\2\32\33\3\2\2\2\33\n\3\2\2\2\34\36\7/\2\2\35\34\3\2\2\2\35"+
		"\36\3\2\2\2\36\63\3\2\2\2\37!\5\17\b\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2"+
		"\2\"#\3\2\2\2#+\3\2\2\2$(\7\60\2\2%\'\5\17\b\2&%\3\2\2\2\'*\3\2\2\2(&"+
		"\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+$\3\2\2\2+,\3\2\2\2,\64\3\2\2\2"+
		"-/\7\60\2\2.\60\5\17\b\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\64\3\2\2\2\63 \3\2\2\2\63-\3\2\2\2\64\f\3\2\2\2\65\67\t\3\2\2"+
		"\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\7\2\2;"+
		"\16\3\2\2\2<=\t\4\2\2=\20\3\2\2\2\13\2\32\35\"(+\61\638\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}