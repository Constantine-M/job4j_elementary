package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import  static ru.job4j.array.MaxFirstOrLastElement.getMaxValue;

public class MaxFirstOrLastElementTest {

    @Test
    public void whenMaxValueLast() {
        assertThat(MaxFirstOrLastElement.getMaxValue(
                new int[] {1, 2, 3, 4, 5}),
                is(5));
    }

    @Test
    public void whenMaxValueFirst() {
        assertThat(MaxFirstOrLastElement.getMaxValue(
                new int[] {5, 4, 3, 2, 1}),
                is(5));
    }
}