Java - Концепции ООП: начальные вопросы собеседования с ООП

Что такое объектно-ориентированная парадигма?
Это парадигма программирования, основанная на объектах, данные и методы которых определены в классе, к которому они принадлежат. Объектно-ориентированная парадигма направлена на объединение преимуществ модульности и возможности повторного использования. Объекты - это экземпляры классов, которые взаимодействуют друг с другом при разработке приложений и программ. Есть следующие особенности объектно-ориентированной парадигмы.
o	При разработке программ следует восходящему подходу.
o	Сосредоточьтесь на данных с помощью методов для работы с данными объекта
o	Включает такие концепции, как инкапсуляция и абстракция, которые скрывают сложности от пользователя и показывают только функциональность.
o	Реализует подход в реальном времени, такой как наследование, абстракция и т. Д.
o	Примеры объектно-ориентированной парадигмы: C ++, Simula, Smalltalk, Python, C # и т. Д.
Что такое объект?
Объект - это сущность реального времени, имеющая определенное состояние и поведение. В Java Object - это экземпляр класса, имеющий переменные экземпляра как состояние объекта и методы как поведение объекта. Объект класса может быть создан с помощью ключевого слова new .
What is the difference between an object-oriented programming language and object-based programming language?
Существуют следующие основные различия между объектно-ориентированным языком и объектно-ориентированным языком.
o	Объектно-ориентированные языки следуют всем концепциям ООП, тогда как объектно-ориентированный язык не следует всем концепциям ООП, таким как наследование и полиморфизм.
o	Объектно-ориентированные языки не имеют встроенных объектов, тогда как объектно-ориентированные языки имеют встроенные объекты, например, JavaScript имеет объект окна.
o	Примерами объектно-ориентированного программирования являются Java, C #, Smalltalk и т. Д., Тогда как примерами объектно-ориентированных языков являются JavaScript, VBScript и т. Д.
Каким будет начальное значение ссылки на объект, которая определяется как переменная экземпляра?
Все ссылки на объекты в Java инициализируются нулевым значением.
________________________________________
Ядро Java - Концепции ООП: вопросы на собеседовании с конструктором
Что такое конструктор?
Конструктор можно определить как метод особого типа, который используется для инициализации состояния объекта. Он вызывается, когда создается экземпляр класса, и для объекта выделяется память. Каждый раз, когда объект создается с использованием ключевого слова new , вызывается конструктор класса по умолчанию. Имя конструктора должно быть похоже на имя класса. Конструктор не должен иметь явного возвращаемого типа.
В Java конструктор - это блок кода, похожий на метод. Он вызывается при создании экземпляра класса . Во время вызова конструктора память для объекта выделяется в памяти.
Это особый тип метода, который используется для инициализации объекта.
Каждый раз, когда объект создается с использованием ключевого слова new (), вызывается как минимум один конструктор.
Он вызывает конструктор по умолчанию, если в классе нет конструктора. В таком случае компилятор Java по умолчанию предоставляет конструктор по умолчанию.
В Java есть два типа конструкторов: конструктор без аргументов и параметризованный конструктор.
Примечание: он называется конструктором, потому что он конструирует значения во время создания объекта. Нет необходимости писать конструктор для класса. Это потому, что компилятор java создает конструктор по умолчанию, если в вашем классе его нет.
Правила создания конструктора Java
Для конструктора определены два правила.
1.	Имя конструктора должно совпадать с именем его класса
2.	Конструктор не должен иметь явного возвращаемого типа
3.	Конструктор Java не может быть абстрактным, статическим, окончательным и синхронизированным.
Примечание: мы можем использовать модификаторы доступа при объявлении конструктора. Он контролирует создание объекта. Другими словами, у нас может быть частный, защищенный, общедоступный конструктор или конструктор по умолчанию в Java.
Типы конструкторов Java
В Java есть два типа конструкторов:
1.	Конструктор по умолчанию (конструктор без аргументов)
2.	Параметризованный конструктор
Конструктор Java по умолчанию
Конструктор называется «конструктором по умолчанию», если он не имеет параметров.

Синтаксис конструктора по умолчанию:
1.	<class_name>(){} 

Какова цель конструктора по умолчанию?
Конструктор по умолчанию используется для предоставления объекту значений по умолчанию, таких как 0, null и т. Д., В зависимости от типа.

Конструктор с параметрами Java
Конструктор с определенным количеством параметров называется параметризованным конструктором.
Зачем использовать параметризованный конструктор?
Параметризованный конструктор используется для предоставления разных значений отдельным объектам. Однако вы также можете указать те же значения.

