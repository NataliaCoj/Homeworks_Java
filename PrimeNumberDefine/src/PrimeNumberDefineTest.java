import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberDefineTest {
    PrimeNumberDefine isPrime = new PrimeNumberDefine();

    @Test
    public void testIfIsPrime() {
        assertEquals(true, PrimeNumberDefine.isPrime(3));
    }
}
