package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSumTest {

    @Test
    public void sum() {
        assertEquals(4, SecondSum.sum(1, 3));
        assertEquals(1, SecondSum.sum(1, 2));
        assertEquals(4, SecondSum.sum(1, 4));
        assertEquals(12, SecondSum.sum(0, 6));
    }
}