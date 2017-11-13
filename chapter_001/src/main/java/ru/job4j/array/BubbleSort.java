package ru.job4j.array;

import java.util.Arrays;
/**
 * Bubblesort of an array.
 * @author Ramil' Gilyazev.
 * @version task 5.1.
 * @since 12.11.2017.
 */
public class BubbleSort {
    /**
     * 1 field-array of int.
     */
    int[] array;
    /**
     * Bubblesort method.
     * @param array-array of int.
     * @return sorted array .
     */
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int tval = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = tval;
                }
            }
        }
        return array;
    }
}
