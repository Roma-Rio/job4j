package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Test class for Factorial task.
 *
 *@author Ramil' Gilyazev.
 *@version task 4.2.
 *@since 25.10.2017.
 */
public class FactorialTest {
    /**
     * Factorial of 5 test method.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fact = new Factorial();
        int res5 = fact.calc(5);
        assertThat(res5, is(120));
    }
    /**
     * Factorial of 0 test method.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new Factorial();
        int res0 = fact.calc(0);
        assertThat(res0, is(1));
    }
}