package day05_variables;

public class CharExamples {

    public static void main(String[]args){

        // assigning characters to char type. Type is different bat these characters are value and variable

        char letterOne  = 'a';
        char letterTwo  = 'Z';
        char numberOne  = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // because type is character, I'll see 187 in output. 187 means that a + Z = ascii characters

        char letterThree = 65; // my type is caharacter because of this i see A in output.

        // char letterThree = '65'; this is invalid because there is two characters.

        System.out.println(letterThree);

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne); // original: 97 + 90 + 65 + 57 + 36 each character has ascii value, these are ascii value

        System.out.println(letterOne + " " +  letterTwo + " " + letterThree + " " + numberOne + " " +  specialOne );
        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne);

        System.out.println("chars: " + letterOne + "," +  letterTwo + "," + letterThree + "," + numberOne + "," +  specialOne);

    }
}
