package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (; a <= b; a += 2) {
            sum += a;
        }
        return sum;
    }
}
