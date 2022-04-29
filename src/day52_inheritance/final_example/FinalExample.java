package day52_inheritance.final_example;

public class FinalExample {

    final int a =5; // you can not do " final int a; " because the final variable can not be changed
    final int b;

    public static final String PLANET = "Earth"; // constant variable

    public FinalExample (int b) {
        this.b =b;  // you can make a constructor for the "   final int b;  " compiler.
    }


}
