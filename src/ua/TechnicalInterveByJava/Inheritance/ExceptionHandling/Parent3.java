package ua.TechnicalInterveByJava.Inheritance.ExceptionHandling;
//Если метод суперкласса объявляет исключение

//3)	Правило: если метод суперкласса объявляет исключение, метод
// переопределения подкласса может объявить то же самое,
// исключение подкласса или отсутствие исключения, но не
// может объявить родительское исключение.
//Пример в случае, если метод переопределения подкласса
// объявляет родительское исключение



public class Parent3 {
    void msg() throws ArithmeticException {
        System.out.println("parent");
    }
}

class TestExceptionChild2 extends Parent3 {
    void msg() throws ArithmeticException {System.out.println("child");
    //void msg() throws Exception {System.out.println("child");
    }

    public static void main(String args[]) {
        Parent3 p = new TestExceptionChild2();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }

}

//child or overridden method does not throw java.lang.Exception