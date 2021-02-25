package ua.TechnicalInterveByJava.Polymorphism;
//Полиморфизм среды выполнения Java с многоуровневым наследованием
//Давайте посмотрим на простой пример полиморфизма времени выполнения с
// многоуровневым наследованием.

public class Animal1 {
    void eat() {
        System.out.println("eating");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("eating fruits");
    }
}

class BabyDog extends Dog {
    void eat() {
        System.out.println("drinking milk");
    }

    public static void main(String args[]) {
        Animal1 a1;
        Animal1 a2;
        BabyDog a3;
        a1 = new Animal1();
        a2 = new Dog1();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }

}
//eating
//eating fruits
//drinking milk