package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

public class Null {
    public static void greet() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        ((Null)null).greet();
    }
}
//Hello world (The key to understanding this puzzle is that
// Null.greet is a static method. A qualifying expression for
// a static method invocation is evaluated, but its value is
//ignored. )
//Привет, мир (ключ к пониманию этой загадки в том, что
//// Null.greet - статический метод. Квалифицирующее выражение для
//// вызов статического метода оценивается, но его значение равно
//// игнорируется.