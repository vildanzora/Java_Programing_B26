package OfficeHoursTask;

public class StringTimes {
    /*
         Write a method that accepts a string and a non-negative number,
               and prints a larger string that is number copies of the original String

               stringTimes("Hi", 2); = > HiHi
               stringTimes("Hi", 3); = > HiHiHi
               stringTimes("Hi", 1); = > Hi
        */
    public static void main(String[] args) {


        String word = "Hi";

        stringTimes ("hi", 3);
    }

    private static void stringTimes(String word, int num) {

        String str ="";
        for (int i = 0; i < num; i++) {
            str += word;
        }
        System.out.println(str);

    }


}