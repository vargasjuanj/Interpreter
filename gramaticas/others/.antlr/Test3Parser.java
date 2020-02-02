// Generated from c:\antlr\gramaticas\others\Test3.g4 by ANTLR 4.7.1

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
public class Test3Parser extends Parser {
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
		RULE_println = 4, RULE_expr = 5, RULE_expresion = 6, RULE_potencia = 7, 
		RULE_factor_o_division = 8, RULE_term = 9;
	public static final String[] ruleNames = {
		"program", "sentencias", "var_decl", "var_assign", "println", "expr", 
		"expresion", "potencia", "factor_o_division", "term"
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
	public String getGrammarFileName() { return "Test3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	Map<String,Object> symbolTable = new HashMap<String,Object>();
	 
	public Test3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Test3Parser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(Test3Parser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(Test3Parser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(Test3Parser.BRACKET_CLOSE, 0); }
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
		public TerminalNode VAR() { return getToken(Test3Parser.VAR, 0); }
		public TerminalNode ID() { return getToken(Test3Parser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(Test3Parser.SEMICOLON, 0); }
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
		public TerminalNode ID() { return getToken(Test3Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Test3Parser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Test3Parser.SEMICOLON, 0); }
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
		public ExprContext expr;
		public TerminalNode PRINTLN() { return getToken(Test3Parser.PRINTLN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Test3Parser.SEMICOLON, 0); }
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
			setState(47);
			match(PRINTLN);
			setState(48);
			((PrintlnContext)_localctx).expr = expr();
			setState(49);
			match(SEMICOLON);
			System.out.println(((PrintlnContext)_localctx).expr.value);
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

	public static class ExprContext extends ParserRuleContext {
		public Object value;
		public PotenciaContext t1;
		public PotenciaContext t2;
		public PotenciaContext t3;
		public List<PotenciaContext> potencia() {
			return getRuleContexts(PotenciaContext.class);
		}
		public PotenciaContext potencia(int i) {
			return getRuleContext(PotenciaContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(Test3Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Test3Parser.MULT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Test3Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Test3Parser.PLUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((ExprContext)_localctx).t1 = potencia();
			((ExprContext)_localctx).value = (int)((ExprContext)_localctx).t1.value;
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MULT) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					{
					setState(54);
					match(MULT);
					setState(55);
					((ExprContext)_localctx).t2 = potencia();
					((ExprContext)_localctx).value = (int)_localctx.value*(int)((ExprContext)_localctx).t2.value;
					}
					}
					break;
				case PLUS:
					{
					{
					setState(58);
					match(PLUS);
					setState(59);
					((ExprContext)_localctx).t3 = potencia();
					((ExprContext)_localctx).value = (int)_localctx.value+(int)((ExprContext)_localctx).t3.value;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Object value;
		public Factor_o_divisionContext t1;
		public Factor_o_divisionContext t2;
		public List<TerminalNode> MIN() { return getTokens(Test3Parser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(Test3Parser.MIN, i);
		}
		public List<Factor_o_divisionContext> factor_o_division() {
			return getRuleContexts(Factor_o_divisionContext.class);
		}
		public Factor_o_divisionContext factor_o_division(int i) {
			return getRuleContext(Factor_o_divisionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Test3Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Test3Parser.PLUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(Test3Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Test3Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Test3Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Test3Parser.DIV, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(67);
				match(MIN);
				setState(68);
				((ExpresionContext)_localctx).t1 = factor_o_division();
				((ExpresionContext)_localctx).value = -(int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			case 2:
				{
				setState(71);
				((ExpresionContext)_localctx).t1 = factor_o_division();
				((ExpresionContext)_localctx).value = (int)((ExpresionContext)_localctx).t1.value;
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(76);
					match(MIN);
					setState(77);
					match(PLUS);
					setState(78);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 2:
					{
					setState(81);
					match(PLUS);
					setState(82);
					match(MIN);
					setState(83);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 3:
					{
					setState(86);
					match(PLUS);
					setState(87);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 4:
					{
					setState(90);
					match(MIN);
					setState(91);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value-(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 5:
					{
					setState(94);
					match(MULT);
					setState(95);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				case 6:
					{
					setState(98);
					match(DIV);
					setState(99);
					((ExpresionContext)_localctx).t2 = factor_o_division();
					((ExpresionContext)_localctx).value = (int)_localctx.value+(int)((ExpresionContext)_localctx).t2.value;
					}
					break;
				}
				}
				setState(106);
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
		public List<TerminalNode> POWER() { return getTokens(Test3Parser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(Test3Parser.POWER, i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_potencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((PotenciaContext)_localctx).t1 = term();
			((PotenciaContext)_localctx).value = (int)((PotenciaContext)_localctx).t1.value; 
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWER) {
				{
				{
				setState(109);
				match(POWER);
				setState(110);
				((PotenciaContext)_localctx).t2 = term();

				       for(int i=1; i<(int)((PotenciaContext)_localctx).t2.value; i++){
				           ((PotenciaContext)_localctx).value = (int)_localctx.value*(int)((PotenciaContext)_localctx).t1.value;
				        }
				        ((PotenciaContext)_localctx).t1.value=_localctx.value;
				   
				}
				}
				setState(117);
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
		public PotenciaContext t;
		public TermContext t2;
		public TermContext t1;
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public List<TerminalNode> MULT() { return getTokens(Test3Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Test3Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Test3Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Test3Parser.DIV, i);
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
		enterRule(_localctx, 16, RULE_factor_o_division);
		try {
			int _alt;
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((Factor_o_divisionContext)_localctx).t = potencia();
				((Factor_o_divisionContext)_localctx).value = (int)((Factor_o_divisionContext)_localctx).t.value; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(129);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(121);
							match(MULT);
							setState(122);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(125);
							match(DIV);
							setState(126);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((Factor_o_divisionContext)_localctx).t1 = term();
				((Factor_o_divisionContext)_localctx).value = (int)((Factor_o_divisionContext)_localctx).t1.value; 
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(144);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(136);
							match(MULT);
							setState(137);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value*(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						case DIV:
							{
							setState(140);
							match(DIV);
							setState(141);
							((Factor_o_divisionContext)_localctx).t2 = term();
							((Factor_o_divisionContext)_localctx).value = (int)_localctx.value/(int)((Factor_o_divisionContext)_localctx).t2.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(148);
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
		public TerminalNode MIN() { return getToken(Test3Parser.MIN, 0); }
		public TerminalNode NUMBER() { return getToken(Test3Parser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(Test3Parser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(Test3Parser.PAR_OPEN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(Test3Parser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(MIN);
				setState(152);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = -Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value = Integer.parseInt( (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)) ;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value = symbolTable.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(PAR_OPEN);
				setState(159);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).value = ((TermContext)_localctx).expresion.value;
				setState(161);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\5\3%\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tt\n\t\f\t\16\tw\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0084\n\n\f\n\16\n"+
		"\u0087\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0093\n\n\f\n"+
		"\16\n\u0096\13\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00a6\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\2\2\u00b3\2\26\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b+\3\2\2\2\n\61\3\2\2"+
		"\2\f\66\3\2\2\2\16L\3\2\2\2\20m\3\2\2\2\22\u0097\3\2\2\2\24\u00a5\3\2"+
		"\2\2\26\27\7\3\2\2\27\30\7\32\2\2\30\34\7\25\2\2\31\33\5\4\3\2\32\31\3"+
		"\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3"+
		"\2\2\2\37 \7\26\2\2 \3\3\2\2\2!%\5\6\4\2\"%\5\b\5\2#%\5\n\6\2$!\3\2\2"+
		"\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\4\2\2\'(\7\32\2\2()\7\31\2\2)"+
		"*\b\4\1\2*\7\3\2\2\2+,\7\32\2\2,-\7\24\2\2-.\5\16\b\2./\7\31\2\2/\60\b"+
		"\5\1\2\60\t\3\2\2\2\61\62\7\5\2\2\62\63\5\f\7\2\63\64\7\31\2\2\64\65\b"+
		"\6\1\2\65\13\3\2\2\2\66\67\5\20\t\2\67B\b\7\1\289\7\b\2\29:\5\20\t\2:"+
		";\b\7\1\2;A\3\2\2\2<=\7\6\2\2=>\5\20\t\2>?\b\7\1\2?A\3\2\2\2@8\3\2\2\2"+
		"@<\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\r\3\2\2\2DB\3\2\2\2EF\7\7\2"+
		"\2FG\5\22\n\2GH\b\b\1\2HM\3\2\2\2IJ\5\22\n\2JK\b\b\1\2KM\3\2\2\2LE\3\2"+
		"\2\2LI\3\2\2\2Mj\3\2\2\2NO\7\7\2\2OP\7\6\2\2PQ\5\22\n\2QR\b\b\1\2Ri\3"+
		"\2\2\2ST\7\6\2\2TU\7\7\2\2UV\5\22\n\2VW\b\b\1\2Wi\3\2\2\2XY\7\6\2\2YZ"+
		"\5\22\n\2Z[\b\b\1\2[i\3\2\2\2\\]\7\7\2\2]^\5\22\n\2^_\b\b\1\2_i\3\2\2"+
		"\2`a\7\b\2\2ab\5\22\n\2bc\b\b\1\2ci\3\2\2\2de\7\t\2\2ef\5\22\n\2fg\b\b"+
		"\1\2gi\3\2\2\2hN\3\2\2\2hS\3\2\2\2hX\3\2\2\2h\\\3\2\2\2h`\3\2\2\2hd\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2\2mn\5\24\13\2"+
		"nu\b\t\1\2op\7\n\2\2pq\5\24\13\2qr\b\t\1\2rt\3\2\2\2so\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wu\3\2\2\2xy\5\20\t\2yz\b\n\1\2z\u0098"+
		"\3\2\2\2{|\7\b\2\2|}\5\24\13\2}~\b\n\1\2~\u0084\3\2\2\2\177\u0080\7\t"+
		"\2\2\u0080\u0081\5\24\13\2\u0081\u0082\b\n\1\2\u0082\u0084\3\2\2\2\u0083"+
		"{\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0098\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\24"+
		"\13\2\u0089\u0094\b\n\1\2\u008a\u008b\7\b\2\2\u008b\u008c\5\24\13\2\u008c"+
		"\u008d\b\n\1\2\u008d\u0093\3\2\2\2\u008e\u008f\7\t\2\2\u008f\u0090\5\24"+
		"\13\2\u0090\u0091\b\n\1\2\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097x\3\2\2\2\u0097\u0085"+
		"\3\2\2\2\u0097\u0088\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a\7\7\2\2\u009a"+
		"\u009b\7\33\2\2\u009b\u00a6\b\13\1\2\u009c\u009d\7\33\2\2\u009d\u00a6"+
		"\b\13\1\2\u009e\u009f\7\32\2\2\u009f\u00a6\b\13\1\2\u00a0\u00a1\7\27\2"+
		"\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\b\13\1\2\u00a3\u00a4\7\30\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u009e\3\2"+
		"\2\2\u00a5\u00a0\3\2\2\2\u00a6\25\3\2\2\2\20\34$@BLhju\u0083\u0085\u0092"+
		"\u0094\u0097\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}