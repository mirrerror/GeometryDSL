package geometrydsl.utils;

import geometrydsl.GeometryDSLParser;
import geometrydsl.Main;
import geometrydsl.visitors.GeometryVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExpressionManager {

    private final GeometryVisitor visitor;

    public ExpressionManager(GeometryVisitor visitor) {
        this.visitor = visitor;
    }

    public Object visitStatement(GeometryDSLParser.StatementContext ctx) {
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
            } else {
                return null;
            }
        }

        if(ctx.blockStatement() != null) {
            return visitor.visitBlockStatement(ctx.blockStatement());
        }

        if(ctx.forLoop() != null) {
            return visitor.visitForLoop(ctx.forLoop());
        }

        if(ctx.whileLoop() != null) {
            return visitor.visitWhileLoop(ctx.whileLoop());
        }

        return null;
    }

    public Object getValue(GeometryDSLParser.ExprContext ctx) {
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

    public Object getValue(GeometryDSLParser.WhileLoopContext ctx) {
        TerminalNode booleanOperator = null;

        if(ctx.condition.LESS_EQ() != null) {
            booleanOperator = ctx.condition.LESS_EQ();
        } else if(ctx.condition.LESS() != null) {
            booleanOperator = ctx.condition.LESS();
        } else if(ctx.condition.GREATER_EQ() != null) {
            booleanOperator = ctx.condition.GREATER_EQ();
        } else if(ctx.condition.GREATER() != null) {
            booleanOperator = ctx.condition.GREATER();
        } else if(ctx.condition.EQUAL() != null) {
            booleanOperator = ctx.condition.EQUAL();
        } else if(ctx.condition.NOT_EQUAL() != null) {
            booleanOperator = ctx.condition.NOT_EQUAL();
        }

        float operand1 = (float) getValue(ctx.condition.expr(0));
        float operand2 = (float) getValue(ctx.condition.expr(1));

        if(booleanOperator != null) {
            switch(booleanOperator.getText()) {
                case "<":
                    return operand1 < operand2;
                case "<=":
                    return operand1 <= operand2;
                case ">":
                    return operand1 > operand2;
                case ">=":
                    return operand1 >= operand2;
                case "==":
                    return operand1 == operand2;
                case "!=":
                    return operand1 != operand2;
            }
        }

        return null;
    }

    public Object getValue(GeometryDSLParser.AssignStmtContext ctx) {
        TerminalNode operator = null;

        if(ctx.expr().PLUS() != null) {
            operator = ctx.expr().PLUS();
        } else if(ctx.expr().MINUS() != null) {
            operator = ctx.expr().MINUS();
        } else if(ctx.expr().MULTIPLY() != null) {
            operator = ctx.expr().MULTIPLY();
        } else if(ctx.expr().DIVIDE() != null) {
            operator = ctx.expr().DIVIDE();
        }

        float operand1 = (float) getValue(ctx.expr().expr(0));
        float operand2 = (float) getValue(ctx.expr().expr(1));

        if(operator != null) {
            switch(operator.getText()) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    return operand1 / operand2;
            }
        }

        return null;
    }

    public Object getValue(GeometryDSLParser.ForLoopContext ctx) {
        TerminalNode booleanOperator = null;

        if(ctx.condition.LESS_EQ() != null) {
            booleanOperator = ctx.condition.LESS_EQ();
        } else if(ctx.condition.LESS() != null) {
            booleanOperator = ctx.condition.LESS();
        } else if(ctx.condition.GREATER_EQ() != null) {
            booleanOperator = ctx.condition.GREATER_EQ();
        } else if(ctx.condition.GREATER() != null) {
            booleanOperator = ctx.condition.GREATER();
        } else if(ctx.condition.EQUAL() != null) {
            booleanOperator = ctx.condition.EQUAL();
        } else if(ctx.condition.NOT_EQUAL() != null) {
            booleanOperator = ctx.condition.NOT_EQUAL();
        }

        float operand1 = (float) getValue(ctx.condition.expr(0));
        float operand2 = (float) getValue(ctx.condition.expr(1));
        System.out.println("operand1 = " + operand1);
        System.out.println("operand2 = " + operand2);

        if(booleanOperator != null) {
            switch(booleanOperator.getText()) {
                case "<":
                    return operand1 < operand2;
                case "<=":
                    return operand1 <= operand2;
                case ">":
                    return operand1 > operand2;
                case ">=":
                    return operand1 >= operand2;
                case "==":
                    return operand1 == operand2;
                case "!=":
                    return operand1 != operand2;
            }
        }



        return null;
    }

}
