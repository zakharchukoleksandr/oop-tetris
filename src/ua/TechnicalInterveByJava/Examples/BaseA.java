package ua.TechnicalInterveByJava.Examples;

public class BaseA {
    protected final void getInfo() {//overridden method is final
        System.out.println("method of Base class");
    }
//}

//public class Derived extends Base {
   // protected final void getInfo() {
      //  System.out.println("method of Derived class");
  //  }

    public static void main(String[] args) {
        Base obj = new Base();
      //  obj.getInfo();
    }

}
//error: getInfo() in Derived cannot override getInfo() in Base
//    protected final void getInfo()