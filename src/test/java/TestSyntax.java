import static org.junit.Assert.*;
import org.junit.Test;

public class TestSyntax {


    private final String[] input = {
            "10*2/2+4\n",
            "2*4\n"
    };


 /*   private final String[] outputSyntaxerkenner = {
            "(stat (expr (expr (expr (expr 10) * (expr 2)) / (expr 2)) + (expr 4)) \\n)",
            "(stat (expr (expr 2) * (expr 4)) \\n)"
    };

    private final String[] outputExprit = {
            "(stat (expr (term (fact 10) * (fact 2) / (fact 2)) + (term (fact 4))) \\n)",
            "(stat (expr (term (fact 2) * (fact 4))) \\n)"
    };*/

    @Test
    public void test(){
        for(String str : input){
            assertEquals(RunSyntax.syntaxerkenner(str), str);
            assertEquals(RunSyntax.exprit(str), str);
            assertEquals(RunSyntax.expr(str), str);

            System.out.println(RunSyntax.syntaxerkenner(str));
            System.out.println(RunSyntax.exprit(str));

        }
    }
}
