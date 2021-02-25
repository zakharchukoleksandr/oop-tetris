package ua.TechnicalInterveByJava.Polymorphism.Overloading;
//Пример перегрузки метода с продвижением типа в случае
// неоднозначности
//Если в методе нет аргументов соответствующего типа и каждый
// метод продвигает
// одинаковое количество аргументов, возникнет неоднозначность.

public class OverloadingCalculationA {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

   /* void sum(long a, int b) {
        System.out.println("b method invoked");
    }*/

    public static void main(String args[]) {
        OverloadingCalculationA obj = new OverloadingCalculationA();
        obj.sum(20, 20);//now ambiguity
    }

}
//Compile Time Error
//Один тип не отменяется неявно, например,
// double не может быть понижен до любого типа неявно.