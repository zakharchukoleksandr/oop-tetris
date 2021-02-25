package ua.TechnicalInterveByJava.Inheritance.ExceptionHandling;

//Пример в случае, если метод переопределения
// подкласса не объявляет исключения

public class Parent6 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

class TestExceptionChild5 extends Parent6 {
    void msg() {
        System.out.println("child");
    }

    public static void main(String args[]) {
        Parent6 p = new TestExceptionChild5();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }

}
//child