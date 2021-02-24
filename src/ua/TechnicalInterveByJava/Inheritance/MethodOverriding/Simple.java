package ua.TechnicalInterveByJava.Inheritance.MethodOverriding;

public class Simple extends AOverriding {
          //void msg() { System.out.println("Hello java"); }//C.T.Error Модификатор
          // по умолчанию более строгий, чем защищенный.
          // Вот почему возникает ошибка времени компиляции.
     public void msg() {System.out.println("Hello java");

    }

    public static void main(String args[]) {
        Simple obj = new Simple();
        obj.msg();
    }

}
//Hello java