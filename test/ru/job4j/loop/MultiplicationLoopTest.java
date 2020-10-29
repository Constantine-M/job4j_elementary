package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {

    @Test
    public void mult() {
        Assert.assertEquals(2, MultiplicationLoop.mult(1, 2));
        Assert.assertEquals(6, MultiplicationLoop.mult(1, 3));
    }
}