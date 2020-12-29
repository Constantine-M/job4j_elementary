package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void whenArrayIsFibonacci() {
        int[] data = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        boolean result = Fibonacci.checkArray(data);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayIsNotFibonacci() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = Fibonacci.checkArray(data);
        assertThat(result, is(false));
    }
}