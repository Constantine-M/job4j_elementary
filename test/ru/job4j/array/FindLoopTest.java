package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.array.FindLoop.indexOfMod;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then4() {
        int input[] = {5, 1, 2, 3, 4};
        int value = 4;
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas0ThenError() {
        int input[] = {10, 13, 12, 4};
        int value = 0;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Then0mod() {
        int data[] = {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int expect = 3;
        assertThat(FindLoop.indexOfMod(data, el, start, finish), is(expect));
    }

    @Test
    public void whenNotFind1() {
        int data[] = {3, 6, 5, 2, 5, 7, 9};
        int el = 1;
        int start = 2;
        int finish = 5;
        int expect = -1;
        assertThat(FindLoop.indexOfMod(data, el, start, finish), is(expect));
    }
}