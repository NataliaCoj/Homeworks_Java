import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testFactorial1() {
        assertEquals(6, Factorial.getFactorial(3));
    }
    @Test
    public void testFactorial2() {
        assertEquals(24, Factorial.getFactorial(4));
    }
    @Test
    public void testFactorial3() {
        assertEquals(120, Factorial.getFactorial(5));
    }
    @Test
    public void testFactorial4() {
        assertEquals(1, Factorial.getFactorial(0));
    }


}