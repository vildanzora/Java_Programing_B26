package Questions.GroupMeeting.meetingTask5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveSameValues {
    public static void main(String[] args) {
        /*
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
         */

        Scanner a  = new Scanner(System.in);
        System.out.println("Enter number: ");
        int max = a.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            nums.add(i);
            nums.removeIf(n -> n>100);
        }

        System.out.println(nums);
    }
}
