package Questions.GroupMeeting.meetingTask5;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {
        /*
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Ahmed", "Eric", "Vildan", "Ahmet"));
//        list2.removeIf( n -> n.contains("Ahmed"));
//        System.out.println(list2);

        String result= "";

        for (String eachList : list) {
            if (!eachList.equalsIgnoreCase("ahmed") && !eachList.equalsIgnoreCase("ahmet")){
                result += eachList + " ";
            }

        }
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(result.split(" ")));
        System.out.println(list2);


    }

}
