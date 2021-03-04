package ua.TechnicalInterveByJava.JPInterviewQuestions.JPTurnTheLine;

/*There are several ways you can flip your line if you're allowed
to use other built-in line features.

In this way, we initiate a string variable with the name st
the value of a given line. We then convert this line into an
array of characters using toCharArray. After that, we use the
for loop to take all the characters in reverse order and bring
them so on the screen alternately.*/

/*Это еще один способ выполнить задачу с переворотом
последовательности символов в строке. В этом способе вы
объявляете строковую переменную st, а затем используете класс
Scanner, объявляя объект scannerQ для работы со стандартным
потоком ввода данных.
В данном случае программа примет строковое значение через
командную строку (при ее выполнении).
Далее мы использовали метод nextLine(), который прочитал
нашу строку при вводе ее через консоль с пробелами между
 словами строки. После этого мы использовали метод split()
 для разделения строки на ее подстроки (здесь не указывается
  разделитель). Затем, мы выводим строку в обратном порядке,
  используя цикл for.*/

public class JPTurnTheLineVar2 {
    public static void main(String[] args) {
        //  2 of the top 20 test jobs interviewed for Java developer
        String st = "Learning to program";
        char symbols[] = st.toCharArray();// convert the string
        // into an array of characters, then display the characters
        // to the screen in reverse order
        for(int x= symbols.length-1; x>=0; x--) {
            System.out.print(symbols [x]);
        }
    }
}
//margorp ot gninraeL