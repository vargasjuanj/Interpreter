// Generated from Simple.g4 by ANTLR 4.8

import ast.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MIN=7, MULT=8, DIV=9, 
		POW=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, LEQ=17, EQ=18, NEQ=19, 
		ASSIGN=20, BRACKET_OPEN=21, BRACKET_CLOSE=22, PAR_OPEN=23, PAR_CLOSE=24, 
		SEMICOLON=25, BOOLEAN=26, ID=27, NUMBER=28, WS=29;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_println = 2, RULE_conditional = 3, 
		RULE_var_decl = 4, RULE_var_assign = 5, RULE_expression = 6, RULE_factor = 7, 
		RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "println", "conditional", "var_decl", "var_assign", 
			"expression", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'**'", "'&&'", "'||'", "'|'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MIN", "MULT", 
			"DIV", "POW", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", 
			"ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"BOOLEAN", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		
			 List<ASTNode> body= new ArrayList();
		Map<String,Object> symbolTable= new HashMap<String,Object>();

		 

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ASTNode node;
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(SimpleParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(21);
				((ProgramContext)_localctx).sentence = sentence();
				   
					try{
					((ProgramContext)_localctx).sentence.node.execute(symbolTable);
					}catch(Exception e){}

					

					
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				conditional();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PRINTLN);
			setState(44);
			((PrintlnContext)_localctx).expression = expression();
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
			setState(46);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(SimpleParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(SimpleParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(SimpleParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(SimpleParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			   Map<String,Object> conditionalSymbolTable= new HashMap<String,Object>();
				 List<ASTNode> conditionalBody= new ArrayList();

				 
			setState(49);
			match(IF);
			setState(50);
			match(PAR_OPEN);
			setState(51);
			((ConditionalContext)_localctx).expression = expression();
			setState(52);
			match(PAR_CLOSE);
			setState(53);
			match(BRACKET_OPEN);
			 List<ASTNode> body = new ArrayList();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(55);
				((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(BRACKET_CLOSE);
			setState(64);
			match(ELSE);
			setState(65);
			match(BRACKET_OPEN);
			 List<ASTNode> elsebody = new ArrayList();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(67);
				((ConditionalContext)_localctx).s2 = sentence();
				elsebody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(BRACKET_CLOSE);
			ASTNode node= new If(((ConditionalContext)_localctx).expression.node,body,elsebody);
						try{
						node.execute(conditionalSymbolTable);		
						}catch(Exception e){
							
						node.execute(symbolTable);
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(VAR);
			setState(79);
			((Var_declContext)_localctx).ID = match(ID);
			setState(80);
			match(SEMICOLON);
			((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
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
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(84);
			match(ASSIGN);
			setState(85);
			((Var_assignContext)_localctx).expression = expression();
			setState(86);
			match(SEMICOLON);
			((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node = ((ExpressionContext)_localctx).t1.node;
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(91);
				match(PLUS);
				setState(92);
				((ExpressionContext)_localctx).t2 = factor();
				((ExpressionContext)_localctx).node = new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
				}
				}
				setState(99);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node = ((FactorContext)_localctx).t1.node;
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(102);
				match(MULT);
				setState(103);
				((FactorContext)_localctx).t2 = term();
				((FactorContext)_localctx).node = new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
				}
				}
				setState(110);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public ExpressionContext expression;
		public Token BOOLEAN;
		public Token ID;
		public Token n;
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public List<TerminalNode> POW() { return getTokens(SimpleParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(SimpleParser.POW, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(PAR_OPEN);
				setState(114);
				((TermContext)_localctx).expression = expression();
				setState(115);
				match(PAR_CLOSE);
				((TermContext)_localctx).node = ((TermContext)_localctx).expression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POW) {
					{
					{
					setState(124);
					match(POW);
					setState(125);
					((TermContext)_localctx).n = match(NUMBER);

							 ASTNode node2= new Constant(Integer.parseInt((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null)));
							 
						 ((TermContext)_localctx).node =  new Power(_localctx.node,node2);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POW) {
					{
					{
					setState(134);
					match(POW);
					setState(135);
					((TermContext)_localctx).n = match(ID);

							 ASTNode node2= new VarRef((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null));
							 
						 ((TermContext)_localctx).node =  new Power(_localctx.node,node2);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b\16\be\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0082\n\n\f\n\16\n\u0085\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\5\n\u0091\n\n\3"+
		"\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\u0098\2\24\3\2\2\2\4+\3\2\2\2\6-"+
		"\3\2\2\2\b\62\3\2\2\2\nP\3\2\2\2\fU\3\2\2\2\16[\3\2\2\2\20f\3\2\2\2\22"+
		"\u0090\3\2\2\2\24\25\7\3\2\2\25\26\7\35\2\2\26\34\7\27\2\2\27\30\5\4\3"+
		"\2\30\31\b\2\1\2\31\33\3\2\2\2\32\27\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\30\2\2 \3\3\2\2\2!"+
		"\"\5\6\4\2\"#\b\3\1\2#,\3\2\2\2$,\5\b\5\2%&\5\n\6\2&\'\b\3\1\2\',\3\2"+
		"\2\2()\5\f\7\2)*\b\3\1\2*,\3\2\2\2+!\3\2\2\2+$\3\2\2\2+%\3\2\2\2+(\3\2"+
		"\2\2,\5\3\2\2\2-.\7\5\2\2./\5\16\b\2/\60\b\4\1\2\60\61\7\33\2\2\61\7\3"+
		"\2\2\2\62\63\b\5\1\2\63\64\7\6\2\2\64\65\7\31\2\2\65\66\5\16\b\2\66\67"+
		"\7\32\2\2\678\7\27\2\28>\b\5\1\29:\5\4\3\2:;\b\5\1\2;=\3\2\2\2<9\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\30\2\2BC\7\7"+
		"\2\2CD\7\27\2\2DJ\b\5\1\2EF\5\4\3\2FG\b\5\1\2GI\3\2\2\2HE\3\2\2\2IL\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\30\2\2NO\b\5\1\2O\t"+
		"\3\2\2\2PQ\7\4\2\2QR\7\35\2\2RS\7\33\2\2ST\b\6\1\2T\13\3\2\2\2UV\7\35"+
		"\2\2VW\7\26\2\2WX\5\16\b\2XY\7\33\2\2YZ\b\7\1\2Z\r\3\2\2\2[\\\5\20\t\2"+
		"\\c\b\b\1\2]^\7\b\2\2^_\5\20\t\2_`\b\b\1\2`b\3\2\2\2a]\3\2\2\2be\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2\2\2fg\5\22\n\2gn\b\t\1\2hi\7"+
		"\n\2\2ij\5\22\n\2jk\b\t\1\2km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no"+
		"\3\2\2\2o\21\3\2\2\2pn\3\2\2\2qr\7\36\2\2r\u0091\b\n\1\2st\7\31\2\2tu"+
		"\5\16\b\2uv\7\32\2\2vw\b\n\1\2w\u0091\3\2\2\2xy\7\34\2\2y\u0091\b\n\1"+
		"\2z{\7\35\2\2{\u0091\b\n\1\2|}\7\36\2\2}\u0083\b\n\1\2~\177\7\f\2\2\177"+
		"\u0080\7\36\2\2\u0080\u0082\b\n\1\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0091\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\7\35\2\2\u0087\u008d\b\n\1\2\u0088\u0089\7\f\2\2"+
		"\u0089\u008a\7\35\2\2\u008a\u008c\b\n\1\2\u008b\u0088\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090q\3\2\2\2\u0090s\3\2\2\2\u0090x\3\2\2\2\u0090z\3\2"+
		"\2\2\u0090|\3\2\2\2\u0090\u0086\3\2\2\2\u0091\23\3\2\2\2\13\34+>Jcn\u0083"+
		"\u008d\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}