package day28_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {


        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        // declare array with values

        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour, cityFive};

        String [] cities = { "Chicago", "New York" , "Houston", "Denver", "Pittsburgh" };



        // how to access each element in the array

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // print all the cities one line

       // System.out.println("Reverse order of the cities " + cities[5]); out of bound error. 5 doesn't work. change 4.

        System.out.println("Reverse order of the cities " + cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1] + ", " + cities[0]);


        // print the array all at one time

        System.out.println(cities); // this doesn't print the array how we want

        System.out.println(Arrays.toString(cities));

        System.out.println(Arrays.toString(cities).substring(1,Arrays.toString(cities).length()-1 )); // for without []


        // number of elements

        System.out.println(cities.length); // no ()
        System.out.println(cities[0].length());

        System.out.println(cities [cities.length -1]); // it shows last element






    }
}
