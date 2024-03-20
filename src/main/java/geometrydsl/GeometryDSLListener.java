package geometrydsl;// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeometryDSLParser}.
 */
public interface GeometryDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#geometry}.
	 * @param ctx the parse tree
	 */
	void enterGeometry(GeometryDSLParser.GeometryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#geometry}.
	 * @param ctx the parse tree
	 */
	void exitGeometry(GeometryDSLParser.GeometryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GeometryDSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GeometryDSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(GeometryDSLParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(GeometryDSLParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GeometryDSLParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GeometryDSLParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(GeometryDSLParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(GeometryDSLParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#pointStmt}.
	 * @param ctx the parse tree
	 */
	void enterPointStmt(GeometryDSLParser.PointStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#pointStmt}.
	 * @param ctx the parse tree
	 */
	void exitPointStmt(GeometryDSLParser.PointStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#lineStmt}.
	 * @param ctx the parse tree
	 */
	void enterLineStmt(GeometryDSLParser.LineStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#lineStmt}.
	 * @param ctx the parse tree
	 */
	void exitLineStmt(GeometryDSLParser.LineStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#circleStmt}.
	 * @param ctx the parse tree
	 */
	void enterCircleStmt(GeometryDSLParser.CircleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#circleStmt}.
	 * @param ctx the parse tree
	 */
	void exitCircleStmt(GeometryDSLParser.CircleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GeometryDSLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GeometryDSLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GeometryDSLParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GeometryDSLParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GeometryDSLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GeometryDSLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(GeometryDSLParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(GeometryDSLParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(GeometryDSLParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(GeometryDSLParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryDSLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GeometryDSLParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryDSLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GeometryDSLParser.WhileLoopContext ctx);
}