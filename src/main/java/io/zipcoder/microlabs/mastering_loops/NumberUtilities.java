package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    /*
     * Return a String concatenation of all even integers between start (inclusive) and stop (exclusive)
     */
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                sb.append(i);
                i++;
            }
        }
        return sb.toString();
    }

    /*
     * Return a String concatenation of all odd integers between start (inclusive) and stop (exclusive)
     */
    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i++){
            if(i % 2 == 1){
                sb.append(i);
                i++;
            }
        }
        return sb.toString();
    }

    /*
     * Return a String concatenation of all values squared between start (inclusive) and stop (exclusive)
     */
    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i += step){
            sb.append((int) Math.pow(i, 2));
        }
        return sb.toString();
    }

    /*
     * Return a String concatenation of all integers between 0 up to and not including stop
     */
    public static String getRange(int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stop; i++){
            sb.append(i);
        }
        return sb.toString();
    }

    /*
     * Return a String concatenation of all integers from start (inclusive) to stop (exclusive)
     */
    public static String getRange(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i++){
            sb.append(i);
        }
        return sb.toString();
    }

    /*
     * Return a String concatenation of all integers from start (inclusive) to stop (exclusive)
     * using step to increment
     */
    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i += step){
            sb.append(i);
        }
        return sb.toString();
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
