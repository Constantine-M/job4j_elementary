package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.WeeklySalary.calculate;

public class WeeklySalaryTest {

    @Test
    public void whenWork5Days() {
        assertThat(WeeklySalary.calculate(
                new int[] {8, 8, 9, 10, 8}),
                is(445));
    }

    @Test
    public void whenWorkOnlyWeekend() {
        assertThat(WeeklySalary.calculate(
                new int[] {0, 0, 0, 0, 0, 9, 8}),
                is(350));
    }

    @Test
    public void whenWorkOnlyWeekdays() {
        assertThat(WeeklySalary.calculate(
                new int[] {8, 8, 8, 8, 8, 0, 0}),
                is(400));
    }

    @Test
    public void whenWorkWeekdaysAndWeekend() {
        assertThat(WeeklySalary.calculate(
                new int[] {10, 0, 12, 0, 8, 12, 4}),
                is(690));
    }
}