Разница между конструктором и методом в Java
Между конструкторами и методами есть много различий. Они приведены ниже.
Конструктор Java	Метод Java
Конструктор используется для инициализации состояния объекта.	Метод используется для раскрытия поведения 
объекта.
Конструктор не должен иметь возвращаемого типа.	Метод должен иметь возвращаемый тип.
Конструктор вызывается неявно.	Метод вызывается явно.
Компилятор Java предоставляет конструктор по умолчанию, если у вас нет конструктора в классе.	В любом случае метод не 
предоставляется компилятором.
Имя конструктора должно совпадать с именем класса.	Имя метода может совпадать с
 именем класса, а может и не совпадать.

Конструктор копирования Java
В Java нет конструктора копирования. Однако мы можем копировать значения из одного объекта в другой, как конструктор копирования в C ++.
Есть много способов скопировать значения одного объекта в другой в Java. Они есть:
o	Конструктором
o	Присваивая значения одного объекта другому
o	Методом clone () класса Object

Конструктор возвращает какое-либо значение?
Да, это текущий экземпляр класса (вы не можете использовать возвращаемый тип, но он возвращает значение).

Может ли конструктор выполнять другие задачи вместо инициализации?
Да, например, создание объекта, запуск потока, вызов метода и т. Д. Вы можете выполнять любую операцию в конструкторе так же, как и в методе.

Есть ли в Java класс конструктора?
Да.
________________________________________
Какова цель класса Constructor?
Java предоставляет класс конструктора, который можно использовать для получения внутренней информации конструктора в классе. Он находится в пакете java.lang.reflect.
 
Java static keyword
Статическое ключевое слово в Java используется для управления памятью главным образом. Мы можем применять ключевое слово static с переменными , методами, блоками и вложенными классами . Ключевое слово static принадлежит классу, а не экземпляру класса.
Статика может быть:
1.	Переменная (также известная как переменная класса)
2.	Метод (также известный как метод класса)
3.	Блокировать
4.	Вложенный класс

1) статическая переменная Java
Если вы объявляете какую-либо переменную статической, она называется статической переменной.
o	Статическая переменная может использоваться для ссылки на общее свойство всех объектов (которое не является уникальным для каждого объекта), например, название компании сотрудников, название колледжа студентов и т. Д.
o	Статическая переменная получает память только один раз в области класса во время загрузки класса.
Преимущества статической переменной
Это делает память вашей программы более эффективной (т. Е. Экономит память).
Понимание проблемы без статической переменной
1.	class StudentStaticMethodStaticMethod{  
2.	     int rollno;  
3.	     String name;  
4.	     String college="ITS";  
5.	}  
Предположим, что в моем колледже 500 студентов, теперь все члены данных экземпляра будут получать память каждый раз при создании объекта. У всех студентов есть свое уникальное имя и номер, поэтому в этом случае подойдет элемент данных экземпляра. Здесь «колледж» относится к общей собственности всех объектов . Если мы сделаем его статическим, это поле получит память только один раз.
Статическое свойство Java является общим для всех объектов.

Статический метод Java
Если вы примените статическое ключевое слово с любым методом, это называется статическим методом.
o	Статический метод принадлежит классу, а не объекту класса.
o	Статический метод может быть вызван без необходимости создания экземпляра класса.
o	Статический метод может обращаться к статическому элементу данных и изменять его значение.

Ограничения для статического метода
У статического метода есть два основных ограничения. 
Они есть:
1.	Статический метод не может использовать нестатический элемент 
данных или напрямую вызывать нестатический метод.
2.	this и super нельзя использовать в статическом контексте.

Почему main () метод Java статичен?
Ответ) Это потому, что объекту не требуется вызывать 
статический метод. Если бы это был нестатический метод, 
JVM сначала создает объект, а затем вызывает метод main (),
 который приведет к проблеме выделения дополнительной памяти.
________________________________________

статический блок Java
o	Используется для инициализации статического элемента данных.
o	Он выполняется перед основным методом во время загрузки класса.

Можем ли мы выполнить программу без метода main ()?
Ответ) Нет, одним из способов был статический блок, но это 
было возможно до JDK 1.6. Начиная с JDK 1.7, невозможно 
выполнить класс Java без основного метода .

Можем ли мы выполнить программу без метода main ()?
Ответ) Да, один из способов выполнить программу без основного метода - использовать статический блок.
Что делать, если из сигнатуры основного метода убрать модификатор static?
Программа компилируется. Однако во время выполнения выдается ошибка «NoSuchMethodError».

