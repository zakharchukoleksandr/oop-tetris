package ua.TechnicalInterveByJava.Practise;

public class AutoconversionPractise {
    public static void main(String[] args) {
        Integer int1=20;
        int int2=20;
        int int3=new Integer(int2);
        System.out.println(int1==int3);
    }
}
//true- авто конвертация в примитивный тип данных