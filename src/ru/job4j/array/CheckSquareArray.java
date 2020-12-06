package ru.job4j.array;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        int standard = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != standard) {
                return false;
            }
        }
        return true;
    }
}
