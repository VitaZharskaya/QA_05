package lesson7;

public class Comments {

    // ========================= Part 1. Final ==============================

    // final - используется, чтобы нельзя было изменить значение


    // 1) final переменная

    // Пример
//    public String getName() {
//
//        final String male = "Mr. ";
//        final String female = "Ms. ";
//
//        if (this.sex == 'M') {
//            return male + this.name;
//        } else {
//            return female + this.name;
//        }
//    }

    // 2) final поле
    public static final double PI = 3.1415;  // в других языках называют константами, но это не константа,
    // Это переменная, которую нельзя менять
    // Если посмотрим класс Math или Integer. Например MAX_VALUE - это как раз такая переменная
    int i = Integer.MAX_VALUE;
    //  В JAVA используется All CAPS Snake case (через нижнее подчеркивание) - это говорит, что это static и final

    // 3) final метод
    // Если метод final, нельзя его менять, соответственно нельзя делать Override

    // 4) final class
    // не позволяет дальнейшее наследование

    // ============================= Part 2. Abstraction ====================================

    // 1) Абстракция

    // Java запрещает создавать экземпляры/объекты от абстрактного класса
    // Часто во главе иерархии классов ставится Base class (например BasePerson, а не Person)
    // Единственная цель этого класса - это, чтобы от него наследовались остальные

    // Можно назвать метод абстрактным, т.е. он имеет название, но мы не задаем тело, но мы не задаем параметры. Т.е. он пустой
    // если мы наследуем абстрактный метод от абстрактного класса, то у всех наследников этого класса нужно
    // имплементировать (переписать, Override) этот метод. Иначе класс должен быть тоже абстрактным

    // Еще одна особенность наследия: мы объект какого-то класса можем записать в переменную любого предка, но не наоборот,
    // потому что у предков может быть больше методов, это более расширенные классы.
    // Объект любого типа можно записать в Object

//    пример
//    Employee i = new Employee("Ivan", 34, "Vegetarian");
//    Person j = new Person("John", 44, "Halal");
    //  BasePerson i = new Employee("Ivan", 34);
    //  BasePerson j = new Person("John", 44);

    //  Object o = new Person("Vasilii Piterskiy", 23);
    //  System.out.println(o);

    //  Object o = i;
    //  o = j;

    // у класса Object есть метод getClass(), который возвращает класс того объекта, от которого мы вызываем

    // 2) Интерфейс

    // В JAVA нет множественного наследования
    // Допустим 2 класса не имеют общих предков. В Java для этого есть интерфейс
    // interface is always abstract by default (поэтому необязательно писать abstract к классу, оно подчеркнет серым)
    // интерфейс позволяет создать абстрактные методы
    // все методы в интерфейс public (необязательно писать public, оно подчеркнет серым)
    // интерфейс позволяет объединять классы, которые не имеют общих наследований (предков)
    // интерфейсов можно писать столько, сколько вам для вашей реализации нужно
    // наследование помогает максимально избавиться от дупликации кода

    // ============================= Part 3. Exception ====================================

    // чтобы добавить Exception нужно либо добавлять везде throw exception, либо перехватывать с помощью try catch


}
