package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String str2 = "A";
        System.out.println(str.startsWith(str2)); // does the string str start with the string s.

        System.out.println(str.startsWith("  app"));
        System.out.println(str.startsWith("Aoo"));

        System.out.println(str.startsWith("    App")); // spaces are in the string, so its counts as a space character
        System.out.println(str.startsWith(       "App")); // spaces are in the code, doesn't affect the string

      String sentence = "today is a good day";
        System.out.println(sentence.startsWith("today was a"));

        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("good"));
        System.out.println(sentence.endsWith("today was a good day"));





    }
}
