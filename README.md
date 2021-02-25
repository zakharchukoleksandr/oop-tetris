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

Что такое композиция?
Сохранение ссылки на класс в другом классе называется композицией. 
Когда объект содержит другой объект, если содержащийся объект не 
может существовать без существования объекта-контейнера, это 
называется композицией. Другими словами, мы можем сказать, что 
композиция - это частный случай агрегации, который представляет 
собой более сильные отношения между двумя объектами. Пример: в 
классе есть ученики. Студент не может существовать без класса. 
Между классом и учениками существует композиция.

What is the difference between aggregation and composition?
Агрегация представляет собой слабую взаимосвязь, тогда как 
композиция представляет собой сильную взаимосвязь. Например, 
у велосипеда есть индикатор (агрегирование), а у велосипеда есть 
двигатель (состав).

Почему Java не поддерживает указатели?
Указатель - это переменная, которая ссылается на адрес памяти. 
Они не используются в Java, потому что они небезопасны (незащищены) 
и сложны для понимания.

What is super in java?
Super ключевое слово в Java является ссылкой переменной , 
которая используется для обозначения непосредственного объекта 
родительского класса. Всякий раз, когда вы создаете экземпляр 
подкласса, неявно создается экземпляр родительского класса, на 
который ссылается супер-ссылочная переменная. Super () вызывается 
в конструкторе класса неявно компилятором, если нет super или this.

Каковы основные виды использования ключевого слова super?
Есть следующие варианты использования ключевого слова super.
o	super может использоваться для ссылки на непосредственную 
переменную экземпляра родительского класса.
o	super можно использовать для непосредственного вызова метода 
родительского класса.
o	super () может использоваться для непосредственного вызова 
конструктора родительского класса.
What are the differences between this and super keyword?
Между этим ключевым словом и ключевым словом super есть следующие 
различия.
o	Ключевое слово super всегда указывает на контексты родительского 
класса, тогда как это ключевое слово всегда указывает на контекст 
текущего класса.
o	Ключевое слово super в основном используется для инициализации
 переменных базового класса в конструкторе производного класса, 
 тогда как это ключевое слово в основном используется для различения 
 локальных переменных и переменных экземпляра при передаче в 
 конструкторе класса.
o	Super и this должны быть первым оператором внутри конструктора, 
иначе компилятор выдаст ошибку.

Можете ли вы использовать this () и super () как в конструкторе?
Нет, потому что this () и super () должны быть первым оператором 
в конструкторе класса.

Что такое клонирование объектов?
Клонирование объекта используется для создания точной копии объекта. 
Метод clone () класса Object используется для клонирования объекта. 
Интерфейс java.lang.Cloneable должен быть реализован классом, 
клон объекта которого мы хотим создать. Если мы не реализуем 
интерфейс Cloneable, метод clone () генерирует исключение 
CloneNotSupportedException.
1.	protected Object clone() throws CloneNotSupportedException    
Клонирование объектов в Java
Объект клонирования является способом создания точной копии объекта.
 Метод clone () класса Object используется для клонирования объекта.
Интерфейс java.lang.Cloneable должен быть реализован классом, 
клон объекта которого мы хотим создать. Если мы не реализуем 
интерфейс Cloneable, метод clone () генерирует исключение 
CloneNotSupportedException .
Метод clone () определен в классе Object. Синтаксис метода clone () 
следующий:
1.	protected Object clone() throws CloneNotSupportedException  
Зачем использовать метод clone ()?
Метод clone () избавляет от дополнительной задачи обработки для 
создания точной копии объекта. Если мы выполним это с использованием 
ключевого слова new, это займет много времени обработки, поэтому 
мы используем клонирование объектов.
Преимущество клонирования объектов
Хотя Object.clone () имеет некоторые проблемы с дизайном, он 
по-прежнему остается популярным и простым способом копирования 
объектов. Ниже приводится список преимуществ использования метода 
clone ():
o	Вам не нужно писать длинные и повторяющиеся коды. 
Просто используйте абстрактный класс с методом clone () 
длиной 4 или 5 строк.
o	Это самый простой и эффективный способ копирования объектов, 
особенно если мы применяем его к уже разработанному или старому 
проекту. Просто определите родительский класс, реализуйте в 
нем Cloneable, предоставьте определение метода clone (), 
и задача будет выполнена.
o	Clone () - самый быстрый способ скопировать массив.
Недостаток клонирования объектов
Ниже приводится список некоторых недостатков метода clone ():
o	Чтобы использовать метод Object.clone (), мы должны изменить 
множество синтаксисов нашего кода, например, реализовать интерфейс 
Cloneable, определить метод clone () и обработать 
CloneNotSupportedException и, наконец, вызвать Object.clone () и т. Д.
o	Мы должны реализовать клонируемый интерфейс, пока в нем нет 
никаких методов. Нам просто нужно использовать его, чтобы 
сообщить JVM, что мы можем выполнить clone () для нашего объекта.
o	Object.clone () защищен, поэтому мы должны предоставить 
собственный clone () и косвенно вызвать из него Object.clone ().
o	Object.clone () не вызывает никаких конструкторов, поэтому 
у нас нет никакого контроля над созданием объекта.
o	Если вы хотите написать метод клонирования в дочернем классе,
 тогда все его суперклассы должны определить в них метод clone () 
 или унаследовать его от другого родительского класса. 
 В противном случае цепочка super.clone () завершится ошибкой.
