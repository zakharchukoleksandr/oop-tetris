package ua.TechnicalInterveByJava.OOP.StaticVariable;

public class TestClassInStaticVariable extends AbstractClassInStaticVariable
{
            public static void main (String args[])
            {
                AbstractClassInStaticVariable.TestMethod();
                System.out.println("i = "+AbstractClassInStaticVariable.i);
            }
        }
