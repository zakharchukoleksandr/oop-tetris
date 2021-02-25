package ua.TechnicalInterveByJava.Inheritance;

//Programmer - это подкласс, а Employee - суперкласс.
// Отношения между этими двумя классами –
// это Programmer IS-A Employee.  .
// Это означает, что Программист - это тип Сотрудника.
public class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }

}
//Programmer salary is:40000.0
//Bonus of Programmer is:10000
//В приведенном выше примере объект Programmer может
// получить доступ как к полю собственного класса, так и к
// классу Employee, т.е. возможность повторного использования кода.