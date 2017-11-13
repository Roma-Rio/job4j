package ru.job4j.array;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test class for Bubbesort task.
 *
 * @author Ramil' Gilyazev.
 * @version task 5.1.
 * @since 12.11.2017.
 */

public class BubbleSortTest {
    /**
     * Check array sorting  by Bubble method.
     */
        @Test
        public void whenSortArrayWithTenElementsThenSortedArray() {
            BubbleSort arr1 = new BubbleSort();
            int[] arr = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
            int[] resultArray = arr1.sort(arr);
            int[]  expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
            assertThat(resultArray, is(expectArray));
        }
}
