// Generated from Simple.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(SimpleParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(SimpleParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(SimpleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(SimpleParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(SimpleParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(SimpleParser.ExpresionContext ctx);
}