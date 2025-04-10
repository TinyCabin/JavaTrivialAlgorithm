import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Sortowanie.*;

public class ArraySorterTest {

    @Test
    public void testSortWithBubbleSort() {
        // Arrange
        int[] array = {5, 3, 1, 2, 4};
        int[] expected = {1, 2, 3, 4, 5};
        ArraySorter sorter = new ArraySorter(new BubbleSort());

        // Act
        int[] actual = sorter.sort(array);

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWithHeapSort() {
        // Arrange
        int[] array = {5, 3, 1, 2, 4};
        int[] expected = {1, 2, 3, 4, 5};
        ArraySorter sorter = new ArraySorter(new HeapSort());

        // Act
        int[] actual = sorter.sort(array);

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWithQuickSort() {
        // Arrange
        int[] array = {5, 3, 1, 2, 4};
        int[] expected = {1, 2, 3, 4, 5};
        ArraySorter sorter = new ArraySorter(new QuickSort());

        // Act
        int[] actual = sorter.sort(array);

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWithMergeSort() {
        // Arrange
        int[] array = {5, 3, 1, 2, 4};
        int[] expected = {1, 2, 3, 4, 5};
        ArraySorter sorter = new ArraySorter(new MergeSort());

        // Act
        int[] actual = sorter.sort(array);

        // Assert
        assertArrayEquals(expected, actual);
    }
}
