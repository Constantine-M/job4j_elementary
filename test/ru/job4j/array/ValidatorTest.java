package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidatorTest {

    @Test
    public void whenArrayIsValid() {
        int[] input = {1, 2, 3, 1, 4, 1, 5, 6, 7, 1, 8, 9};
        assertThat(Validator.checkArray(input, 1), is(true));
    }

    @Test
    public void whenArrayIsNOTValid() {
        int[] input = {1, 2, 1, 3, 1, 4, 1};
        assertThat(Validator.checkArray(input, 1), is(false));
    }
}