package ua.TechnicalInterveByJava.WhatDoesTheProgramPrint;

import java.math.BigInteger;

public class BigProblem {
    public static void main(String[] args) {
        BigInteger fiveThousand=new BigInteger("5000");
        BigInteger fiftyThousand=new BigInteger("50000");
        BigInteger fiveHundredThousand=new BigInteger("500000");
        BigInteger total=BigInteger.ZERO;
        total.add(fiveThousand);
        total.add(fiftyThousand);
        total.add(fiveHundredThousand);
        System.out.println(total);
    }
}
//0
//BigInteger are immutable. So are instances of String, BigDecimal,
// and the wrapper types:Integer, Long, Short, Byte, Character,
// Boolean,  Float and Double. Instead of modifying existing instances,
// operations on  these types return new instances.
//To perform a computation on a variable containing a reference
// to an immutable object, assign the result of the computation
//to the variable.

//// BigInteger неизменяемы. Как и экземпляры String, BigDecimal,
//// и типы оболочки: Integer, Long, Short, Byte, Character,
//// Boolean, Float и Double. Вместо изменения существующих экземпляров,
//// операции с этими типами возвращают новые экземпляры.
//// Выполнить вычисление для переменной, содержащей ссылку
//// неизменяемому объекту присваиваем результат вычисления
//// в переменную.