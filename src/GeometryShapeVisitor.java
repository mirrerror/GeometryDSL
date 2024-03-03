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
        String id = ctx.ID().getText();
        float x1 = Float.parseFloat(ctx.x1.getText());
        float y1 = Float.parseFloat(ctx.y1.getText());
        float x2 = Float.parseFloat(ctx.x2.getText());
        float y2 = Float.parseFloat(ctx.y2.getText());
        variables.put(id, new Line(id, x1, y1, x2, y2));
        return visitChildren(ctx);
    }

    @Override
    public IShape visitCircleStmt(GeometryDSLParser.CircleStmtContext ctx) {
        String id = ctx.ID().getText();
        float x = Float.parseFloat(ctx.x.getText());
        float y = Float.parseFloat(ctx.y.getText());
        float radius = Float.parseFloat(ctx.r.getText());
        variables.put(id, new Circle(id, x, y, radius));
        return visitChildren(ctx);
    }

    public Map<String, IShape> getVariables() {
        return variables;
    }
}
