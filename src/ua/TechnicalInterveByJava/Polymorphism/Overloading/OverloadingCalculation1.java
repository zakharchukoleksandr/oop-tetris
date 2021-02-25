package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//byte можно повысить до short, int, long, float или double.
// Тип данных short может быть повышен до int, long, float
// или double. Тип данных char может быть повышен до int, long,
// float или double и так далее.

public class OverloadingCalculation1 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String args[]) {
        OverloadingCalculation1 obj = new OverloadingCalculation1();
        obj.sum(20, 20);//now second int literal will be promoted to long
        obj.sum(20, 20, 20);

    }

}
//40
//60