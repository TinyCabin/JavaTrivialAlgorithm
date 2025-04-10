package Zygzaki;

public class Ciagi{
    public static void printZigZagConcat(String str, int n) {
        if (n == 1) {
            System.out.print(str + "\n");
        }
        String result = "";
        String[] zigZagLines = new String[n];
        for (int i = 0; i < n; i++)
            zigZagLines[i] = "";
        boolean goingDown = false;
        int currentRow = 0;

        for (int i = 0; i < str.length(); i++) {
            if (currentRow >= 0)
                zigZagLines[currentRow] += (str.charAt(i));
            if (currentRow == n - 1) {
                goingDown = false;
            }
            if (currentRow == 0) {
                goingDown = true;
            }
            if (!goingDown)
                currentRow--;
            else
                currentRow++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(zigZagLines[i]);
        }
    }


}
