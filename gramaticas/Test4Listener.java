// Generated from Test4.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Test4Parser}.
 */
public interface Test4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Test4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Test4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Test4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(Test4Parser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(Test4Parser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Test4Parser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Test4Parser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(Test4Parser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(Test4Parser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(Test4Parser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(Test4Parser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Test4Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Test4Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(Test4Parser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(Test4Parser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void enterFactor_o_division(Test4Parser.Factor_o_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void exitFactor_o_division(Test4Parser.Factor_o_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test4Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Test4Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test4Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Test4Parser.TermContext ctx);
}