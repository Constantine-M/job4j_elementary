package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;
import static ru.job4j.array.IndexOfWithCount.indexOf;

public class IndexOfWithCountTest {

    @Test
    public void whenByNumber() {
        assertEquals(5,
                IndexOfWithCount.indexOf(new char[]
                        {'a', 'b', 'c', 'd', 'e', 'c'},
                        2, 'c'));
    }

    @Test
    public void whenNotContain() {
        assertEquals(-1,
                IndexOfWithCount.indexOf(new char[]
                                {'a', 'b', 'c'},
                        1, 'd'));
    }

    @Test
    public void whenOrdinary() {
        assertEquals(3,
                IndexOfWithCount.indexOf(new char[]
                                {'a', 'b', 'c', 'd'},
                        1, 'd'));
    }
}