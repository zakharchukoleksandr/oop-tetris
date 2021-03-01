package ua.TechnicalInterveByJava.Interface;
//при реализации интерфейса необходимо реализовать все его методы
interface InterfaceI {
    public void F();
    public void say();

}
abstract class A implements InterfaceI {

    //public void F(); - not implements



    @Override
    public void say() {

            System.out.println("Hello");
        }
    }
