package ua.TechnicalInterveByJava.Polymorphism;


public class Animal2 {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog2 extends Animal2 {
    void eat() {
        System.out.println("dog2 is eating...");
    }
}

class BabyDog1 extends Dog2 {
    public static void main(String args[]) {
        Animal2 a = new BabyDog1();
        a.eat();
    }
}

//dog2 is eating...
