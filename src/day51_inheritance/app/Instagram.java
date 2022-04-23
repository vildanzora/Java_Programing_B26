package day51_inheritance.app;

public class Instagram extends App {

    public Instagram( double version) {
        super("Instagram", 4.5);
    }

    public void postPicture () {
        System.out.println("Posting picture to Instagram");
    }




}

/*
- Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
 */