package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {

        // different class different package

        First obj  = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

    }

    // four is private only visible in the same class

    // three is default only divisible in the same package

    // two is protected, no inheritance, so no visibility. only accessibility in the sam

}
