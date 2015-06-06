import junit.framework.TestCase;
import ru.dk.Math.MathSpace;

public class MainTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        System.out.println("Starting main test:");
    }

    public void testMain() {
        System.out.println("Testing;");
        MathSpace mathSpace = new MathSpace();
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("Main test successfully passed.");
    }
}
