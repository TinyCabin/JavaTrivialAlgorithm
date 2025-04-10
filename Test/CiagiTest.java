import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;
import Zygzaki.Ciagi;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;


public class CiagiTest {

    @Test
    public void testPrintZigZagConcat() {
        // Arrange
        String str = "abcdefgh";
        int n = 3;
        String expected = "aeibdfhc";

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Ciagi.printZigZagConcat(str, n);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintZigZagConcatWithNEqualsToOne() {
        // Arrange
        String str = "abcdefgh";
        int n = 1;
        String expected = "abcdefgh";

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Ciagi.printZigZagConcat(str, n);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintZigZagConcatWithEmptyString() {
        // Arrange
        String str = "";
        int n = 3;
        String expected = "";

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Ciagi.printZigZagConcat(str, n);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintZigZagConcatWithDifferentStringLengthAndNValue() {
        // Arrange
        String str = "abcdef";
        int n = 2;
        String expected = "acebdf";

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Ciagi.printZigZagConcat(str, n);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

}