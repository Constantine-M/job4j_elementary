package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String num = Integer.toString(i);
        for (int j = 0; j < num.length() / 2; j++) {
            if (num.charAt(j) == num.charAt((num.length() - j - 1))) {
            } else {
                return false;
            }
        }
        return true;
    }
}
