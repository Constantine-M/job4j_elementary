package ru.job4j.condition;

public class Delenie {
    public static void main(String[] args) {
        double p = 3.0;
        double k = 4.0;
        double height = p / (2 * (k + 1));
        double length = height * k;
        double rsl = length * height;
        System.out.println(rsl);
    }
}
