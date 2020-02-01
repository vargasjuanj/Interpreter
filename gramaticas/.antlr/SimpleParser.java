// Generated from c:\antlr\gramaticas\Simple.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MIN=5, MULT=6, DIV=7, AND=8, OR=9, 
		NOT=10, GT=11, LT=12, GEQ=13, LEQ=14, EQ=15, NEQ=16, ASSIGN=17, BRACKET_OPEN=18, 
		BRACKET_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ID=23, NUMBER=24, 
		WS=25;
	public static final int
		RULE_program = 0, RULE_sentencias = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_expresion = 5;
	public static final String[] ruleNames = {
		"program", "sentencias", "var_decl", "var_assign", "println", "expresion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", "'&&'", 
		"'||'", "'|'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", 
		"'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "VAR", "PRINTLN", "PLUS", "MIN", "MULT", "DIV", "AND", 
		"OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
		"WS"
	};
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
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SimpleParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(PROGRAM);
			setState(13);
			match(ID);
			setState(14);
			match(BRACKET_OPEN);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(15);
				sentencias();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(BRACKET_CLOSE);
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

	public static class SentenciasContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				var_assign();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				println();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR);
			setState(29);
			match(ID);
			setState(30);
			match(SEMICOLON);
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

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ID);
			setState(33);
			match(ASSIGN);
			setState(34);
			match(NUMBER);
			setState(35);
			match(SEMICOLON);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PRINTLN);
			setState(38);
			expresion();
			setState(39);
			match(SEMICOLON);
			System.out.println("Imprimiendo por pantalla");
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\2\3\2\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\31\32"+
		"\2+\2\16\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f,"+
		"\3\2\2\2\16\17\7\3\2\2\17\20\7\31\2\2\20\24\7\24\2\2\21\23\5\4\3\2\22"+
		"\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26"+
		"\24\3\2\2\2\27\30\7\25\2\2\30\3\3\2\2\2\31\35\5\6\4\2\32\35\5\b\5\2\33"+
		"\35\5\n\6\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36"+
		"\37\7\4\2\2\37 \7\31\2\2 !\7\30\2\2!\7\3\2\2\2\"#\7\31\2\2#$\7\23\2\2"+
		"$%\7\32\2\2%&\7\30\2\2&\t\3\2\2\2\'(\7\5\2\2()\5\f\7\2)*\7\30\2\2*+\b"+
		"\6\1\2+\13\3\2\2\2,-\t\2\2\2-\r\3\2\2\2\4\24\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}