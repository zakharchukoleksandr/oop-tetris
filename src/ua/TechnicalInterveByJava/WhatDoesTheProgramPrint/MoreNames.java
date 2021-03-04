package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

import java.util.HashMap;
import java.util.Map;

public class MoreNames {
    private Map<String, String> m =new HashMap<String, String>();
    public void MoreNames(){
        m.put("Mickey","Mouse");
        m.put("Mickey","Mantle");
    }
    public int size(){
        return m.size();
    }

    public static void main(String[] args) {
        MoreNames moreNames=new MoreNames();
        System.out.println(moreNames.size());
    }
}
//0
//The problem is that MoreNames has no programmer-declared constructor.
//What is does have is a void-returning instance method called MoreNames
//which the author probably intended as a constructor.

 //   Проблема в том, что MoreNames не имеет конструктора, объявленного программистом.
// Что есть, так это метод экземпляра, возвращающий void, который называется MoreNames
// который автор, вероятно, задумал как конструктор.