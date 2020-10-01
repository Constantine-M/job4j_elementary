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
        double rsl = value * 0.85;
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
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        double in1 = 140;
        double expected1 = 2.3333333333333335;
        double out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2.3333333333333335. Test result: " + passed1);
        double in2 = 1;
        double expected2 = 0.85;
        double out2 = Converter.dollarToEuro(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("1 dollar costs 0.85. Test result: " + passed2);
        int in3 = 1;
        int expected3 = 60;
        int out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("1 dollar costs 60. Test result: " + passed3);
        double in4 = 1;
        double expected4 = 1.18;
        double out4 = Converter.euroToDollar(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("1 euro costs 1.18. Test result: " + passed4);
        int in5 = 1;
        int expected5 = 70;
        int out5 = Converter.euroToRuble(in5);
        boolean passed5 = expected5 == out5;
        System.out.println("1 euro costs 70. Test result: " + passed5);
    }
}
