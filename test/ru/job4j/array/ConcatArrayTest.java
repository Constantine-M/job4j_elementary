package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.ConcatArray.combineSize;

public class ConcatArrayTest {

    @Test
    public void whenResultIs8() {
        assertThat(ConcatArray.combineSize(
                new int[] {1, 2, 3, 4},
                new int[] {3, 4, 5, 6}),
                is(8));
    }

    @Test
    public void whenResultIs12() {
        assertThat(ConcatArray.combineSize(
                new int[] {1, 2},
                new int[] {3, 4, 5, 6, 10, 1, 6, 14, 95, 13}),
                is(12));
    }

    @Test
    public void whenResultIs0() {
        assertThat(ConcatArray.combineSize(
                new int[] {},
                new int[] {}),
                is(0));
    }
}