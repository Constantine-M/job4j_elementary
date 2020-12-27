package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                count++;
            }
        }
        int[] odd = new int[count];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                odd[j] = data[i];
                j++;
            } else continue;
        }
        return odd;
    }
}