В чем разница между статическим (классовым) методом и методом экземпляра?
статический метод или метод класса	                          метод экземпляра
1) Метод, объявленный как статический, известен как статический метод.	Метод, 
который не объявлен как статический, известен как метод экземпляра.
2) Нам не нужно создавать объекты для вызова статических методов.	
Объект требуется для вызова методов экземпляра.
3) Нестатические члены (экземпляры) не могут быть доступны напрямую 
в статическом контексте (статический метод, статический блок 
и статический вложенный класс).	К статическим и нестатическим 
переменным  можно получить доступ в методах экземпляра.
4) Например: публичный статический куб int (int n) 
{return n * n * n;}	Например: public void msg () {...}.

Можно ли сделать конструкторы статичными?
Как мы знаем, статический контекст (метод, блок или переменная) 
принадлежит классу, а не объекту. Поскольку конструкторы вызываются 
только при создании объекта, нет смысла делать конструкторы 
статическими. Однако, если вы попытаетесь это сделать, компилятор 
покажет ошибку компилятора.

Можем ли мы сделать абстрактные методы статическими в Java?
В Java, если мы сделаем абстрактные методы статическими, они 
станут частью класса, и мы сможем напрямую вызывать их, 
что не нужно. Вызов неопределенного метода совершенно 
бесполезен, поэтому не разрешен.

Можем ли мы объявить статические переменные и методы в абстрактном 
классе?
Да, мы можем объявлять статические переменные и методы в
 абстрактном методе. Поскольку мы знаем, что нет необходимости 
 делать объект для доступа к статическому контексту, поэтому мы 
 можем получить доступ к статическому контексту, объявленному
 внутри абстрактного класса, используя имя абстрактного класса. 
 
 Java - Концепции ООП: вопросы на собеседовании по наследованию
 Core Java - OOPs Concepts: Inheritance Interview Questions
 
What is this keyword in java?
Это ключевое слово является ссылкой переменной , которая 
относится к текущему объекту. Это ключевое слово используется 
в Java по-разному. Его можно использовать для ссылки на 
текущие свойства класса, такие как методы экземпляра, 
переменные, конструкторы и т. Д. Его также можно передать
 в качестве аргумента в методы или конструкторы. 
 Его также можно вернуть из метода как текущий экземпляр класса.
 
________________________________________
52) Каковы основные применения этого ключевого слова?
Есть следующие варианты использования этого ключевого слова.
o	this можно использовать для ссылки на текущую переменную экземпляра класса.
o	this можно использовать для вызова метода текущего класса (неявно)
o	this () можно использовать для вызова конструктора текущего класса.
o	this можно передать в качестве аргумента при вызове метода.
o	
o	this можно передать в качестве аргумента при вызове конструктора.
o	this можно использовать для возврата текущего экземпляра класса из метода.
________________________________________
53) Можно ли присвоить ссылку на this переменную?
Нет, это не может быть присвоено никакому значению, 
потому что оно всегда указывает на текущий объект 
класса, а это последняя ссылка в Java. Однако, 
если мы попытаемся это сделать, будет показана ошибка компилятора.

Можно ли использовать this
 ключевое слово для ссылки на статические члены?
Да, это ключевое слово можно использовать для
 ссылки на статические члены, потому что это 
 просто ссылочная переменная, которая ссылается 
 на текущий объект класса. Однако, как мы знаем, 
 нет необходимости обращаться к статическим 
 переменным через объекты, поэтому не рекомендуется
  использовать это для ссылки на статические члены. 
  
  Как можно создать цепочку конструкторов с помощью этого 
  ключевого слова?
  Цепочка конструкторов позволяет нам вызывать
   один конструктор из другого конструктора класса 
   по отношению к текущему объекту класса. Мы можем 
   использовать это ключевое слово для выполнения цепочки 
   конструкторов в одном классе. 

Каковы преимущества передачи this в метод вместо самого объекта 
текущего класса?
Как мы знаем, this относится к текущему объекту класса, поэтому он 
должен быть похож на текущий объект класса. Однако передача this в 
метод вместо текущего объекта класса может иметь два основных 
преимущества.
o	this последняя переменная. Следовательно, this не может быть 
присвоено какому-либо новому значению, тогда как текущий объект 
класса может не быть окончательным и может быть изменен.
o	this можно использовать в синхронизированном блоке.
Что такое наследование?
Наследование - это механизм, с помощью которого один объект 
приобретает все свойства и поведение другого объекта другого 
класса. Он используется для повторного использования кода и 
переопределения метода. Идея наследования в Java заключается в том, 
что вы можете создавать новые классы, основанные на существующих 
классах. Когда вы наследуете существующий класс, вы можете повторно 
использовать методы и поля родительского класса. Более того, вы 
также можете добавлять новые методы и поля в свой текущий класс. 
Наследование представляет собой отношение IS-A, которое также 
известно как отношение родитель-потомок.

