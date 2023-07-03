package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    /*
     * Returns a String representation of a row of asterisks whose base and width is equal to numberOfRows
     */
    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numberOfRows; i++){
            sb.append(getRow(i)+"\n");
        }
        return sb.toString();
    }

    /*
     * Returns a String representation of a row of asterisks whose length is equal numberOfStars
     */
    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numberOfStars; i++){
            sb.append("*");
        }
        return sb.toString();
    }

    /*
     * Returns a String representation of a small triangle whose base and height is 4 asterisks
     */
    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    /*
     * Returns a String representation of a small triangle whose base and height is 10 asterisks
     */
    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
