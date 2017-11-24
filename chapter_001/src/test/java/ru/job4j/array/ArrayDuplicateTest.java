package ru.job4j.array;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test class for Remove duplicates task.
 *
 * @author Ramil' Gilyazev.
 * @version task 5.3.
 * @since 21.11.2017.
 */

public class ArrayDuplicateTest {
    /**
     * Check method for array without duplicates.
     */
        @Test
        public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
            ArrayDuplicate arr1 = new ArrayDuplicate();
            String[] arr = {"Java", "method", "OOP", "FOR", "WHILE", "DO", "ASSERT", "OOP", "ASSERT", "Java"};
            String[] resultArray = arr1.remove(arr);
            String[] expectArray = {"Java", "method", "OOP", "FOR", "WHILE", "DO", "ASSERT"};
            assertThat(resultArray, is(expectArray));
        }
}
