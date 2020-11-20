package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortSelectedTest {

    @Test
    public void whenArrayHas5ElemThenSorted() {
        int[] input = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3ElemThenSorted() {
        int[] input = {10, 7 ,3};
        int[] result = SortSelected.sort(input);
        int[] expect = {3, 7, 10};
        assertThat(result, is(expect));
    }
}