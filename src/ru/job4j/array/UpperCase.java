package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i]) && Character.isLowerCase(string[i])) {
                rsl[i] = Character.toUpperCase(string[i]);
            } else {
                rsl[i] = string[i];
            }
        }
        return rsl;
    }
}
