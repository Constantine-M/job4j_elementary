package ru.job4j.calculator;

public class CalculatorM {

    public static void plus (int first, int second) {
        int result = first  + second;
        System.out.println(result);
    }
    public static void main (String[] args) {
        CalculatorM.plus (100,500);
        CalculatorM.plus (4,2);
        CalculatorM.plus(3,5);
    }
}
