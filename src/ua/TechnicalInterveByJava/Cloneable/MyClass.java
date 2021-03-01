package ua.TechnicalInterveByJava.Cloneable;
//синтаксис вызова clone()
//Object copy = obj.clone();
//MyClass copy=(MyClass)obj.clone();

public class MyClass implements Cloneable {
    public Integer i = 10;

    public MyClass clone() throws CloneNotSupportedException {
        MyClass obj = (MyClass) super.clone();
        obj.i = i;
        return obj;
    }

    public String toString() {
        return i.toString();
    }
}

