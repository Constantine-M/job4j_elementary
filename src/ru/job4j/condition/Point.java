package ru.job4j.condition;

import java.lang.Math;
import java.text.DecimalFormat;

public class Point {
    public static double distance(int x1,int y1, int x2, int y2) {
        double first = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(first,2);
        double four = Math.pow(two,2);
        double five = three + four;
        double rsl = Math.sqrt(five);
        return rsl;
    }

    public static void  main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result = Point.distance(0,0,2,0);
        System.out.println("result (0,0) to (2,0) " + result);
        double result1 = Point.distance(-1,2,-5,5);
        System.out.println("result1 (-1,2) to (-5,5) " + result1);
        double result2 = Point.distance(2,-3,-4,-1);
        String result2mod = decimalFormat.format(result2);
        System.out.println("result2 (2,-3) to (-4,-1) " + result2mod);
    }
}
