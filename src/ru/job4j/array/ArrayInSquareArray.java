package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int n = 2; /*rows*/
        int m = 2; /*column*/
        int a = 0;
        while (array.length > n * m) {
            n++;
            m++;
        }
        int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (a < array.length) {
                    result[i][j] = array[a];
                    a++;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}