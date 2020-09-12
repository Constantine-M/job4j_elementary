package ru.job4j.condition;

import java.lang.Math;
import java.text.DecimalFormat;

public class TrgArea {
    public static double area(double a,double b,double c) {
        double p = (a + b + c)/2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return  rsl;
    }

    public static void  main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double rsl = TrgArea.area(2,2,2);
        String rslmod = decimalFormat.format(rsl);
        System.out.println("area (2, 2, 2) = " + rslmod);
    }
}
