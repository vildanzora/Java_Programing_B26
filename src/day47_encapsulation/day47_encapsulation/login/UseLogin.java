package day47_encapsulation.day47_encapsulation.login;

import day47_encapsulation.day47_encapsulation.login.LoginEncapsulationExample;

public class UseLogin {
    public static void main(String[] args) {

        LoginEncapsulationExample obj = new LoginEncapsulationExample();
       //  obj.username = "jamesbond";
     //    obj.password = "1234";
        // can not acces private variables directly

        obj.setUsername("jamesbond");
        obj.setPassword("1234");



    }
}
