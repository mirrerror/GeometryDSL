import models.Point;

public class GeometryFunctionsVisitor extends GeometryDSLBaseVisitor<Object> {

    @Override
    public Float visitFunctionCall(GeometryDSLParser.FunctionCallContext ctx) {
        String functionName = ctx.ID().getText();

        switch (functionName) {
            case "distance" -> {
                Point p1 = (Point) Main.getVariables().get(ctx.args().expr(0).ID().getText());
                Point p2 = (Point) Main.getVariables().get(ctx.args().expr(1).ID().getText());
                return p1.calculateDistance(p2);
            }
            case "printVariable" -> {
                System.out.println(Main.getVariables().get(ctx.args().expr(0).ID().getText()));
                return (Float) visitChildren(ctx);
            }
            default -> {
                return (Float) visitChildren(ctx);
            }
        }
    }

}
