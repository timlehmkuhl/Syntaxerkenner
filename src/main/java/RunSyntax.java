import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class RunSyntax {

    public static String syntaxerkenner(String str){
        CharStream input = CharStreams.fromString(str);
        SyntaxerkennerLexer lexer = new SyntaxerkennerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SyntaxerkennerParser parser = new SyntaxerkennerParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.prog();
        return tree.toStringTree(parser);

    }

    public static String exprit(String str){
        CharStream input = CharStreams.fromString(str);
        ExpritLexer lexer = new ExpritLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpritParser parser = new ExpritParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.prog();
        return tree.toStringTree(parser);
    }

    public static String expr(String str){
        CharStream input = CharStreams.fromString(str);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.prog();
        return tree.toStringTree(parser);
    }

    public static void main(String[] args) {
        System.out.println( syntaxerkenner("10*2/2+4\n"));
        System.out.println( syntaxerkenner("2*4\n"));
        System.out.println( syntaxerkenner("10+5*4\n"));
        System.out.println( syntaxerkenner("10+5*16/2\n"));
        System.out.println();
        System.out.println( exprit("10*2/2+4\n"));
        System.out.println( exprit("2*4\n"));
        System.out.println( exprit("10+5*4\n"));
        System.out.println( exprit("10+5*16/2\n"));
        System.out.println();
        System.out.println( expr("10*2/2+4\n"));
        System.out.println( expr("2*4\n"));
        System.out.println( expr("10+5*4\n"));
        System.out.println( expr("10+5*16/2\n"));
    }

    public static String clean(String str, String[] rules){
        for(String r : rules){
            str = str.replace(r, "");
        }
        return str.replace("(", "").replace(")", "").replace(" ", "").replace("\\n", "") + "\n";
    }



}