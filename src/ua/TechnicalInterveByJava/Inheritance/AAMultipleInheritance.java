package ua.TechnicalInterveByJava.Inheritance;
//Почему множественное наследование не поддерживается в java?
//Чтобы уменьшить сложность и упростить язык, в java не поддерживается
// множественное наследование.
//Рассмотрим сценарий, в котором A, B и C - три класса. Класс C
// наследует классы A и B. Если классы A и B имеют один и тот же
// метод и вы вызываете его из объекта дочернего класса, вызов метода
// класса A или B будет неоднозначным.
//Поскольку ошибки времени компиляции лучше, чем ошибки времени
// выполнения, Java отображает ошибку времени компиляции, если
// вы наследуете 2 класса. Таким образом, независимо от того,
// используете ли вы тот же метод или разные, будет ошибка времени
// компиляции.

public class AAMultipleInheritance {
    	void msg(){System.out.println("Hello");}
	}
	class B{
	void msg(){System.out.println("Welcome");}
	}
	//class C extends AAMultipleInheritance,BB{//suppose if it were
	class C extends B{

        	 public static void main(String args[]){
        	   C obj=new C();
        	   obj.msg();//Now which msg() method would be invoked?
        	}

}
//Welcome