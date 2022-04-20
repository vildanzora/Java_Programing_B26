package day11_if_statements;
public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 'A';
        /*if (letter >= 65 && letter <=90){
            System.out.println( letter + "= This letter is written with \"UPPERCASE\"");
        } else if (letter >= 97 && letter <= 122){
            System.out.println(letter + "= This letter is written with \"lowercase\"");

        }*/

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("lowercase");

        } if(letter >= 'A' && letter <= 'Z'){
            System.out.println("uppercase");
        }



    }
}
