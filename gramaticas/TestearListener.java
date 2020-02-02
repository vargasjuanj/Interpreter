// Generated from Testear.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestearParser}.
 */
public interface TestearListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestearParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TestearParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TestearParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(TestearParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(TestearParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(TestearParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(TestearParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(TestearParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(TestearParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(TestearParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(TestearParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TestearParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TestearParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void enterFactor_o_division(TestearParser.Factor_o_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#factor_o_division}.
	 * @param ctx the parse tree
	 */
	void exitFactor_o_division(TestearParser.Factor_o_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestearParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TestearParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestearParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TestearParser.TermContext ctx);
}