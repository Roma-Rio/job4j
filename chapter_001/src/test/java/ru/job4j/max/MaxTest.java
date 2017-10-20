package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Тестовый класс MaxTest.
 *
 *@author Ramil' Gilyazev.
 *@version task 3.1.
 *@since 18.10.2017.
 */
public class MaxTest {
    /**
     * Test1 max method.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Test2 max method.
     */
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 2);
        assertThat(result, is(3));
    }
    /**
     * Test3 max method.
     */
    @Test
    public void whenSecondEqualFirst() {
        Max maxim = new Max();
        int result = maxim.max(4, 4);
        assertThat(result, is(4));
    }
    /**
     * Test4 max method.
     */
    @Test
    public void whenSecondnull() {
        Max maxim = new Max();
        int result = maxim.max(-4, 0);
        assertThat(result, is(0));
    }
    /**
     * Test5 max method.
     */
    @Test
    public void whenFirstnull() {
        Max maxim = new Max();
        int result = maxim.max(0, -1);
        assertThat(result, is(0));
    }
    /**
     * Test1 max of 3 method.
     */
    @Test
    public void whenFirstLessOther() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
    /**
     * Test2 max of 3 method.
     */
    @Test
    public void whenSecondLessOther() {
        Max maxim = new Max();
        int result = maxim.max(1, -5, 3);
        assertThat(result, is(3));
    }
    /**
     * Test3 max of 3 method.
     */
    @Test
    public void whenThirdLessOther() {
        Max maxim = new Max();
        int result = maxim.max(11, 0, 3);
        assertThat(result, is(11));
    }
    /**
     * Test4 max of 3 method.
     */
    @Test
    public void whenThirdEqualSecond() {
        Max maxim = new Max();
        int result = maxim.max(11, 22, 22);
        assertThat(result, is(22));
    }
    /**
     * Test5 max of 3 method.
     */
    @Test
    public void whenAllEqual() {
        Max maxim = new Max();
        int result = maxim.max(33, 33, 33);
        assertThat(result, is(33));
    }
    /**
     * Test6 max of 3 method.
     */
    @Test
    public void whenFirstEqualSecond() {
        Max maxim = new Max();
        int result = maxim.max(-11, -11, 3);
        assertThat(result, is(3));
    }
    /**
     * Test7 max of 3 method.
     */
    @Test
    public void whenFirstEqualThird() {
        Max maxim = new Max();
        int result = maxim.max(-7, -11, -7);
        assertThat(result, is(-7));
    }
}



