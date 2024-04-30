package geometrydsl.visitors;

import geometrydsl.GeometryDSLBaseVisitor;
import geometrydsl.GeometryDSLParser;
import geometrydsl.Main;
import geometrydsl.models.*;
import geometrydsl.utils.ExpressionManager;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ListIterator;

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
    public Object visitTriangleStmt(GeometryDSLParser.TriangleStmtContext ctx) {
        Triangle triangle;

        String id = ctx.ID().get(0).getText();

        if(ctx.p1 != null) {
            Point p1 = (Point) Main.getVariables().get(ctx.p1.getText());
            Point p2 = (Point) Main.getVariables().get(ctx.p2.getText());
            Point p3 = (Point) Main.getVariables().get(ctx.p3.getText());
            triangle = new Triangle(id, p1, p2, p3);
        } else {
            Float x1 = (Float) expressionManager.getValue(ctx.e1);
            Float y1 = (Float) expressionManager.getValue(ctx.e2);
            Float x2 = (Float) expressionManager.getValue(ctx.e3);
            Float y2 = (Float) expressionManager.getValue(ctx.e4);
            Float x3 = (Float) expressionManager.getValue(ctx.e5);
            Float y3 = (Float) expressionManager.getValue(ctx.e6);
            triangle = new Triangle(id, x1, y1, x2, y2, x3, y3);
        }

        Main.getVariables().put(id, triangle);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRectangleStmt(GeometryDSLParser.RectangleStmtContext ctx) {
        Rectangle rectangle;

        String id = ctx.ID().get(0).getText();

        if(ctx.p != null) {
            Point p = (Point) Main.getVariables().get(ctx.p.getText());
            Float width = (Float) expressionManager.getValue(ctx.e1);
            Float height = (Float) expressionManager.getValue(ctx.e2);
            rectangle = new Rectangle(id, p, width, height);
        } else {
            Float x = (Float) expressionManager.getValue(ctx.e1);
            Float y = (Float) expressionManager.getValue(ctx.e2);
            Float width = (Float) expressionManager.getValue(ctx.e3);
            Float height = (Float) expressionManager.getValue(ctx.e4);
            rectangle = new Rectangle(id, x, y, width, height);
        }

        Main.getVariables().put(id, rectangle);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPolygonStmt(GeometryDSLParser.PolygonStmtContext ctx) {
        Polygon polygon;

        ListIterator<TerminalNode> idsIterator = ctx.ID().listIterator();

        String id = idsIterator.next().getText();

        polygon = new Polygon(id);

        boolean usesPoints = false;
        while(idsIterator.hasNext()) {
            String pointId = idsIterator.next().getText();
            Point point = (Point) Main.getVariables().get(pointId);
            polygon.addPoint(point);
            usesPoints = true;
        }

        ListIterator<GeometryDSLParser.ExprContext> exprsIterator = ctx.expr().listIterator();

        if(!usesPoints)
            while (exprsIterator.hasNext()) {
                Float x = (Float) expressionManager.getValue(exprsIterator.next());
                if(!exprsIterator.hasNext()) break;
                Float y = (Float) expressionManager.getValue(exprsIterator.next());

                polygon.addPoint(x, y);
            }

        Main.getVariables().put(id, polygon);
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
        while (condition) {
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
