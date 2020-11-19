package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.EndsWith.endsWith;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] post = {'L', 'O'};
        assertThat(endsWith(word, post), is(true));
    }

    @Test
    public void whenEndsWithPrefixThenTrue() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] post = {'E', 'L', 'L', 'O'};
        assertThat(endsWith(word, post), is(true));
    }

    @Test
    public void whenEndsWithPrefixThenFalse() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] post = {'E', 'L', 'L', 'A'};
        assertThat(endsWith(word, post), is(false));
    }

}