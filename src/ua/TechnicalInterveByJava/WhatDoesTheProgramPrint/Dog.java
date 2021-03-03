package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

public class Dog {
    public static void bark() {
        System.out.println("woof");
    }
    static class Basenji extends Dog{
        public static void bark() {

        }
        public static class Bark{
            public static void main(String[] args) {
                Dog woofer=new Dog();
                Dog nipper=new Basenji();
                woofer.bark();
                nipper.bark();
            }
        }
    }
}
//woof
//woof