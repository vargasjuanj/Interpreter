// Generated from Simple.g4 by ANTLR 4.8


import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Simple}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Simple#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Simple.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(Simple.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(Simple.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(Simple.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(Simple.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(Simple.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Simple.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Simple.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Simple.TermContext ctx);
}