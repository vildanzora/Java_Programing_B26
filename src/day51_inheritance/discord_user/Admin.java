package day51_inheritance.discord_user;

public class Admin extends DiscordUser{

    public Admin (String name, String ID) {
        super ("Admin", name, ID);
    }

    public void createChannel () {
        System.out.println("Creating a new discord channel");
    }

}

/*
Create a class Admin

    - Admin class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    - create method:
        createChannel()
            Example output: prints Creating new discord channel

Create a class Student

    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
 */