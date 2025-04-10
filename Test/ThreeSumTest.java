import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import Trojki.ThreeSum;

public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        // Arrange
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        ThreeSum solution = new ThreeSum();

        // Act
        List<List<Integer>> actual = solution.threeSum(nums);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testThreeSumWithNoSolution() {
        // Arrange
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList();
        ThreeSum solution = new ThreeSum();

        // Act
        List<List<Integer>> actual = solution.threeSum(nums);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testThreeSumWithEmptyArray() {
        // Arrange
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        ThreeSum solution = new ThreeSum();

        // Act
        List<List<Integer>> actual = solution.threeSum(nums);

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testThreeSumWithMultipleSolutions() {
        // Arrange
        int[] nums = {-1, 0, 1, 2, -1, -4, 5};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-4, -1, 5),
                Arrays.asList(-4, 0, 4),
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        ThreeSum solution = new ThreeSum();

        // Act
        List<List<Integer>> actual = solution.threeSum(nums);

        // Assert
        assertEquals(expected, actual);
    }

}
