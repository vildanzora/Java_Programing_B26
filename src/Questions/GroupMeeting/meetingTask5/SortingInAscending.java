package Questions.GroupMeeting.meetingTask5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortingInAscending {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,9,4,11,3,85,96));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size() ; j++) {

                int temp = 0;

                if(arr.get(i) > arr.get(j)){

                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }


        System.out.println(arr);




    }
}
