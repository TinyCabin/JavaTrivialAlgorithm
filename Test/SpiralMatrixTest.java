import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;
import Spirala.SpiralMatrix;

public class SpiralMatrixTest {

    @Test
    public void testPrintSpiralOrder() {
        // Arrange
        int[][] matrix = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        String expected = "5 4 3 2 1 6 11 16 21 22 23 24 25 20 15 10 9 8 7 12 17 18 19 14 13";
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        spiralMatrix.printSpiralOrder(matrix);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintSpiralOrderFor2x2Matrix() {
        // Arrange
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        String expected = "2 1 3 4";
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        spiralMatrix.printSpiralOrder(matrix);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintSpiralOrderFor3x3Matrix() {
        // Arrange
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String expected = "3 2 1 4 7 8 9 6 5";
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        // Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        spiralMatrix.printSpiralOrder(matrix);
        String actual = outputStream.toString().trim();

        // Assert
        assertEquals(expected, actual);
    }

}
