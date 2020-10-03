package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K0Then0() {
        double p = 5;
        double k = 0;
        double expected = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP3K4Then036() {
        double p = 3;
        double k = 4;
        double expected = 0.36;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}