package u.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSquareArraysTest {

    @Test
    public void test1() {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        int[] expected = {2, 10, 92, 82, 32, 40, 8, 27, 35};
        int[] result = TwoSquareArrays.collectArray(left, right);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testMyNumbers() {
        int[][] left = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] right = {{1, 3, 5}, {3, 4, 7}, {8, 9, 2}};
        int[] expected = {1, 3, 5, 4, 5, 7, 8, 9, 9};
        int[] result = TwoSquareArrays.collectArray(left, right);
        Assert.assertArrayEquals(expected, result);
    }
}