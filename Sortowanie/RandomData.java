package Sortowanie;

import java.util.Random;

public class RandomData {
    private Random random;

    public RandomData() {
        this.random = new Random();
    }

    public int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    public int[] generateSortedArray(int size){
        int [] sortedarray = new int[size];
        for( int i =0; i < size; i++){
            sortedarray[i] = i;
        }
        return sortedarray;
    }

    public int[] generateReversedSortedArray(int size) {
        int[] reversedSortedArray = new int[size];
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            reversedSortedArray[i] = j;
        }
        return reversedSortedArray;
    }


    public int generateRandomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public double generateRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

}
