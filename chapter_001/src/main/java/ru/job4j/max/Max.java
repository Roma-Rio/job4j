package ru.job4j.max;

/**
 * Класс для  вычисления максимума двух чисел.
 * @author Ramil' Gilyazev.
 * @version task 3.1.
 * @since 18.10.2017.
 */
public class Max {
    /**
     * 2 fields.
     */
    private int first, second; //numbers as parameters
    /**
     * search max method.
     * @param first is a number.
     * @param second is a number.
     * @return max of 2 numbers.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
}