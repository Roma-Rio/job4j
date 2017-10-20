package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Тестовый класс PointTest.
 *
 *@author Ramil' Gilyazev.
 *@version task 3.2.
 *@since 19.10.2017.
 */
public class PointTest {
    /**
     * Condition test method.
     */
    @Test
    public void whenPointOnLineThenTrue() {
        //create of new point.
        Point a = new Point(1, 1);
        // execute method - is and get result;
        boolean rsl = a.is(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(true));
    }
}
