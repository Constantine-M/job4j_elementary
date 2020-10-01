package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140RblThen2Dlr() {
        double in = 140;
        double expected = 2.33;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert1DlrThen1Eur() {
        double in = 1;
        double expected = 0.85;
        double out = Converter.dollarToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert1DlrThen60Rub() {
        int in = 1;
        int expected = 60;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert1EurThen1Dollar() {
        double in = 1;
        double expected = 1.18;
        double out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert1EurThen70Rub() {
        int in = 1;
        int expected = 70;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
}