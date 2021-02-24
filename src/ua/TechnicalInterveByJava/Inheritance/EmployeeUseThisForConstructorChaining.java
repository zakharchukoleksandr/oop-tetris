package ua.TechnicalInterveByJava.Inheritance;

public class EmployeeUseThisForConstructorChaining {
    int id, age;
    String name, address;

    public EmployeeUseThisForConstructorChaining(int age) {
        this.age = age;
    }

    public EmployeeUseThisForConstructorChaining(int id, int age) {
        this(age);
        this.id = id;
    }

    public EmployeeUseThisForConstructorChaining(int id, int age, String name, String address) {
        this(id, age);
        this.name = name;
        this.address = address;
    }

    public static void main(String args[]) {
        EmployeeUseThisForConstructorChaining emp = new EmployeeUseThisForConstructorChaining(105, 22, "Vikas", "Delhi");
        System.out.println("ID: " + emp.id + " Name:" + emp.name + " age:" + emp.age + " address: " + emp.address);
    }

}
//ID: 105 Name:Vikas age:22 address: Delhi