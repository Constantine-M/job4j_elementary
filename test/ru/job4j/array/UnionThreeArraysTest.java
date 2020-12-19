package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UnionThreeArraysTest {

    @Test
    public void union() {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {2, 3, 6, 9, 7};
        int[] right = {3, 5, 6, 8, 4, 1};
        int[] rsl = UnionThreeArrays.union(left, middle, right);
        int[] expected = {1, 3, 3, 6, 9, 4, 5};
        assertThat(rsl, is(expected));
    }

    @Test
    public void unionReturnArrayWith5Elements() {
        int[] left = {1, 2, 3};
        int[] middle = {4, 5, 6};
        int[] right = {7, 8, 9, 10};
        int[] rsl = UnionThreeArrays.union(left, middle, right);
        int[] expected = {1, 7, 5, 9, 3};
        assertThat(rsl, is(expected));
    }
}