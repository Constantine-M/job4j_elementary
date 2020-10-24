package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int i = 1;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            if (n < 0) {
                System.out.println("Error");
            } else {
                result = 1;
                for (i = 1; i <= n; i++) {
                    result = result * i;
                }
            }
        }
        return result;
    }
}
