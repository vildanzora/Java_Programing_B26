package day28_array;

import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        int [] numbers = {20,36,47,51};
        int average = 0;

//        for (int i = 0; i < numbers.length; i++) {
//
//            average += numbers[i];
//        }

        for (int each : numbers) {
            average += each;
        }

        System.out.println(average / numbers.length);





    }
}
