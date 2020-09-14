package ru.job4j.converter;

public class ConverterTest {
    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
        }

    public static double dollarToEuro(double value) {
        double rsl = value / 0.85;
        return rsl;
        }

    public static void main(String[] args) {
        double dollar = Converter.rubleToDollar(140);
        System.out.println(dollar);
        double dollareu = Converter.dollarToEuro(1);
        System.out.println(dollareu);
    }
}
