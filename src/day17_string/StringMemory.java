package day17_string;

public class StringMemory {

    public static void main(String[] args) {

        String first = "java"; // String literal, directly in the String pool because we use double " "

        String second = new String("java"); // String object, not in the String pool,but directly in the heap.

        System.out.println(first == second);

        // It gives me false because == with String type gives me false, The == doesn't compare the characters, it compares the memory location of the object

        String third =  "java";
        System.out.println(first == third); // It gives the true result because it is noa a same value because it is the same object

        String fourth = "Java"; // at this line how much object in the String pool: 2
        // You have "java" "java"

        System.out.println(first == fourth);

        // at this point hpw many total object is there. 3 => 2 in the String pool and  1 separate object directly in the heap

        String fifth = new String("java");
        System.out.println(second == fifth); // false different object
    }
}
