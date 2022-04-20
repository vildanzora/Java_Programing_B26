package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {

        /*
        Given a 2D array find the average of each inner array and
        extra : average of the whole array

         */
        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double total = 0;
        int totalLength = 0;

        for(int [] eachArray : nums){

            //System.out.println(Arrays.toString(eachArray));

            double sum = 0;

            for(int eachNumber : eachArray){
                sum += eachNumber;
            }

            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/ eachArray.length));
            total += sum;
            totalLength += eachArray.length;
        }

        System.out.println("Average of the whole 2D array: " + (total/totalLength));



















//        int [] [] nums = new int[2][];
//
//        nums[0] = new int [] {8, 4, 2, 6};
//        nums[1] = new int [] {5, 2, 6};
//        double innerOne = 0;
//        double innerTwo = 0;
//
//        for( int [] innerArray : nums) {
//
//            if(innerArray == nums[0]) {
//                for (int i = 0; i < innerArray.length; i++) {
//                    innerOne += innerArray[i];
//
//                }
//            }
//            if(innerArray == nums[1]) {
//                for (int i = 0; i < innerArray.length; i++) {
//                    innerTwo += innerArray[i];
//
//                }
//            }
//
//        }
//
//        double innerOneAverage = innerOne / (nums[0].length);
//        double innerTwoAverage = innerTwo / (nums[1].length);
//
//        System.out.println("Inner One average: " + innerOneAverage);
//        System.out.println("Inner Two average: " + innerTwoAverage);
//        System.out.println("Array average: " + ( (innerOneAverage + innerTwoAverage)/2) );



    }
}
