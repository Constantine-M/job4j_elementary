package ru.job4j.array;


public class Merge {
    public static int[] merge(int[] left, int[] right) {
        /*объявил нов массив, равный сумме длин 2 других массивов*/
        int[] rsl = new int[left.length + right.length];
        /*index counters for left/right/rsl massive*/
        int i = 0, j = 0, k = 0;

        /*take elements from left and right arrays*/
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[k++] = left[i++];
            } else {
                rsl[k++] = right[j++];
            }
        }
        /*take remains elements from left array*/
        while (i < left.length) {
            rsl[k++] = left[i++];
        }
        /*take remains elements from right array*/
        while (j < right.length) {
            rsl[k++] = right[j++];
        }
        return rsl;
    }
}
