package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean rsl = false;
        if (year % 400 == 0) {
            rsl = true;
            } else {
            if (year % 4 == 0 && year % 100 != 0) {
                rsl = true;
            } else {
                rsl = false;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkYear(400));
        System.out.println(checkYear(1700));
        System.out.println(checkYear(2020));
        System.out.println(checkYear(2019));
        System.out.println(checkYear(1800));
        System.out.println(checkYear(2100));
        System.out.println(checkYear(2015));
    }
}
