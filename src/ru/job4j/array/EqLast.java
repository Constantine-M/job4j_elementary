package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int index = left.length - 1; index >= 0; index--) {
            if (left[left.length - 1] == right[right.length - 1]) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
