package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String action = "none";
        if (left * right == rsl) {
            action = "multiplied";
       }
        if (left + right == rsl) {
            action = "added";
        }
        if (left - right == rsl) {
            action = "subtracted";
        }
        if (left / right == rsl) {
            action = "divided";
        }
        return action;
    }

    public static void main(String[] args) {
        System.out.println(selectAction(100, 200, 300));
        System.out.println(selectAction(15, 3, 5));
        System.out.println(selectAction(10, 5, 5));
        System.out.println(selectAction(5, 5, 25));
        System.out.println(selectAction(2, 2, 3));
    }
}
