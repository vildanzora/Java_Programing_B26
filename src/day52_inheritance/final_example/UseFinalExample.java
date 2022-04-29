package day52_inheritance.final_example;

//public class UseFinalExample extends FinalExample ( this is not valid because final class was final so it can not be inherited, parent

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
       // FinalExample.PLANET = "Mars";

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        // obj.a = 4;
        // obj.b = 40;

        FinalExample obj2 = new FinalExample(100);
        System.out.println();
        System.out.println(obj2.b);

        /* obj and obj2 were separate objects. Each object has its own copy of instance variables a and b, both are final so they can not be changed.

        a was hardcoded to be 5 in the class
        b was assigned in the constructor call
        */



    }
}
