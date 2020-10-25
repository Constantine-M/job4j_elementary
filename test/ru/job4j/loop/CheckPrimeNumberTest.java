package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void checkWhenFive() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void checkWhenFour() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkWhenOne() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkWhen14() {
        boolean rsl = CheckPrimeNumber.check(14);
        assertThat(rsl, is(false));
    }
}