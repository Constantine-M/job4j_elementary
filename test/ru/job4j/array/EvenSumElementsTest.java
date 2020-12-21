package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class EvenSumElementsTest {

    @Test
    public void checkArray() {
        int[] data = {1, 2, 3, 4, 5};
        assertThat(EvenSumElements.checkArray(data), is(false));
    }

    @Test
    public void whenSumElIsEven() {
        int[] data = {2, 2, 3, 4, 5};
        assertThat(EvenSumElements.checkArray(data), is(true));
    }
}