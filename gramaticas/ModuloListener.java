// Generated from Modulo.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModuloParser}.
 */
public interface ModuloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModuloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ModuloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ModuloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(ModuloParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(ModuloParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(ModuloParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(ModuloParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(ModuloParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(ModuloParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(ModuloParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(ModuloParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ModuloParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ModuloParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(ModuloParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(ModuloParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void enterFactor_o_division(ModuloParser.Factor_o_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void exitFactor_o_division(ModuloParser.Factor_o_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#suma_o_resta}.
	 * @param ctx the parse tree
	 */
	void enterSuma_o_resta(ModuloParser.Suma_o_restaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#suma_o_resta}.
	 * @param ctx the parse tree
	 */
	void exitSuma_o_resta(ModuloParser.Suma_o_restaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModuloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ModuloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ModuloParser.TermContext ctx);
}