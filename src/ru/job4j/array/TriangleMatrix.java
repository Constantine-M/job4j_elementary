package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int element = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1]; //создал первый массив массивов с длиной 1 например
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = element; //записал в ячейку этого массива значение 1
                element++;
            }
        }
        return triangle;
    }
}
