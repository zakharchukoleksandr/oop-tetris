package ua.TechnicalInterveByJava.OOP.Constructors;

class StudentStaticMethodStaticMethod3DefaultConstructorDisplaysTheDefaultValues {

        int id;
        String name;

        void display () {
        System.out.println(id + " " + name);
    }

        public static void main (String args[]){
        StudentStaticMethodStaticMethod3DefaultConstructorDisplaysTheDefaultValues s1 = new StudentStaticMethodStaticMethod3DefaultConstructorDisplaysTheDefaultValues();
        StudentStaticMethodStaticMethod3DefaultConstructorDisplaysTheDefaultValues s2 = new StudentStaticMethodStaticMethod3DefaultConstructorDisplaysTheDefaultValues();
        s1.display();
        s2.display();
    }
    }
//0 null
//0 null

