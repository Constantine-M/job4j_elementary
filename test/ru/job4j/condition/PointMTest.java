package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.hamcrest.Matchers.closeTo;


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

    /**Сначала считал в онлайн калькуляторе, а потом тут.
     * Все сошлось. Тест написан верно.
     */
    @Test
    public void when251To410() {
        PointM a = new PointM(2, 5, 1);
        PointM b = new PointM(-4, -1, 0);
        DecimalFormat decimal = new DecimalFormat("#.###");
        double expected = 8.5;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.5);
    }
}