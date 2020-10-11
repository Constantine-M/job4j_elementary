package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }

    @Test
    public void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double expected = 1;
        double out = SqArea.square(4, 1);
        assertThat(out, is(expected));
    }

    @Test
    public void whenP5K0Then0() {
        double p = 5;
        double k = 0;
        double expected = 0;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }

    @Test
    public void whenP3K4Then036() {
        double p = 3;
        double k = 4;
        double expected = 0.36;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }
}