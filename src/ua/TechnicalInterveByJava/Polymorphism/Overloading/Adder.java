package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Перегрузка метода: изменение № аргументов
//В этом примере мы создали два метода: первый метод add ()
// выполняет сложение двух чисел,
// а второй метод добавления выполняет сложение трех чисел.
//В этом примере мы создаем статические методы, поэтому нам
// не нужно создавать экземпляр для вызова методов.

public class Adder {
    static double add(double a, double b) {
        return (int) (a + b);
    }

    static int add(int a, int b, int c) {
        return  a + b + c;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }

}
//22
//33