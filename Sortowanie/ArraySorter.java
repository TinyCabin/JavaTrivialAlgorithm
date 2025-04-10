package Sortowanie;
import java.util.Arrays;

public class ArraySorter {

    private SortingStrategy strategy;

    public ArraySorter(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public int[] sort(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        return strategy.sort(copy);

    }

    static public void sortAll(int[] randomArray){
        System.out.println();

        System.out.println("BubbleSort");
        ArraySorter sorter = new ArraySorter(new BubbleSort());
        ArraySorter.measureAndPrint(sorter, randomArray);

        System.out.println("HeapSort");
        sorter.setStrategy(new HeapSort());
        ArraySorter.measureAndPrint(sorter, randomArray);

        System.out.println("QuickSort");
        sorter.setStrategy(new QuickSort());
        ArraySorter.measureAndPrint(sorter, randomArray);

        System.out.println("MergeSort");
        sorter.setStrategy(new MergeSort());
        ArraySorter.measureAndPrint(sorter, randomArray);

//        System.out.println();
//        sorter.setStrategy(new BogoSort());
//        ArraySorter.measureAndPrint(sorter, randomArray);
    }

    static public void measureAndPrint(ArraySorter sorter, int[] array) {
        long tStart = System.currentTimeMillis();
        System.out.println(Arrays.toString(sorter.sort(array)));
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("Czas na sortowanie: " + elapsedSeconds);
    }

    static public void showoff(){
        RandomData generator = new RandomData();

        int[] randomArray = generator.generateRandomArray(10000, 1, 1000);
        System.out.println("Losowa tablica:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        int [] sortedarray = generator.generateSortedArray(10000);
        int [] reversedsortedarray = generator.generateReversedSortedArray(10000);
        System.out.println();


        System.out.println("Sortowanie warunek oczekiwany");
        ArraySorter.sortAll(randomArray);

        System.out.println("Sortowanie warunek pesymistyczny");
        ArraySorter.sortAll(reversedsortedarray);

        System.out.println("Sortowanie warunek optymistyczny");
        ArraySorter.sortAll(sortedarray);
    }

        static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

}
