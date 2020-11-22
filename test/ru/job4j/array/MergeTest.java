package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.Merge.merge;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        assertThat(Merge.merge(
                new int[0],
                new int[0]), is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        assertThat(Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}), is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        assertThat(Merge.merge(
                new int[] {1, 2,},
                new int[] {3, 4}), is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 3, 4};
        assertThat(Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}), is(expect));
    }

    @Test
    public void whenRightGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        assertThat(Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}), is(expect));
    }

    @Test
    public void whenLeftIsEmpty() {
        int[] expect = {1, 2, 3, 4};
        assertThat(Merge.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}), is(expect));
    }
}