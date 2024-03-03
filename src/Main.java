import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Object> variables = new HashMap<>();

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./test.geo");
//        CharStream charStream = CharStreams.fromFileName("./" + args[0] + ".geo");

        GeometryDSLLexer lexer = new GeometryDSLLexer(charStream);
        GeometryDSLParser parser = new GeometryDSLParser(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.geometry();

        GeometryVisitor geometryVisitor = new GeometryVisitor();
        geometryVisitor.visit(parseTree);
    }

    public static Map<String, Object> getVariables() {
        return variables;
    }
}
