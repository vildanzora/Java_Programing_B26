package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have?: ");
        int size = input.nextInt();
        String [] friendsList = new String [size];
        input.nextLine(); // because between to nextInt and nextLine



        for (int i = 0; i < friendsList.length; i++) {

            System.out.println("What is you friends name?: ");

            friendsList[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(friendsList));


    }
}
