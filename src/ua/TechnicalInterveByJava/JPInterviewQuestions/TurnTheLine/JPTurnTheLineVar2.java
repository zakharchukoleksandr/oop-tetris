package ua.TechnicalInterveByJava.JPInterviewQuestions.TurnTheLine;

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