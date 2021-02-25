package ua.TechnicalInterveByJava.SuperThis;
//What is super in java?
//Super ключевое слово в Java является ссылкой переменной ,
// которая используется для обозначения непосредственного
// объекта родительского класса. Всякий раз, когда вы создаете
// экземпляр подкласса, неявно создается экземпляр родительского
// класса, на который ссылается супер-ссылочная переменная.
// Super () вызывается в конструкторе класса неявно компилятором,
// если нет super или this.

public class AnimalSuper {
    AnimalSuper() {
        System.out.println("animal is created");
    }
}

class Dog extends AnimalSuper {
    Dog() {
        System.out.println("dog is created");
    }
}

class TestSuper4 {
    public static void main(String args[]) {
        Dog d = new Dog();
    }

}
//animal is created
//dog is created