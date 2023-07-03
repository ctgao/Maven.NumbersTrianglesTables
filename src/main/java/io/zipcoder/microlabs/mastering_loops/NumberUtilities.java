package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    /*
     * Return a String concatenation of all even integers between start (inclusive) and stop (exclusive)
     */
    public static String getEvenNumbers(int start, int stop) {
        if(start % 2 == 0){
            // if is even then just return the range w/ step
            return getRange(start, stop, 2);
        }
        return getRange(start+1, stop, 2);
    }

    /*
     * Return a String concatenation of all odd integers between start (inclusive) and stop (exclusive)
     */
    public static String getOddNumbers(int start, int stop) {
        if(start % 2 == 1){
            // if is odd then just return the range w/ step
            return getRange(start, stop, 2);
        }
        return getRange(start+1, stop, 2);
    }

    /*
     * Return a String concatenation of all values squared between start (inclusive) and stop (exclusive)
     */
    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    /*
     * Return a String concatenation of all integers between 0 up to and not including stop
     */
    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    /*
     * Return a String concatenation of all integers from start (inclusive) to stop (exclusive)
     */
    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    /*
     * Return a String concatenation of all integers from start (inclusive) to stop (exclusive)
     * using step to increment
     */
    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1);
    }

    /*
     * Return a String concatenation of all values raised to s specific exponent between
     * start (inclusive) and stop (exclusive)
     */
    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i += step){
            sb.append((int)Math.pow(i, exponent));
        }
        return sb.toString();
    }
}
