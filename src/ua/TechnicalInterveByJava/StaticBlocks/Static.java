package ua.TechnicalInterveByJava.StaticBlocks;

//в статическом блоке инициализируются статические поля

public class Static {
    static final int i;

    static {
        i = 10;
    }
}

//блок статической инициализации может создаваться сам
// при компиляции программы.
  /*  public static int MAX = 100;
}
    public static int MAX;
static {
    MAX=100;
        };*/