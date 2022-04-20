package day33_methods;

public class JamesBackArray {
    public static void main(String[] args) {

        String[][] arr = new String[3][];

        arr[0] = new String[]{"James", "is", "back"};
        arr[1] = new String[]{"he", "was", "never", "gone"};
        arr[2] = new String[]{"methods", "tomorrow"};

        String message = "";

        for (String[] eachArr : arr) {
            for (String eachWords : eachArr) {
                message += eachWords.charAt(eachWords.length() - 1);
            }
            System.out.println(message);
            message = "";
        }


    }
}
