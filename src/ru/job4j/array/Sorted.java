package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                return false;
            }
        }
        return true;
    }
}
