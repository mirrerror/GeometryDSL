package geometrydsl;// Generated from D:/MyIdeaProjects2023/GeometryDSL/grammar/GeometryDSL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GeometryDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GeometryDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#geometry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometry(GeometryDSLParser.GeometryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GeometryDSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(GeometryDSLParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#pointStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointStmt(GeometryDSLParser.PointStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#lineStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStmt(GeometryDSLParser.LineStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#circleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleStmt(GeometryDSLParser.CircleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GeometryDSLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GeometryDSLParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryDSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GeometryDSLParser.ExprContext ctx);
}