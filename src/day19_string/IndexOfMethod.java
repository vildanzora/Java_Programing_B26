package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";
        //          012

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf("x")); //-1
        System.out.println(s.indexOf("y")); //-1
        System.out.println(s.indexOf("pe")); // the methods give me a one result. its give me a zero because p  start with o in index. Its give first letters' index number
        System.out.println(s.indexOf("en")); // the first one is e because we see 1 in output, its index number is 1

        System.out.println(s.indexOf("pz")); // -1 because String doesnt have z

    }
}
