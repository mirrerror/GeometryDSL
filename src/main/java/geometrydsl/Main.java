package geometrydsl;

import geometrydsl.models.Shape;
import geometrydsl.visitors.GeometryVisitor;
import geometrydsl.visual.JavaFXApplication;
import javafx.application.Application;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final Map<String, Object> variables = new HashMap<>();
    private static final Set<Shape> shapesToDraw = new HashSet<>();

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./test.geo");
//        CharStream charStream = CharStreams.fromFileName("./" + args[0] + ".geo");

        GeometryDSLLexer lexer = new GeometryDSLLexer(charStream);
        GeometryDSLParser parser = new GeometryDSLParser(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.geometry();

        GeometryVisitor geometryVisitor = new GeometryVisitor();
        geometryVisitor.visit(parseTree);

        variables.forEach((key, value) -> {
            if(value instanceof Shape) {
                shapesToDraw.add((Shape) value);
            }
        });

        Application.launch(JavaFXApplication.class, args);
    }

    public static Map<String, Object> getVariables() {
        return variables;
    }

    public static Set<Shape> getShapesToDraw() {
        return shapesToDraw;
    }
}
