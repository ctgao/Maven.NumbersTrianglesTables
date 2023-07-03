package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        int product = 0;

        // for loop for rows
        for(int row = 1; row <= tableSize; row++){
            // for loop for cols
            for(int col = 1; col <= tableSize; col++){
                product = row * col;
                if(product < 10){
                    sb.append(" ");
                }
                if(product < 100){
                    sb.append(" ");
                }
                sb.append(product);
                sb.append(" |");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
