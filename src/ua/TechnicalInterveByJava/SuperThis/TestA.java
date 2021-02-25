package ua.TechnicalInterveByJava.SuperThis;
//Можете ли вы использовать this () и super () как в конструкторе?
//Нет, потому что this () и super () должны быть первым оператором
// в конструкторе класса.

public class TestA {
    TestA() {
        super();
//        this();
        System.out.println("Test class object is created");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }

}
