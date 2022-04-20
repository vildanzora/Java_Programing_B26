package day37_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String [] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));

        String resultStr = arr[1].replace(",", "");
        String timeStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        //9223372036854775807 is Long MAX VALUE --> public class MaxAndMinValues

        long resultNumber = Long.parseLong(resultStr); // I made the long number in the string type 2550000000
        double timeNumber = Double.parseDouble(timeStr);

        System.out.println(resultNumber);

        if (resultNumber >= 0) {
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }

        if (timeNumber <= 2 && timeNumber >= 0 ) {
            System.out.println("TEST CASE PASSED - Under 2 seconds");
        }





    }
}
