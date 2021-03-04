package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 7) Write the program to Java to see if the number is simple
or not.
Answer:

We announced two inteth of temp and number variables and used the
 Scanner class with
nextInt (since we can only have a whole number under consideration).

We declare the logical numberIsPrime variable and set its value -
true. We then use a for loop with a variable iterator value starting
with 2. The number of iterations we need will be half the number we
put in. The iteration counter increases by 1 after each iteration.
In the tempNumber variable, we'll put the balance from the dividing
value of the entered number on the counter value. If the balance
from the division in one iteration is 0, then numberIsPrime will be
 set in false,the entered number will not be easy and we exit the
 cycle. If in all iterations we get in temp some remnants from the
 division, different from zero - the number will be simple.
Based on the value of numberIsPrime,we come to the conclusion
whether our number is simple or not.*/

/*Q # 7) Напишите программу на Java, чтобы узнать, является ли
число простым или нет.
Ответ:
Мы объявили две целочисленных переменных temp и number и
использовали класс Scanner с nextInt (поскольку у нас может
быть на рассмотрении только целое число).
Объявляем логическую переменную numberIsPrime и устанавливаем
ее значение - true. После этого мы используем цикл for со значением
переменной итератора, начинающемся с 2. Количество итераций,
нужное нам, будет равно половине введенного числа. Счетчик
итераций увеличивается на 1 после каждой итерации. В переменную
tempNumber мы будем помещать остаток от деления значения
введенного числа на значение счетчика. Если остаток от деления
в одной из итераций будет равен 0, тогда numberIsPrime будет
установлен в false, введенное число не будет простым, и мы
выходим из цикла. Если во всех итерациях мы будем получать
 в temp некие остатки от деления, отличные от нуля – число
 будет простым.Основываясь на значении numberIsPrime, мы приходим
 к выводу, является  ли наше число простым или нет.*/

import java.util.Scanner;

public class JPNumberSimpleOrNot {
    private static int tempNumber;

    public static void main(String[] args) {

        int temp, number;
        boolean numberIsPrime = true;

        Scanner scannerQ = new Scanner(System.in);
        number = scannerQ.nextInt();
        scannerQ.close();

        for (int x = 2; x<= number /2; x++) {
            tempNumber = number %x;
            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if(numberIsPrime)
            System.out.println (number + " number is simple");
        else
            System.out.println (number + " number is not simple");
    }
    }

//27
//27 number is not simple