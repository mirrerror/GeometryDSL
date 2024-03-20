package geometrydsl.utils;

import geometrydsl.GeometryDSLParser;
import geometrydsl.Main;
import geometrydsl.visitors.GeometryVisitor;

public class ExpressionManager {

    public Object visitStatement(GeometryDSLParser.StatementContext ctx, GeometryVisitor visitor) {
        if(ctx.singleStatement() != null) {
            if(ctx.singleStatement().pointStmt() != null) {
                return visitor.visitPointStmt(ctx.singleStatement().pointStmt());
            } else if(ctx.singleStatement().lineStmt() != null) {
                return visitor.visitLineStmt(ctx.singleStatement().lineStmt());
            } else if(ctx.singleStatement().assignStmt() != null) {
                return visitor.visitAssignStmt(ctx.singleStatement().assignStmt());
            } else if(ctx.singleStatement().circleStmt() != null) {
                return visitor.visitCircleStmt(ctx.singleStatement().circleStmt());
            } else if(ctx.singleStatement().functionCall() != null) {
                return visitor.visitFunctionCall(ctx.singleStatement().functionCall());
            } else if(ctx.singleStatement().forLoop() != null) {
                return visitor.visitForLoop(ctx.singleStatement().forLoop());
            } else if(ctx.singleStatement().whileLoop() != null) {
                return visitor.visitWhileLoop(ctx.singleStatement().whileLoop());
            } else {
                return null;
            }
        }

        if(ctx.blockStatement() != null) {
            return visitor.visitBlockStatement(ctx.blockStatement());
        }

        return null;
    }

    public Object getValue(GeometryDSLParser.ExprContext ctx, GeometryVisitor visitor) {
        if(ctx.ID() != null) {
            return Main.getVariables().get(ctx.ID().getText());
        } else if(ctx.NUMBER() != null) {
            return Float.parseFloat(ctx.NUMBER().getText());
        } else if(ctx.functionCall() != null) {
            return visitor.visitFunctionCall(ctx.functionCall());
        } else {
            return null;
        }
    }

}
