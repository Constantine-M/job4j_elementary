package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int rsl = Fitness.calc(95, 90);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int rsl = Fitness.calc(90, 95);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int rsl = Fitness.calc(50, 90);
        assertThat(rsl, is(2));
    }
}