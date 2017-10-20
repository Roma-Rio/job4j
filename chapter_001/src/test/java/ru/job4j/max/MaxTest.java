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

}



