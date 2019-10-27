import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class RunSyntax {

    public static String syntaxerkenner(String str){

        CharStream input = CharStreams.fromString(str);
        SyntaxerkennerLexer lexer = new SyntaxerkennerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SyntaxerkennerParser parser = new SyntaxerkennerParser(tokens);
        ParseTree tree = parser.stat();

        return clean(tree.toStringTree(parser), SyntaxerkennerParser.ruleNames)+ "\n";

    }

    public static String exprit(String str){

        CharStream input = CharStreams.fromString(str);
        ExpritLexer lexer = new ExpritLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpritParser parser = new ExpritParser(tokens);
        ParseTree tree = parser.stat();
        return clean(tree.toStringTree(parser), ExpritParser.ruleNames) + "\n";

    }

    public static String expr(String str){

        CharStream input = CharStreams.fromString(str);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.stat();
        return clean(tree.toStringTree(parser), ExprParser.ruleNames)+ "\n";

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println( syntaxerkenner("10*2/2+4\n"));
        System.out.println( expr("10*2/2+4\n"));
        System.out.println( exprit("10*2/2+4\n"));
        System.out.println( exprit("2*4\n"));


    }

    public static String clean(String str, String[] rules){
        for(String r : rules){
            str = str.replace(r, "");
        }
        return str.replace("(", "").replace(")", "").replace(" ", "").replace("\\n", "");
    }



}