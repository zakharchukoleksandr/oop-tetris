package ua.TechnicalInterveByJava.JPInterviewQuestions.JPTurnTheLine;
/*t's a way almost the same as Method 2, but here we don't use
the splitmethod. We use the Scanner class and nextLinemethod
to read the incoming line. We then announced a whole
stringLengthvariable, assigning it the length value of the
incoming line.

After that, we put the line back, using the forloop. However,
we used the charAt (index) method, which will return the symbol
by a specific index. After each iteration, the symbol will be
added to a new line to get the string variable inverted.

Then, we display the variable of the inverted line.*/
/*Это способ почти такой же, как способ 2, но здесь мы не
используем метод split(). Мы используем класс Scanner и
метод nextLine() для чтения входящей строки. Затем мы объявили
 целочисленную переменную stringLength, присваивая ей значение
 длины входящей строки.

После этого мы вывели строку в обратном порядке, используя цикл
for. Однако мы использовали метод charAt(index), который будет
 возвращать символ по конкретному индексу. После каждой итерации
 символ будет добавлен в новую строку для получения перевернутого
 значения строковой переменной.
Затем, мы выводим переменную перевернутой строки.*/

import java.util.Scanner;

public class JPTurnTheLineVar3 {
    public static void main(String[] args) {
        //  2 of the top 20 test jobs interviewed for Java developer
        String mainString, reverseString = "";
        System.out.println("Enter the right line to get upside down:");

        Scanner scannerQ = new Scanner(System.in);
        mainString = scannerQ.nextLine();
        int stringLength = mainString.length();
        for (int x = stringLength - 1; x >= 0; x--) {
            reverseString = reverseString + mainString.charAt(x);
            //use the built - in charAt method to flip the line
        }
        System.out.println(reverseString);
    }
}
//Enter the right line to get upside down:
// java2021
//1202avaj