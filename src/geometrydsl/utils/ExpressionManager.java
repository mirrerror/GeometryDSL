package geometrydsl.utils;

import geometrydsl.GeometryDSLParser;
import geometrydsl.Main;
import geometrydsl.visitors.GeometryVisitor;

public class ExpressionManager {

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
