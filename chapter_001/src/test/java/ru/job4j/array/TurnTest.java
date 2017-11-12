package ru.job4j.array;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test class for turn array task.
 *
 * @author Ramil' Gilyazev.
 * @version task 5.1.
 * @since 12.11.2017.
 */

public class TurnTest {
    /**
     * Check turn of an array with an even number of elements.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn arr1 = new Turn();
        int[] arr= {4, 1, 6, 2};
        int[] resarr = arr1.back(arr);
        int[] expectedarr = {2, 6, 1, 4};
        assertThat(resarr, is(expectedarr));
    }

    /**
     * Check turn of an array with an odd number of elements.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn arr2 = new Turn();
        int[] arr= { 1, 2, 3, 4, 5};
        int[] resarr = arr2.back(arr);
        int[] expectedarr = {5, 4, 3, 2, 1};
        assertThat(resarr, is(expectedarr));
    }
}