package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;


public class PointMTest {

    @Test
    public void when00to20Then2() {
        PointM a = new PointM(0, 0);
        PointM b = new PointM(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to55Then5() {
        PointM a = new PointM(-1, 2);
        PointM b = new PointM(-5, 5);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23To41Then6() {
        PointM a = new PointM(2, -3);
        PointM b = new PointM(-4, -1);
        double expected = 6.32;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}