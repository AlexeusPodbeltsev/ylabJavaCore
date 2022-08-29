package com.ylab.core.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @DisplayName("Sorting an array without duplicates")
    @Test
    void sortWithoutDupsTest() {
        int[] givenArr = new int[]{2, 5, 7, 12, 76, 3, 1, 0};
        int[] expected = new int[]{0, 1, 2, 3, 5, 7, 12, 76};
        SecondTask.mergeSort(givenArr, givenArr.length);
        assertArrayEquals(expected, givenArr);
    }

    @DisplayName("Sorting an array with duplicates")
    @Test
    void sortWithDupsTest() {
        int[] givenArr = new int[]{2, 5, 7, 12, 76, 3, 1, 5, 0, 2};
        int[] expected = new int[]{0, 1, 2, 2, 3, 5, 5, 7, 12, 76};
        SecondTask.mergeSort(givenArr, givenArr.length);
        assertArrayEquals(expected, givenArr);

    }


}