В Java существует пять типов наследования.
o	Одноуровневое наследование
o	Многоуровневое наследование
o	Множественное наследование
o	Иерархическое наследование
o	Гибридное наследование
В Java не поддерживается множественное наследование через классы.

Наследование в Java
Наследование в Java - это механизм, в котором один объект получает
 все свойства и поведение родительского объекта. Это важная часть 
 ООП (система объектно-ориентированного программирования).
Идея наследования в Java заключается в том, что вы можете создавать 
новые классы , основанные на существующих классах. Когда вы 
наследуете существующий класс, вы можете повторно использовать 
методы и поля родительского класса. Более того, вы также можете 
добавлять новые методы и поля в свой текущий класс.
Наследование представляет собой отношение IS-A, которое также 
известно как отношение родитель-потомок .
Зачем использовать наследование в java
o	Для переопределения метода (чтобы можно было добиться 
полиморфизма во время выполнения ).
o	Для повторного использования кода.

Переопределение метода в Java
Если подкласс (дочерний класс) имеет тот же метод, что и 
объявленный в родительском классе, в Java это называется 
переопределением метода .
Другими словами, если подкласс предоставляет конкретную 
реализацию метода, который был объявлен одним из его 
родительских классов, это называется переопределением метода.
Использование замены метода Java
o	Переопределение метода используется для обеспечения 
конкретной реализации метода, который уже предоставляется его 
суперклассом.
o	Переопределение метода используется для полиморфизма времени 
выполнения

Правила переопределения методов Java
1.	Метод должен иметь то же имя, что и в родительском классе
2.	Метод должен иметь тот же параметр, что и в родительском классе.
3.	Должны быть отношения IS-A (наследование).

Можем ли мы переопределить статический метод?
Нет, статический метод нельзя переопределить. Это можно доказать с помощью полиморфизма среды выполнения

Почему мы не можем переопределить статический метод?
Это связано с тем, что статический метод связан с классом, тогда как метод экземпляра связан с объектом. Статический принадлежит области класса, а экземпляр принадлежит области кучи.
________________________________________
Можем ли мы переопределить main метод java?
Нет, потому что main - статический метод.

Разница между перегрузкой метода и переопределением метода в java
Есть много различий между перегрузкой метода и переопределением метода в java. Список различий между перегрузкой метода и переопределением метода приведен ниже:
Нет.	Перегрузка метода	Переопределение метода
1)	Перегрузка метода используется для повышения читабельности 
программы.	Переопределение метода используется для 
обеспечения конкретной реализации метода, 
который уже предоставлен его суперклассом.
2)	Перегрузка метода выполняется внутри класса .	
Переопределение метода происходит в двух 
классах , имеющих отношение IS-A (наследование).
3)	В случае перегрузки метода параметр должен быть другим .	
В случае переопределения метода параметр 
должен быть таким же .
4)	Перегрузка метода - это пример полиморфизма времени компиляции .	Переопределение метода - это пример 
полиморфизма времени выполнения .
5)	В java перегрузка метода не может быть выполнена путем изменения 
только возвращаемого типа метода. Тип возвращаемого значения 
может быть одинаковым или различным при перегрузке метода. 
Но вы должны изменить параметр.	Тип возвращаемого значения 
должен быть таким же или ковариантным при переопределении метода.


Модификаторы доступа Java с переопределением метода
Если вы переопределяете какой-либо метод, переопределенный 
метод (то есть объявленный в подклассе) не должен быть более строгим.

Обработка исключений с помощью MethodOverriding в Java
Есть много правил, если мы говорим о методах управления с 
обработкой исключений. 
Правила следующие:
o	Если метод суперкласса не объявляет исключение
o	Если метод суперкласса не объявляет исключение, метод 
переопределения подкласса не может объявить проверенное исключение, 
но может объявить непроверенное исключение.
o	Если метод суперкласса объявляет исключение
o	Если метод суперкласса объявляет исключение, метод 
переопределения подкласса может объявить то же самое, исключение 
подкласса или отсутствие исключения, но не может объявить 
родительское исключение.

Если метод суперкласса не объявляет исключение
1) Правило: если метод суперкласса не объявляет исключение, метод
 переопределения подкласса не может объявить проверенное исключение.

