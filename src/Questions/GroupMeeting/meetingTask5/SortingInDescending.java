package Questions.GroupMeeting.meetingTask5;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingInDescending {
        /*
        Write a method that can sort the ArrayList in descending order without using the sort method
         */
        public static void main(String[] args) {
            ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5,9,4,1,3,85,96));

            for (int i = 0; i < arr2.size(); i++) {
                for (int j = i + 1; j < arr2.size() ; j++) {

                    int temp = 0;

                    if(arr2.get(i) > arr2.get(j)){

                        temp = arr2.get(i);
                        arr2.set(i, arr2.get(j));
                        arr2.set(j, temp);
                    }
                }
            }


            System.out.println(arr2);
        }
}
