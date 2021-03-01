package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Что дает следующая программа на Java?

public class Base {
    void method(int a) {
        System.out.println("Base class method called with integer a = " + a);
    }

    void method(double d) {
        System.out.println("Base class method called with double d =" + d);
    }
}

class Derived extends Base {
    @Override
    void method(double d) {
        System.out.println("Derived class method called with double d =" + d);
    }
}

class Main {
    public static void main(String[] args) {
        new Derived().method(10);
    }

}
//Base class method called with integer a = 10

//Объяснение
//Метод () перегружен в классе Base, тогда как он является
// производным от класса Derived с типом double в качестве
// параметра. В вызове метода передается целое число.