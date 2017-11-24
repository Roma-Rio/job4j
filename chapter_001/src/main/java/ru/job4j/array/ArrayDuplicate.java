package ru.job4j.array;

import java.util.Arrays;
/**
 * Bubblesort of an array.
 * @author Ramil' Gilyazev.
 * @version task 5.1.
 * @since 12.11.2017.
 */
public class ArrayDuplicate {
    /**
     * 1 field-array of int.
     */
    private String[] str;
    /**
     * Bubblesort method.
     * @param str-array of string.
     * @return sorted array .
     */
    public String[] remove(String[] str) {
        int dlm = str.length;
        for (int i = 0; i < dlm; i++) {
            for (int j = i + 1; j < dlm; j++) {
                 if (str[i].equals(str[j])) {
                    String tmp = str[j];
                    str[j] = str[dlm - 1];
                    str[dlm - 1] = tmp;
                    dlm--;
                }
            }
        }
        return Arrays.copyOf(str, dlm);
    }
}
