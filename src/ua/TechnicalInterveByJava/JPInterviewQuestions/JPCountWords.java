package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Write a program in Java to count the number of specific
words in a row using HashMap.
Answer:
This program works with the collection class in which we
used HashMap to store the string.
First of all, we announced our string variable with the name st.
We then used split, a single space feature, so that we could break
the line into an array of a few words.
We then created a copy of HashMap and a forloop. Inside the for
loop we use the if elsestatement. We go into every element of the
split array and add elements of that array. Words we add as keys
copy hashMap. As the HashMap values, we'll add that number, how many
 times we've met the word when we've been bypassed. If we've already
  added this word to our HashMap instance, we'll increase the value
  recorded in HashMap according to this key word when we go around.
Every time a word meets again (we see that the word in the HashMap
instance we've already added) - the counter value increases by 1.
If such a word has not been seen before, the value-counter is
set at 1.
Finally, we bring it to the HashMapscreen.
Note:The same program you can use to count the number of
characters in a row. All you have to do is remove one space
(remove the space specified in the split method) and prescribe
String [] words = st.split (“”); */

/*Q # 5) Напишите программу на Java для подсчета количества
конкретных слов в строке, используя HashMap.
Ответ:
Это программа работает с классом-коллекцией, в которой мы
использовали HashMap для хранения строки.
Прежде всего, мы объявили нашу строковую переменную с именем st.
Затем мы использовали функцию split(), с одиночным пробелом, чтобы
можно было разбить строку на массив из нескольких слов.
После этого мы создали экземпляр HashMap и цикл for. Внутри цикла
for мы используем оператор if else. Мы заходим в каждый элемент
массива split и добавляем элементы этого массива. Слова мы добавляем
в качестве ключей экземпляра HashMap. В качестве значений HashMap
 мы будем добавлять то число, сколько раз при обходе массива слов
 нам данное слово встретилось. Если в наш экземпляр HashMap мы уже
 добавили данное слово – при обходе мы увеличим значение, записанное
 в HashMap в соответствии с данным словом-ключом.
Каждый раз, когда слово будет встречаться повторно (мы видим, что
слово в экземпляр HashMap мы уже добавляли) – значение-счетчик
увеличивается на 1. Если такое слово ранее не встречалось –
значение-счетчик устанавливается на 1.
Наконец, мы выводим на экран HashMap.
Обратите внимание: ту же программу вы можете использовать и для
подсчета количества символов в строке. Все, что вам нужно сделать,
это удалить один пробел (удалить пробел, указанный в методе split)
и прописать String [] words = st.split (“”);*/

import java.util.HashMap;

public class JPCountWords {
    public static void main(String[] args) {
   //  5 из ТОП 20 тестовых заданий на интервью для Java разработчика
        String st = "Current task posted for Java developers developers";
        String[] words = st.split(" ");

        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i <= words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);
            } else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }

}
//{Java=1, task=1, developers=2, for=1, Current=1, posted=1}

