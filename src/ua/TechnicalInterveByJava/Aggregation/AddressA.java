package ua.TechnicalInterveByJava.Aggregation;
//Что такое агрегирование?
//Агрегацию можно определить как отношение между двумя классами,
// где агрегатный класс содержит ссылку на принадлежащий ему класс.
// Агрегация лучше всего описывается как есть, а отношения.
// Например, совокупный класс Employee, имеющий различные поля,
// такие как возраст, имя и зарплата, также содержит объект класса
// Address, имеющий различные поля, такие как Address-Line 1, City,
// State и pin-code. Другими словами, мы можем сказать, что Employee
// (класс) имеет объект класса Address. Рассмотрим следующий пример.

public class AddressA {
    String city, state, country;

    public AddressA(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

class Emp {
    int id;
    String name;
    AddressA address;

    public Emp(int id, String name, AddressA address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        AddressA address1 = new AddressA("gzb", "UP", "india");
        AddressA address2 = new AddressA("gno", "UP", "india");

        Emp e = new Emp(111, "varun", address1);
        Emp e2 = new Emp(112, "arun", address2);

        e.display();
        e2.display();

    }

}
//111 varun
//gzb UP india

//112 arun
//gno UP india