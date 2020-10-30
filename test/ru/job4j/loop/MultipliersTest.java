package ru.job4j.loop;

import org.junit.Test;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultipliersTest {

    @Test
    public void when2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(2);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln +
                        "2" + ln
        ));
    }
}