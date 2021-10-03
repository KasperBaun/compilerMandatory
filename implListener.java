// Generated from impl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAssign}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterStringAssign(implParser.StringAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAssign}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitStringAssign(implParser.StringAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(implParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(implParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterOutput(implParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitOutput(implParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(implParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(implParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(implParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(implParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(implParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(implParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(implParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(implParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationAndDivision}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationAndDivision(implParser.MultiplicationAndDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationAndDivision}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationAndDivision(implParser.MultiplicationAndDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionAndSubtraction}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionAndSubtraction(implParser.AdditionAndSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionAndSubtraction}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionAndSubtraction(implParser.AdditionAndSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unequal}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterUnequal(implParser.UnequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unequal}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitUnequal(implParser.UnequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEquals(implParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEquals(implParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(implParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(implParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(implParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(implParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserThanOrEquals}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLesserThanOrEquals(implParser.LesserThanOrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserThanOrEquals}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLesserThanOrEquals(implParser.LesserThanOrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEquals}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEquals(implParser.GreaterThanOrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEquals}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEquals(implParser.GreaterThanOrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(implParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(implParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLesserThan(implParser.LesserThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLesserThan(implParser.LesserThanContext ctx);
}