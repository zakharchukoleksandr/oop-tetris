package ua.TechnicalInterveByJava.Cloneable;

public class TempMyClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass a = new MyClass();
        a.i = 11;
        MyClass b = a.clone();
        MyClass c = a;
        System.out.println("a:" + a + " b:" + b + " c:" + c);
        a.i = 12;
        System.out.println("a:" + a + " b:" + b + " c:" + c);

        //a:11 b:11 c:11
        //a:12 b:11 c:12 обэкты а  с измнились


    }
}
