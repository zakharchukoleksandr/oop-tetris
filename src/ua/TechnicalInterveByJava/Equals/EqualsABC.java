package ua.TechnicalInterveByJava.Equals;

public class EqualsABC {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = "ABC";
        String s4 = "ABC";

        System.out.println(s1==s2);//false, две переменные указывают на
        System.out.println(s1!=s2);//true, две переменные указывают на
        // разные объекты в памяти

        System.out.println(s1.equals(s2));//true, посимвольное сравнение
        // ABC=ABC
        System.out.println(s1.equals(s3)); //true,посимвольное сравнение
        // ABC=ABC

        System.out.println(s3==s4);//true, две переменные указывают на
        // один и тот же объект в памяти

        System.out.println();



    }
}
