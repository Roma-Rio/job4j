package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Тестовый класс CounterTest.
 *
 *@author Ramil' Gilyazev.
 *@version task 5.1.
 *@since 23.10.2017.
 */
public class CounterTest {
    /**
     * Sum even test method.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sum = new Counter();
        int result = sum.add(1, 10);
        assertThat(result, is(30));
    }
}