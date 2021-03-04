package ua.TechnicalInterveByJava.JPInterviewQuestions.JPSwapValues;
/*Q # 4) Write a program to Java to swap the values stored
 in the two variables without using the third variable.
Answer:

In the beginning, everything will be the same as in the
example above. Only further logic will change. Here, we
first assign a variable to a value a b, which means that
 a will now have both a and b.

We then assign a b to a b, which means that we deduct b
from the amount(a+b) . Until now, a still holds the amount
of the original a and b. But b now has the value of the original a.
Finally, in the third step, we assign a a value to a-b,
which means that we subtract the value of variable b
(which now has a value a)from the amount (a+b).
As a result of these actions, we have swapped the values
stored in the variables.*/
/*В начале все будет так же, как и в приведенном выше примере.
 Только дальнейшая логика изменится. Здесь мы сначала присваиваем
 переменной a значение a + b, что означает, что a будет теперь
 иметь в себе значение как a, так и b.

Затем мы присваиваем переменной b значение a - b, что означает,
 что мы вычитаем значение b из суммы (a + b). До сих пор a все
 еще хранит в себе сумму изначальных a и b. Но b имеет теперь
 значение первоначального a.
Наконец, на третьем шаге мы присваиваем a значение a - b, что
означает, что мы вычитаем значение переменной b (которая сейчас
уже имеет в себе значение a) из суммы (a + b). В результате этих
действий мы поменяли местами значения, хранящиеся в переменных.*/

import java.util.Scanner;

public class SwapValuesVar2 {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Enter the right values a and b");

        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        b = scannerQ.nextInt();
        System.out.println("Before the exchange of values \na = " +a+"\nb = "+b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After exchanging values without an intermediate variable\na = "+a+"\nb = "+b);

    }
}
//Enter the right values a and b
// 22
//23
//Before the exchange of values
//a = 22
//b = 23
//After exchanging values without an intermediate variable
//a = 23
//b = 22