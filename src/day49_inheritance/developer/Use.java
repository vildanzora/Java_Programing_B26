package day49_inheritance.developer;

public class Use {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Vildan";
        employee.isFullTime = true;
        employee.salary = 350_000;
        employee.work();

        Testers tester = new Testers();
        tester. name = "Alp";
        tester.isFullTime = false;
        tester.bugsFound = true;
        tester.salary = 300_000;
        tester.test();
        tester.work();


        Developer dev = new Developer();
        dev.name = "Nurdan";
        dev.isFullTime = true;
        dev.salary = 150_000;
        dev.featuresCreated = true;
        dev.work();
        dev.develop();



    }
}
