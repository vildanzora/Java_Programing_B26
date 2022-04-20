package Questions;
import java.util.Scanner;
public class Assessment {
    public static void main(String[] args) {

        /*int cookies = 10;
        String day = " tuesday";

        switch (day) {
            case "sunday" :
                cookies++;
            case "monday":
                cookies +=5;
                break;
            case "tuesday":
            case "wednesday":
                cookies += 10;
            case "thursday":
                cookies += 5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies =0;
        }
        System.out.println(cookies);*/

      /* int check = 132;
       String str = "";

       if (check % 2 == 0) {
           str += check;
           if (check % 5 == 0) {
               str += "132";
           } else {
               str = " 500";
           }
       } else {
           str += "123";
       }
        System.out.println(str);*/
Scanner input = new Scanner(System.in);
String first = input.nextLine();
String last = input.nextLine();
int number = input.nextInt();

String fullName = "";

if (number %2 ==0) {
    fullName = first + " " + last;

} else {
    fullName = "Not valid name";
}

        System.out.println(fullName);






    }
}
