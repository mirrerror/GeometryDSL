import models.Circle;
import models.IShape;
import models.Line;
import models.Point;

import java.util.HashMap;
import java.util.Map;

public class GeometryShapeVisitor extends GeometryDSLBaseVisitor<IShape> {

    private final Map<String, IShape> variables;

    public GeometryShapeVisitor() {
        this.variables = new HashMap<>();
    }

    @Override
    public IShape visitPointStmt(GeometryDSLParser.PointStmtContext ctx) {
        String id = ctx.ID().getText();
        float x = Float.parseFloat(ctx.x.getText());
        float y = Float.parseFloat(ctx.y.getText());
        variables.put(id, new Point(id, x, y));
        return visitChildren(ctx);
    }

    @Override
    public IShape visitLineStmt(GeometryDSLParser.LineStmtContext ctx) {
        Line line;

        String id = ctx.ID().get(0).getText();

        if(ctx.x1 != null) {
            float x1 = Float.parseFloat(ctx.x1.getText());
            float y1 = Float.parseFloat(ctx.y1.getText());
            float x2 = Float.parseFloat(ctx.x2.getText());
            float y2 = Float.parseFloat(ctx.y2.getText());
            line = new Line(id, x1, y1, x2, y2);
        } else {
            Point p1 = (Point) variables.get(ctx.p1.getText());
            Point p2 = (Point) variables.get(ctx.p2.getText());
            line = new Line(id, p1, p2);
        }
        variables.put(id, line);
        return visitChildren(ctx);
    }

    @Override
    public IShape visitCircleStmt(GeometryDSLParser.CircleStmtContext ctx) {
        Circle circle;

        String id = ctx.ID().get(0).getText();
        float radius = Float.parseFloat(ctx.r.getText());

        if(ctx.p != null) {
            Point p = (Point) variables.get(ctx.p.getText());
            circle = new Circle(id, p, radius);
        } else {
            float x = Float.parseFloat(ctx.x.getText());
            float y = Float.parseFloat(ctx.y.getText());
            circle = new Circle(id, x, y, radius);
        }

        variables.put(id, circle);
        return visitChildren(ctx);
    }

    public Map<String, IShape> getVariables() {
        return variables;
    }
}
