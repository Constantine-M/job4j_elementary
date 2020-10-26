package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        // где amount - сумма выданная по кредиту;
        //     salary - годовой доход;
        //     percent - процентная ставка по кредиту;
        int year = 0;
        double balance = (amount + (amount * percent * 0.01));
        while (balance >= 0) {
            balance = balance - salary;
            balance = balance * percent * 0.01 + balance;
            year++;
        }
        return year;
    }
}
