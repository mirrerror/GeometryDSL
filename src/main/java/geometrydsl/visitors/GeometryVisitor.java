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

    public GeometryVisitor(ExpressionManager expressionManager) {
        this.expressionManager = expressionManager;
    }

    @Override
    public Object visitPointStmt(GeometryDSLParser.PointStmtContext ctx) {
        String id = ctx.ID().getText();

        Point point;

        Float x = (Float) expressionManager.getValue(ctx.x, this);
        Float y = (Float) expressionManager.getValue(ctx.y, this);

        point = new Point(id, x, y);

        Main.getVariables().put(id, point);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLineStmt(GeometryDSLParser.LineStmtContext ctx) {
        Line line;

        String id = ctx.ID().get(0).getText();

        if(ctx.e1 != null) {
            Float x1 = (Float) expressionManager.getValue(ctx.e1, this);
            Float y1 = (Float) expressionManager.getValue(ctx.e2, this);
            Float x2 = (Float) expressionManager.getValue(ctx.e3, this);
            Float y2 = (Float) expressionManager.getValue(ctx.e4, this);
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

        Float radius = (Float) expressionManager.getValue(ctx.r, this);

        if(ctx.p != null) {
            Point p = (Point) Main.getVariables().get(ctx.p.getText());
            circle = new Circle(id, p, radius);
        } else {
            Float x = (Float) expressionManager.getValue(ctx.e1, this);
            Float y = (Float) expressionManager.getValue(ctx.e2, this);
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
            case "printVariable" -> {
                System.out.println(Main.getVariables().get(ctx.args().expr(0).ID().getText()));
                return (Float) visitChildren(ctx);
            }
            case "print" -> {
                System.out.println(visitFunctionCall(ctx.args().expr(0).functionCall()));
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

        return visitChildren(ctx);
    }

    @Override public Object visitForLoop(GeometryDSLParser.ForLoopContext ctx) {



        return visitChildren(ctx);
    }

    @Override public Object visitWhileLoop(GeometryDSLParser.WhileLoopContext ctx) {

        boolean condition = (boolean) expressionManager.getValue(ctx.expr(), this);
        while(condition) {
            expressionManager.visitStatement(ctx.statement(), this);
            condition = (boolean) expressionManager.getValue(ctx.expr(), this);
        }

        return visitChildren(ctx);
    }

}
