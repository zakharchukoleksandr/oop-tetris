package ua.TechnicalInterveByJava.Inheritance;
//Когда класс наследует другой класс, это называется
// одиночным наследованием . В приведенном ниже примере класс
//Dog наследует класс Animal,поэтому существует единственное
// наследование.

public class AnimalA {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends AnimalA {
    void bark() {
        System.out.println("barking...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

//barking...
//eating...
