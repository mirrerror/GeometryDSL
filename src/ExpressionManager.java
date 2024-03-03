public class ExpressionManager {

    public Object getValue(GeometryDSLParser.ExprContext ctx) {
        if(ctx.ID() != null) {
            return Main.getVariables().get(ctx.ID().getText());
        } else if(ctx.NUMBER() != null) {
            return Float.parseFloat(ctx.NUMBER().getText());
        } else if(ctx.functionCall() != null) {
            return new GeometryVisitor().visitFunctionCall(ctx.functionCall());
        } else {
            return null;
        }
    }

}
