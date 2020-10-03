package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointMTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = PointM.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to55Then5() {
        int x1 = -1;
        int y1 = 2;
        int x2 = -5;
        int y2 = 5;
        int expected = 5;
        double out = PointM.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to41Then6() {
        int x1 = 2;
        int y1 = -3;
        int x2 = -4;
        int y2 = -1;
        double expected = 6.32;
        double out = PointM.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}