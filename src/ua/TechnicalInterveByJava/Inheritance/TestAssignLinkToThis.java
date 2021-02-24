package ua.TechnicalInterveByJava.Inheritance;

public class TestAssignLinkToThis {
    {
	//public TestAssignLinkToThis()
        {
          //  this = null;
            System.out.println("TestAssignLinkToThis class constructor called");
        }

       // public static void main (String args[])
        {
            TestAssignLinkToThis t = new TestAssignLinkToThis();
        }
    }
}

//error: cannot assign a value to final variable this
//        this = null;