o	Object.clone () поддерживает только поверхностное 
копирование, но нам нужно будет переопределить его, если 
нам понадобится глубокое клонирование.

Java - Концепции ООП: вопросы на собеседовании с перегрузкой методов
Core Java - OOPs Concepts: Method Overloading Interview Questions

Что такое перегрузка метода?
Перегрузка метода - это метод полиморфизма, который позволяет нам создавать несколько методов с одним и тем же именем, но с другой подписью. Мы можем добиться перегрузки метода двумя способами.
o	Изменение количества аргументов
o	Изменение типа возврата
Перегрузка метода увеличивает читаемость программы. Для быстрого определения программы выполняется перегрузка метода.
Перегрузка методов в Java
Если у класса есть несколько методов с одинаковым именем, но разными параметрами, это называется перегрузкой метода .
Если нам нужно выполнить только одну операцию, одно и то же имя методов увеличивает читаемость программы .
Предположим, вам нужно выполнить сложение заданных чисел, но может быть любое количество аргументов, если вы напишете такой метод, как a (int, int) для двух параметров и b (int, int, int) для трех параметров, тогда он Вам, а также другим программистам может быть сложно понять поведение метода, потому что его имя отличается.
Итак, мы выполняем перегрузку метода, чтобы быстро разобраться в программе.
 
Преимущество перегрузки метода
Перегрузка метода увеличивает читаемость программы .
Различные способы перегрузки метода
Есть два способа перегрузить метод в java
1.	Изменяя количество аргументов
2.	Изменяя тип данных
В Java перегрузка метода невозможна путем изменения только 
возвращаемого типа метода.

Типы данных в Java
Типы данных определяют различные размеры и значения, которые могут храниться в переменной. В Java есть два типа данных:
1.	Примитивные типы данных: примитивные типы данных включают boolean, char, byte, short, int, long, float и double.
2.	Непримитивные типы данных: непримитивные типы данных включают классы , интерфейсы и массивы .
Примитивные типы данных Java
В языке Java примитивные типы данных являются строительными блоками для обработки данных. Это самые основные типы данных, доступные в языке Java .
Java - это язык программирования со статической типизацией. Это означает, что все переменные должны быть объявлены перед его использованием. Вот почему нам нужно объявить тип и имя переменной.
Существует 8 типов примитивных типов данных:
o	логический тип данных
o	байтовый тип данных
o	тип данных char
o	short тип данных
o	тип данных int
o	long тип данных
o	тип данных float
o	double тип данных
 
Тип данных	Значение по умолчанию	Размер по умолчанию
логический	      ложный	                1 бит
char	         '\ u0000'	                2 байта
байт	          0	                        1 байт
short           	0	                    2 байта
int	                0	                    4 байта
long                0L	                    8 байт
flout              0,0f	                    4 байта
double	           0,0d	                    8 байт

Логический тип данных

Тип данных Boolean используется для хранения только двух 
возможных значений: true и false. Этот тип данных используется
 для простых флагов, которые отслеживают истинные / ложные условия.
