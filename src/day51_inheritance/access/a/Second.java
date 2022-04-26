package day51_inheritance.access.a;

public class Second {
    public static void main(String[] args) {

        // same package different class

        First obj  = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
       //  System.out.println(obj.four); four is not accessible bc it is private


    }
}
