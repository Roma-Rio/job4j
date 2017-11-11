package ru.job4j.loop;
/*
 *Build pyramid in a pseudo-graphic.
 * @author Ramil' Gilyazev.
 * @version task 4.4.
 * @since 04.11.2017.
 */
public class Paint {
    /**
     * 1 field-height of pyramid.
     */
    private int h;

    /**
     * draw pyramid method.
     *
     * @param h is height of pyramid.
     * @return string.
     */
    public String piramid(int h) {
        StringBuilder tempstr = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h * 2; j++) {
                if (j > h - 2 - i && j < h + i) {
                    tempstr.append("^");
                } else if (j < h * 2 - 1) {
                    tempstr.append(" ");
                }
            }
            if (i < h - 1) {
                tempstr.append(System.getProperty("line.separator"));
            }
        }
        return tempstr.toString();
    }
}


