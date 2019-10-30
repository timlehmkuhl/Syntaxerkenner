import static org.junit.Assert.*;
import org.junit.Test;

public class TestSyntax {


    private final String[][] inputs = {
            //Input         //Expected: syntaxerkenner, exprit, expr
            {"10*2/2+4\n",  "(prog (stat (expr (expr (term (term (term (fact 10)) * (fact 2)) / (fact 2))) + (term (fact 4))) \\n))", "(prog (stat (expr (term (fact 10) * (fact 2) / (fact 2)) + (term (fact 4))) \\n))", "(prog (stat (expr (expr (expr (expr 10) * (expr 2)) / (expr 2)) + (expr 4)) \\n))"},
            {"2*4\n",       "(prog (stat (expr (term (term (fact 2)) * (fact 4))) \\n))", "(prog (stat (expr (term (fact 2) * (fact 4))) \\n))", "(prog (stat (expr (expr 2) * (expr 4)) \\n))"},
            {"10+5*4\n",    "(prog (stat (expr (expr (term (fact 10))) + (term (term (fact 5)) * (fact 4))) \\n))", "(prog (stat (expr (term (fact 10)) + (term (fact 5) * (fact 4))) \\n))", "(prog (stat (expr (expr 10) + (expr (expr 5) * (expr 4))) \\n))"},
            {"10+5*16/2\n", "(prog (stat (expr (expr (term (fact 10))) + (term (term (term (fact 5)) * (fact 16)) / (fact 2))) \\n))", "(prog (stat (expr (term (fact 10)) + (term (fact 5) * (fact 16) / (fact 2))) \\n))", "(prog (stat (expr (expr 10) + (expr (expr (expr 5) * (expr 16)) / (expr 2))) \\n))"}
    };



    @Test
    public void test(){
        for(int i = 0; i < inputs.length; i++) {
                assertEquals(RunSyntax.syntaxerkenner(inputs[i][0]), inputs[i][1]);
                assertEquals(RunSyntax.exprit(inputs[i][0]), inputs[i][2]);
                assertEquals(RunSyntax.expr(inputs[i][0]), inputs[i][3]);
        }
    }
}
