package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'E', 'L'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenStartsWithPrefixThenFalse() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'I'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}