package ua.TechnicalInterveByJava.OOP.Constructors;
//Перегрузка конструктора в Java - это метод наличия
// более одного конструктора с разными списками параметров.
// Они организованы таким образом, что каждый конструктор
// выполняет свою задачу. Они различаются компилятором
// по количеству параметров в списке и их типам.

//Java program to overload constructors
public class Student5OverloadConstructors {
    int id;
    String name;

    int age;

    //creating two arg constructor
    Student5OverloadConstructors(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Student5OverloadConstructors(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student5OverloadConstructors s1 = new Student5OverloadConstructors(111, "Karan");
        Student5OverloadConstructors s2 = new Student5OverloadConstructors(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}


//111 Karan 0
//222 Aryan 25
