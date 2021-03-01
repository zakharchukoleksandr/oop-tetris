package ua.TechnicalInterveByJava.Concat;

public class ConcatABC {
    /*StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer = new StringBuffer();*/

    public static void main(String[] args) {
        String str = "ABC";
        str += "DEF";
        System.out.println(str);

        String str2 = "one".concat("two").concat("three");
        System.out.println(str2);

        /*String s="abcdef";
        StringBuilder stringBuilder=new StringBuilder(s);
        System.out.println(StringBuilder.toString));*/

       /* StringBuffer.append("ddd").append("aaa");
        StringBuilder.append("ddd").append("qqq");*/
    }


}

