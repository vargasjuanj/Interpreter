// Generated from c:\antlr\gramaticas\Simple.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"program", "sentence", "println", "conditional", "var_decl", "var_assign", 
		"expression", "factor", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
		"'*'", "'/'", "'**'", "'&&'", "'||'", "'|'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MIN", "MULT", 
		"DIV", "POW", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", 
		"ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
		"BOOLEAN", "ID", "NUMBER", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					 List<ASTNode> body= new ArrayList();
				 	Map<String,Object> symbolTable= new HashMap<String,Object>();
				 
			setState(19);
			match(PROGRAM);
			setState(20);
			match(ID);
			setState(21);
			match(BRACKET_OPEN);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);   
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(BRACKET_CLOSE);

					    
					for (ASTNode n : body){
				try{
					n.execute(symbolTable);
				}catch(Exception e){}
				
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
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				conditional();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
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
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PRINTLN);
			setState(46);
			((PrintlnContext)_localctx).expression = expression();
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
			setState(48);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

				 List<ASTNode> conditionalBody= new ArrayList();
				 	Map<String,Object> symbolsTable= new HashMap<String,Object>();
				 
			setState(51);
			match(IF);
			setState(52);
			match(PAR_OPEN);
			setState(53);
			((ConditionalContext)_localctx).expression = expression();
			setState(54);
			match(PAR_CLOSE);
			setState(55);
			match(BRACKET_OPEN);
			 List<ASTNode> body = new ArrayList();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(57);
				((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(BRACKET_CLOSE);
			setState(66);
			match(ELSE);
			setState(67);
			match(BRACKET_OPEN);
			 List<ASTNode> elsebody = new ArrayList();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				((ConditionalContext)_localctx).s2 = sentence();
				elsebody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(BRACKET_CLOSE);
			ASTNode node= new If(((ConditionalContext)_localctx).expression.node,body,elsebody);
						node.execute(symbolsTable);		
						
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
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(VAR);
			setState(81);
			((Var_declContext)_localctx).ID = match(ID);
			setState(82);
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
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(86);
			match(ASSIGN);
			setState(87);
			((Var_assignContext)_localctx).expression = expression();
			setState(88);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node = ((ExpressionContext)_localctx).t1.node;
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(93);
				match(PLUS);
				setState(94);
				((ExpressionContext)_localctx).t2 = factor();
				((ExpressionContext)_localctx).node = new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
				}
				}
				setState(101);
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
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node = ((FactorContext)_localctx).t1.node;
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(104);
				match(MULT);
				setState(105);
				((FactorContext)_localctx).t2 = term();
				((FactorContext)_localctx).node = new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
				}
				}
				setState(112);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(PAR_OPEN);
				setState(116);
				((TermContext)_localctx).expression = expression();
				setState(117);
				match(PAR_CLOSE);
				((TermContext)_localctx).node = ((TermContext)_localctx).expression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POW) {
					{
					{
					setState(126);
					match(POW);
					setState(127);
					((TermContext)_localctx).n = match(NUMBER);

							 ASTNode node2= new Constant(Integer.parseInt((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null)));
							 
						 ((TermContext)_localctx).node =  new Power(_localctx.node,node2);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POW) {
					{
					{
					setState(136);
					match(POW);
					setState(137);
					((TermContext)_localctx).n = match(ID);

							 ASTNode node2= new VarRef((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null));
							 
						 ((TermContext)_localctx).node =  new Power(_localctx.node,node2);
					}
					}
					setState(143);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bd\n\b\f\b\16\bg\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13\n\5\n\u0093"+
		"\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\u009a\2\24\3\2\2\2\4-\3\2\2"+
		"\2\6/\3\2\2\2\b\64\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16]\3\2\2\2\20h\3\2\2"+
		"\2\22\u0092\3\2\2\2\24\25\b\2\1\2\25\26\7\3\2\2\26\27\7\35\2\2\27\35\7"+
		"\27\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32\34\3\2\2\2\33\30\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\30"+
		"\2\2!\"\b\2\1\2\"\3\3\2\2\2#$\5\6\4\2$%\b\3\1\2%.\3\2\2\2&.\5\b\5\2\'"+
		"(\5\n\6\2()\b\3\1\2).\3\2\2\2*+\5\f\7\2+,\b\3\1\2,.\3\2\2\2-#\3\2\2\2"+
		"-&\3\2\2\2-\'\3\2\2\2-*\3\2\2\2.\5\3\2\2\2/\60\7\5\2\2\60\61\5\16\b\2"+
		"\61\62\b\4\1\2\62\63\7\33\2\2\63\7\3\2\2\2\64\65\b\5\1\2\65\66\7\6\2\2"+
		"\66\67\7\31\2\2\678\5\16\b\289\7\32\2\29:\7\27\2\2:@\b\5\1\2;<\5\4\3\2"+
		"<=\b\5\1\2=?\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"B@\3\2\2\2CD\7\30\2\2DE\7\7\2\2EF\7\27\2\2FL\b\5\1\2GH\5\4\3\2HI\b\5\1"+
		"\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2"+
		"\2OP\7\30\2\2PQ\b\5\1\2Q\t\3\2\2\2RS\7\4\2\2ST\7\35\2\2TU\7\33\2\2UV\b"+
		"\6\1\2V\13\3\2\2\2WX\7\35\2\2XY\7\26\2\2YZ\5\16\b\2Z[\7\33\2\2[\\\b\7"+
		"\1\2\\\r\3\2\2\2]^\5\20\t\2^e\b\b\1\2_`\7\b\2\2`a\5\20\t\2ab\b\b\1\2b"+
		"d\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\17\3\2\2\2ge\3\2\2"+
		"\2hi\5\22\n\2ip\b\t\1\2jk\7\n\2\2kl\5\22\n\2lm\b\t\1\2mo\3\2\2\2nj\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2rp\3\2\2\2st\7\36\2\2t\u0093"+
		"\b\n\1\2uv\7\31\2\2vw\5\16\b\2wx\7\32\2\2xy\b\n\1\2y\u0093\3\2\2\2z{\7"+
		"\34\2\2{\u0093\b\n\1\2|}\7\35\2\2}\u0093\b\n\1\2~\177\7\36\2\2\177\u0085"+
		"\b\n\1\2\u0080\u0081\7\f\2\2\u0081\u0082\7\36\2\2\u0082\u0084\b\n\1\2"+
		"\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0093\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\35\2\2"+
		"\u0089\u008f\b\n\1\2\u008a\u008b\7\f\2\2\u008b\u008c\7\35\2\2\u008c\u008e"+
		"\b\n\1\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092s\3\2\2\2"+
		"\u0092u\3\2\2\2\u0092z\3\2\2\2\u0092|\3\2\2\2\u0092~\3\2\2\2\u0092\u0088"+
		"\3\2\2\2\u0093\23\3\2\2\2\13\35-@Lep\u0085\u008f\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}