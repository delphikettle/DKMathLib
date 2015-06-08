import junit.framework.TestCase;
import ru.dk.Math.MathElements.Expressions.Countable;
import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathSpace;


public class MainTest extends TestCase {
    private MathSpace mathSpace;
    @Override
    protected void setUp() throws Exception {
        System.out.println("Starting main test:");
        mathSpace = new MathSpace();
    }

    public void testMain() throws MathSpace.SameVariableException, MathSpace.UnknownVariableException {
        System.out.println("Testing;");
        mathSpace.addVariable(new Variable("a", new Countable<Integer>(100)));
        System.out.println(mathSpace.getVariable("a").toString());
    }

    public void testCountables() throws MathSpace.SameVariableException, MathSpace.UnknownVariableException {
        mathSpace.addVariable(new Variable("x", new Countable<Integer>(100)));
        assertTrue(mathSpace.getVariable("x").isCountable());
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("Main test successfully passed.");
    }
}
