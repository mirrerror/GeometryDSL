import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
        CharStream charStream = CharStreams.fromString("""
                point p1 = (1, 2);
                point p2 = (3, 4);
                line l1 = from (1, 2) to (3, 4);
                circle c1 = center(1, 2) radius=5;
                """);

        GeometryDSLLexer lexer = new GeometryDSLLexer(charStream);
        GeometryDSLParser parser = new GeometryDSLParser(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.geometry();
        GeometryShapeVisitor geometryShapeVisitor = new GeometryShapeVisitor();
        geometryShapeVisitor.visit(parseTree);
        System.out.println(geometryShapeVisitor.getVariables());
    }

}
