package geometrydsl.visitors;

import geometrydsl.GeometryDSLBaseVisitor;
import geometrydsl.GeometryDSLParser;
import geometrydsl.Main;
import geometrydsl.models.Circle;
import geometrydsl.models.Line;
import geometrydsl.models.Point;
import geometrydsl.models.Shape;
import geometrydsl.utils.ExpressionManager;

public class GeometryVisitor extends GeometryDSLBaseVisitor<Object> {

    private final ExpressionManager expressionManager;

    public GeometryVisitor() {
        this.expressionManager = new ExpressionManager(this);
    }

    @Override
    public Object visitPointStmt(GeometryDSLParser.PointStmtContext ctx) {
        String id = ctx.ID().getText();

        Point point;

        Float x = (Float) expressionManager.getValue(ctx.x);
        Float y = (Float) expressionManager.getValue(ctx.y);

        point = new Point(id, x, y);

        Main.getVariables().put(id, point);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLineStmt(GeometryDSLParser.LineStmtContext ctx) {
        Line line;

        String id = ctx.ID().get(0).getText();

        if(ctx.e1 != null) {
            Float x1 = (Float) expressionManager.getValue(ctx.e1);
            Float y1 = (Float) expressionManager.getValue(ctx.e2);
            Float x2 = (Float) expressionManager.getValue(ctx.e3);
            Float y2 = (Float) expressionManager.getValue(ctx.e4);
            line = new Line(id, x1, y1, x2, y2);
        } else {
            Point p1 = (Point) Main.getVariables().get(ctx.p1.getText());
            Point p2 = (Point) Main.getVariables().get(ctx.p2.getText());
            line = new Line(id, p1, p2);
        }
        Main.getVariables().put(id, line);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCircleStmt(GeometryDSLParser.CircleStmtContext ctx) {
        Circle circle;

        String id = ctx.ID().get(0).getText();

        Float radius = (Float) expressionManager.getValue(ctx.r);

        if(ctx.p != null) {
            Point p = (Point) Main.getVariables().get(ctx.p.getText());
            circle = new Circle(id, p, radius);
        } else {
            Float x = (Float) expressionManager.getValue(ctx.e1);
            Float y = (Float) expressionManager.getValue(ctx.e2);
            circle = new Circle(id, x, y, radius);
        }

        Main.getVariables().put(id, circle);
        return visitChildren(ctx);
    }

    @Override
    public Float visitFunctionCall(GeometryDSLParser.FunctionCallContext ctx) {
        String functionName = ctx.ID().getText();

        switch (functionName) {
            case "distance" -> {
                Shape shape1 = (Shape) Main.getVariables().get(ctx.args().expr(0).ID().getText());
                Shape shape2 = (Shape) Main.getVariables().get(ctx.args().expr(1).ID().getText());
                return shape1.calculateDistance(shape2);
            }
            case "print" -> {
                GeometryDSLParser.ExprContext expr = ctx.args().expr(0);
                if(expr.ID() != null) {
                    System.out.println(Main.getVariables().get(expr.ID().getText()));
                } else if(expr.NUMBER() != null) {
                    System.out.println(Float.parseFloat(expr.NUMBER().getText()));
                } else if(expr.functionCall() != null) {
                    System.out.println(visitFunctionCall(expr.functionCall()));
                }

                return (Float) visitChildren(ctx);
            }
            case "area" -> {
                Shape shape = (Shape) Main.getVariables().get(ctx.args().expr(0).ID().getText());
                return shape.calculateArea();
            }
            case "perimeter" -> {
                Shape shape = (Shape) Main.getVariables().get(ctx.args().expr(0).ID().getText());
                return shape.calculatePerimeter();
            }
            default -> {
                return (Float) visitChildren(ctx);
            }
        }
    }

    @Override
    public Object visitAssignStmt(GeometryDSLParser.AssignStmtContext ctx) {

        String name = ctx.ID().getText();

        if(ctx.expr().ID() != null) {
            Main.getVariables().put(name, Main.getVariables().get(ctx.expr().ID().getText()));
        } else if(ctx.expr().NUMBER() != null) {
            Main.getVariables().put(name, Float.parseFloat(ctx.expr().NUMBER().getText()));
        } else if(ctx.expr().functionCall() != null) {
            Main.getVariables().put(name, visitFunctionCall(ctx.expr().functionCall()));
        }

        if(ctx.expr().expr().size() == 2) {
            Main.getVariables().put(name, expressionManager.getValue(ctx));
        }

        return visitChildren(ctx);
    }

    @Override public Object visitForLoop(GeometryDSLParser.ForLoopContext ctx) {
        visitAssignStmt(ctx.init);

        boolean condition = (boolean) expressionManager.getValue(ctx);
        for(;condition;) {
            condition = (boolean) expressionManager.getValue(ctx);
            if(!condition) break;
            expressionManager.visitStatement(ctx.statement());
            visitAssignStmt(ctx.assignStmt().get(1));
        }

        return null;
    }

    @Override public Object visitWhileLoop(GeometryDSLParser.WhileLoopContext ctx) {
        boolean condition = (boolean) expressionManager.getValue(ctx);
        while(condition) {
            condition = (boolean) expressionManager.getValue(ctx);
            if(!condition) break;
            expressionManager.visitStatement(ctx.statement());
        }

        return null;
    }

    @Override public Object visitIfStmt(GeometryDSLParser.IfStmtContext ctx) {
        boolean condition = (boolean) expressionManager.getValue(ctx);
        if(condition) {
            expressionManager.visitStatement(ctx.statement(0));
        } else {
            expressionManager.visitStatement(ctx.statement(1));
        }

        return null;
    }

}
