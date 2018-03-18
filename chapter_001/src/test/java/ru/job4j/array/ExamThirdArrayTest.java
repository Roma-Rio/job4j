package ru.job4j.array;

import org.junit.Test;
import java.lang.reflect.Array;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 *Test class for third sorted array task.
 *
 * @author Ramil' Gilyazev.
 * @version exam task
 * @since 21.12.2017.
 */

public class ExamThirdArrayTest {
        /**
         * Check array sorting  by Bubble method.
         */
        @Test
        public void whenTwoSortedArrayBecomeThirdSortedArray() {
                ExamThirdArray arr5 = new ExamThirdArray();
                int[] arr3 = {1, 3, 5, 7, 9};
                int[] arr4 = {2, 4, 6, 8, 10};
                int[] resultArray = arr5.createLong(arr3, arr4);
                int[] expectArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                assertThat(resultArray, is(expectArray));
        }
}
