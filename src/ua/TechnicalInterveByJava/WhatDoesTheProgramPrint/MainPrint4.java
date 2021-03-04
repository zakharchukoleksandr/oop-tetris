package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

public class MainPrint4 extends Thread {
    private int a;
    public MainPrint4(){
        a=2;
        start();
        System.out.println(a);
    }
    public void run(){
        a++;
    }

    public static void main(String[] args) {
        new MainPrint4();
    }
}
//2