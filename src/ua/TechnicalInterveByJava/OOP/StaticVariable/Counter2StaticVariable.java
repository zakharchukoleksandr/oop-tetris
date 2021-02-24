package ua.TechnicalInterveByJava.OOP.StaticVariable;

//Программа счетчика по статической переменной
//Как мы уже упоминали выше, статическая переменная получит память только один раз, если какой-либо объект изменит значение статической переменной, он сохранит свое значение.
//Java Program to illustrate the use of static variable which
//is shared with all objects.

public class Counter2StaticVariable {
    static int count = 0;//will get memory only
    // once and retain its value

    Counter2StaticVariable () {
        count++;  //incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
        //creating objects  
        Counter2StaticVariable  c1 = new Counter2StaticVariable ();
        Counter2StaticVariable  c2 = new Counter2StaticVariable ();
        Counter2StaticVariable  c3 = new Counter2StaticVariable ();
    }
}  

//1
//2
//3