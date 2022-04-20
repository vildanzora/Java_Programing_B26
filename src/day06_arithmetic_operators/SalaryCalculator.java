package day06_arithmetic_operators;

public class SalaryCalculator {

    /*
    create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */

    public static void main(String[]args){

        double salary = 100_000;
        double stateTaxRate = 0.08; // 8 %
        double federalTaxRate = 0.21; // 21 %

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println( "Salary: " + salary);
        System.out.println("Federal Tax Rate: " + federalTaxRate);
        System.out.println("State Tax Rate: " + stateTaxRate);
        System.out.println("State Tax: " + stateTax);
        System.out.println("Federal Tax : " + federalTax);
        System.out.println("Total Tax: " + totalTax);
        System.out.println(salaryAfterTax);

        /*
declare and assign a short variable
declare and assign a byte variable with the short value above. Cast if needed

declare and assign a float variable
declare and assign a double variable with the float value above. Cast if needed

declare and assign a double variable
declare and assign a int variable with the double value above. Cast if needed

declare and assign a long variable
declare and assign a int variable with the long value above. Cast if needed
int i = 40;
long l = i;

long l = 100;
int i = (int) l;
 */
        byte num1 = 2;
        short num2 = num1;

        float num3 = 1.02F;
        double num4 = num3;

        double num5 = 2.35;
        int num6 = (int)num5;

        long num7 = 123456789L;
        int num8 = (int)num7;


        System.out.println(num8);








    }

}

