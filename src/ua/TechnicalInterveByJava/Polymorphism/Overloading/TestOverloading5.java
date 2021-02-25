package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Можем ли мы перегрузить метод java main ()?
//Да, путем перегрузки метода. Вы можете иметь любое
// количество основных методов в классе путем перегрузки метода.
// Но JVM вызывает метод main (), который получает массив строк
// только в качестве аргументов. Посмотрим на простой пример:

public class TestOverloading5 {
    public static void main(String[] args) {
        System.out.println("main with String[]");
    }

    public static void main(String args) {
        System.out.println("main with String");
    }

    public static void main() {
        System.out.println("main without args");
    }
}

//main with String[]
