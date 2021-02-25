package ua.TechnicalInterveByJava.Cloneable;
//Пример метода clone () (клонирование объекта)

public class Student18 implements Cloneable {
    int rollno;
    String name;

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String args[]) {
        try {
            Student18 s1 = new Student18(101, "amit");

            Student18 s2 = (Student18) s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }

}
//101 amit
//101 amit

//Как вы можете видеть в приведенном выше примере,
// обе ссылочные переменные имеют одинаковое значение.
// Таким образом, clone () копирует значения одного объекта
// в другой. Поэтому нам не нужно писать явный код для
// копирования значения одного объекта в другой.

//Если мы создадим другой объект с помощью ключевого
// слова new и присвоим этому объекту значения другого
// объекта, это потребует большой обработки этого объекта.
// Поэтому, чтобы сэкономить дополнительную задачу обработки,
// мы используем метод clone ().