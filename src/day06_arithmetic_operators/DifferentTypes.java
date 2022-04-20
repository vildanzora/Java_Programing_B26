package day06_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args){
// because data types are same java could  calculate - both int type
        System.out.println(10 - 5);

// double / int you will see double in output
        System.out.println(10.5 / 5);

//double / double => double you will see
        System.out.println(10.0 / 5.0);

// int / double => double you will see
// double is a bigger type and default because of this seeing double type in output
        System.out.println(10 / 5.0);
        System.out.println((int)(10.0 / 5.0));
        System.out.println((int)(10.5 /  5));//(int) code doing casting. (int)10.5 is casting => 10 to integer number. First calculate the division and after casting. because of this written number in parentheses()

        byte b1 = 10;
        byte b2 = 20;

        // byte sum = b1 + b2; this will not work because the values get changes to int during the calculation.

        byte sumByte = (byte)(b1 + b2);

        System.out.println(sumByte);
    }

}
