package ua.TechnicalInterveByJava.StaticVariable;

//Test class to show the values of objects
public class TestStaticVariable1 {

    public static void main(String args[]) {
        StudentUseOfStaticVariable s1 = new StudentUseOfStaticVariable(111, "Karan");
        StudentUseOfStaticVariable s2 = new StudentUseOfStaticVariable(222, "Aryan");
        //we can change the college of all objects by the single line of code
//        StudentUseOfStaticVariable.college="BBDIT";
        s1.display();
        s2.display();
    }
}
//111 Karan ITS
//222 Aryan ITS