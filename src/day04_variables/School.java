package day04_variables;

public class School {

    public static void main(String[]args){

       /*  Task:

        class name: School

        declare and assign these variables
        number of students in grade 1
        number of students in grade 2
        number of students in grade 3
        number of students in grade 4
        number of students in grade 5

        total number of students in your school

        number of days in a year (have some half day = ~ 100.5)
        average gpa in school

        print all of the variables with unique messages */


        int numberOfStudentInGrade1 = 10;
        int numberOfStudentInGrade2 = 20;
        int numberOfStudentInGrade3 = 30;
        int numberOfStudentInGrade4 = 40;
        int numberOfStudentInGrade5 = 50;

        double daysInAyear =  365.5;
        double snowDaysInAYear = 8.5;
        double averageGpa      = 3.5;

        System.out.println("NumberOfStudentInGrade1\t\t\t\t: " + numberOfStudentInGrade1);
        System.out.println("NumberOfStudentInGrade2\t\t\t\t: " + numberOfStudentInGrade2);
        System.out.println("NumberOfStudentInGrade3\t\t\t\t: " + numberOfStudentInGrade3);
        System.out.println("NumberOfStudentInGrade4\t\t\t\t: " + numberOfStudentInGrade4);
        System.out.println("NumberOfStudentInGrade5\t\t\t\t: " + numberOfStudentInGrade5);
        System.out.print("Total student number of our school  :");
        System.out.println(numberOfStudentInGrade1 + numberOfStudentInGrade2 + numberOfStudentInGrade3 + numberOfStudentInGrade4 + numberOfStudentInGrade5);

        System.out.println("\nNumber of days in a year\t\t\t: " + daysInAyear);
        System.out.println("Number of snow days in a year\t\t: " + snowDaysInAYear);
        System.out.println("Average GPA in school\t\t\t\t: " + averageGpa);





    }
}
