package ru.job4j.loop;

/**
 * Подсчёт суммы чётных чисел.
 * @author Ramil' Gilyazev.
 * @version task 5.1.
 * @since 23.10.2017.
 */
public class Counter {
    /**
     * 3 fields.
     */
    private int start, finish, rsl;
    /**
     * calculate sum of even method.
     * @param start is first number.
     * @param finish is second number.
     * @return sum of even from start to finish.
     */
    public int  add(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                rsl = rsl + i;
            }
        }
        return rsl;
    }
}