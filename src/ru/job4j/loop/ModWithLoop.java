package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = d;
        while (rsl + d <= n) {
            rsl += d;
        }
        rsl = n - rsl;
        return rsl;
    }
}
