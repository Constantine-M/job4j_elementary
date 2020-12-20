package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConverterTest {

    @Test
    public void convertInSquareArray() {
        int[][] input = {
                {1},
                {2, 3, 4}
        };
        int[][] expected = {
                {1, 2},
                {3, 4}
        };
        int[][] result = Converter.convertInSquareArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void convertInSquareArrayWith0() {
        int[][] input = {
                {1},
                {2, 3, 4},
                {5, 6},
                {7, 8, 9, 10, 11}
        };
        int[][] expected = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 0},
                {0, 0, 0, 0}
        };
        int[][] result = Converter.convertInSquareArray(input);
        assertArrayEquals(expected, result);
    }
}