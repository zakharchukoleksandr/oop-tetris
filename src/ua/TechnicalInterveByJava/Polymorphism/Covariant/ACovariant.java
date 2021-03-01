package ua.TechnicalInterveByJava.Polymorphism.Covariant;
//Что такое ковариантный возвращаемый тип?
//Теперь, начиная с java5, можно переопределить любой метод,
// изменив тип возвращаемого значения, если тип возвращаемого
// значения метода переопределения подкласса является типом подкласса.
// Он известен как ковариантный возвращаемый тип. Ковариантный тип
// возвращаемого значения указывает, что тип возвращаемого значения
// может изменяться в том же направлении, что и подкласс.

public class ACovariant {
    ACovariant get() {
        return this;
    }
}

class B1 extends ACovariant {
    B1 get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]) {
        new B1().get().message();
    }

}
//welcome to covariant return type