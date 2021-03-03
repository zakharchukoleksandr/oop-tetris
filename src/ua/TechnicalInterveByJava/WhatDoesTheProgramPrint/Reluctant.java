package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

public class Reluctant {
   // private Reluctant internalInstance=new Reluctant();
    public Reluctant()throws Exception{
        throw new Exception("I am not com in out");

    }

    public static void main(String[] args) {
        try {
            Reluctant b=new Reluctant();
            System.out.println("Surprise");

        }catch (Exception ex){
            System.out.println("I told you so");//I told you so - if commit 4 rove
        }
    }
}
//StackOverflowError