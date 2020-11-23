package ru.job4j.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        if (array[0] > array[array.length - 1]) {
            return array[0];
        }
        return array[array.length - 1];
    }
}
