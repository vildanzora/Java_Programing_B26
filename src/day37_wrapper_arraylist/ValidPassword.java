package day37_wrapper_arraylist;


import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        int upper = 0;
        int lower =0;
        int number =0;
        int other =0;
        boolean valid = false;

        if (password.length() < 8) {
            System.out.println("Must have at least 8 characters");
        } else {

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)){
                    upper++;
                } else if (Character.isLowerCase(ch)){
                    lower++;
                } else if (Character.isDigit(ch)) {
                    number++;
                } else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch =='*') {
                    other++;
                }
            }
            valid = (upper >=1 && lower >=1 && number >=1 && other >=1);
        }

        System.out.println(valid ? "Valid Password" : "Not valid password");





    }
}
