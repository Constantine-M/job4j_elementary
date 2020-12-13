package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RightDiagonalTest {

    @Test
    public void whenArray2x2() {
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        int[] expected = {2, 3};
        int[] out = RightDiagonal.diagonal(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void whenArray3x3() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {3, 5, 7};
        int[] out = RightDiagonal.diagonal(input);
        assertArrayEquals(expected, out);
    }
}