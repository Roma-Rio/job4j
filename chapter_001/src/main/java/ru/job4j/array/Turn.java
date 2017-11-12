package ru.job4j.array;

import java.util.Arrays;

public class Turn {

    int[] array;
    public int[] back(int[] array) {
        //int[]array = new int[]{};
        for (int index = 0; index < array.length / 2; index++) {
            int tempval = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = tempval;
        }
        //печать массива столбцом
        /*for(int arr : array){
            System.out.println(arr);
            }*/
        System.out.println(Arrays.toString(array)); //печать массива строкой
        return array;
        }

    }
