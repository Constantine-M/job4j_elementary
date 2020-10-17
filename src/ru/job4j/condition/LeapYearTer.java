package ru.job4j.condition;

public class LeapYearTer {
    public static boolean checkYear(int year) {
        return year % 400 == 0
                ? true
                : year % 4 == 0 && year % 100 != 0 ? true : false;
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
