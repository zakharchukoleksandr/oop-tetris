package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 17) Write a Java program to see if the number entered
is Armstrong's number.
Answer:

First of all, we need to understand what Armstrong's number
 is. Armstrong's number is a number that is equal to the sum
 of the numbers it consists of, elevated to a degree equal to
 the number of numbers in that number. As an example - number 371:
371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
If you have a four-digit number:
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 =
4096 + 16 + 0 + 4096 = 8208
As we make the decision, we first announce inteth of the
intefficnating variables tempNumber, x and y. We initiated
the y variable by 0. Then we create the qurentNumber variable
and assign it an inteest amount, which we're going to check
whether it's Armstrong's number (in our case it's 371).
We then assigned our tempNumber variable the value that
is stored in the verifiable qurentNumbervariable.
Next in the while cycle, we assign the balance from the
qurentNumber dividing by 10 - and get the number of units
in the original number of qurentNumber. We then replace the
qurentNumber variable by dividing the number by 10.
Our variable y,which was originally set as 0, is assigned
the result y q (xx x x x).
Finally, we use the if-else statement to see if the y variable
received will be equal to the tempNumber variable
(where the original number is stored).
If y tempNumber,the guessed number is
Armstrong's number, otherwise it's not. */

/*Q # 17) Напишите Java-программу для проверки является
ли введенное число - числом Армстронга.
Ответ:

Прежде всего, нам нужно понять, что такое число Армстронга.
Число Армстронга это число, значение которого равно сумме
цифр, из которых оно состоит, возведенных в степень, равную
количеству цифр в этом числе. Как пример - число 371:
371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
Если у вас число четырехзначное:
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 =
4096 + 16 + 0 + 4096 = 8208
Выполняя решение, для начала мы объявляем целочисленные
переменные tempNumber, x и y. Мы инициализировали
переменную y значением 0. Затем мы создаем переменную
qurentNumber и присваиваем ей целочисленное значение,
которое мы собираемся проверить является ли оно числом
Армстронга (в нашем случае это 371). Затем мы присвоили
нашей переменной tempNumber то значение, которое хранится
в проверяемой переменной qurentNumber.
Далее в цикле while мы переменной a присваиваем остаток
от деления числа qurentNumber на 10 – и получим число единиц
в изначальном числе qurentNumber. Затем мы заменяем значение
переменной qurentNumber на результат деления введенного числа
на 10. Нашей переменной y, значение которой изначально было
установлено как 0, присваивается результат y + (x* x * x).
Таким образом во время первой итерации в y попадет результат
возведения в нужную степень значения числа единиц в
изначальном числе, при следующей итерации в y к степени
числа единиц добавится результат возведения в степень
числа десятков, и так далее по всем разрядам до конца
числа qurentNumber с права налево.
Наконец, мы используем оператор if-else для проверки,
 будет ли полученное значение переменной y равно значению
  переменной tempNumber (в которой хранится исходное число).
  Если y = tempNumber, то загаданное число является числом
  Армстронга, иначе - нет.*/

public class JPArmstrongsNumber {
    public static void main(String[] args) {
        // 17 of the top 20 test jobs interviewed for Java developer
        int y = 0, x, tempNumber;
        int qurentNumber = 371;
        System.out.println(qurentNumber);

       // This number will be checked to see if it is Armstrong 's number
        tempNumber = qurentNumber;
        while (qurentNumber > 0) {
            x = qurentNumber % 10;
            qurentNumber = qurentNumber / 10;
            y = y + (x * x * x);
        }
        if (tempNumber == y)
            System.out.println("This number is Armstrong's number");
        else
            System.out.println("This number is not Armstrong's number");
    }
}
//371
//This number is Armstrong's number