package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int[][] temp = new int[data.length][data.length];
        //write to temp and replace src column
        for (int i = 0; i < data.length; i++) {
            temp[i][src] = data[i][src];
            data[i][src] = data[i][dst];
        }
        //replace dst column from temp
        for (int i = 0; i < data.length; i++) {
            data[i][dst] = temp[i][src];
        }
    }
}
