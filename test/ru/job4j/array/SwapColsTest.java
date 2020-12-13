package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapColsTest {

    @Test
    public void swap() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expect = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        SwapCols.swap(data, 0, 2);
        assertArrayEquals(expect, data);
    }
}