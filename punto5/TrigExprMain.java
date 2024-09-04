import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TrigExprTest {
    public static void main(String[] args) throws Exception {
        // Asegúrate de proporcionar el camino correcto al archivo
        String inputFile = "expr.in";
        CharStream input = CharStreams.fromFileName(inputFile);
        TrigExprLexer lexer = new TrigExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigExprParser parser = new TrigExprParser(tokens);
        ParseTree tree = parser.calc(); // `calc` es el punto de entrada de tu gramática
    }
}

