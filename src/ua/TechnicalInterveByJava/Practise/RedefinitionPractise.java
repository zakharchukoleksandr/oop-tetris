package ua.TechnicalInterveByJava.Practise;

public class RedefinitionPractise {
    public static void main(String[] args) {
        Integer int1 = 20;
        Integer int2 = new Integer(20);
        Integer int3 = int2;
        int2=40;
        System.out.println(int1.equals(int3));
    }
}
// true-переопределение int 2 не влияет на значение int3