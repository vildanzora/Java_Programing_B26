package day53_abstraction.exercise;

public class Running extends Exercise {

    public Running () {
        super ("Running");
    } // Super is call my parent class name variable




    @Override
    public void performExercise() {
        System.out.println("Running for fun, not sure who does this");

    }

    @Override
    public int gerCaloriesBurned(int minutes) {
        return minutes *5;
    }
}
