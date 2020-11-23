package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int i = 0;
        int rsl = 0;
        int salary[] = new int[hours.length];
        //salary for work week
        for (int index = 0; index < hours.length; index++) {
            if (hours[index] > 8 & hours[index] != 0) {
                salary[i++] = hours[index - 8] * 15 + hours[index - (index - 8)] * 10;
            } else if (hours[index] != 0 & hours[index] <= 8) {
                salary[i++] = hours[index - (index - 8)] * 10;
            }
        }
        for (int element : salary) {
            rsl += element;
        }
        //salary for weekend
        //for (int index = 5; index < hours.length - 1; index++) {
        //    if (hours[index])
        //}
        return rsl;
    }
}
