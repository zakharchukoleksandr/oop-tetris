package ua.TechnicalInterveByJava.Trim;

public class TrimAB {
    public static void main(String[] args) {
        String s="   a     ";
        System.out.println(s.trim()+"b");//ab
        System.out.println(s+"b");//    a     b
    }
}
