package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void sumByEvenFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        assertThat(rsl, is(30));
    }

    @Test
    public void sumByEvenFromZeroToTenThenThirty() {
        int rsl = Counter.sumByEven(0, 10);
        assertThat(rsl, is(30));
    }

    @Test
    public void sumByEvenFromThreeToEightThenEighteen() {
        int rsl = Counter.sumByEven(3, 8);
        assertThat(rsl, is(18));
    }

    @Test
    public void sumByEvenFromOneToOneThenOne() {
        int rsl = Counter.sumByEven(1, 1);
        assertThat(rsl, is(0));
    }

    @Test
    public void sumByEvenFromOneToFiveThenSix() {
        int rsl = Counter.sumByEven(1, 5);
        assertThat(rsl, is(6));
    }
}