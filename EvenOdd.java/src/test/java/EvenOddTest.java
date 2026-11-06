import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

    @Test
    public void testEven() {
        assertEquals("Even", EvenOdd.checkEvenOdd(10));
    }

    @Test
    public void testOdd() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    public void testNegative() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(-3));
    }
}