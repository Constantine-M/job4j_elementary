package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length;
        }
        int n = 2;
        int m = 2;
        while (sum > n * m) {
            n++;
            m++;
        }
        int[][] result = new int[n][m];
        int[] temp = new int[sum];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[a] = array[i][j];
                a++;
            }
        }
        a = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (a < temp.length) {
                    result[i][j] = temp[a];
                    a++;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}