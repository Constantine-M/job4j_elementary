package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModWithLoopTest {

    @Test
    public void mod() {
        Assert.assertEquals(2, ModWithLoop.mod(8, 3));
        Assert.assertEquals(1, ModWithLoop.mod(3, 2));
        Assert.assertEquals(0, ModWithLoop.mod(4, 2));
    }
}