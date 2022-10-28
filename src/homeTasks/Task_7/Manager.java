package homeTasks.Task_7;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, gender, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int baseSalary = super.getSalary(monthArray);
        if (getNumberOfSubordinates() == 0){
            return baseSalary;
        }
        return baseSalary + (baseSalary / 100 * getNumberOfSubordinates());
    }
}


