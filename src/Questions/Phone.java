package Questions;


import org.w3c.dom.ls.LSOutput;

public class Phone {
    public Phone () {
        System.out.println(1);
    }

    public Phone (int num) {
        this();
        System.out.println(2);
    }

    public Phone (String str) {
        this(str.length() );
        System.out.println(3);
    }



}

class CellPhones {
    public static void main(String[] args) {
        new Phone ("iphone");
        new Phone();
        new Phone (4);
    }
}