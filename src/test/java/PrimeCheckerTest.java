import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    public void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    public void testNotPrime() {
        assertFalse(PrimeChecker.isPrime(10));
    }

    @Test
    public void testOne() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    public void testNegative() {
        assertFalse(PrimeChecker.isPrime(-5));
    }
}
