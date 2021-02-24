package ua.TechnicalInterveByJava.OOP.StaticMethod;

//Java Program to demonstrate the use of a static method.
public class StudentStaticMethod {
    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    //constructor to initialize the variable
    StudentStaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
//Test class to create and display the values of object


