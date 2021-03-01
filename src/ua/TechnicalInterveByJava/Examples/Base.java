package ua.TechnicalInterveByJava.Examples;
//What is the output of the following Java program?
public class Base {
    public void baseMethod() {
        System.out.println("BaseMethod called ...");
    }
}

class Derived extends Base {
    public void baseMethod() {
        System.out.println("Derived method called ...");
    }
}

