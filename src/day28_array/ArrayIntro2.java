package day28_array;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4];
      //  arr= new double[]{0.5, 0.6, 0.8, 0.5};


        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] = 5;

        System.out.println(Arrays.toString(arr));

        //reassigning

        arr[2] = 2000;
        System.out.println(Arrays.toString(arr));

        arr = new double [5]; // This one create a new arrays with 5 elements, and reassigns the arr reference to the new object

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[1]);


    }
}
