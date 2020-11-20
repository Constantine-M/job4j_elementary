package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.MinDiapason.findMin;

public class MinDiapasonTest {

    @Test
    public void whenRangeAtTheBeginThen1() {
        assertThat(MinDiapason.findMin(new int[] {3, 1, 2, 4, 6, 1, 5, 3, 8, 5, 9, 3}
        , 0, 3)
                , is(1));
    }

    @Test
    public void whenRangeInTheMiddleThen1() {
        assertThat(MinDiapason.findMin(new int[] {3, 1, 2, 4, 6, 1, 5, 3, 8, 5, 9, 3}
                , 4, 7)
                , is(1));
    }

    @Test
    public void whenRangeAtTheEndThen3() {
        assertThat(MinDiapason.findMin(new int[] {3, 1, 2, 4, 6, 1, 5, 3, 8, 5, 9, 3}
                , 8, 11)
                , is(3));
    }
}