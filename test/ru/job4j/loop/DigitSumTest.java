package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitSumTest {

    @Test
    public void sum() {
        Assert.assertEquals(3, DigitSum.sum(12));
        Assert.assertEquals(1, DigitSum.sum(1));
        Assert.assertEquals(6, DigitSum.sum(123));
        Assert.assertEquals(10, DigitSum.sum(1234));
        Assert.assertEquals(15, DigitSum.sum(12345));
    }
}