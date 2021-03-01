package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Можно ли перегрузить методы, сделав их статическими?
//Нет, мы не можем перегрузить методы, просто применив к ним
// ключевое слово static (количество параметров и типов одинаково).
// Рассмотрим следующий пример.

public class AnimalX {

        void consume ( int a)
        {
            System.out.println(a + " consumed!!");
        }
       // static void consume ( int a)
        {
       //     System.out.println("consumed static " + a);
        }
        public static void main (String args[])
        {
            AnimalX a = new AnimalX();
        //    a.consume(10);
         //   AnimalX.consume(20);
        }

    }
//error: non-static method consume(int) cannot be referenced from a static context
//        Animal.consume(20);