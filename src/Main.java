import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Object> variables = new HashMap<>();

    public static void main(String[] args) {

        CharStream charStream = CharStreams.fromString("""
                point p1 = (1, 2);
                point p2 = (3, 4);
                line l1 = from (p1) to (p2);
                circle c1 = center(p1) radius=5;
                point p3 = (5, 6);
                distance(p1, p2);
                distance(p1, p3);
                printVariable(p1);
                x = 5;
                y = 7;
                printVariable(x);
                printVariable(y);
                point p3 = (x, y);
                printVariable(p3);
                """);

        GeometryDSLLexer lexer = new GeometryDSLLexer(charStream);
        GeometryDSLParser parser = new GeometryDSLParser(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.geometry();

        GeometryAssignmentsVisitor geometryAssignmentsVisitor = new GeometryAssignmentsVisitor();
        geometryAssignmentsVisitor.visit(parseTree);

        GeometryShapeVisitor geometryShapeVisitor = new GeometryShapeVisitor();
        geometryShapeVisitor.visit(parseTree);

        GeometryFunctionsVisitor geometryFunctionsVisitor = new GeometryFunctionsVisitor();
        geometryFunctionsVisitor.visit(parseTree);

//        System.out.println(variables);
    }

    public static Map<String, Object> getVariables() {
        return variables;
    }
}
