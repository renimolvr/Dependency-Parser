// Generated from com/orange/labs/conllparser/Conditions.g4 by ANTLR 4.13.1
package com.orange.labs.conllparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConditionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConditionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code printResult}
	 * labeled alternative in {@link ConditionsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintResult(ConditionsParser.PrintResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldname}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldname(ConditionsParser.FieldnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vorher}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVorher(ConditionsParser.VorherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oder}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOder(ConditionsParser.OderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valcompatible}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValcompatible(ConditionsParser.ValcompatibleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code klammern}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKlammern(ConditionsParser.KlammernContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kopf}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKopf(ConditionsParser.KopfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nachher}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNachher(ConditionsParser.NachherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valcompare}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValcompare(ConditionsParser.ValcompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code und}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnd(ConditionsParser.UndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nicht}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNicht(ConditionsParser.NichtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code child}
	 * labeled alternative in {@link ConditionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(ConditionsParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueUpos}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueUpos(ConditionsParser.ValueUposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueXpos}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueXpos(ConditionsParser.ValueXposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueDeprel}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeprel(ConditionsParser.ValueDeprelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFeat}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFeat(ConditionsParser.ValueFeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getkopf}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetkopf(ConditionsParser.GetkopfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getvorher}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetvorher(ConditionsParser.GetvorherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getnachher}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetnachher(ConditionsParser.GetnachherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getchild}
	 * labeled alternative in {@link ConditionsParser#columnname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetchild(ConditionsParser.GetchildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkUpos}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckUpos(ConditionsParser.CheckUposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkLemma}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckLemma(ConditionsParser.CheckLemmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkForm}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckForm(ConditionsParser.CheckFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkXpos}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckXpos(ConditionsParser.CheckXposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkDeprel}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckDeprel(ConditionsParser.CheckDeprelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkFeat}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckFeat(ConditionsParser.CheckFeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkMisc}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckMisc(ConditionsParser.CheckMiscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkID}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckID(ConditionsParser.CheckIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkHeadID}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckHeadID(ConditionsParser.CheckHeadIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkAbsEUD}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckAbsEUD(ConditionsParser.CheckAbsEUDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkRelEUD}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckRelEUD(ConditionsParser.CheckRelEUDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkMWT}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckMWT(ConditionsParser.CheckMWTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkEmpty}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckEmpty(ConditionsParser.CheckEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkIsMWT}
	 * labeled alternative in {@link ConditionsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckIsMWT(ConditionsParser.CheckIsMWTContext ctx);
}