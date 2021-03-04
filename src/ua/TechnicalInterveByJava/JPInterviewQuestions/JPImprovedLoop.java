package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 10) Напишите Java-программу для обхода ArrayList с
использованием цикла for, while и улучшенного цикла for.
Ответ:

В этой программе мы добавили три элемента в ArrayList и
вывели его размер.
Затем мы используем цикл While с итератором. Всякий раз,
когда итератор получает следующий элемент, он будет отображать
этот элемент, пока мы не достигнем конца списка. В нашем
случае это будет повторяться три раза.

Аналогично, мы сделали для улучшенного цикла for, где мы
создали объект o для ArrayList с именем testList. Затем
вывели на экран значение объекта.

После этого мы создали цикла for, где итератор i установлен
сначала на индекс 0, а затем увеличивается на 1 при каждой
итерации, пока не будет достигнут предел ArrayList. Наконец,
мы выводим на экран каждый элемент, используя метод get(index)
для каждой итерации цикла for.*/

/*Q # 10) Write a Java program to bypass ArrayList using
the for, while, and improved for loop.
Answer:

In this program, we added three elements to ArrayList and
brought it back in size.
We then use the While cycle with the iterator. Whenever the
iterator gets the next item, it will display that item until
we reach the end of the list. In our case, it will be repeated
three times.

Similarly, we did for an improved forloop where we created an o
object for ArrayList named testList. The value of the object was
then displayed on the screen.

After that, we created a forloop where the i iterator is set first
 on index 0 and then increased by 1 at each iteration until the
 ArrayListlimit is reached. Finally, we display each element using
 the get (index)method for each iteration of the for loop. */

import java.util.ArrayList;
import java.util.Iterator;

public class JPImprovedLoop {
    public static void main(String[] args) {
        //  10 of the top 20 test jobs for a Java developer interview

        ArrayList testList = new ArrayList();
        testList.add("50");
        testList.add("60");
        testList.add("70");
        System.out.println(testList.size());

        System.out.println ("Cycle While:");

        Iterator iter = testList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println ("Improved Cycle For:");

        for(Object o : testList) {
            System.out.println(o);
        }
        System.out.println ("Cycle For:");
        for(int i=0; i< testList.size(); i++) {
            System.out.println(testList.get(i));
        }
    }
}
//3
//Cycle While:
//50
//60
//70
//Improved Cycle For:
//50
//60
//70
//Cycle For:
//50
//60
//70