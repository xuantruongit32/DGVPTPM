import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleProgramTest {

    @Test
    public void testOddNumbers() {
        // Arrange
        int[] numbers = {1, 3, 5};
        String[] expected = {"1 là số lẻ", "3 là số lẻ", "5 là số lẻ"};

        // Act & Assert
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(expected[i], getOutput(numbers[i]));
        }
    }

    @Test
    public void testEvenNumbers() {
        // Arrange
        int[] numbers = {2, 4, 6};
        String[] expected = {"2 là số chẵn", "4 là số chẵn", "6 là số chẵn"};

        // Act & Assert
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(expected[i], getOutput(numbers[i]));
        }
    }

    private String getOutput(int num) {
        if (num % 2 == 0) {
            return num + " là số chẵn";
        } else {
            return num + " là số lẻ";
        }
    }
}

