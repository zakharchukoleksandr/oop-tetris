package ua.TechnicalInterveByJava.OOP.StaticVariable;
//Понимание проблемы без статической переменной
//1.	class Student{
//2.	     int rollno;
//3.	     String name;
//4.	     String college="ITS";
//5.	}
//Предположим, что в моем колледже 500 студентов, теперь все члены данных экземпляра будут получать память каждый раз при создании объекта. У всех студентов есть свое уникальное имя и номер, поэтому в этом случае подойдет элемент данных экземпляра. Здесь «колледж» относится к общей собственности всех объектов . Если мы сделаем его статическим, это поле получит память только один раз.
//Статическое свойство Java является общим для всех объектов.

//Java Program to demonstrate the use of static variable

public class StudentUseOfStaticVariable {
	   int rollno;//instance variable
	   String name;
	   static String college ="ITS";//static variable
	   //constructor
       StudentUseOfStaticVariable(int r, String n){
        	   rollno = r;
        	   name = n;
        	   }
	   //method to display the values
           void display (){System.out.println(rollno+" "+name+" "+college);}
	}