Тип данных Boolean определяет один бит информации, но его «размер» 
нельзя точно определить.
Пример: логическая единица = ложь

Тип данных байта
Тип данных байта является примером примитивного типа данных. 
Это 8-битовое целое число с дополнением до двух со знаком. 
Диапазон его значений составляет от -128 до 127 (включительно). 
Его минимальное значение -128, а максимальное - 127. Его значение
 по умолчанию - 0.

Тип данных byte используется для экономии памяти в больших массивах,
 где экономия памяти наиболее необходима. Это экономит место, потому
  что байт в 4 раза меньше целого числа. Его также можно 
  использовать вместо типа данных "int".
Пример: байт a = 10, байт b = -20

Short тип данных
Короткий тип данных - это 16-битовое знаковое целое число с 
дополнением до двух. Его диапазон значений находится в 
пределах от -32 768 до 32 767 (включительно). 
Его минимальное значение - 32 768, максимальное - 32 767. 
Его значение по умолчанию - 0.
short тип данных также может использоваться для экономии 
памяти, как и байтовый тип данных. short тип данных 
в 2 раза меньше целого.
Пример: short s = 10000, short r = -5000

Тип данных Int
Тип данных int - это 32-битное знаковое целое число с дополнением 
до двух. Его диапазон значений находится в 
диапазоне от -2 147 483 648 (-2 ^ 31) до 2 147 483 647 (2 ^ 31 -1) 
(включительно). Его минимальное значение - 2 147 483 648, 
максимальное - 2 147 483 647. Его значение по умолчанию - 0.
Тип данных int обычно используется как тип данных по
 умолчанию для целых значений, если нет проблем с памятью.
Пример: int a = 100000, int b = -200000

long тип данных
Тип данных long - это 64-битное целое число с дополнением до двух. 
Его диапазон значений находится 
между -9 223 372 036 854 775 808 (-2 ^ 63) 
до 9 223 372 036 854 775 807 (2 ^ 63 -1) (включительно).
 Его минимальное значение - 9 223 372 036 854 775 808, 
 максимальное - 9 223 372 036 854 775 807. 
 Его значение по умолчанию - 0. Тип данных long используется, 
 когда вам нужен диапазон значений, больший, чем тот, 
 который предоставляется int.
Пример: long a = 100000l, long b = -200000l

Тип данных с плавающей запятой float
Тип данных с плавающей запятой представляет собой 32-битное число с плавающей запятой одинарной точности IEEE 754. Диапазон значений неограничен. Рекомендуется использовать float (вместо double), если вам нужно сохранить память в больших массивах чисел с плавающей запятой. Тип данных с плавающей запятой никогда не следует использовать для точных значений, таких как валюта. Его значение по умолчанию - 0,0F.
Пример: float f1 = 234,5f

double тип данных
Тип данных double - это 64-битное число с плавающей запятой двойной точности IEEE 754. Диапазон его значений неограничен. Тип данных double обычно используется для десятичных значений, как и float. Тип данных double также никогда не следует использовать для точных значений, таких как валюта. Его значение по умолчанию - 0,0d.
Пример: double d1 = 12,3

Тип данных Char
Тип данных char - это один 16-битный символ Unicode.
 Диапазон значений находится между '\ u0000' (или 0) и '\ uffff' 
 (или 65 535 включительно). Тип данных char используется 
 для хранения символов.
Пример: char letterA = 'A'
________________________________________
Почему char использует 2 байта в java и что такое \ u0000?
Это потому, что java использует систему Unicode, а не систему 
кода ASCII. \ U0000 - это самый низкий диапазон системы Unicode. 
Чтобы получить подробное объяснение о Unicode, 
посетите следующую страницу.

Почему перегрузка метода невозможна при изменении только 
возвращаемого типа метода?
В java перегрузка метода невозможна путем изменения типа 
возвращаемого значения метода только из-за двусмысленности. 

Примечание. Ошибка времени компиляции лучше, чем ошибка 
времени выполнения. Итак, компилятор java отображает ошибку 
времени компилятора, если вы объявляете тот же метод с такими 
же параметрами.

Перегрузка метода и продвижение типа
byte можно повысить до short, int, long, float или double.
 Тип данных short может быть повышен до int, long, float или 
 double. Тип данных char может быть повышен до int, long, float
  или double и так далее.






