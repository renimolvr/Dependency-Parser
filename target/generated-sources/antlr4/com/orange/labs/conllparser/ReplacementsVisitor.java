// Generated from com/orange/labs/conllparser/Replacements.g4 by ANTLR 4.13.1
package com.orange.labs.conllparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReplacementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReplacementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code printResult}
	 * labeled alternative in {@link ReplacementsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintResult(ReplacementsParser.PrintResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code element}
	 * labeled alternative in {@link ReplacementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ReplacementsParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spalte}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpalte(ReplacementsParser.SpalteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kopf}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKopf(ReplacementsParser.KopfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wort}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWort(ReplacementsParser.WortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substr}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr(ReplacementsParser.SubstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repl}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepl(ReplacementsParser.ReplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gross}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGross(ReplacementsParser.GrossContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReplacementsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code klein}
	 * labeled alternative in {@link ReplacementsParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKlein(ReplacementsParser.KleinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kopfspalte}
	 * labeled alternative in {@link ReplacementsParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKopfspalte(ReplacementsParser.KopfspalteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kopfkopf}
	 * labeled alternative in {@link ReplacementsParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKopfkopf(ReplacementsParser.KopfkopfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wortohne}
	 * labeled alternative in {@link ReplacementsParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWortohne(ReplacementsParser.WortohneContext ctx);
}