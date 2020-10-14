package ru.job4j.condition;

public class LessThen {
    public static boolean check(int first, int second) {
        return first < second;
    }

    public static void main(String[] args) {
        System.out.println(check(1, 2));
    }
}
