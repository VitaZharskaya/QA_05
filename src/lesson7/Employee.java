package lesson7;

public class Employee extends BasePerson {

    private int salary;

    public Employee(String name, int age, String diet) throws PersonAgeException {
        super(name, age, diet);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void hello() {
        System.out.println("Hi, I am Employee");
    }
}
