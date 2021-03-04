package ua.TechnicalInterveByJava.JPInterviewQuestions.JPSwapValues;
/*Write a program to Java to swap values stored in two variables
with a third variable
Answer:

In this example, we're creating an Scanner class object to work
with a standard data stream System.in. This program will take a
and b values through the command line.

We used nextInt,which will put the user's inte matter in a and b.
We also announce a temporary variable.

Now the logic of the program is this: we create a temporary or
 third variable with the name temp,assign it to the value stored
 in variable a,and then we assign a value b,and again assign b
 to temp. Thus, after all operations, temp will store a, a b,and b
 will be temp (which is equal to a).*/
/*В этом примере мы создаем объект класса Scanner для работы со
стандартным потоком ввода данных System.in. Эта программа будет
принимать значения a и b через командную строку.

Мы использовали nextInt(), который будет помещать введенные
пользователем значения целочисленнох переменных в a и b. Также
объявляем временную переменную.

Теперь логика программы выглядит следующим образом: мы
создаем временную или третью переменную с именем temp,
присваиваем ей значение, хранящееся в переменной a, а затем
мы присваиваем a значение b, и снова присваиваем b значение
temp. Таким образом, после выполнения всех операций temp будет
хранить в себе значение a, a получит значение b, а b будет
 иметь значение temp (которое равно a).*/

import java.util.Scanner;

public class JPSwapValuesVar1 {
    public static void main(String[] args) {
        //  3 of the top 20 test jobs interviewed for Java developer
        int a, b, temp;
        System.out.println();

        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        b = scannerQ.nextInt();
        System.out.println("Before the exchange of values "+a + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After exchanging values " +a + b);


    }
}
//22
//44
//Before the exchange of values 2244
//After exchanging values4422