package day08_relational_operators;

import java.util.jar.JarOutputStream;

public class UpdateVariable {
    public static void main(String[] args) {
        int a = 10;
        // adding 1 to a variable
        a++;
        ++a;
       //  a = a +1;  Also we can write this type
        // a = 11;  Also we can write this type

        int b = 4;
 // 10 times I write b++;
      //  b = 14;  Also we can write this type
       // b = b + 10;  Also we can write this type but shorthand operators is b += 10;

        b += 10;
        System.out.println(b);

        int count = 0;
        count += 5;

        System.out.println(count);
        count -= 10;
        System.out.println(count);
        count *=2;
        System.out.println(count);


    }

}
