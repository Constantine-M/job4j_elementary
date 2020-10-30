package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = n;
        while (rsl >= 0) {
            rsl -= d;
        }
        rsl = rsl + d;
        return rsl;
    }
}
