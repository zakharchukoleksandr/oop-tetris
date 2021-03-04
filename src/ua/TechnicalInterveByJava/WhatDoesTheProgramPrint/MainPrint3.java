package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;
//что из перечисленного при вставке в строку 5 не приведет к
// ошибке компиляции
//1. b=(s instanceof Number);
//2. b=(Number instance s);
//3. b=(s instanceof String);
//4. b= s instanceof (Short);

public class MainPrint3 {

    public static void main(String[] args) {
        Short s=15;
        Boolean b;
        //b=(s instanceof String);
        //b= s instanceof (Short);
       // b=(Number instanceof s);
        b=(s instanceof Number);
    }
}
//   b=(s instanceof Number);