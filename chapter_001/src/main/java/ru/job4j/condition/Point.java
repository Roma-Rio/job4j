package ru.job4j.condition;

/**
 * Определение положения точки.
 * @author Ramil' Gilyazev.
 * @version task 3.2.
 * @since 19.10.2017.
 */
public class Point {
    /**
     * 2 coordinates.
     */
    private int x, y;

    /**
     * determine a posotion of a point method.
     * @param x is first coordinate.
     * @param y is second coordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getX method.
     * @return x value.
     */
    public int getX() {
        return this.x;
    }

    /**
     * getY method.
     * @return y value.
     */
    public int getY() {
        return this.y;
    }

    /**
     * determine a posotion of a point method.
     * @param a is first number.
     * @param b is second number.
     * @return true or false.
     */
    public boolean is(int a, int b) {
        return this.y == this.x * a + b;
    }
}
