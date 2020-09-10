package ru.job4j.condition;

import java.lang.Math;
import java.text.DecimalFormat;

public class PointM {
    public static double distance(int x1,int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
        return rsl;
    }

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result = PointM.distance(0,0,2,0);
        String resultm = decimalFormat.format(result);
        System.out.println("result (0,0) to (2,0) " + resultm);
        double result1 = Point.distance(-1,2,-5,5);
        String result1m = decimalFormat.format(result1);
        System.out.println("result1 (-1,2) to (-5,5) " + result1m);
        double result2 = Point.distance(2,-3,-4,-1);
        String result2m = decimalFormat.format(result2);
        System.out.println("result2 (2,-3) to (-4,-1) " + result2m);
    }
}
