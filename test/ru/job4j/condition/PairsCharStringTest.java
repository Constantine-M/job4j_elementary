package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PairsCharStringTest {

    @Test
    public void checkTrue() {
        boolean rsl = PairsCharString.check(" ", " ");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkFalse() {
        boolean rsl = PairsCharString.check("booking", "grabbers");
        assertThat(rsl, is(false));
    }

}