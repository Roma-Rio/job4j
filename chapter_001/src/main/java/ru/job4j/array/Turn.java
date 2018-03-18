package ru.job4j.array;

import java.util.Arrays;
/**
 * Turn array.
 * @author Ramil' Gilyazev.
 * @version task 5.0.
 * @since 11.11.2017.
 */
public class Turn {
    /**
     * turn array method.
     * @param array-array of int.
     * @return inverted array .
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int tempval = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = tempval;
        }
        return array;
    }

}
