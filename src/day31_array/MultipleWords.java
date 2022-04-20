package day31_array;

public class MultipleWords {
    public static void main(String[] args) {

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] seperate = words.split(",");


        for (String eachword : seperate) {

            if(eachword.trim().contains(" ")) {
                System.out.println(eachword);
            }

        }



    }
}
