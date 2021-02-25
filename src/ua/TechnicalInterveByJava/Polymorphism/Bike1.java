package ua.TechnicalInterveByJava.Polymorphism;
//Полиморфизм среды выполнения Java с элементом данных
//
//Переопределяется метод, а не члены данных, поэтому полиморфизм
//времени выполнения не может быть достигнут с помощью членов данных.
//В приведенном ниже примере оба класса имеют ограничение скорости
//члена данных. Мы получаем доступ к элементу данных с помощью
//ссылочной переменной родительского класса, которая ссылается на
//объект подкласса. Поскольку мы обращаемся к члену данных, который
//не переопределяется, следовательно, он всегда будет обращаться к
//члену данных родительского класса.
//
//Правило: полиморфизм времени выполнения не может быть достигнут с
//помощью элементов данных.

public class Bike1 {
	 int speedlimit=90;
	}
	class Honda3 extends Bike1 {
        int speedlimit = 150;

        public static void main(String args[]) {
            Bike1 obj = new Honda3();
            System.out.println(obj.speedlimit);//90

        }
    }

//90