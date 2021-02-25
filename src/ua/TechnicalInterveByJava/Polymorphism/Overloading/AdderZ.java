package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Почему невозможна перегрузка метода при изменении типа
// возвращаемого значения в java?
//В Java перегрузка метода невозможна путем изменения типа
// возвращаемого значения программы во избежание двусмысленности.

public class AdderZ {
   /* static int add(int a, int b) {
        return a + b;
    }*/

    static double add(int a, int b) {
        return a + b;
    }
}

class TestOverloadingZ {
    public static void main(String[] args) {
        System.out.println(AdderZ.add(11, 11));//ambiguity
    }

}
//method add(int, int) is already defined in class AdderZ