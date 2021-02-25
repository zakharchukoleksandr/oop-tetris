package ua.TechnicalInterveByJava.Polymorphism.Overloading;

public class OverloadingCalculationV {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverloadingCalculationV obj = new OverloadingCalculationV();
        obj.sum(20, 20);//now ambiguity
    }

}
//both method sum(int,long) in OverloadingCalculationV
//      and method sum(long,int) in OverloadingCalculationV match
//1 error

//Объяснение
//Есть два метода, определенных с одинаковым именем,
// например, sum. Первый метод принимает целочисленный
// и длинный тип, тогда как второй метод принимает длинные и
// целочисленные типы. Переданные параметры: a = 20, b = 20.
// Мы не можем сказать, какой метод будет вызван, поскольку не
// упоминается четкое различие между целочисленным литералом и
// длинным литералом. Это случай двусмысленности. Следовательно,
// компилятор выдаст ошибку.