package ru.job4j.loop;

/**
 * Вычисление факториала.
 * @author Ramil' Gilyazev.
 * @version task 4.2.
 * @since 24.10.2017.
 */
public class Factorial {
    /**
     * 2 fields.
     */
    private int n, rsl;
    /**
     * calculate factorial method.
     * @param n is argument.
     * @return value of n-factorial .
     */
    public int calc(int n) {
        rsl = 1;
        for (int i = 1; i <= n; i++) {

            rsl = rsl * i;
        }
        return rsl;
    }
}