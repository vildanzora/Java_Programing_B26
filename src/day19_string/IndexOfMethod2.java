package day19_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String s = "java";

        System.out.println(s.indexOf('a')); // 1 => because the first a characters' index number is 1
        System.out.println(s.lastIndexOf('a'));


        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));

        System.out.println(s2.indexOf("cb")); // seeing 2 because first c index number is 2
        System.out.println(s2.indexOf("cbd")); // cbd sequence is not in the String so we get -1
        System.out.println(s2.indexOf('z')); // the character z is not in the String so we get -1




    }
}
