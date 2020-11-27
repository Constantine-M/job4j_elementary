package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size + 1][size + 1];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i > 0 && j > 0) {
                    table[i][j] = i * j;
                } else {
                    table[i][j] = table[i][j];
                }
            }
        }
        return table;
    }
}
