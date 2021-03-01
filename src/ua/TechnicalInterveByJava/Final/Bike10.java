package ua.TechnicalInterveByJava.Final;
//Можем ли мы инициализировать пустую конечную переменную?
//Да, но только в конструкторе. Например:

public class Bike10 {
    final int speedlimit;//blank final variable

        	  Bike10(){
        	  speedlimit=70;
        	  System.out.println(speedlimit);
        	  }

        	  public static void main(String args[]){
        	    new Bike10();
        	 }

}

//70