package day09_scanner;


public class GoForWalk {

    public static void main(String[] args) {
        // we want to go for walk
        // we will go for walk if it is not raining and the weather is above 70
        // there is no need check the weather if it is raining

        boolean isRaining = false;
        int temperature = 75;
        System.out.println(" go for walk " + (!isRaining && temperature  > 70));

        boolean walking = !isRaining && temperature > 70;
        System.out.println(walking);


    }



}
