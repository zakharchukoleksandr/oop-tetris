package ua.TechnicalInterveByJava.Examples;

public class BExample {
    public static void main(String args[]) {
        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
    }

}
//200Javatpoint
//Javatpoint200
/*Объяснение
В первом случае сначала умножаются числа 10 и 20, а
затем результат 200 обрабатывается как строка и объединяется
 со строкой Javatpoint для получения результата 200Javatpoint .
Во втором случае числа 10 и 20 будут сначала умножены до 200,
потому что приоритет умножения выше, чем сложение. Результат
200 будет обработан как строка и объединен со строкой Javatpoint
для получения вывода как Javatpoint200 .
*/