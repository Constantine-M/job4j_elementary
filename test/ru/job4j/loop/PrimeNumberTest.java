package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {

    @Test
    public void calcWhen5() {
       int rsl = PrimeNumber.calc(5);
       assertThat(rsl, is(3));
    }

    @Test
    public void calcWhen11() {
        int rsl = PrimeNumber.calc(11);
        assertThat(rsl, is(5));
    }

    @Test
    public void calcWhen2() {
        int rsl = PrimeNumber.calc(2);
        assertThat(rsl, is(1));
    }

    @Test
    public void calcWhen21() {
        int rsl = PrimeNumber.calc(21);
        assertThat(rsl, is(8));
    }
}