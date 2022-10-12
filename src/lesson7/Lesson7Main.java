package lesson7;

public class Lesson7Main {

    public static void lesson07() throws PersonAgeException {
        // public static void lesson07(int age) throws PersonAgeException {
        Employee i = new Employee("Ivan", 34, "Vegetarian");
        Person j = new Person("John", 44, "Halal");
        Manager m = new Manager("Jane", 55, "Kosher");

        //        BasePerson i = new Employee("Ivan", 34);
        //        BasePerson j = new Person("John", 44);

        //        Object o = i;
        //        o = j;

        Dog sharik = new Dog("Sharik");
        Dog bobik = new Dog("Bobik", "meat");

//        BasePerson bp = new BasePerson() {    // в переменную наследника нельзя засунуть объект предка
//            @Override                         // переменную предка можно засунуть объект наследника
//            public void hello() {
//            }
//        }

        i.hello();
        j.hello();

//        BasePerson[] arr = new BasePerson[] {i, j, m};
        IDiet[] arr = new IDiet[] {i, j, m, sharik, bobik};

//        for (BasePerson bp: arr) {
//            System.out.println(bp.getClass().toString() + " eats " + bp.getDiet()); // у класса Object есть метод getClass() который возвращает класс того объекта, от которого мы вызываем
//            bp.hello();
//        }

        for (IDiet bp: arr) {
            System.out.println(bp.getClass().toString() + " eats " + bp.getDiet());
        }

//        Object o = new Person("Vasilii Piterskiy", 23);  // объект любого типа можно записать в Object
//        System.out.println(o);


        // Exceptions

//        try {
//            Person j = new Person("John", age, "Halal");
//        } catch (PersonAgeException personAgeException) {
//            Person j = new Person("John", 0, "Halal");
//        }

    }


    public static void main(String[] args) throws PersonAgeException {

        lesson07();



    }
}
