package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void calcFactorialForFiveThenOneHundredAndTwenty() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
    }

    @Test
    public void calcFactorialForOneThenOne() {
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(1));
    }

    @Test
    public void calcFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
    }

    @Test
    public void calcFactorialForTenThen3628800() {
        int rsl = Factorial.calc(10);
        assertThat(rsl, is(3628800));
    }

    @Test
    public void calcFactorialForMinusFiveThenZero() {
        int rsl = Factorial.calc(-5);
        assertThat(rsl, is(0));
    }
}