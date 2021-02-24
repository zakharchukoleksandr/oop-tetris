package ua.TechnicalInterveByJava.OOP.StaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        StudentStaticMethod.change();//calling change method
        //creating objects
        StudentStaticMethod s1 = new StudentStaticMethod(111, "Karan");
        StudentStaticMethod s2 = new StudentStaticMethod(222, "Aryan");
        StudentStaticMethod s3 = new StudentStaticMethod(333, "Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }

}
//111 Karan BBDIT
//222 Aryan BBDIT
//333 Sonoo BBDIT