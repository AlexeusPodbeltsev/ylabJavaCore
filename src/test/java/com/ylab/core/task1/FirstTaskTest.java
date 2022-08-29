package com.ylab.core.task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    int[][] arrWithRandomValues;

    @BeforeEach
    void setUp() {
        arrWithRandomValues = new int[][]{{10, 2, 7, 22, 9}, {28, 27, 24, 15, 17}, {23, 12, 8, 25,18}};
    }

    @DisplayName("Searching min value")
    @Test
    void min() {
        int expected = 2;
        int actual = FirstTask.min(arrWithRandomValues);
        assertEquals(expected, actual);
    }

    @DisplayName("Searching max value")
    @Test
    void max() {
        int expected = 28;
        int actual = FirstTask.max(arrWithRandomValues);
        assertEquals(expected, actual);
    }

    @DisplayName("Searching avg value")
    @Test
    void avg() {
        int expected = 16;
        int actual = FirstTask.avg(arrWithRandomValues);
        assertEquals(expected, actual);
    }

}