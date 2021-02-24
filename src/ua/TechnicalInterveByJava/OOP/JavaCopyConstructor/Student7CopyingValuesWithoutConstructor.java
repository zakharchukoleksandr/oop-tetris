package ua.TechnicalInterveByJava.OOP.JavaCopyConstructor;
//Мы можем скопировать значения одного объекта в другой,
// присвоив значения объекта другому объекту.
// В этом случае нет необходимости создавать конструктор.

public class Student7CopyingValuesWithoutConstructor {

    int id;
    String name;
    Student7CopyingValuesWithoutConstructor(int i,String n){
        id = i;
        name = n;
    }
    Student7CopyingValuesWithoutConstructor(){}
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        Student7CopyingValuesWithoutConstructor s1 = new Student7CopyingValuesWithoutConstructor(111,"Karan");
        Student7CopyingValuesWithoutConstructor s2 = new Student7CopyingValuesWithoutConstructor();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}

//111 Karan
//111 Karan