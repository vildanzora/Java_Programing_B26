package day51_inheritance.discord_user;

public class UseDiscordUser {
    public static void main(String[] args) {

        DiscordUser user1 = new DiscordUser("Student", "Vildan", "WERFTY");
        System.out.println(user1);


        Admin admin1 = new Admin("Nurdan", "1234567");
        System.out.println(admin1);
        admin1.createChannel();

        Student student1 = new Student("Ihsan", "12345679");
        System.out.println(student1);
        student1.sendMessage();






    }
}
