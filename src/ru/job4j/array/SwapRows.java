package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        //Thank you, Yandex
        int[] temp = data[src];
        data[src] = data[dst];
        data[dst] = temp;
    }
}
