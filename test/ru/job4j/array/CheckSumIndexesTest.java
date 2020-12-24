package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CheckSumIndexesTest {

    @Test
    public void collectNewArray() {
        int[][] data = {
                {1, 2, 3},
                {5, 4, 3},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 5, 3, 8, 9};
        int[] result = CheckSumIndexes.collectNewArray(data, 2);
        assertArrayEquals(expected, result);
    }
}