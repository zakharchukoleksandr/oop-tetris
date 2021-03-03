package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

public class Confusing {
    private Confusing(Object o){
        System.out.println("Object");
    }
    private Confusing (double[]dArray){
        System.out.println("double array");
    }

    public static void main(String[] args) {
        new Confusing(null);
    }
}
//double array(in our program, both constructors are accessible
// and applicable.
// The constructor Confusion(Object) accepts any parameter passed
// to Confusion(double[]),
// so Confusion (Object) is less specific.(Every double array is
// an Object, but not
// every Object is a double array).

//в нашей программе оба конструктора доступны и применимы.
//// Конструктор Confusion (Object) принимает любой параметр,
// переданный в Confusion (double []),
//// поэтому Confusion (Object) менее конкретен. (Каждый двойной
// массив является объектом, но не
//// каждый объект представляет собой двойной массив