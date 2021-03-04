package ua.TechnicalInterveByJava.JPInterviewQuestions.JPTurnTheLine;
/*This is another way to complete a task with a coup sequence of
characters in a row. In this way, you announce the ststring variable,
 and then use the Scannerclass, declaring the scanner object to
 work with the standard data entry stream.

In this case, the program will take a string value through a
command line (when it is run).

Next, we used the nextLine method, which read our line when
entering it through a console with spaces between the words
of the line. We then used the splitmethod to divide the line
into its sub-strings (there is no divider here). Then, we put
the line back in reverse, using the for loop.*/

/*Есть несколько способов, с помощью которых вы можете перевернуть
вашу строку, если вам разрешено использовать другие встроенные
функции строки.

В этом способе мы инициализируем строковую переменную с именем st
значением заданной строки. Затем мы конвертируем эту строку в
массив символов с помощью функции toCharArray(). После этого мы
используем цикл for чтобы взять все символы в обратном порядке и
вывести их так на экран поочередно.*/

import java.util.Scanner;

public class JPTurnTheLineVar1 {
    public static void main(String[] args) {

        //  2 of the top 20 test jobs interviewed for Java developer

        String st;

        Scanner scannerQ = new Scanner(System.in);

        System.out.println (st = scannerQ.nextLine());

        String[] temp = st.split("");
        //use the split method to reverse the line

        for(int x= temp.length-1; x>=0; x--)

        {

            System.out.print(temp [x] + "");

        }



    }
}
//java
//java
//avaj