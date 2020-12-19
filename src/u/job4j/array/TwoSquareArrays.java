package u.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * 3];
        int n = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                if (left[i][j] <= right[i][j]) {
                    result[n] = right[i][j];
                } else {
                    result[n] = left[i][j];
                }
                n++;
            }
        }
        return result;
    }
}
