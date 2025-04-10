import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Mediana.Mediana;

public class MedianaTest {

    @Test
    public void testFindMedianSortedArrays() {
        // Arrange
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected1 = 2.0;

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        double expected2 = 2.5;

        // Act
        double result1 = Mediana.findMedianSortedArrays(nums1, nums2);
        double result2 = Mediana.findMedianSortedArrays(nums3, nums4);

        // Assert
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }

    @Test
    public void testFindMedianSortedArraysEmptyArrays() {
        // Arrange
        int[] nums1 = {};
        int[] nums2 = {};
        double expected = 0.0; // Median of empty array is 0.0

        // Act
        double result = Mediana.findMedianSortedArrays(nums1, nums2);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testFindMedianSortedArraysOneEmptyArray() {
        // Arrange
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        double expected = 2.0; // Median of {1, 2, 3} is 2.0

        // Act
        double result = Mediana.findMedianSortedArrays(nums1, nums2);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testFindMedianSortedArraysUnevenLengthArrays() {
        // Arrange
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5};
        double expected = 3.0; // Median of {1, 2, 3, 4, 5} is 3.0

        // Act
        double result = Mediana.findMedianSortedArrays(nums1, nums2);

        // Assert
        assertEquals(expected, result);
    }

}
