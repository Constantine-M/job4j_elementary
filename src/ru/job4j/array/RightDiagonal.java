package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data.length];
        int j = data.length - 1;
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            rsl[i] = data[i][j - k];
            k++;
        }
        return rsl;
    }
}
