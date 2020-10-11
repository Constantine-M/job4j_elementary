package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second
                ? (first > third ? first : third)
                : (second > third ? second : third);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 5, 100));
        System.out.println(max(100, 5, 5));
        System.out.println(max(5, 100, 5));
        System.out.println(max(100, 100, 100));
    }
}
