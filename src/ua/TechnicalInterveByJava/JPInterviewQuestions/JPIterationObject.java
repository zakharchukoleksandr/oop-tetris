package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*In 6) Write a Java program to the iteration of an object like
HashMap using the while loop and an improved forloop.
Answer:
Here, we've inserted three elements into a HashMap variable
 called keyValue,using the put().
The size of the keyValue variable can be obtained using the
size method(). Keys and values can be obtained using getKey() and getValue methods.
Similarly, we use an extended forloop onthe qurentMe2elements
in HashMap.*/

/*В # 6) Напишите Java-программу для итерации объекта типа
HashMap с использованием цикла while и улучшенного цикла for.
Ответ:
Здесь мы для начала вставили три элемента в переменную типа
HashMap с именем keyValue, используя функцию put().
Размер переменной keyValue можно получить с помощью метода
size(). После этого мы использовали цикл While для обхода
keyValue, которая содержит по одной паре ключ-значение для
каждого элемента. Ключи и значения могут быть получены с
помощью методов getKey() и getValue().*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JPIterationObject {
    public static void main(String[] args) {
        // 6  test  for Java developer interviews
        HashMap<Integer,String> keyValue = new HashMap<Integer,String>();
        keyValue.put(1, " Hello");
        keyValue.put(2, " World");
        keyValue.put(3, " Have a nice day!");
        System.out.println(keyValue.size());
        System.out.println (" Cycle While: ");

        Iterator iter = keyValue.entrySet().iterator();
        while(iter.hasNext()) {

            Map.Entry qurentMe = (Map.Entry) iter.next();
            System.out.println (" Key is "+ qurentMe.getKey() +
                    " Meaning it " +qurentMe.getValue ());
        }
        System.out.println (" Cycle For: ");

        for(Map.Entry qurentMe2: keyValue.entrySet()) {
            System.out.println (" Key is: "+ qurentMe2.getKey()+
                    " The meaning is: "+ qurentMe2.getValue ());

        }

    }
}
//3
// Cycle While:
// Key is 1 Meaning it  Hello
// Key is 2 Meaning it  World
// Key is 3 Meaning it  Have a nice day!
// Cycle For:
// Key is: 1 The meaning is:  Hello
// Key is: 2 The meaning is:  World
// Key is: 3 The meaning is:  Have a nice day!