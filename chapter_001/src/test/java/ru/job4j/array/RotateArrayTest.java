package ru.job4j.array;

import org.junit.Test;
import java.lang.reflect.Array;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test class for RotateArray task.
 *
 * @author Ramil' Gilyazev.
 * @version task 5.2.
 * @since 27.11.2017.
 */

public class RotateArrayTest {
    /**
     * Check 2x2 array turning.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray()  {
        RotateArray arr1 = new RotateArray();
        int[][] arr = {{4, 5}, {7, 8}};
        int[][] resultArray = arr1.rotate(arr);
        int[][]  expectArray = {{7, 4}, {8, 5}};
        assertThat(resultArray, is(expectArray));
    }
    /**
     * Check 3x3 array turning.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray arr1 = new RotateArray();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultArray = arr1.rotate(arr);
        int[][]  expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(resultArray, is(expectArray));
    }
}
