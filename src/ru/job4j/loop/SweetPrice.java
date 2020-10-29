package ru.job4j.loop;

public class SweetPrice {
    public static void out(int price) {
        int original = price;
        for (int i = 1; i <= 5; i++) {
            price = original * i;
            System.out.println(price);
        }
    }
}
