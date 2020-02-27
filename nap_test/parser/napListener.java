// Generated from nap.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link napParser}.
 */
public interface napListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link napParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(napParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link napParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(napParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link napParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(napParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link napParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(napParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link napParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(napParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link napParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(napParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Argument}
	 * labeled alternative in {@link napParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument(napParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Argument}
	 * labeled alternative in {@link napParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument(napParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(napParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(napParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterReAssignment(napParser.ReAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitReAssignment(napParser.ReAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(napParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssignment}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(napParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulEqDivEq}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMulEqDivEq(napParser.MulEqDivEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulEqDivEq}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMulEqDivEq(napParser.MulEqDivEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIncDec(napParser.IncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIncDec(napParser.IncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncEqDecEq}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIncEqDecEq(napParser.IncEqDecEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncEqDecEq}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIncEqDecEq(napParser.IncEqDecEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewOp}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNewOp(napParser.NewOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewOp}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNewOp(napParser.NewOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Read}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRead(napParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRead(napParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPrint(napParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPrint(napParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstNew}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterConstNew(napParser.ConstNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstNew}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitConstNew(napParser.ConstNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterReturn(napParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitReturn(napParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondExpr}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(napParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondExpr}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(napParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentFunctionCall}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentFunctionCall(napParser.AssignmentFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentFunctionCall}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentFunctionCall(napParser.AssignmentFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionToExpr}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionToExpr(napParser.InstructionToExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionToExpr}
	 * labeled alternative in {@link napParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionToExpr(napParser.InstructionToExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(napParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(napParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LNegation}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLNegation(napParser.LNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LNegation}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLNegation(napParser.LNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(napParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(napParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(napParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(napParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantArray}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstantArray(napParser.ConstantArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantArray}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstantArray(napParser.ConstantArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(napParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(napParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(napParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(napParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(napParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(napParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GteqLteq}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGteqLteq(napParser.GteqLteqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GteqLteq}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGteqLteq(napParser.GteqLteqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOrLAndLNot}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLOrLAndLNot(napParser.LOrLAndLNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOrLAndLNot}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLOrLAndLNot(napParser.LOrLAndLNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(napParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(napParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(napParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(napParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(napParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(napParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtLt}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtLt(napParser.GtLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtLt}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtLt(napParser.GtLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(napParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(napParser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualNotEq}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualNotEq(napParser.EqualNotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualNotEq}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualNotEq(napParser.EqualNotEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(napParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(napParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(napParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(napParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstMod}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstMod(napParser.ConstModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstMod}
	 * labeled alternative in {@link napParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstMod(napParser.ConstModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(napParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(napParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(napParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(napParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(napParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(napParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCond}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfCond(napParser.IfCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCond}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfCond(napParser.IfCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfCond}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterElseIfCond(napParser.ElseIfCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfCond}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitElseIfCond(napParser.ElseIfCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(napParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link napParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(napParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterChar(napParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitChar(napParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Byte}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterByte(napParser.ByteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Byte}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitByte(napParser.ByteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInt(napParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInt(napParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBool(napParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBool(napParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterArray(napParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link napParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitArray(napParser.ArrayContext ctx);
}