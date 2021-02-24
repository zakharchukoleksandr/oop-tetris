package ua.TechnicalInterveByJava.Inheritance;

public class TestUseThisForReferencingStaticMembers {
    static int i = 10;
	    public TestUseThisForReferencingStaticMembers()
	    {
       	        System.out.println(this.i);
       	    }
	    public static void main (String args[])
	    {
            TestUseThisForReferencingStaticMembers t = new TestUseThisForReferencingStaticMembers();
        	    }

}
//10