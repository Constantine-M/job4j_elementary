package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        for (int i = 0; i <= left.length() - 1; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                rsl += 1;
            }
        }
        return rsl;
    }
}
