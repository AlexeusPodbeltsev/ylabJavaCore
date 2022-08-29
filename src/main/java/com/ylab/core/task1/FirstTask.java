package com.ylab.core.task1;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        fill(array);
        System.out.println(Arrays.deepToString(array));
        System.out.printf("Min: %d\n", min(array));
        System.out.printf("Avg: %d\n", avg(array));
        System.out.printf("Max: %d\n", max(array));
    }

    public static void fill(int[][] arr) {
        int startNum = (int) (System.currentTimeMillis() % 10);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (3 * startNum + 1) % 29;    // linear random generator
                startNum = arr[i][j];
            }
        }
    }

    public static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] innerArr : arr) {
            for (int innerElem : innerArr) {
                if (innerElem < min) {
                    min = innerElem;
                }
            }
        }
        return min;
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] innerArr : arr) {
            for (int innerElem : innerArr) {
                if (innerElem > max) {
                    max = innerElem;
                }
            }
        }
        return max;
    }

    public static int avg(int[][] arr) {
        int sum = 0;
        for (int[] innerArr : arr) {
            for (int innerElem : innerArr) {
                sum += innerElem;
            }
        }
        return sum / (arr.length * arr[0].length);
    }
}
