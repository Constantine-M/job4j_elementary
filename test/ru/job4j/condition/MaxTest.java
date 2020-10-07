package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFisrtmaxToSecondminThenFirst() {
        int result = Max.max(99, 1);
        assertThat(result, is(99));
    }

    @Test
    public void whenSecondmaxToFirstminThenSecond() {
        int result = Max.max(1, 99);
        assertThat(result, is(99));
    }

    @Test
    public void whenFirstEqualToSecondThenAny() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }
}