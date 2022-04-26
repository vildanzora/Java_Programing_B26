package day51_inheritance.discord_user;

public class Student extends DiscordUser{

    public Student (String name, String ID) {
        super ("Student", name, ID);
    }

    public void sendMessage () {
        System.out.println("Sending message to class chat");
    }

}
