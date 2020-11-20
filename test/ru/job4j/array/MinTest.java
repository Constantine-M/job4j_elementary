package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.Min.findMin;

public class MinTest {

    @Test
    public void whenMinIsLast() {
        assertThat(Min.findMin(
                new int[] {5, 5, 3, 6, 2, 4, 1}), is(1));
    }

    @Test
    public void whenMinIsFirst() {
        assertThat(Min.findMin(
                new int[] {5, 15, 13, 16, 12, 14, 11}), is(5));
    }

    @Test
    public void whenMinIsMiddle() {
        assertThat(Min.findMin(
                new int[] {5, 5, 3, 1, 2, 4, 7}), is(1));
    }
}