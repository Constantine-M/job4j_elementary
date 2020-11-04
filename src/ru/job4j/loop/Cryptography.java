package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.equals("")) {
            return "empty"; // вернул сразу
        }
        StringBuilder word = new StringBuilder(s); //нужно было использовать
        for (int i = 0; i < word.length() - 4; i++) {
            if (word.length() <= 4) { //если кол-во символов от 0 до 4, то вернуть то что на входе
                break;
            }
            word.setCharAt(i, '#'); //метод устанавливает новый символ в индекс позиции
        }
        s = word.toString();
        return s;
        }
    }