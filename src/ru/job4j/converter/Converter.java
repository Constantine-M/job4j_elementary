package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }

    public static double dollarToEuro(double value) {
        double rsl = value / 0.85;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static double euroToDollar(double value) {
        double rsl = value * 1.18;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return  rsl;
    }

    public static void  main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(140);
        String dollarmod = String.format("%.2f", dollar);
        System.out.println("140 rubles are " + dollarmod + " dollar.");
        double dollareu = Converter.dollarToEuro(1);
        String dollareumod = String.format("%.2f", dollareu);
        System.out.println("1 dollar costs " + dollareumod + " euro.");
        int dollarru = Converter.dollarToRuble(1);
        System.out.println("1 dollar costs " + dollarru + " rubles.");
        double eurodoll = Converter.euroToDollar(1);
        System.out.println("1 euro costs " + eurodoll + " dollars.");
        int eurorub = Converter.euroToRuble(1);
        System.out.println("1 euro costs " + eurorub + " rubles.");
    }
}
