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
}