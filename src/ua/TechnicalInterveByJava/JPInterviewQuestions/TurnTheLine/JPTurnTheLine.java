package ua.TechnicalInterveByJava.JPInterviewQuestions.TurnTheLine;
/*Q # 1) Write a java program to turn the line, changing
the location of the characters in the line backwards without
using built-in String features.
Answer:

To begin with, we initiate a string st variable and use the
 StringBuilderclass.

The StringBuilder strB class will then be used to add a value
stored in the string variable st.

After that, we use the reverse feature built into StringBuilder
and save a new line in stB.

Finally, we display stB.*/

public class JPTurnTheLine {
    public static void main(String[] args) {
        //  1 of the top 20 test jobs interviewed for Java developer
        String st ="Challenge1";
        StringBuilder stB = new StringBuilder();
        stB.append(st);
        stB = stB.reverse();
        //use StringBuilder for coup row
        System.out.println(stB);

    }

///1egnellahC
}
