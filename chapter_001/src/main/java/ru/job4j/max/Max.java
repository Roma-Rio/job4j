package ru.job4j.max;

/**
 * Класс для  вычисления максимума двух чисел.
 * @author Ramil' Gilyazev.
 * @version task 3.1.
 * @since 18.10.2017.
 */
public class Max {
    /**
     * 3 fields.
     */
    private int first, second, third;
    /**
     * search max of 2 method.
     * @param first is a number.
     * @param second is a number.
     * @return max of 2 numbers.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
    /**
     * search max of 3 method.
     * @param first is a number.
     * @param second is a number.
     * @param third is a number.
     * @return max of 3 numbers.
     */
    public int max(int first, int second, int third) {
        int a = max(first, second);
        return max(a, third);
    }
}
