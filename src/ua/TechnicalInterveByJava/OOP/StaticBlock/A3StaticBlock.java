package ua.TechnicalInterveByJava.OOP.StaticBlock;

public class A3StaticBlock {
    static {
        System.out.println("static block is invoked");
        System.exit(0);
    }

   // public static void main(String args[]) {
    }
//} static block is invoked

//Error: Main method not found in class A3StaticBlock, please define the main method as:
//   public static void main(String[] args)

