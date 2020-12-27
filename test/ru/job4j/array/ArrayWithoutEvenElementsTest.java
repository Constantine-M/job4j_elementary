package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayWithoutEvenElementsTest {

    @Test
    public void changeData() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 3, 5};
        int[] result = ArrayWithoutEvenElements.changeData(input);
        assertArrayEquals(expected, result);
    }


    @Test
    public void when5Odds() {
        int[] input = {2, 1, 3, 7, 5, 4, 1};
        int[] expected = {1, 3, 7, 5, 1};
        int[] result = ArrayWithoutEvenElements.changeData(input);
        assertArrayEquals(expected, result);
    }
}