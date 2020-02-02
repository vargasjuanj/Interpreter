// Generated from Test2.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Test2Parser}.
 */
public interface Test2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Test2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Test2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Test2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(Test2Parser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(Test2Parser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Test2Parser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Test2Parser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(Test2Parser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(Test2Parser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(Test2Parser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(Test2Parser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Test2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Test2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(Test2Parser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(Test2Parser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void enterFactor_o_division(Test2Parser.Factor_o_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void exitFactor_o_division(Test2Parser.Factor_o_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Test2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Test2Parser.TermContext ctx);
}