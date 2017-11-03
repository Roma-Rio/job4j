package ru.job4j.loop;
/**
 * Build chessboard in a pseudo-graphic.
 * @author Ramil' Gilyazev.
 * @version task 4.3.
 * @since 25.10.2017.
 */
public class Board {
    /**
     * 2 fieds.
     */
    private int width, height;
    /**
     * calculate factorial method.
     * @param width of chessboard.
     * @param height of chessboard.
     * @return draw string .
     */
    public String paint(int width, int height) {
        StringBuilder tempstr = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((j % 2 != 0 && i % 2 != 0) || (j % 2 == 0 && i % 2 == 0)) {
                    tempstr.append("x");
                } else if ((j % 2 == 0 && i % 2 != 0) || (j % 2 != 0  && i % 2 == 0)) {
                    tempstr.append(" ");
                }
            }
            tempstr.append(System.getProperty("line.separator"));
        }
        String fullstr = tempstr.toString();
        //System.out.println(fullstr);
        return fullstr;
    }
}
