package ua.TechnicalInterveByJava.Practise;

public class AutoconversationPractis2 {
    public static void main(String[] args) {
        Integer int1 = 20;
        Integer int2 = new Integer(20);
        Integer int3 = int2;
        System.out.println(int1 == int3);
    }
}
//false