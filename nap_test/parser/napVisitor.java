// Generated from nap.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link napParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface napVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link napParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(napParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link napParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(napParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link napParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(napParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Argument}
	 * labeled alternative in {@link napParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(napParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(napParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignment(napParser.ReAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(napParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulEqDivEq}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulEqDivEq(napParser.MulEqDivEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDec(napParser.IncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncEqDecEq}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncEqDecEq(napParser.IncEqDecEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewOp}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewOp(napParser.NewOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(napParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(napParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstNew}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstNew(napParser.ConstNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(napParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondExpr}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(napParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(napParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentFunctionCall}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentFunctionCall(napParser.AssignmentFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionToExpr}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionToExpr(napParser.InstructionToExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(napParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LNegation}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLNegation(napParser.LNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(napParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(napParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantArray}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantArray(napParser.ConstantArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(napParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(napParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(napParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GteqLteq}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteqLteq(napParser.GteqLteqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOrLAndLNot}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrLAndLNot(napParser.LOrLAndLNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(napParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(napParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtLt}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtLt(napParser.GtLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(napParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualNotEq}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNotEq(napParser.EqualNotEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(napParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstMod}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstMod(napParser.ConstModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(napParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(napParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(napParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCond}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCond(napParser.IfCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfCond}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfCond(napParser.ElseIfCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(napParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(napParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Byte}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte(napParser.ByteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(napParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(napParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(napParser.ArrayContext ctx);
}