// Generated from Modulo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModuloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MIN=5, MULT=6, DIV=7, POWER=8, MOD=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		ID=25, NUMBER=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "PLUS", "MIN", "MULT", "DIV", "POWER", "MOD", 
			"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"ID", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", 
			"'**'", "'%'", "'&&'", "'||'", "'|'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "PLUS", "MIN", "MULT", "DIV", "POWER", 
			"MOD", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"ID", "NUMBER", "WS"
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


	public ModuloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Modulo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\7\32\u0081\n\32\f\32\16\32\u0084\13\32\3\33\6\33\u0087\n\33\r\33\16"+
		"\33\u0088\3\34\6\34\u008c\n\34\r\34\16\34\u008d\3\34\3\34\2\2\35\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\5\2C\\"+
		"aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0093\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2"+
		"\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2"+
		"\25Z\3\2\2\2\27]\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2"+
		"\2!i\3\2\2\2#l\3\2\2\2%o\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-x\3\2"+
		"\2\2/z\3\2\2\2\61|\3\2\2\2\63~\3\2\2\2\65\u0086\3\2\2\2\67\u008b\3\2\2"+
		"\29:\7r\2\2:;\7t\2\2;<\7q\2\2<=\7i\2\2=>\7t\2\2>?\7c\2\2?@\7o\2\2@\4\3"+
		"\2\2\2AB\7x\2\2BC\7c\2\2CD\7t\2\2D\6\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7k\2"+
		"\2HI\7p\2\2IJ\7v\2\2JK\7n\2\2KL\7p\2\2L\b\3\2\2\2MN\7-\2\2N\n\3\2\2\2"+
		"OP\7/\2\2P\f\3\2\2\2QR\7,\2\2R\16\3\2\2\2ST\7\61\2\2T\20\3\2\2\2UV\7,"+
		"\2\2VW\7,\2\2W\22\3\2\2\2XY\7\'\2\2Y\24\3\2\2\2Z[\7(\2\2[\\\7(\2\2\\\26"+
		"\3\2\2\2]^\7~\2\2^_\7~\2\2_\30\3\2\2\2`a\7~\2\2a\32\3\2\2\2bc\7@\2\2c"+
		"\34\3\2\2\2de\7>\2\2e\36\3\2\2\2fg\7@\2\2gh\7?\2\2h \3\2\2\2ij\7>\2\2"+
		"jk\7?\2\2k\"\3\2\2\2lm\7?\2\2mn\7?\2\2n$\3\2\2\2op\7#\2\2pq\7?\2\2q&\3"+
		"\2\2\2rs\7?\2\2s(\3\2\2\2tu\7}\2\2u*\3\2\2\2vw\7\177\2\2w,\3\2\2\2xy\7"+
		"*\2\2y.\3\2\2\2z{\7+\2\2{\60\3\2\2\2|}\7=\2\2}\62\3\2\2\2~\u0082\t\2\2"+
		"\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\64\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\66\3\2\2\2\u008a\u008c\t\5\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\b\34\2\2\u00908\3\2\2\2\6\2\u0082\u0088\u008d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}