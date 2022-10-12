package lesson7;

public class Manager extends Employee{

    public Manager(String name, int age, String diet) throws PersonAgeException {
        super(name, age, diet);
    }

    @Override
    public void hello() {
        System.out.println("I am the boss");
    }

    public static void something() {

    }

}
