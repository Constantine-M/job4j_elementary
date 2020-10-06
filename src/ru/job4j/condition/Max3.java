package ru.job4j.condition;

public class Max3 {
    public static void compare(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Самое большое число = " + a);
            } else {
                System.out.println("Самое большое число = " + c);
            }
        } else if (b > c) {
            System.out.println("Самое большое число = " + b);
        } else {
            System.out.println("Самое большое число = " + c);
        }
    }

    public static void main(String[] args) {
        Max3.compare(3, 4, -4);
    }
}
