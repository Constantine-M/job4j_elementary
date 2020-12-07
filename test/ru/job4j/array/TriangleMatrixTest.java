package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TriangleMatrixTest {

    @Test
    public void whenRows2() {
        int[][] expect = {
                {1},
                {2, 3}
        };
        assertThat(TriangleMatrix.rows(2), is(expect));
    }
}