package ua.TechnicalInterveByJava.SuperThis;

public class PersonD {
    public PersonD() {
        System.out.println("Person class constructor called");
    }


    public static class Employee extends PersonD {
        public Employee() {
            System.out.println("Employee class constructor called");
        }

        public static void main(String args[]) {
            Employee e = new Employee();
        }

    }
}
//Person class constructor called
//Employee class constructor called

//Super () неявно вызывается компилятором, если super () или this ()
// явно не включены в конструктор производного класса.
// Следовательно, в этом случае сначала вызывается конструктор
// класса Person, а затем вызывается конструктор класса Employee.