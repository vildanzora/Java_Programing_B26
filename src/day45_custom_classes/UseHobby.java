package day45_custom_classes;

import day46_static.BestBuy;

import java.util.ArrayList;
import java.util.Arrays;

public class UseHobby {
    public static void main(String[] args) {
/*
- create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */

        ArrayList<Hobby> allHobbies = new ArrayList<>();

        allHobbies.addAll(Arrays.asList(new Hobby("Hiking",700,true,true),new Hobby("Biking",300,true, true),new Hobby("BasketBall",200,true,true),new Hobby("Dancing",100,false,false)));


        for (Hobby each:allHobbies) {
            each.doIt();
        }


        System.out.println(" INDOORS ACTIVITIES ");
        ArrayList<Hobby> indoorHobbies = new ArrayList <> (allHobbies);
        indoorHobbies.removeIf(Hobby -> Hobby.isOutdoors);
        System.out.println(indoorHobbies);
        System.out.println();

        System.out.println("INDIVIDUAL ACTIVITIES");
        ArrayList<Hobby> individualHobbies = new ArrayList<>(allHobbies);
        individualHobbies.removeIf( Hobby -> Hobby.requiresOthers );
        System.out.println(individualHobbies);
        System.out.println();

        System.out.println("INEXPENSIVE ACTIVITIES");
        ArrayList<Hobby> inexpensiveActivities = new ArrayList<>(allHobbies);
        inexpensiveActivities.removeIf(Hobby -> Hobby.annualCost>500);
        System.out.println(inexpensiveActivities);





    }
}
