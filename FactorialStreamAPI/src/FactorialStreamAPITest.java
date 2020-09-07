import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialStreamAPITest {
    FactorialStreamAPI factorialStreamAPI = new FactorialStreamAPI();

    @Test
    public void testFactorial1(){
        assertEquals(6, factorialStreamAPI.getFactorial(3));
    }

    @Test
    public void testFactorial2(){
        assertEquals(1, factorialStreamAPI.getFactorial(1));
    }
    @Test
    public void testFactorial3(){
        assertEquals(1, factorialStreamAPI.getFactorial(0));
    }

}