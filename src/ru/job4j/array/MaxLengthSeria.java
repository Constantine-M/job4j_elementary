package ru.job4j.array;
import java.lang.Math;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int[] counters = new int[array.length];
        int count = 1;
        /*index for counters*/
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                count++;
            } else {
                counters[j] = count;
                count = 1;
                j++;
            }
        }
        counters[j] = count;
        /*max length seria*/
        int max = counters[0];
        for (int i = 0; i < counters.length; i++) {
            max = Math.max(max, counters[i]);
        }
        return max;
    }
}
