package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Описание класса CalculatorTest.
 *
 *@author Ramil' Gilyazev.
 *@version task 2.3.
 *@since 16.10.2017.
 */
public class CalculatorTest {
    /**
     * Test add method.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResultAdd();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test sub method.
     */
    @Test
    public void whenSubThreeMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.sub(3D, 1D);
        double result = calc.getResultSub();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test div method.
     */
    @Test
    public void whenDivSixforTwoThenThree() {
        Calculator calc = new Calculator();
        calc.div(6D, 2D);
        double result = calc.getResultDiv();
        double expected = 3D;
        assertThat(result, is(expected));
    }
    /**
     * Test mult method.
     */
    @Test
    public void whenMultTwoofTwoThenFour() {
        Calculator calc = new Calculator();
        calc.mult(2D, 2D);
        double result = calc.getResultMult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

}




