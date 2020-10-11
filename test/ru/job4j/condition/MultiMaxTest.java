package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenMaxFirstThen100() {
       int result = MultiMax.max(100, 5, 5);
        Assert.assertThat(result, is(100));
    }

    @Test
    public void whenSecondMaxThen100() {
        int result = MultiMax.max(5, 100, 5);
        Assert.assertThat(result, is(100));
    }

    @Test
    public void whenThirdMaxThen100() {
        int result = MultiMax.max(5, 5, 100);
        Assert.assertThat(result, is(100));
    }

    @Test
    public void whenAllEqualThen100() {
        int result = MultiMax.max(100, 100, 100);
        Assert.assertThat(result, is(100));
    }
}