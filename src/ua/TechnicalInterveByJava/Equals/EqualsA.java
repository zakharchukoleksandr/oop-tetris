package ua.TechnicalInterveByJava.Equals;
//реализация метода equals -проверка на равенство двух ссылок

public class EqualsA {
    @Override
    public boolean equals(Object obj) {
        return (this==obj);
    }

//реализация метода hashCode - проверка на равенство двух ссылок

public native int hashCode();
}
//возвращает адрес объекта в памяти