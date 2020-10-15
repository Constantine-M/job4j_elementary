package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl = 0;
        if (count >= n) {
            rsl = count + count / n;
        } else {
            rsl = count;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(countCup(7, 6));
        System.out.println(countCup(5, 6));
        System.out.println(countCup(6, 6));
        System.out.println(countCup(248, 6));
    }
}
