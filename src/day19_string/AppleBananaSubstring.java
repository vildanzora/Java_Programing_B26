package day19_string;

public class AppleBananaSubstring {
    public static void main(String[] args) {

        String fruit1 = "apple";
        String fruit2 = "banana";

        int secondIndex = fruit1.indexOf('p');
        System.out.println(secondIndex);

        System.out.println(fruit1.substring(secondIndex));
        System.out.println(fruit2.substring(0, (fruit2.length()-1)));


    }
}
