package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

import java.util.ArrayList;
import java.util.List;

public class MainPrint2 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Object");
        list.add(list);
        for (Object object:list){
            System.out.println(object);
        }
    }
}
//Object
//[Object, (this Collection)]