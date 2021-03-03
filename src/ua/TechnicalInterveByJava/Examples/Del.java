package ua.TechnicalInterveByJava.Examples;

public class Del {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("java");
        sb.delete(2, 3);
        System.out.println(sb);//jaa-del (v) from 2 to 2(3-1), j=0, a=1, v=2, a=3

        String value= "java";
        value=value.substring(1);
        System.out.println(value);//ava-del (j)

      /*  String value1= "java";
        value1=value1.replaceAll("a","o");
        System.out.println(value1);//jovo*/

        String value2= "java";
        //value2=value2.replace("a","");
        value2=value2.replaceFirst("a","");
        System.out.println("value2="+value2);//value2=jva

        String value3= "java";
        value3=value3.replaceAll("a","x");
        System.out.println("value3="+value3);//value3=jxvx
    }
}
