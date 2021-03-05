package ua.TechnicalInterveByJava.Examples;

public class AExample {
    public static void main(String args[]) {
        System.out.println(10 + 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 + 20);
    }

}
//30Javatpoint
//Javatpoint1020
//Объяснение
//В первом случае 10 и 20 обрабатываются как числа и
// добавляются к 30. Теперь их сумма 30 обрабатывается
// как строка и объединяется со строкой Javatpoint .
// Следовательно, на выходе будет 30Javatpoint .
//Во втором случае строка Javatpoint объединяется
// с 10, чтобы быть строкой Javatpoint10, которая затем
// будет объединена с 20, чтобы получить Javatpoint1020 .