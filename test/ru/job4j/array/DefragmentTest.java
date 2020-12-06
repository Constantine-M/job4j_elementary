package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.Defragment.compress;

public class DefragmentTest {

    @Test
    public void whenSingleFirstNull() {
        String[] input = {null, "I"};
        String[] expect = {"I", null};
        String[] compressed = Defragment.compress(input);
        assertThat(compressed, is(expect));
    }

    @Test
    public void whenNotFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        String[] compressed = Defragment.compress(input);
        assertThat(compressed, is(expect));
    }

    @Test
    public void whenFirstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        String[] compressed = Defragment.compress(input);
        assertThat(compressed, is(expect));
    }

    @Test
    public void whenNotAllNull() {
        String[] input = {null, null, null};
        String[] expect = {null, null, null};
        String[] compressed = Defragment.compress(input);
        assertThat(compressed, is(expect));
    }

    @Test
    public void whenNotAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        String[] compressed = Defragment.compress(input);
        assertThat(compressed, is(expect));
    }

}