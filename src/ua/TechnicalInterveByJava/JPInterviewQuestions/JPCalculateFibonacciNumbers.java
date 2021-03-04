package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 9) Написать программу на Java для вычисления серии чисел
 Фибоначчи.
Ответ:

Ряд Фибоначчи — это такая серия чисел, где после первых двух
чисел - каждое встречающееся число является суммой двух
предыдущих чисел.

Пример: 0,1,1,2,3,5,8,13,21 ………

В этой программе мы снова использовали класс Scanner с nextInt
(описывалось выше). Первоначально мы вводим (через командную строку)
 некое число, какое количество чисел Фибоначчи мы должны получить.
 Мы объявили целочисленные переменные number, x, y и z,
 инициализировали x и y нулем, а z - единицей. Затем мы использовали
 цикл for для итерации.

Процесс решения в цикле выглядит так – мы присваиваем x значение
равное y (которое в первой итерации равно 0), затем y присваиваем
значение переменной z (равное в первой итерации 1).
Затем переменной z присваиваем значение равное
сумме значений x и y.*/
/*Q # 9) Write a program on Java to calculate the Fibonacci
series of numbers.
Answer:

The Fibonacci series is a series of numbers where, after
the first two numbers, each number is the sum of the previous
two numbers.

Example: 0.1,1,2,3,5,8,13,21.........

In this program, we used the Scanner class with nextInt
again (described above). Initially, we introduce
(through the command line) a certain number,
how many numbers of Fibonacci we should get.
We announced intethe number, x, y and zvariables,
and we initiated x and y zero, and z - one. We then
used the for loop for iteration.

The solution process in the loop looks like this -
we assign x value to the equivalent of y
(which in the first iteration is 0), then y
assign the value of the variable z
(equal in the first iteration 1).
Then we assign the value of x and */

import java.util.Scanner;

public class JPCalculateFibonacciNumbers {
    public static void main(String[] args) {
        //  9 of the top 20 test jobs interviewed for Java developer
        int number, x = 0, y = 0, z = 1;

        Scanner scannerQ = new Scanner(System.in);
        System.out.println();

        number = scannerQ.nextInt();
        System.out.println("Fibonacci Numbers Series:");

        for (int i = 0; i <= number; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.println(x + "");
            //If you want to display in the current line - use print()

        }

    }
}
//20
//Fibonacci Numbers Series:
//0
//1
//1
//2
//3
//5
//8
//13
//21
//34
//55
//89
//144
//233
//377
//610
//987
//1597
//2584
//4181
//6765