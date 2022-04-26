package day51_inheritance.discord_user;

public class DiscordUser {

    String role;
    String name;
    String ID;

    public DiscordUser(String role, String name, String ID) {
        this.role = role;
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "DiscordUser, your role is" +
                 role + '\'' +
                ", name is'" + name + '\'' +
                ", ID is" + ID +
                '}';
    }
}
