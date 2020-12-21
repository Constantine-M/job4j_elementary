package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int match = 0;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                match++;
            }
        }
        if (match < data.length / 2) {
            return true;
        }
        return false;
    }
}
