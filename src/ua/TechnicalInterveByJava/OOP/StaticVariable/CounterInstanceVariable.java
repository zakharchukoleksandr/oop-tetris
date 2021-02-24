package ua.TechnicalInterveByJava.OOP.StaticVariable;

//Программа счетчика без статической переменной

//В этом примере мы создали переменную экземпляра
// с именем count, которая увеличивается в конструкторе.
// Поскольку переменная экземпляра получает
// память во время создания объекта, каждый объект
// будет иметь копию переменной экземпляра.
// Если он увеличивается, он не будет отражать
// другие объекты. Таким образом, каждый объект
// будет иметь значение 1 в переменной count.

//Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.

public class CounterInstanceVariable {

    int count=0;//will get memory each time when the instance is created

    CounterInstanceVariable(){
        	count++;//incrementing value
        	System.out.println(count);
        	}

        	public static void main(String args[]){
        	//Creating objects
                CounterInstanceVariable c1=new CounterInstanceVariable();
                CounterInstanceVariable c2=new CounterInstanceVariable();
                CounterInstanceVariable c3=new CounterInstanceVariable();
        	}
	}

//1
//1
//1