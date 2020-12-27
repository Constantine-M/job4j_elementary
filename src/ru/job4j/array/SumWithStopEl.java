package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        int i = 0;
        while (i < data.length && data[i] != el) {
            sum += data[i];
            i++;
        }
        if (sum % 2 == 0) {
            return sum;
        }
        return 0;
    }
}
