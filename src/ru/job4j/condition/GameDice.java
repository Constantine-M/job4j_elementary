package ru.job4j.condition;

public class GameDice {
    public static int checkGame(double percent, int prize, int pay) {
        double result = 0;
        if (percent * prize > pay) {
            result = (percent * prize) - pay;
        } else {
            if ((percent * prize) - pay <= 0) {
               result = 0;
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.1, 90, 9));
        System.out.println(checkGame(0.9, 1, 2));
    }
}
