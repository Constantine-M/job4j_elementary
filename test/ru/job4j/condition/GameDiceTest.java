package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameDiceTest {

    @Test
    public void checkGame() {
        int rsl = GameDice.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = GameDice.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }

    @Test
    public void checkGameIs0too() {
        int rsl = GameDice.checkGame(0.1, 99, 10);
        assertThat(rsl, is(0));
    }
}