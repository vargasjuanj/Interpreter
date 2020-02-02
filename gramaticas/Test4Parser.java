// Generated from Test4.g4 by ANTLR 4.8

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
public class Test4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_println = 4, RULE_expresion = 5, RULE_potencia = 6, RULE_factor_o_division = 7, 
		RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencias", "var_decl", "var_assign", "println", "expresion", 
			"potencia", "factor_o_division", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", 
			"'**'", "'&&'", "'||'", "'|'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "PLUS", "MIN", "MULT", "DIV", "POWER", 
			"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
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
	public String getGrammarFileName() { return "Test4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	Map<String,Object> symbolTable = new HashMap<String,Object>();
	 
	public Test4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Test4Parser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(Test4Parser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(Test4Parser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(Test4Parser.BRACKET_CLOSE, 0); }
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
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(PROGRAM);
			setState(19);
			match(ID);
			setState(20);
			match(BRACKET_OPEN);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(21);
				sentencias();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitSentencias(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				var_assign();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
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
		public TerminalNode VAR() { return getToken(Test4Parser.VAR, 0); }
		public TerminalNode ID() { return getToken(Test4Parser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(Test4Parser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(VAR);
			setState(35);
			((Var_declContext)_localctx).ID = match(ID);
			setState(36);
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
		public TerminalNode ID() { return getToken(Test4Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Test4Parser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Test4Parser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(40);
			match(ASSIGN);
			setState(41);
			((Var_assignContext)_localctx).expresion = expresion();
			setState(42);
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
		public TerminalNode PRINTLN() { return getToken(Test4Parser.PRINTLN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Test4Parser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PRINTLN);
			setState(46);
			((PrintlnContext)_localctx).expresion = expresion();
			setState(47);
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
		public Factor_o_divisionContext t2;
		public PotenciaContext t3;
		public List<TerminalNode> MIN() { return getTokens(Test4Parser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(Test4Parser.MIN, i);
		}
		public List<PotenciaContext> potencia() {
			return getRuleContexts(PotenciaContext.class);
		}
		public PotenciaContext potencia(int i) {
			return getRuleContext(PotenciaContext.class,i);
		}
		public List<TerminalNode> POWER() { return getTokens(Test4Parser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(Test4Parser.POWER, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Test4Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Test4Parser.PLUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(Test4Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Test4Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Test4Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Test4Parser.DIV, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitExpresion(this);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(50);
				match(MIN);
				setState(51);
				((ExpresionContext)_localctx).t1 = potencia();
				((ExpresionContext)_localctx).value = -(int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			case 2:
				{
				setState(54);
				((ExpresionContext)_localctx).t1 = potencia();
				((ExpresionContext)_localctx).value = (int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << MULT) | (1L << DIV) | (1L << POWER))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(59);
					match(POWER);
					setState(60);
					((ExpresionContext)_localctx).t = term();

					    ((ExpresionContext)_localctx).value = (int) Math.pow((int)_localctx.value,(int)((ExpresionContext)_localctx).t.value); 

					    
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(70);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case MULT:
								{
								setState(62);
								match(MULT);
								setState(63);
								((ExpresionContext)_localctx).t = term();
								((ExpresionContext)_localctx).value = (int)_localctx.value*(int)((ExpresionContext)_localctx).t.value;
								}
								break;
							case DIV:
								{
								setState(66);
								match(DIV);
								setState(67);
								((ExpresionContext)_localctx).t = term();
								((ExpresionContext)_localctx).value = (int)_localctx.value/(int)((ExpresionContext)_localctx).t.value;
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							} 
						}
						setState(74);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(75);
					match(MIN);
					setState(76);
					match(PLUS);
					setState(77);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 3:
					{
					setState(80);
					match(PLUS);
					setState(81);
					match(MIN);
					setState(82);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 4:
					{
					setState(85);
					match(PLUS);
					setState(86);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 5:
					{
					setState(89);
					match(MIN);
					setState(90);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 6:
					{
					setState(93);
					match(MULT);
					setState(94);
					((ExpresionContext)_localctx).t3 = potencia();
					((ExpresionContext)_localctx).value = (int)_localctx.value*(int)((ExpresionContext)_localctx).t3.value;
					}
					break;
				case 7:
					{
					setState(97);
					match(DIV);
					setState(98);
					((ExpresionContext)_localctx).t3 = potencia();
					((ExpresionContext)_localctx).value = (int)_localctx.value/(int)((ExpresionContext)_localctx).t3.value;
					}
					break;
				}
				}
				setState(105);
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
		public List<TerminalNode> POWER() { return getTokens(Test4Parser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(Test4Parser.POWER, i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitPotencia(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_potencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((PotenciaContext)_localctx).t1 = term();
			((PotenciaContext)_localctx).value = (int)((PotenciaContext)_localctx).t1.value; 
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(POWER);
					setState(109);
					((PotenciaContext)_localctx).t2 = term();

					       for(int i=1; i<(int)((PotenciaContext)_localctx).t2.value; i++){
					           ((PotenciaContext)_localctx).value = (int)_localctx.value*(int)((PotenciaContext)_localctx).t1.value;
					        }
					        ((PotenciaContext)_localctx).t1.value=_localctx.value;
					        
					   
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public List<TerminalNode> MULT() { return getTokens(Test4Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Test4Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Test4Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Test4Parser.DIV, i);
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
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterFactor_o_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitFactor_o_division(this);
		}
	}

	public final Factor_o_divisionContext factor_o_division() throws RecognitionException {
		Factor_o_divisionContext _localctx = new Factor_o_divisionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor_o_division);
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(125);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(117);
							match(MULT);
							setState(118);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(121);
							match(DIV);
							setState(122);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((Factor_o_divisionContext)_localctx).t1 = term();
				((Factor_o_divisionContext)_localctx).value = (int)((Factor_o_divisionContext)_localctx).t1.value; 
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(140);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(132);
							match(MULT);
							setState(133);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(136);
							match(DIV);
							setState(137);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode MIN() { return getToken(Test4Parser.MIN, 0); }
		public TerminalNode NUMBER() { return getToken(Test4Parser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(Test4Parser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(Test4Parser.PAR_OPEN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(Test4Parser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Test4Listener ) ((Test4Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(MIN);
				setState(148);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = -Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value = symbolTable.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(PAR_OPEN);
				setState(155);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).value = ((TermContext)_localctx).expresion.value;
				setState(157);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\5\3#\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7<\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7I\n\7\f\7\16\7L\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7h\n"+
		"\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t\u0092\13\t\5\t"+
		"\u0094\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\u00b0\2\24\3\2\2\2\4\"\3\2\2"+
		"\2\6$\3\2\2\2\b)\3\2\2\2\n/\3\2\2\2\f;\3\2\2\2\16l\3\2\2\2\20\u0093\3"+
		"\2\2\2\22\u00a1\3\2\2\2\24\25\7\3\2\2\25\26\7\32\2\2\26\32\7\25\2\2\27"+
		"\31\5\4\3\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\35\3\2\2\2\34\32\3\2\2\2\35\36\7\26\2\2\36\3\3\2\2\2\37#\5\6\4\2 #\5"+
		"\b\5\2!#\5\n\6\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\4\2"+
		"\2%&\7\32\2\2&\'\7\31\2\2\'(\b\4\1\2(\7\3\2\2\2)*\7\32\2\2*+\7\24\2\2"+
		"+,\5\f\7\2,-\7\31\2\2-.\b\5\1\2.\t\3\2\2\2/\60\7\5\2\2\60\61\5\f\7\2\61"+
		"\62\7\31\2\2\62\63\b\6\1\2\63\13\3\2\2\2\64\65\7\7\2\2\65\66\5\16\b\2"+
		"\66\67\b\7\1\2\67<\3\2\2\289\5\16\b\29:\b\7\1\2:<\3\2\2\2;\64\3\2\2\2"+
		";8\3\2\2\2<i\3\2\2\2=>\7\n\2\2>?\5\22\n\2?J\b\7\1\2@A\7\b\2\2AB\5\22\n"+
		"\2BC\b\7\1\2CI\3\2\2\2DE\7\t\2\2EF\5\22\n\2FG\b\7\1\2GI\3\2\2\2H@\3\2"+
		"\2\2HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2Kh\3\2\2\2LJ\3\2\2\2MN\7\7"+
		"\2\2NO\7\6\2\2OP\5\20\t\2PQ\b\7\1\2Qh\3\2\2\2RS\7\6\2\2ST\7\7\2\2TU\5"+
		"\20\t\2UV\b\7\1\2Vh\3\2\2\2WX\7\6\2\2XY\5\20\t\2YZ\b\7\1\2Zh\3\2\2\2["+
		"\\\7\7\2\2\\]\5\20\t\2]^\b\7\1\2^h\3\2\2\2_`\7\b\2\2`a\5\16\b\2ab\b\7"+
		"\1\2bh\3\2\2\2cd\7\t\2\2de\5\16\b\2ef\b\7\1\2fh\3\2\2\2g=\3\2\2\2gM\3"+
		"\2\2\2gR\3\2\2\2gW\3\2\2\2g[\3\2\2\2g_\3\2\2\2gc\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2lm\5\22\n\2mt\b\b\1\2no\7\n\2\2o"+
		"p\5\22\n\2pq\b\b\1\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"u\17\3\2\2\2vt\3\2\2\2wx\7\b\2\2xy\5\22\n\2yz\b\t\1\2z\u0080\3\2\2\2{"+
		"|\7\t\2\2|}\5\22\n\2}~\b\t\1\2~\u0080\3\2\2\2\177w\3\2\2\2\177{\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0094"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\22\n\2\u0085\u0090\b\t\1\2"+
		"\u0086\u0087\7\b\2\2\u0087\u0088\5\22\n\2\u0088\u0089\b\t\1\2\u0089\u008f"+
		"\3\2\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5\22\n\2\u008c\u008d\b\t\1\2"+
		"\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0084\3\2\2\2\u0094\21\3\2\2"+
		"\2\u0095\u0096\7\7\2\2\u0096\u0097\7\33\2\2\u0097\u00a2\b\n\1\2\u0098"+
		"\u0099\7\33\2\2\u0099\u00a2\b\n\1\2\u009a\u009b\7\32\2\2\u009b\u00a2\b"+
		"\n\1\2\u009c\u009d\7\27\2\2\u009d\u009e\5\f\7\2\u009e\u009f\b\n\1\2\u009f"+
		"\u00a0\7\30\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0098\3"+
		"\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\23\3\2\2\2\20\32"+
		"\";HJgit\177\u0081\u008e\u0090\u0093\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}