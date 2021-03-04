package ua.TechnicalInterveByJava.JPInterviewQuestions.RemoveAllSpaces;
/*Q # 19) Write a Java program to remove all spaces from the
line without using replace.)
Answer:
This is another approach to removing all the gaps. Again, to
begin with, we have one st1 string variable with some value.
 We convert this line into an array of characters using toCharArray.
We then have one StringBuffer strBobject that will be used to
add a value stored on the chars index after we have added a
loop and one ifcondition.
The condition is established so that an item with an i index
of the character array should not be equal to a space or tab
symbol. Finally, we display our StringBuffer strBobject.

Q # 19) Напишите Java-программу для удаления всех пробелов из
 строки без использования replace().
Ответ:
Это еще один подход к удалению всех пробелов. Опять же, для
начала у нас есть одна строковая переменная st1 с некоторым
значением. Мы преобразовываем эту строку в массив символов,
используя toCharArray().
Затем у нас есть один объект StringBuffer strB, который будет
использоваться для добавления значения, хранящегося по индексу
chars [i] после того, как мы добавили цикл и одно условие if.
Условие установлено так, что элемент с индексом i массива
символов не должен быть равен символу пробела или табуляции.
Наконец, мы выводим на экран наш объект StringBuffer strB.
*/

public class RemoveAllSpacesWithoutUsingReplace {
    public static void main(String[] args) {
        //  17 of the top 20 test jobs interviewed for Java developer
        String st1= " Я готов  к интервью   на вакансию    Java разработчика";

        char[] charsArray = st1.toCharArray();

        StringBuffer strB = new StringBuffer();

        for (int i = 0; i < charsArray.length; i++) {
            if ((charsArray[i] != ' ') && (charsArray[i] != '\t')) {
                strB.append(charsArray[i]);
            }
        }
        System.out.println(strB);

    }
}
//ЯготовкинтервьюнавакансиюJavaразработчика