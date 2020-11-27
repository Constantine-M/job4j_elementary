package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.Matrix.multiple;

public class MatrixTest {

    @Test
    public void whenTwoOnTwo() {
        int[][] expect = {
                {0, 1, 2, 3},
                {1, 1, 2, 3},
                {2, 2, 4, 6},
                {3, 3, 6, 9}
        };
        assertThat(Matrix.multiple(3), is(expect));
    }
}