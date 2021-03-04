package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 16) Write a Java program to find the second highest
number in the array.
Answer:

In this program, we initiated an array with 10 random
elements from which we are going to find the second
largest number. Next, we created two inteths of variables,
which we will assign the values of two whole numbers from
the array - the largest and second largest. Both variables
initially receive the values of the first array element
index. We then display all the elements using the forloop.

The further logic of the program is to use the cycle
to bypass the array.

When you go around, if the array element with the current
index is larger than the value stored in the largestvariable,
then secondBiggest is assigned the value stored in the
largest,and the largest variable is the new highest value
according to the value of the current array element. Again,
if the item on the current index is larger than secondBiggest,
then assign secondBiggest the value of that item.

This will be repeated for each iteration and, eventually,
after you complete the array bypass in the loop, you will
get the elements the largest and the second largest array
elements in the largest and secondBiggest variables respectively.*/


public class JPSecondHighestNumberInArray {
    public static void main(String[] args)
    {
        // 16 of the top 20 test jobs interviewed for a Java developer

        int numbersArray[] = { 10, 15, 32, 100, 16, 11, 98, 36, 95, 33 };
        int biggest= numbersArray[0];
        int secondBiggest = numbersArray[0];
        System.out.println();

        for (int i = 0; i < numbersArray.length; i++)
        {
            System.out.print(numbersArray[i] + "\t");
        }
        for (int i = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] > biggest)
            {
                secondBiggest = biggest;
                biggest = numbersArray[i];
            }
            else if (numbersArray[i] > secondBiggest && numbersArray[i] != biggest)
            {
                secondBiggest = numbersArray[i];
            }
        }
        System.out.println("\nSecond highest number:" + secondBiggest);;
    }
}
//10	15	32	100	16	11	98	36	95	33
//Second highest number:98