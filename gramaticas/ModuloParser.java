// Generated from Modulo.g4 by ANTLR 4.8

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
public class ModuloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MIN=5, MULT=6, DIV=7, POWER=8, MOD=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		ID=25, NUMBER=26, WS=27;
	public static final int
		RULE_program = 0, RULE_sentencias = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_expresion = 5, RULE_potencia = 6, RULE_factor_o_division = 7, 
		RULE_suma_o_resta = 8, RULE_term = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencias", "var_decl", "var_assign", "println", "expresion", 
			"potencia", "factor_o_division", "suma_o_resta", "term"
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

	@Override
	public String getGrammarFileName() { return "Modulo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	Map<String,Object> symbolTable = new HashMap<String,Object>();
	 
	public ModuloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(ModuloParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(ModuloParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(ModuloParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(ModuloParser.BRACKET_CLOSE, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PROGRAM);
			setState(21);
			match(ID);
			setState(22);
			match(BRACKET_OPEN);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(23);
				sentencias();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitSentencias(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				var_assign();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
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
		public TerminalNode VAR() { return getToken(ModuloParser.VAR, 0); }
		public TerminalNode ID() { return getToken(ModuloParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ModuloParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(VAR);
			setState(37);
			((Var_declContext)_localctx).ID = match(ID);
			setState(38);
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
		public TerminalNode ID() { return getToken(ModuloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ModuloParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ModuloParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(42);
			match(ASSIGN);
			setState(43);
			((Var_assignContext)_localctx).expresion = expresion();
			setState(44);
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
		public TerminalNode PRINTLN() { return getToken(ModuloParser.PRINTLN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ModuloParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PRINTLN);
			setState(48);
			((PrintlnContext)_localctx).expresion = expresion();
			setState(49);
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
		public PotenciaContext t1;
		public TermContext t;
		public Suma_o_restaContext t0;
		public Factor_o_divisionContext t2;
		public PotenciaContext t3;
		public List<TerminalNode> MIN() { return getTokens(ModuloParser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(ModuloParser.MIN, i);
		}
		public List<PotenciaContext> potencia() {
			return getRuleContexts(PotenciaContext.class);
		}
		public PotenciaContext potencia(int i) {
			return getRuleContext(PotenciaContext.class,i);
		}
		public List<TerminalNode> POWER() { return getTokens(ModuloParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(ModuloParser.POWER, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ModuloParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ModuloParser.MOD, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ModuloParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ModuloParser.PLUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(ModuloParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ModuloParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ModuloParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ModuloParser.DIV, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Suma_o_restaContext> suma_o_resta() {
			return getRuleContexts(Suma_o_restaContext.class);
		}
		public Suma_o_restaContext suma_o_resta(int i) {
			return getRuleContext(Suma_o_restaContext.class,i);
		}
		public List<Factor_o_divisionContext> factor_o_division() {
			return getRuleContexts(Factor_o_divisionContext.class);
		}
		public Factor_o_divisionContext factor_o_division(int i) {
			return getRuleContext(Factor_o_divisionContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(52);
				match(MIN);
				setState(53);
				((ExpresionContext)_localctx).t1 = potencia();
				((ExpresionContext)_localctx).value = -(int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			case 2:
				{
				setState(56);
				((ExpresionContext)_localctx).t1 = potencia();
				((ExpresionContext)_localctx).value = (int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << MULT) | (1L << DIV) | (1L << POWER) | (1L << MOD))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(61);
					match(POWER);
					setState(62);
					((ExpresionContext)_localctx).t = term();

					    ((ExpresionContext)_localctx).value = (int) Math.pow((int)_localctx.value,(int)((ExpresionContext)_localctx).t.value); 

					    
					setState(74);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(72);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case MULT:
								{
								setState(64);
								match(MULT);
								setState(65);
								((ExpresionContext)_localctx).t = term();
								((ExpresionContext)_localctx).value = (int)_localctx.value*(int)((ExpresionContext)_localctx).t.value;
								}
								break;
							case DIV:
								{
								setState(68);
								match(DIV);
								setState(69);
								((ExpresionContext)_localctx).t = term();
								((ExpresionContext)_localctx).value = (int)_localctx.value/(int)((ExpresionContext)_localctx).t.value;
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							} 
						}
						setState(76);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(77);
					match(MOD);
					setState(78);
					((ExpresionContext)_localctx).t0 = suma_o_resta();
					((ExpresionContext)_localctx).value = (int)_localctx.value%(int)((ExpresionContext)_localctx).t0.value;
					}
					break;
				case 3:
					{
					setState(81);
					match(MOD);
					setState(82);
					match(MIN);
					setState(83);
					((ExpresionContext)_localctx).t0 = suma_o_resta();
					((ExpresionContext)_localctx).value = (int)_localctx.value%-(int)((ExpresionContext)_localctx).t0.value;
					}
					break;
				case 4:
					{
					setState(86);
					match(MIN);
					setState(87);
					match(PLUS);
					setState(88);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 5:
					{
					setState(91);
					match(PLUS);
					setState(92);
					match(MIN);
					setState(93);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 6:
					{
					setState(96);
					match(PLUS);
					setState(97);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 7:
					{
					setState(100);
					match(MIN);
					setState(101);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 8:
					{
					setState(104);
					match(MULT);
					setState(105);
					((ExpresionContext)_localctx).t3 = potencia();
					((ExpresionContext)_localctx).value = (int)_localctx.value*(int)((ExpresionContext)_localctx).t3.value;
					}
					break;
				case 9:
					{
					setState(108);
					match(DIV);
					setState(109);
					((ExpresionContext)_localctx).t3 = potencia();
					((ExpresionContext)_localctx).value = (int)_localctx.value/(int)((ExpresionContext)_localctx).t3.value;
					}
					break;
				}
				}
				setState(116);
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

	public static class PotenciaContext extends ParserRuleContext {
		public Object value;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> POWER() { return getTokens(ModuloParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(ModuloParser.POWER, i);
		}
		public List<TerminalNode> MIN() { return getTokens(ModuloParser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(ModuloParser.MIN, i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitPotencia(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_potencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((PotenciaContext)_localctx).t1 = term();
			((PotenciaContext)_localctx).value = (int)((PotenciaContext)_localctx).t1.value; 
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					match(POWER);
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(120);
						match(MIN);
						setState(121);
						((PotenciaContext)_localctx).t2 = term();
						 ((PotenciaContext)_localctx).value = -(int)Math.pow((int)_localctx.value,(int)((PotenciaContext)_localctx).t2.value);
						}
						break;
					case 2:
						{
						setState(124);
						((PotenciaContext)_localctx).t2 = term();
						 ((PotenciaContext)_localctx).value = (int)Math.pow((int)_localctx.value,(int)((PotenciaContext)_localctx).t2.value);
						}
						break;
					}
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public List<TerminalNode> MULT() { return getTokens(ModuloParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ModuloParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ModuloParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ModuloParser.DIV, i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterFactor_o_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitFactor_o_division(this);
		}
	}

	public final Factor_o_divisionContext factor_o_division() throws RecognitionException {
		Factor_o_divisionContext _localctx = new Factor_o_divisionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor_o_division);
		try {
			int _alt;
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(142);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(134);
							match(MULT);
							setState(135);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(138);
							match(DIV);
							setState(139);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				((Factor_o_divisionContext)_localctx).t1 = term();
				((Factor_o_divisionContext)_localctx).value = (int)((Factor_o_divisionContext)_localctx).t1.value; 
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(157);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(149);
							match(MULT);
							setState(150);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(153);
							match(DIV);
							setState(154);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Suma_o_restaContext extends ParserRuleContext {
		public Object value;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ModuloParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ModuloParser.PLUS, i);
		}
		public List<TerminalNode> MIN() { return getTokens(ModuloParser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(ModuloParser.MIN, i);
		}
		public Suma_o_restaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma_o_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterSuma_o_resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitSuma_o_resta(this);
		}
	}

	public final Suma_o_restaContext suma_o_resta() throws RecognitionException {
		Suma_o_restaContext _localctx = new Suma_o_restaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_suma_o_resta);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((Suma_o_restaContext)_localctx).t1 = term();
			((Suma_o_restaContext)_localctx).value = (int)((Suma_o_restaContext)_localctx).t1.value; 
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(174);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(166);
						match(PLUS);
						setState(167);
						((Suma_o_restaContext)_localctx).t2 = term();
						((Suma_o_restaContext)_localctx).value = (int)_localctx.value+(int)((Suma_o_restaContext)_localctx).t2.value;
						}
						break;
					case MIN:
						{
						setState(170);
						match(MIN);
						setState(171);
						((Suma_o_restaContext)_localctx).t2 = term();
						((Suma_o_restaContext)_localctx).value = (int)_localctx.value-(int)((Suma_o_restaContext)_localctx).t2.value;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode MIN() { return getToken(ModuloParser.MIN, 0); }
		public TerminalNode NUMBER() { return getToken(ModuloParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(ModuloParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ModuloParser.PAR_OPEN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ModuloParser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuloListener ) ((ModuloListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(MIN);
				setState(180);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = -Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value = symbolTable.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(PAR_OPEN);
				setState(187);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).value = ((TermContext)_localctx).expresion.value;
				setState(189);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00c4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\5\3%\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\7\b\u0084\n\b\f\b\16"+
		"\b\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3"+
		"\13\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b1"+
		"\n\n\f\n\16\n\u00b4\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00c2\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2"+
		"\2\u00d4\2\26\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b+\3\2\2\2\n\61\3\2\2\2\f"+
		"=\3\2\2\2\16w\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00c1\3\2\2"+
		"\2\26\27\7\3\2\2\27\30\7\33\2\2\30\34\7\26\2\2\31\33\5\4\3\2\32\31\3\2"+
		"\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2"+
		"\2\2\37 \7\27\2\2 \3\3\2\2\2!%\5\6\4\2\"%\5\b\5\2#%\5\n\6\2$!\3\2\2\2"+
		"$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\4\2\2\'(\7\33\2\2()\7\32\2\2)*\b"+
		"\4\1\2*\7\3\2\2\2+,\7\33\2\2,-\7\25\2\2-.\5\f\7\2./\7\32\2\2/\60\b\5\1"+
		"\2\60\t\3\2\2\2\61\62\7\5\2\2\62\63\5\f\7\2\63\64\7\32\2\2\64\65\b\6\1"+
		"\2\65\13\3\2\2\2\66\67\7\7\2\2\678\5\16\b\289\b\7\1\29>\3\2\2\2:;\5\16"+
		"\b\2;<\b\7\1\2<>\3\2\2\2=\66\3\2\2\2=:\3\2\2\2>t\3\2\2\2?@\7\n\2\2@A\5"+
		"\24\13\2AL\b\7\1\2BC\7\b\2\2CD\5\24\13\2DE\b\7\1\2EK\3\2\2\2FG\7\t\2\2"+
		"GH\5\24\13\2HI\b\7\1\2IK\3\2\2\2JB\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2Ms\3\2\2\2NL\3\2\2\2OP\7\13\2\2PQ\5\22\n\2QR\b\7\1\2Rs\3\2"+
		"\2\2ST\7\13\2\2TU\7\7\2\2UV\5\22\n\2VW\b\7\1\2Ws\3\2\2\2XY\7\7\2\2YZ\7"+
		"\6\2\2Z[\5\20\t\2[\\\b\7\1\2\\s\3\2\2\2]^\7\6\2\2^_\7\7\2\2_`\5\20\t\2"+
		"`a\b\7\1\2as\3\2\2\2bc\7\6\2\2cd\5\20\t\2de\b\7\1\2es\3\2\2\2fg\7\7\2"+
		"\2gh\5\20\t\2hi\b\7\1\2is\3\2\2\2jk\7\b\2\2kl\5\16\b\2lm\b\7\1\2ms\3\2"+
		"\2\2no\7\t\2\2op\5\16\b\2pq\b\7\1\2qs\3\2\2\2r?\3\2\2\2rO\3\2\2\2rS\3"+
		"\2\2\2rX\3\2\2\2r]\3\2\2\2rb\3\2\2\2rf\3\2\2\2rj\3\2\2\2rn\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt\3\2\2\2wx\5\24\13\2x\u0085\b\b"+
		"\1\2y\u0081\7\n\2\2z{\7\7\2\2{|\5\24\13\2|}\b\b\1\2}\u0082\3\2\2\2~\177"+
		"\5\24\13\2\177\u0080\b\b\1\2\u0080\u0082\3\2\2\2\u0081z\3\2\2\2\u0081"+
		"~\3\2\2\2\u0082\u0084\3\2\2\2\u0083y\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u0089\7\b\2\2\u0089\u008a\5\24\13\2\u008a\u008b\b\t\1\2\u008b"+
		"\u0091\3\2\2\2\u008c\u008d\7\t\2\2\u008d\u008e\5\24\13\2\u008e\u008f\b"+
		"\t\1\2\u008f\u0091\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u008c\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a5\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5\24\13\2\u0096\u00a1\b\t\1\2\u0097"+
		"\u0098\7\b\2\2\u0098\u0099\5\24\13\2\u0099\u009a\b\t\1\2\u009a\u00a0\3"+
		"\2\2\2\u009b\u009c\7\t\2\2\u009c\u009d\5\24\13\2\u009d\u009e\b\t\1\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u0092\3\2\2\2\u00a4\u0095\3\2\2\2\u00a5\21\3\2\2"+
		"\2\u00a6\u00a7\5\24\13\2\u00a7\u00b2\b\n\1\2\u00a8\u00a9\7\6\2\2\u00a9"+
		"\u00aa\5\24\13\2\u00aa\u00ab\b\n\1\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\7"+
		"\7\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\b\n\1\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6"+
		"\7\7\2\2\u00b6\u00b7\7\34\2\2\u00b7\u00c2\b\13\1\2\u00b8\u00b9\7\34\2"+
		"\2\u00b9\u00c2\b\13\1\2\u00ba\u00bb\7\33\2\2\u00bb\u00c2\b\13\1\2\u00bc"+
		"\u00bd\7\30\2\2\u00bd\u00be\5\f\7\2\u00be\u00bf\b\13\1\2\u00bf\u00c0\7"+
		"\31\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1"+
		"\u00ba\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\25\3\2\2\2\23\34$=JLrt\u0081"+
		"\u0085\u0090\u0092\u009f\u00a1\u00a4\u00b0\u00b2\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}