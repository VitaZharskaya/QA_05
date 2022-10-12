package homeTasks.Task_5_6;

public class Employee extends Person{
    private int salary;

    public Employee(String name, char sex, int yearOfBirth, int salary) {
        super(name, sex, yearOfBirth);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return employee.getName().equals(getName());
    }
}
