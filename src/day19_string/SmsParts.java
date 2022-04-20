package day19_string;

public class SmsParts {
    public static void main(String[] args) {
       /*  SMS parts]
        Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and
            problem solving}”
        Separate these parts and print them separately:
        Sender: actualSender
        Number: actualNumber
        Message: actualMessage” */

        String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        String sender = message.substring( message.indexOf('S') , message.indexOf('<' ) );
        String actualSender = message.substring(message.indexOf('<')+1, message.indexOf('>'));

        String number = message.substring( message.indexOf('F'), message.indexOf('[')   );
        String actualNumber = message.substring( message.indexOf('[')+1 , message.indexOf(']')      );

        String mes = message.substring( message.indexOf('M'), message.indexOf('{')   );
        String actualMessage = message.substring( message.indexOf('{')+1 , message.indexOf('}')      );

        System.out.println(sender + actualSender);
        System.out.println(number + actualNumber);
        System.out.println(mes + actualMessage);


        /*
         String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int senderStart = msg.indexOf('<');
        int senderEnd = msg.indexOf('>');

        int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int msgEnd = msg.indexOf('}');

        System.out.println("Sender: " + msg.substring(senderStart + 1, senderEnd));
        System.out.println("Number: " + msg.substring(numberStart + 1, numberEnd));
        System.out.println("Message: " + msg.substring(msgStart + 1, msgEnd));
         */



    }
}
