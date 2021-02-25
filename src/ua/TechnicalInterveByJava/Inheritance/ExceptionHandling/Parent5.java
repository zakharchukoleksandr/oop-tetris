package ua.TechnicalInterveByJava.Inheritance.ExceptionHandling;


//Пример в случае, если метод переопределения подкласса
// объявляет исключение подкласса

public class Parent5 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

class TestExceptionChild4 extends Parent5 {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String args[]) {
        Parent5 p = new TestExceptionChild4();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }

}
//child