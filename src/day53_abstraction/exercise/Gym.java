package day53_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {

      //  Exercise obj1 = new Exercise(); this class is abstract class, so you can not create an object

        Running obj2 = new Running();
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.gerCaloriesBurned(20));

    }
}
