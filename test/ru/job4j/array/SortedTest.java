package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.Sorted.isSorted;

public class SortedTest {

    @Test
    public void whenArraySorted() {
        assertThat(Sorted.isSorted(
                new int[] {1, 2, 3, 4, 5})
                , is(true));
    }

    @Test
    public void whenArrayNotSorted() {
        assertThat(Sorted.isSorted(
                new int[] {1, 2, 3, 5, 4})
                , is(false));
    }
}