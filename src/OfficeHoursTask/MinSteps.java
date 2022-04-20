package OfficeHoursTask;

public class MinSteps {
    public static void main(String[] args) {


        String[] input={"x/","y/","../","z/","./","JavaProgramingB26/","../"};
        minSteps(input);

    }

    private static void minSteps(String[] steps) {
        int count = 0;
        for (String eachStep : steps) {

            switch (eachStep){

                case "./":
                    break;
                case "../":
                    count--;
                    break;
                default:
                    count++;
                    break;
            }
        }

        System.out.println(count);
    }







}

