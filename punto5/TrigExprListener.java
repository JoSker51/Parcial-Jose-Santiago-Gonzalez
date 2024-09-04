// Generated from TrigExpr.g4 by ANTLR 4.9.2

    import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigExprParser}.
 */
public interface TrigExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TrigExprParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TrigExprParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TrigExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TrigExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigExprParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TrigExprParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigExprParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TrigExprParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TrigExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TrigExprParser.AssignmentContext ctx);
}