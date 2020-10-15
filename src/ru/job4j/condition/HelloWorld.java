package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        return number % 3 == 0 && number % 5 == 0
                ? "Hello, World!!!"
                : number % 3 == 0
                ? "Hello"
                : number % 5 == 0
                ? "World"
                : "Operation not support";
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(1));
        System.out.println(checkNumber(3));
        System.out.println(checkNumber(5));
        System.out.println(checkNumber(15));
    }
}
