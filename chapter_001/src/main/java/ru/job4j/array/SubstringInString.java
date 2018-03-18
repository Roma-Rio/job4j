package ru.job4j.array;

import java.util.Arrays;

/**
 * Check substring in string method.
 * @author Ramil' Gilyazev.
 * @version task 7.
 * @since 29.11.2017.
 */
public class SubstringInString {
    /**
     * Check substring method.
     *
     * @param origin,sub are strings.
     * @return true\false.
     */
    public Boolean contains(String origin, String sub) {
        char[] orig = origin.toCharArray();
        char[] subs = sub.toCharArray();
        int orl = orig.length;
        int sl = subs.length;
        int count = 0;
        for (int i = 0; i < orl; i++) {
            for (int j = i; j < sl;) {
                if (orig[i] == (subs[j]) ) {
                    count++;
                }
            }

        }if (count == sl)
            return true;
}