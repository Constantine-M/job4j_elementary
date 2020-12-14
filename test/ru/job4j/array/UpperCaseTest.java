package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void whenFirstIsLowCase() {
        char[] input = {'a', '-', '1', '2', '3', '-', 'B'};
        char[] expected = {'A', '-', '1', '2', '3', '-', 'B'};
        assertArrayEquals(expected, UpperCase.toUpperCase(input));
    }

    @Test
    public void whenAlphaIsLowerCase() {
        char[] input = "alpha-123".toCharArray();
        char[] expected = "ALPHA-123".toCharArray();
        assertArrayEquals(expected, UpperCase.toUpperCase(input));
    }
}