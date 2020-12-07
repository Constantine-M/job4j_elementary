package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int element = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < element; j++) {
                triangle[i][j] = i + j + 1;
            }
        }
        return triangle;
    }
}
