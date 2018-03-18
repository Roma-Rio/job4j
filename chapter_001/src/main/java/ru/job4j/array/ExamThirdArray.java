package ru.job4j.array;

import java.util.Arrays;
/**
 * Create long sorted array from two short sorted array.
 * @author Ramil' Gilyazev.
 * @version examtask.
 * @since 15.12.2017.
 */
public class ExamThirdArray {
    /**
     * create long array method.
     * @param arr1,arr2-short arrays of int.
     * @return  new long array.
     */
    public int[] createLong(int[] arr1, int[] arr2) {
        int lenone = arr1.length;
        int lentwo = arr2.length;
        int lennew = lenone + lentwo;
        int[] newarr =  new int[lennew];
        for (int i = 0; i < lennew; i++) {
            for (int j = 0; j < lennew; j++) {
                if (arr1[j] > (arr2[j])) {
                    newarr[i]  = arr2[j];
                    newarr[i + 1] = arr1[j];
                } else {
                    newarr[i]  = arr1[j];
                    newarr[i + 1] = arr2[j];
                }
            }
        }
        return newarr;
    }
}
