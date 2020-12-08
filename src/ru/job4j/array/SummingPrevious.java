package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        int sum = a + b;
        int count = 1;
        if (n > 2) {
            for (int i = 2; i < result.length; i++) {
                result[i] = sum * count;
                count = count * 2;
            }
        }
        return result;
    }
}
