package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Почему перегрузка метода невозможна при изменении только
// возвращаемого типа метода?
//В java перегрузка метода невозможна путем изменения типа
// возвращаемого значения метода только из-за двусмысленности.
// Посмотрим, как может возникнуть двусмысленность:

public class AdderAmbiguity {
    static int add(int a, int b) {
        return a + b;
    }

   /* static double add(int a, int b) {
        return a + b;
    }*///error
}

 class TestOverloading4 {
    public static void main(String[] args) {
        System.out.println(AdderAmbiguity.add(11, 11));//ambiguity
    }
}

//22


//System.out.println (Adder.add (11,11)); // Здесь, как Java может
// определить, какой метод sum () следует вызвать?