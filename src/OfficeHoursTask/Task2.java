package OfficeHoursTask;

import java.util.Arrays;

public class Task2 {
    /*
    Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */

    public static void CombinationArray (int [] arr1, int [] arr2) {

        int [] arr3 = new int [arr1.length + arr2.length];
       int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            count++;

        }

        for (int i = count, j =0; i < arr3.length; i++, j++) {
            arr3[i] = arr2[j];

        }

        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {

       int [] array1 = {1, 2, 3};
       int [] array2 = {4,5,6,7};
        CombinationArray(array1, array2);
    }


}
