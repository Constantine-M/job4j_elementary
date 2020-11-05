package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AbbreviationTest {

    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl, is("NATO"));
    }
}