package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumWithStopElTest {

    @Test
    public void countEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = SumWithStopEl.count(data, 5);
        assertEquals(10, result);
    }

    @Test
    public void countNotEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = SumWithStopEl.count(data, 7);
        assertEquals(0, result);
    }

    @Test
    public void countNotEven1() {
        int[] data = {1, 2, 3};
        int result = SumWithStopEl.count(data, 5);
        assertEquals(6, result);
    }
}