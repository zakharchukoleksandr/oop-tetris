package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

public class AnimalFarm {
    public static void main(String[] args) {
        final String pig="length: 10";
        final String dog="length: "+pig.length();
        //final String dog="length: 10";
        System.out.println("Animal are equal:"+pig==dog);//false
        //System.out.println("Animal are equal:"+pig.equals(dog));//true
        //System.out.println(pig.equals(dog));//true

    }
}
//false(The + operator, whether used for addition or string
// concatenation, binds more tightly than the == operator.
// Therefore, the parameter of the println method is evaluated
// like this : System.out.println("Animal are equal:" +pig==dog);
// The value of the boolean Expression is, of course, false and
// that is exactly what the program prints)