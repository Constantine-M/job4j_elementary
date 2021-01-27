package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenCompareTwoNumber() {
        Max one = new Max();
        int result = one.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenCompareThreeNum() {
        Max one = new Max();
        int result = one.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenCompareFourNum() {
        Max one = new Max();
        int result = one.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}