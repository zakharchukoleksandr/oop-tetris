package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 15) Write the program to Java to find repetitive
characters in the line.
Answer:

In this program, we create a string variable st and
initiate an inte celsial counter, starting from scratch.

We then created an array of characters to convert our
string variable into this array. With two for cycles,
we compare characters with different indices.

If the two characters in the sequential index match,
this character will be displayed on the screen and the
count of the number of matching characters will increase by 1.*/

/*Q # 15) Напишите программу на Java, чтобы найти повторяющиеся
символы в строке.
Ответ:

В этой программе мы создаем строковую переменную st и
инициализируем целочисленный счетчик, начиная с нуля.

Затем мы создали массив символов для преобразования нашей
строковой переменной в этот массив. С помощью двух циклов
for мы проводим сравнение символов с разными индексами.

Если два символа последовательного индекса совпадают, то
этот символ будет выведен на экран и счетчик количества
совпадающих символов увеличится на 1.*/

public class JPRepetitiveCharactersLine {
    public static void main(String[] args) {

        //  15 of the top 20 test jobs interviewed for a Java developer

        String st = new String("Hello");
        int counter = 0;
        char[] charsArray = st.toCharArray();
        System.out.println ("Repetitive characters here:");

        for (int i=0; i<st.length();i++) {
            for(int j=i+1; j<st.length();j++) {

                if (charsArray [i] == charsArray [j]) {
                    System.out.println(charsArray [j]);
                   counter ++;
                    break;

                }

            }

        }

    }
}
//Repetitive characters here:
//l