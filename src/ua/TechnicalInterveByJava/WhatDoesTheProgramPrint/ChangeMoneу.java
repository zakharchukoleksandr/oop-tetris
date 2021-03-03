package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;
//Consider the following problem
//Tom goes to the auto parts store to buy a spark plug that
// costs 1.10 USD, but all he has in his wallet are two dollar bills.
//How much change should he get if he pays for the spark plug with
// a two-dollar bill?

//Here is a program that attempts to solve the word problem.
// What does it print?

public class ChangeMoneу {
    public static void main(String[] args) {
        System.out.println(2.0-1.10);
    }

}
//0.8999999999999999
//The problem is that the number 1.1 can not be represented
//exactly as a double, so it is represented by the closest
//double value.
//The program subtracts this value from 2.
//Unfortunately, the result of this calculation is not the closest
//double value to 0.9.