package ua.TechnicalInterveByJava.Inheritance.MethodOverriding;
//Давайте разберемся с проблемой, с которой мы можем
// столкнуться в программе,
// если не будем использовать переопределение метода.

//Java Program to demonstrate why we need method overriding
//Here, we are calling the method of parent class with child
//class object.
//Creating a parent class

public class VehicleMethodOverriding {
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Creating a child class
class Bike extends VehicleMethodOverriding {
    public static void main(String args[]) {
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance
        obj.run();
    }

}
//Vehicle is running
//Проблема в том, что я должен предоставить конкретную
// реализацию метода run () в подклассе, поэтому мы
// используем переопределение (extends-расширение) метода.
//________________________________________