package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeRowsTest {

    @Test
    public void whenArray2x2ThenMerge() {
        int[][] data = {
                {1, 2},
                {3, 4}
        };
        int[] expected = {1, 2, 3, 4};
        int[] out = MergeRows.merge(data);
        assertArrayEquals(expected, out);
    }

    @Test
    public void whenArray3x3ThenMerge() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = MergeRows.merge(data);
        assertArrayEquals(expected, out);
    }
}