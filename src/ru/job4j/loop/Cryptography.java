package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.equals("")) {
            return "empty";
        }
        StringBuilder word = new StringBuilder(s);
        if (word.length() > 4) {
            for (int i = 0; i < word.length() - 4; i++) {
                word.setCharAt(i, '#');
            }
        }
        return word.toString();
        }
    }