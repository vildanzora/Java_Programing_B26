package day48_encapsulation;

import day48_encapsulation.Square;

public class TestSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);
        System.out.println(obj);

        //obj.side = 11; can't change the value like this because it has private access

        obj.setSide(11);

        System.out.println(obj.getSide());

        System.err.println(obj);

    }
}
