package ua.TechnicalInterveByJava.Constructors;

public class Student3DefaultConstructorDisplaysTheDefaultValues {

        int id;
        String name;

        void display () {
        System.out.println(id + " " + name);
    }

        public static void main (String args[]){
        Student3DefaultConstructorDisplaysTheDefaultValues s1 = new Student3DefaultConstructorDisplaysTheDefaultValues();
        Student3DefaultConstructorDisplaysTheDefaultValues s2 = new Student3DefaultConstructorDisplaysTheDefaultValues();
        s1.display();
        s2.display();
    }
    }
//0 null
//0 null

