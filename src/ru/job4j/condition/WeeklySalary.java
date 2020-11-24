package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int j = 0;
        int rsl = 0;
        int salary[] = new int[hours.length];
        //salary for work week
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8 && hours[i] != 0) {
                salary[j++] = ((hours[i] - 8) * 15) + ((hours[i] - (hours[i] - 8)) * 10);
            } else if (hours[i] != 0 & hours[i] <= 8) {
                salary[j++] = hours[i] * 10;
            } else {
                j++;
            }
        }
        //salary for weekend
        for (int i = 5; i < hours.length; i++) {
            if (hours[i] > 8 && hours[i] != 0) {
                salary[j++] = (((hours[i] - 8) * 15) + ((hours[i] - (hours[i] - 8)) * 10)) * 2;
            } else if (hours[i] != 0 & hours[i] <= 8) {
                salary[j++] = hours[i] * 20;
            } else {
                j++;
            }
        }
        for (int element : salary) {
            rsl += element;
        }
        return rsl;
    }
}
