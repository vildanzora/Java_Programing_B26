package day52_inheritance.final_example;

public class Main {

    public static void main(String[] args) {

        new Parent ().walk();
        Child child = new Child();
        child.walk();

        // They are same

    }

}

class Parent {

    public final void walk () {
        System.out.println("You are walking");
    }

}

class Child extends Parent {

   /*  @Override
    public final void walk() {

    }

     we can not override final methods */

}
