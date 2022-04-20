package day07_unary_operators;

public class Pizza {
    /*
    create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
     */
    public static void main(String[]args) {

        String typeOfPizza = "Cheese Pizza";

        // ALso we can write int numberOfSlices, numberOfPeopleEating;
        // numberOfSlices = 17;

        int numberOfSlices = 17;
        int numberOfPeopleEating = 8;

        double eachPersonWillGet = numberOfSlices / numberOfPeopleEating;

        System.out.println("How many slices each people will eat: " + eachPersonWillGet);

        double reminder = numberOfSlices % numberOfPeopleEating;

        System.out.println("We ordered " + typeOfPizza + " with " + numberOfSlices + " slices." + numberOfPeopleEating + " every person ate 2 slices.  " + reminder + " left over");

    }


    }
