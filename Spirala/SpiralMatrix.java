package Spirala;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public void printSpiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // W lewo
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // W górę
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;

            // W prawo
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            // W dół
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
        }
    }


    public static void show() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int[][] matrix = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        System.out.println("Elementy macierzy w spirali (przeciwnie do ruchu wskazówek zegara):");
        spiralMatrix.printSpiralOrder(matrix);


    }


}
