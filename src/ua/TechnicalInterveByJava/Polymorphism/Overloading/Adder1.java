package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Перегрузка метода: изменение типа данных аргументов

//В этом примере мы создали два метода, которые различаются
// типом данных . Первый метод добавления получает два целочисленных
// аргумента, а второй метод добавления получает два аргумента
// типа double.

 class Adder1 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class TestOverloading3 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6));
    }
}


//22.0
//24.9