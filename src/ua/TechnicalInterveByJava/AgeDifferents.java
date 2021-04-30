package ua.TechnicalInterveByJava;

public class AgeDifferents {

        public static void main(String[] args) {

            int age;
            int age1man =40;
            int age2man=20;

            if (age1man > age2man) {
                int a = age1man - age2man;
                System.out.println("если возраст 1-го  человека больше  возраста 2-го  человека  тогда 1-й человек старше другого на "  + a + " лет");

            }
            else {
                int b = age2man - age1man;
                System.out.println(" \"если возраст 1-го  человека   меньше возраста 2-го  человека \"тогда 1-й человек моложе другого на " + b + " лет");
            }
        }
    }

