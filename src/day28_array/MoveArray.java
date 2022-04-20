package day28_array;

import java.util.Arrays;

public class MoveArray {
    public static void main(String[] args) {

        int [] number1 = {10,0,5,0,1,0};
        int [] fixed = new int[number1.length];
        int n=0;

        for(int i = 0 ; i< number1.length;i++){

            if(number1[i] != 0){
                fixed[n++] = number1[i]; // default int in array is --0-- because of this first 3 character which meean is != 0 characters are 10,5,1 and the last 3 characters is null. nul mean is zero 0 for int type in array.

                //  fixed [n] = number1[i];
                // n++;


            }
        }
        System.out.println(Arrays.toString(fixed));
        System.out.println("===========================");

        n=0;

        for ( int each : number1) {

            if(each != 0) {
                fixed[n] = each;
                n++;
            }

        }
        System.out.println(Arrays.toString(fixed));





    }
}
