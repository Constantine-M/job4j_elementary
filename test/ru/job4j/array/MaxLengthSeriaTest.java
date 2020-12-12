package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.job4j.array.MaxLengthSeria.find;

public class MaxLengthSeriaTest {

    @Test
    public void whenSeqLength4() {
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 1, 1, 2, 3}));
    }

    @Test
    public void whenSeqLength1() {
        assertEquals(1, MaxLengthSeria.find(new int[] {1}));
    }

    @Test
    public void whenSequenceLength4() {
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3}));
    }

    @Test
    public void whenSequenceLength1() {
        assertEquals(1, MaxLengthSeria.find(new int[] {3, 2, 1}));
    }

    @Test
    public void whenSeqLengthIs1() {
        assertEquals(2, MaxLengthSeria.find(new int[] {1, 2}));
    }
}