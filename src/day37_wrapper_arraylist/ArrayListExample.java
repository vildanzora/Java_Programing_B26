package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

         // array [] = value

        numbers.add(100); // adds 100 to the end of the Arraylist
        System.out.println(numbers);

        numbers.add(-100); // adds -100 to the end of the Arraylist
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);
        System.out.println(numbers);

        //in array How do I access each element: arr[index]
        //ArrayList has method numbers.get();

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        // Access each element by using get method
      //  System.out.println(numbers.get(30));  out of bounds. ArrayList doesnt have element 30

        // how many element are in the array: arr.length
        // is length a method --> no
        //in ArrayList numbers.size() --> it is a method bc having parenthesis


        System.out.println(numbers.size()); // 4
        numbers.add(45);
        System.out.println(numbers);
        System.out.println(numbers.size()); // automatically updated the size





    }
}
