package day33_methods;

import java.util.Scanner;

public class MultidimensionalArrayPractice {
    public static void main(String[] args) {



        int [][] arr = {{3, 5, 1}, {1, 6, 10}, {5, 21, 10}};

        String forward = "";
        String reverse = "";
        int count = 0;
        int count2 = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            forward += arr[i][count];
            reverse += arr[i][count2];
            count++;
            count2--;
        }

        System.out.println("\n-----------RESULT----------");
        System.out.println("forward diagonal: " + forward);
        System.out.println("reverse diagonal: " + reverse);
    }



    }

