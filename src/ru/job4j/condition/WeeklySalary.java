package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int j = 0;
        int rsl = 0;
        int salary[] = new int[hours.length];
        //salary for work week
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8 && hours[i] != 0) { //OutOfBounds
                salary[j++] = hours[i] - 8 * 15 + hours[i - (i - 8)] * 10;
            } else if (hours[i] != 0 & hours[i] <= 8) {
                salary[j++] = hours[i - (i - 8)] * 10;
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
