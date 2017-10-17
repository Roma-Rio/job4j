package ru.job4j.calculator;

/**
 *Описание класса Calculator.
 *
 *@author Ramil' Gilyazev.
 *@version task 2.3.
 *@since 16.10.2017.
 */
public class Calculator {
    /**
     * result variable.
     */
    private double result;

    /**
     * addition method.
     * @param first is a number.
     * @param second is a number.
     */

    void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * getResultadd method.
     * @return result of add method.
     */

    public double getResultAdd() {
        return this.result;
    }

    /**
     * substaction method.
     * @param first is a number.
     * @param second is a number.
     */

    public void sub(double first, double second) {
        this.result = first - second;
    }
    /**
     * getResultsub method.
     * @return result of substact method.
     */

    public double getResultSub() {
        return this.result;
    }

    /**
     * division method.
     * @param first is a number.
     * @param second is a number.
     */

    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * getResultdiv method.
     * @return result of div method.
     */

    public double getResultDiv() {
        return this.result;
    }

    /**
     * multiplication method.
     * @param first is a number.
     * @param second is a number.
     */

    public void mult(double first, double second) {
        this.result = first * second;
    }
    /**
     * getResultdmult method.
     * @return result of multiple method.
     */

    public double getResultMult() {
        return this.result;
    }
}