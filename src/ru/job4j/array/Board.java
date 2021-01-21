package ru.job4j.array;

public class Board {
    public static int getCountRow(int[][] array) {
        return array.length;
    }
    /*посмотреть кол-во элементов в ряду*/
    public static int getCountInRow(int[][] array, int row) {
        return array[row].length;
    }
}
