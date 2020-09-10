package ru.job4j.condition;

import java.text.DecimalFormat;

public class SqArea {
    public static double square(int p,int k) {
        double height = p/(2 * (k + 1));
        double lengh = height * k;
        double rsl = lengh * height;
        return rsl;
    }

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result = SqArea.square(6,2);
        String result1 = decimalFormat.format(result);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result1);
    }
}
