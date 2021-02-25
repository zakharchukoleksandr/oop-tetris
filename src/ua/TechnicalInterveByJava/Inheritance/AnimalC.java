package ua.TechnicalInterveByJava.Inheritance;
//Пример иерархического наследования
//Когда два или более класса наследуют один класс,
// это называется иерархическим наследованием .
// В приведенном ниже примере классы Dog и Cat наследуют класс Animal,
// поэтому существует иерархическое наследование.

public class AnimalC {
    void eat() {
        System.out.println("eating...");
    }
}

class DogC extends AnimalC {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends AnimalC {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();

        c.meow();
        c.eat();
       // c.bark();
        // C.T.Error
    }
}

//meowing...
//eating...