Обработка исключений с помощью 
MethodOverriding в Java
Есть много правил, если мы говорим о методах управления с 
обработкой исключений
. Правила следующие:
o	Если метод суперкласса не объявляет исключение
o	Если метод суперкласса не объявляет исключение, метод 
o	переопределения подкласса не может объявить проверенное
o	 исключение, но может объявить непроверенное исключение.
o	Если метод суперкласса объявляет исключение
o	Если метод суперкласса объявляет исключение, метод 
переопределения 
o	подкласса может объявить то же самое, исключение подкласса 
или 
o	отсутствие исключения, но не может объявить родительское 
исключение.

Полиморфизм в Java
Полиморфизм в Java - это концепция, с помощью которой мы можем 
выполнять одно действие разными способами . Полиморфизм происходит
 от двух греческих слов: поли и морфы. Слово «поли» означает 
 «множество», а «морфы» означает формы. Итак, полиморфизм означает 
 множество форм.
В Java есть два типа полиморфизма: полиморфизм времени компиляции 
и полиморфизм времени выполнения. Мы можем выполнить полиморфизм в 
java путем перегрузки метода и переопределения метода.
Если вы перегружаете статический метод в Java, это пример 
полиморфизма времени компиляции. Здесь мы сосредоточимся на 
полиморфизме времени выполнения в java.

class A{}  
class B extends A{}  
A a=new B();//upcasting  

Для повышения качества мы можем использовать ссылочную 
переменную типа класса или типа интерфейса. Например:
1.	interface I{}  
2.	class A{}  
3.	class B extends A implements I{}  

Здесь отношение класса B будет следующим:
B IS-A A
B IS-A I
B IS-A Object
Поскольку Object является корневым классом всех классов в Java, 
мы можем написать B IS-A Object.

Полиморфизм среды выполнения Java с элементом данных

Переопределяется метод, а не члены данных, поэтому полиморфизм 
времени выполнения не может быть достигнут с помощью членов данных.
В приведенном ниже примере оба класса имеют ограничение скорости 
члена данных. Мы получаем доступ к элементу данных с помощью 
ссылочной переменной родительского класса, которая ссылается на 
объект подкласса. Поскольку мы обращаемся к члену данных, который 
не переопределяется, следовательно, он всегда будет обращаться к 
члену данных родительского класса.

Правило: полиморфизм времени выполнения не может быть достигнут с 
помощью элементов данных.

Термины, используемые в наследовании
o	Класс: класс - это группа объектов, которые имеют общие свойства. Это шаблон или план, из которого создаются объекты.
o	Подкласс / Дочерний класс: Подкласс - это класс, наследующий другой класс. Его также называют производным классом, расширенным классом или дочерним классом.
o	Суперкласс / родительский класс: Суперкласс - это класс, от которого подкласс наследует функции. Его также называют базовым классом или родительским классом.
o	Возможность повторного использования : как следует из названия, возможность повторного использования - это механизм, который упрощает повторное использование полей и методов существующего класса при создании нового класса. Вы можете использовать те же поля и методы, которые уже определены в предыдущем классе.
Синтаксис Java Inheritance
1.	class Subclass-name extends Superclass-name  
2.	{  
3.	   //methods and fields  
4.	}  

Расширяет ключевое слово указывает на то, что вы делаете 
новый класс, производный от существующего класса. Значение 
«расширяет» - увеличить функциональность.
В терминологии Java наследуемый класс называется родительским 
или суперклассом, а новый класс называется дочерним или подклассом.

Programmer - это подкласс, а Employee - суперкласс. 
Отношения между этими двумя классами – это Programmer IS-A Employee.  . 
Это означает, что Программист - это тип Сотрудника.

Когда класс наследует другой класс, это называется одиночным 
наследованием . 

Почему множественное наследование не поддерживается в java?
Чтобы уменьшить сложность и упростить язык, в java не поддерживается 
множественное наследование.

Почему в Java используется наследование?
Ниже приведены различные преимущества использования наследования в 
Java.
o	Наследование обеспечивает возможность повторного использования
 кода. Производному классу не нужно переопределять метод базового 
 класса, если только ему не нужно предоставлять конкретную 
 реализацию метода.
o	Полиморфизм времени выполнения не может быть достигнут без 
использования наследования.
o	Мы можем моделировать наследование классов с помощью объектов 
реального времени, что делает ООП более реалистичными.
o	Наследование обеспечивает скрытие данных. Базовый класс может 
скрыть некоторые данные из производного класса, сделав его закрытым.
o	Переопределение метода невозможно без наследования. Путем 
переопределения метода мы можем дать конкретную реализацию 
некоторого базового метода, содержащегося в базовом классе.

Какой класс является суперклассом для всех классов?
Класс объекта является суперклассом всех других классов в Java.

