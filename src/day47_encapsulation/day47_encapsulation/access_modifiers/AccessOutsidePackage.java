package day47_encapsulation.day47_encapsulation.access_modifiers;

import day47_encapsulation.day47_encapsulation.access_modifiers.AccessModifier;

public class AccessOutsidePackage {
    // different class, different package

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
//        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        // c and z are private, so they can only be accessed in the same class

        // b and y are default (didn't have any other access modifier), so they can only be accessed in the same package

        // so what is accessible outside a package:
        // public

    }
}
