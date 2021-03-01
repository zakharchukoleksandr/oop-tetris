package ua.TechnicalInterveByJava.Final;

public class Bike9 {
    final int speedlimit=90;//final variable
    void run(){
       // speedlimit=400;//not final
    }
    public static void main(String args[]){
        Bike9 obj=new  Bike9();
        obj.run();
    }
}//end of class
//cannot assign a value to final variable speedlimit
//Существует конечный предел скорости переменной, мы
// собираемся изменить значение этой переменной, но его
// нельзя изменить, потому что конечной переменной, когда-то
// присвоившей значение, нельзя изменить.

