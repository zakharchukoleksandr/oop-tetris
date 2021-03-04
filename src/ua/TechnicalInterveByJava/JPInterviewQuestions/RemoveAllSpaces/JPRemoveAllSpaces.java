package ua.TechnicalInterveByJava.JPInterviewQuestions.RemoveAllSpaces;
/*Q # 18) Write a Java program to remove all spaces from the line with replace.).
Answer:
This is a simple program in which we have a string variable st1.
The other st2 string is initiated using the replaceAllmethod,
 which is a built-in method for removing n number of spaces.
 As a result, we display the screen st2, which no longer
 contains gaps.*/

/*Q # 18) Напишите Java-программу для удаления всех
пробелов из строки с помощью replace().
Ответ:
Это простая программа, в которой у нас есть строковая
переменная st1.
Другая строковая переменная st2 инициализируется с помощью
метода replaceAll, который является встроенным методом для
удаления n числа пробелов. В итоге мы выводим на экран st2,
которая уже не содержит пробелов.*/

public class JPRemoveAllSpaces {
    public static void main(String[] args)
    {
        //  17 of the top 20 test jobs interviewed for Java developer
        String st1 = "We're getting ready for an interview for a Java developer vacancy";

        //We use the replaceAll method
        String st2 = st1.replaceAll("\\s", "");
        System.out.println(st2);
    }
}
//We'regettingreadyforaninterviewforaJavadevelopervacancy