package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 8) Напишите Java-программу, чтобы определить, является
ли строка или число палиндромом, или нет.
Ответ:

Чтобы проверить, является ли число или строка палиндромом
или нет, вы можете использовать любую переворачивающую
строки программу, из описанных выше,.

Что вам нужно сделать, так это добавить один оператор if-else.
Если исходная строка равна перевернутой строке, то число является
палиндромом, в противном случае - нет.*/

/*Q # 8) Write a Java program to determine whether a line or
number is a palindrome or not.
Answer:

To check whether the number or string is a palindrome or not,
you can use any string-turning program from the above.

What you need to do is add one if-else operator. If the original
 line is equal to an inverted line, the number is a palindrome,
 otherwise it is not.*/

import java.util.Scanner;

public class JPNumberPalindromeOrNot {
    public static void main(String[] args) {

        String inputString, reversedString = "";
        Scanner scannerQ = new Scanner(System.in);

        int stringLength;
        System.out.println();

        inputString = scannerQ.nextLine();
        stringLength = inputString.length();

        for (int x = stringLength - 1; x >= 0; x--) {
            reversedString = reversedString + inputString.charAt(x);
        }
        System.out.println();


        if (inputString.equals(reversedString))
            System.out.println("Introduced value is palindrome");
        else
            System.out.println("Introduced value is not a palindrome");
    }
}
//asddsa
//
//Introduced value is palindrome