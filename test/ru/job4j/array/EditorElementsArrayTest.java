package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class EditorElementsArrayTest {

    @Test
    public void changeDataMineTest() {
        int[][] data = {
                {1, 2},
                {3, 4, 5},
                {6},
                {7, 8, 9, 10}
        };
        int[][] expected = {
                {0, 0},
                {0, 0, 0},
                {1},
                {2, 3, 4, 5}
        };
        int[][] result = EditorElementsArray.changeData(data, 5);
        assertArrayEquals(expected, result);
    }

    @Test
    public void changeDataTest1() {
        int[][] data = {
                {1, 8, 3},
                {2, 4, 11},
                {-10, 6, 5}
        };
        int[][] expected = {
                {0, 5, 0},
                {0, 1, 8},
                {0, 3, 2}
        };
        int[][] result = EditorElementsArray.changeData(data, 3);
        assertArrayEquals(expected, result);
    }
}