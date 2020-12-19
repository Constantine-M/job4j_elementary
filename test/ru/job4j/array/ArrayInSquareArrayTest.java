package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayInSquareArrayTest {

    @Test
    public void convertArray() {
        int[] input = {1, 2};
        int[][] expected = {{1, 2}, {0, 0}};
        int[][] result = ArrayInSquareArray.convertArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void convertArray7Elements() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        int[][] result = ArrayInSquareArray.convertArray(input);
        assertArrayEquals(expected, result);
    }
}