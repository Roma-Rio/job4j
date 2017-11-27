package ru.job4j.array;

/**
 * Rotate of an 2dim array.
 * @author Ramil' Gilyazev.
 * @version task 5.2.
 * @since 14.11.2017.
 */
public class RotateArray {
     /** rotate method.
     * @param array-array of int.
     * @return turned array .
     */
    public int[][] rotate(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int tmp = array[i][j];
                array[i][j] = array[n - j - 1][i];
                array[n - j - 1][i] = array[n - i - 1][n - j - 1];
                array[n - i - 1][n - j - 1] = array[j][n - i - 1];
                array[j][n - i - 1] = tmp;
            }
        }
        return array;
    }
}

