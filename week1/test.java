import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        long result = Factorial.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfOne() {
        long result = Factorial.calculateFactorial(1);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = Factorial.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-5));
    }
}

