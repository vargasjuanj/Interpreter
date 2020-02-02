// Generated from c:\antlr\gramaticas\others\Testear.g4 by ANTLR 4.7.1

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestearParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MIN=5, MULT=6, DIV=7, POWER=8, AND=9, 
		OR=10, NOT=11, GT=12, LT=13, GEQ=14, LEQ=15, EQ=16, NEQ=17, ASSIGN=18, 
		BRACKET_OPEN=19, BRACKET_CLOSE=20, PAR_OPEN=21, PAR_CLOSE=22, SEMICOLON=23, 
		ID=24, NUMBER=25, WS=26;
	public static final int
		RULE_program = 0, RULE_sentencias = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_expresion = 5, RULE_factor_o_division = 6, RULE_term = 7;
	public static final String[] ruleNames = {
		"program", "sentencias", "var_decl", "var_assign", "println", "expresion", 
		"factor_o_division", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", "'**'", 
		"'&&'", "'||'", "'|'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "VAR", "PRINTLN", "PLUS", "MIN", "MULT", "DIV", "POWER", 
		"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", 
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
	public String getGrammarFileName() { return "Testear.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	Map<String,Object> symbolTable = new HashMap<String,Object>();
	 
	public TestearParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(TestearParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(TestearParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(TestearParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(TestearParser.BRACKET_CLOSE, 0); }
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
			setState(16);
			match(PROGRAM);
			setState(17);
			match(ID);
			setState(18);
			match(BRACKET_OPEN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(19);
				sentencias();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
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
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				var_assign();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
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
		public Token ID;
		public TerminalNode VAR() { return getToken(TestearParser.VAR, 0); }
		public TerminalNode ID() { return getToken(TestearParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(TestearParser.SEMICOLON, 0); }
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
			setState(32);
			match(VAR);
			setState(33);
			((Var_declContext)_localctx).ID = match(ID);
			setState(34);
			match(SEMICOLON);
			symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),0);
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
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(TestearParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TestearParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TestearParser.SEMICOLON, 0); }
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
			setState(37);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(38);
			match(ASSIGN);
			setState(39);
			((Var_assignContext)_localctx).expresion = expresion();
			setState(40);
			match(SEMICOLON);
			symbolTable.put((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expresion.value);
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
		public ExpresionContext expresion;
		public TerminalNode PRINTLN() { return getToken(TestearParser.PRINTLN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TestearParser.SEMICOLON, 0); }
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
			setState(43);
			match(PRINTLN);
			setState(44);
			((PrintlnContext)_localctx).expresion = expresion();
			setState(45);
			match(SEMICOLON);
			System.out.println(((PrintlnContext)_localctx).expresion.value);
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
		public Object value;
		public Factor_o_divisionContext t1;
		public Factor_o_divisionContext t2;
		public List<TerminalNode> MIN() { return getTokens(TestearParser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(TestearParser.MIN, i);
		}
		public List<Factor_o_divisionContext> factor_o_division() {
			return getRuleContexts(Factor_o_divisionContext.class);
		}
		public Factor_o_divisionContext factor_o_division(int i) {
			return getRuleContext(Factor_o_divisionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TestearParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TestearParser.PLUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(TestearParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(TestearParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TestearParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TestearParser.DIV, i);
		}
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48);
				match(MIN);
				setState(49);
				((ExpresionContext)_localctx).t1 = factor_o_division();
				((ExpresionContext)_localctx).value = -(int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			case 2:
				{
				setState(52);
				((ExpresionContext)_localctx).t1 = factor_o_division();
				((ExpresionContext)_localctx).value = (int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(57);
					match(MIN);
					setState(58);
					match(PLUS);
					setState(59);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 2:
					{
					setState(62);
					match(PLUS);
					setState(63);
					match(MIN);
					setState(64);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 3:
					{
					setState(67);
					match(PLUS);
					setState(68);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 4:
					{
					setState(71);
					match(MIN);
					setState(72);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 5:
					{
					setState(75);
					match(MULT);
					setState(76);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 6:
					{
					setState(79);
					match(DIV);
					setState(80);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Factor_o_divisionContext extends ParserRuleContext {
		public Object value;
		public TermContext t2;
		public TermContext t1;
		public List<TerminalNode> MULT() { return getTokens(TestearParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(TestearParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TestearParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TestearParser.DIV, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Factor_o_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_o_division; }
	}

	public final Factor_o_divisionContext factor_o_division() throws RecognitionException {
		Factor_o_divisionContext _localctx = new Factor_o_divisionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor_o_division);
		try {
			int _alt;
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(96);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(88);
							match(MULT);
							setState(89);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(92);
							match(DIV);
							setState(93);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((Factor_o_divisionContext)_localctx).t1 = term();
				((Factor_o_divisionContext)_localctx).value = (int)((Factor_o_divisionContext)_localctx).t1.value; 
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(111);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(103);
							match(MULT);
							setState(104);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(107);
							match(DIV);
							setState(108);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
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

	public static class TermContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode MIN() { return getToken(TestearParser.MIN, 0); }
		public TerminalNode NUMBER() { return getToken(TestearParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(TestearParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(TestearParser.PAR_OPEN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(TestearParser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(MIN);
				setState(119);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = -Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value = symbolTable.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(PAR_OPEN);
				setState(126);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).value = ((TermContext)_localctx).expresion.value;
				setState(128);
				match(PAR_CLOSE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7:\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n\7\f\7"+
		"\16\7Y\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b\16\bf\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\5\bw\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n\t\3\t\2"+
		"\2\n\2\4\6\b\n\f\16\20\2\2\2\u0090\2\22\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2"+
		"\b\'\3\2\2\2\n-\3\2\2\2\f9\3\2\2\2\16v\3\2\2\2\20\u0084\3\2\2\2\22\23"+
		"\7\3\2\2\23\24\7\32\2\2\24\30\7\25\2\2\25\27\5\4\3\2\26\25\3\2\2\2\27"+
		"\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33"+
		"\34\7\26\2\2\34\3\3\2\2\2\35!\5\6\4\2\36!\5\b\5\2\37!\5\n\6\2 \35\3\2"+
		"\2\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\"#\7\4\2\2#$\7\32\2\2$%\7\31\2"+
		"\2%&\b\4\1\2&\7\3\2\2\2\'(\7\32\2\2()\7\24\2\2)*\5\f\7\2*+\7\31\2\2+,"+
		"\b\5\1\2,\t\3\2\2\2-.\7\5\2\2./\5\f\7\2/\60\7\31\2\2\60\61\b\6\1\2\61"+
		"\13\3\2\2\2\62\63\7\7\2\2\63\64\5\16\b\2\64\65\b\7\1\2\65:\3\2\2\2\66"+
		"\67\5\16\b\2\678\b\7\1\28:\3\2\2\29\62\3\2\2\29\66\3\2\2\2:W\3\2\2\2;"+
		"<\7\7\2\2<=\7\6\2\2=>\5\16\b\2>?\b\7\1\2?V\3\2\2\2@A\7\6\2\2AB\7\7\2\2"+
		"BC\5\16\b\2CD\b\7\1\2DV\3\2\2\2EF\7\6\2\2FG\5\16\b\2GH\b\7\1\2HV\3\2\2"+
		"\2IJ\7\7\2\2JK\5\16\b\2KL\b\7\1\2LV\3\2\2\2MN\7\b\2\2NO\5\16\b\2OP\b\7"+
		"\1\2PV\3\2\2\2QR\7\t\2\2RS\5\16\b\2ST\b\7\1\2TV\3\2\2\2U;\3\2\2\2U@\3"+
		"\2\2\2UE\3\2\2\2UI\3\2\2\2UM\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2X\r\3\2\2\2YW\3\2\2\2Z[\7\b\2\2[\\\5\20\t\2\\]\b\b\1\2]c\3\2\2\2"+
		"^_\7\t\2\2_`\5\20\t\2`a\b\b\1\2ac\3\2\2\2bZ\3\2\2\2b^\3\2\2\2cf\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2ew\3\2\2\2fd\3\2\2\2gh\5\20\t\2hs\b\b\1\2ij\7\b"+
		"\2\2jk\5\20\t\2kl\b\b\1\2lr\3\2\2\2mn\7\t\2\2no\5\20\t\2op\b\b\1\2pr\3"+
		"\2\2\2qi\3\2\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2vd\3\2\2\2vg\3\2\2\2w\17\3\2\2\2xy\7\7\2\2yz\7\33\2\2z\u0085\b\t"+
		"\1\2{|\7\33\2\2|\u0085\b\t\1\2}~\7\32\2\2~\u0085\b\t\1\2\177\u0080\7\27"+
		"\2\2\u0080\u0081\5\f\7\2\u0081\u0082\b\t\1\2\u0082\u0083\7\30\2\2\u0083"+
		"\u0085\3\2\2\2\u0084x\3\2\2\2\u0084{\3\2\2\2\u0084}\3\2\2\2\u0084\177"+
		"\3\2\2\2\u0085\21\3\2\2\2\r\30 9UWbdqsv\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}