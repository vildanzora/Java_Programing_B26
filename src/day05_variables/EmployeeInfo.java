package day05_variables;

public class EmployeeInfo {

    public static void main(String []args ){

        String name = "Vildan";
        String lastName = "Zora";
        String gender = "Female";
        int age = 27;
        String companyName = "Apple inc";
        boolean isFullTime= true;
        String jobTittle = "Software Developer Engineer in Test";
        double salary = 125.500;
        char a = '$';
        int pto = 15;
        boolean iAmMarried = true;
        char suit = 'D';

        String fullMessage ="My name is " + name + " and my last name is " + lastName + "." + " My gender is " + gender +"." +  " I am " + age + " years old." + " Yes, " + iAmMarried + " I got married last year." + " I am working for " + companyName + " as a " + jobTittle + "." + " \nYes " + isFullTime + " it is a full time job." + " They pay to me " + a  + salary + " per year." + " Paid time off in this job is " + pto + " days." + " The office suit number is " + suit + ".";

        System.out.println(fullMessage);





    }
}
