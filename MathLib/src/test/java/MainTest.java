import junit.framework.TestCase;
import ru.dk.Math.MathElements.Expressions.Countable;
import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathSpace;


public class MainTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        System.out.println("Starting main test:");
    }

    public void testMain() throws MathSpace.SameVariableException, MathSpace.UnknownVariableException {
        System.out.println("Testing;");
        MathSpace mathSpace = new MathSpace();
        mathSpace.addVariable(new Variable("x", new Countable<Integer>(100)));
        System.out.println(mathSpace.getVariable("x").toString());
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("Main test successfully passed.");
    }
}
