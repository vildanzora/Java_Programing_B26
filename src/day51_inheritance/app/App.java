package day51_inheritance.app;

public class App {

    double version;
    String name;

    public App (String name, double version){
        this. name = name;
        this.version = version;
    }

    public void download () {
        System.out.println(name + " is downloading " + version);
    }

}
/*
- create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version

 */