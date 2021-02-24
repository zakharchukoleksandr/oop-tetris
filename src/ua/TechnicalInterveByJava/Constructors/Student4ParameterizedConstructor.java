package ua.TechnicalInterveByJava.Constructors;
//Java Program to create and call a default constructor

public class Student4ParameterizedConstructor {
    int id;
    String name;

    //creating a parameterized constructor
    Student4ParameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        //creating objects and passing values
        Student4ParameterizedConstructor s1 = new Student4ParameterizedConstructor(111, "Karan");
        Student4ParameterizedConstructor s2 = new Student4ParameterizedConstructor(222, "Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
//111 Karan
//222 Aryan
