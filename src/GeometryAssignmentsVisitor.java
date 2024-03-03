public class GeometryAssignmentsVisitor extends GeometryDSLBaseVisitor<Object> {

    @Override
    public Object visitAssignStmt(GeometryDSLParser.AssignStmtContext ctx) {

        String name = ctx.ID().getText();

        if(ctx.expr().ID() != null) {
            Main.getVariables().put(name, Main.getVariables().get(ctx.expr().ID().getText()));
        } else if(ctx.expr().NUMBER().getText() != null) {
            Main.getVariables().put(name, Float.parseFloat(ctx.expr().NUMBER().getText()));
        } else if(ctx.expr().functionCall() != null) {
            Main.getVariables().put(name, new GeometryFunctionsVisitor().visitFunctionCall(ctx.expr().functionCall()));
        }

        return visitChildren(ctx);
    }

}
