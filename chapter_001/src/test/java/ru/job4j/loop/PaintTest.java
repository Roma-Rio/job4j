package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    /**
     * h=2 test method.
     */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String res1 = paint.piramid(2);
        final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^", line, line);
        assertThat(res1, is(expected));
    }
    /**
     * h=3 test method.
     */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String res2 = paint.piramid(3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^", line, line, line);
        assertThat(res2, is(expected));
    }

}


