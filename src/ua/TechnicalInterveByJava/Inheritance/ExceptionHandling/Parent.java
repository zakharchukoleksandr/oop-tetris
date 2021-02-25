package ua.TechnicalInterveByJava.Inheritance.ExceptionHandling;
//Если метод суперкласса не объявляет исключение

//1) Правило: если метод суперкласса не объявляет исключение, метод
// переопределения подкласса не может объявить проверенное исключение.

import java.io.*;

public class Parent {

  //void msg()                    {System.out.println("parent");}  	}
    void msg() throws IOException {System.out.println("parent");
    }
}

class TestExceptionChild extends Parent {
    void msg() throws IOException {
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) throws IOException {
        //public static void main(String args[])  {
        Parent p = new TestExceptionChild();
        p.msg();
    }

}
//TestExceptionChild