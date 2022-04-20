package day12_if_statements;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        /*ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French

        based on the number they picked print a message:

        1 : "hello, thank for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        any other number: "We will use English by default"*/
Scanner scan = new Scanner(System.in);
        System.out.println("Please choose your native language. Write the number and enter. \n1-English\n2-Spanish\n3-Turkish\n4-Russian\n5-French");
        int answer1 = scan.nextInt();
        if(answer1 ==1){
            System.out.println("\"Hello, thank for your call\"");
        }  else if (answer1 == 2){
            System.out.println("\"Hola, gracias para llamar\"");
        }  else if (answer1 == 3){
            System.out.println("\"Merhaba, aradiginiz icin tesekkurler\" ");
        }  else if(answer1 == 4) {
            System.out.println("\"Privet, spasibo za vash zvonok\" ");
        }  else if(answer1 == 5){
            System.out.println("\"Merci ,pour votre appel\"");
        }else {
            System.out.println("\"We will use English by default\"");
        }

    }
}


