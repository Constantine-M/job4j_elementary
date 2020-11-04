package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder word = new StringBuilder(s);
        if (s.equals("")) {
            return "Empty";
        }
        for (int i = 0; i < word.length() - 4; i++) {
            if (word.length() <= 4) {
                break;
            }
            word.setCharAt(i, '#');
        }
        s = word.toString();
        return s;
        }
    }
