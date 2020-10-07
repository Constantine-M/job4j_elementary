package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        Boolean com = left > right;
        int result = com ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rsl = Max.max(3, 3);
        System.out.println(rsl);
    }
}
