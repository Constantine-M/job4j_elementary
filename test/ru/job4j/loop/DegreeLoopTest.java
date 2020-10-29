package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeLoopTest {

    @Test
    public void calculate() {
        Assert.assertEquals(25, DegreeLoop.calculate(5, 2));
        Assert.assertEquals(8, DegreeLoop.calculate(2, 3));
    }
}