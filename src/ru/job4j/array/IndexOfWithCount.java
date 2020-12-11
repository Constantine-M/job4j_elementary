package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, int number, char c) {
        int count = 0;
        int index = 0;
            for (int i = index; i < string.length; i++) {
                if (string[i] == c && count <= number) {
                    count++;
                    if (count == number) {
                        return i;
                    }
                }
            }
        return -1;
    }
}
