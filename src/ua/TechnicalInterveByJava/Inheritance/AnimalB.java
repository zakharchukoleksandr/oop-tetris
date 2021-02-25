package ua.TechnicalInterveByJava.Inheritance;
//Пример многоуровневого наследования
//Когда существует цепочка наследования, это называется
// многоуровневым наследованием . Как вы можете видеть в
// приведенном ниже примере, класс BabyDog наследует класс Dog,
// который снова наследует класс Animal,
// поэтому существует многоуровневое наследование.

public class AnimalB {
    void eat() {
        System.out.println("eating...");
    }
}

class DogB extends AnimalB {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends DogB {
    void weep() {
        System.out.println("weeping...");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
//weeping...
//barking...
//eating...

