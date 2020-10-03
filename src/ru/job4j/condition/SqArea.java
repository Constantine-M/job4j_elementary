package ru.job4j.condition;

import java.text.DecimalFormat;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        double rsl = length * height;
        return rsl;
    }

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result = SqArea.square(4, 1);
        String result1 = decimalFormat.format(result);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
