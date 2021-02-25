package ua.TechnicalInterveByJava.Polymorphism;

//Пример полиморфизма среды выполнения Java
//В этом примере мы создаем два класса Bike и Splendor.
// Класс Splendor расширяет класс Bike и переопределяет
// его метод run (). Мы вызываем метод run по ссылочной
// переменной родительского класса. Поскольку он относится
// к объекту подкласса, а метод подкласса переопределяет
// метод родительского класса, метод подкласса вызывается
// во время выполнения.
//Поскольку вызов метода определяется JVM, а не компилятором,
// это известно как полиморфизм времени выполнения.


public class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splendor();//upcasting
        b.run();
    }

}
//running safely with 60km