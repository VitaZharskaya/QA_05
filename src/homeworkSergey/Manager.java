package homeworkSergey;

public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates > 0) {
            return (int) (getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }else{
            return getBaseSalary();
        }
    }
}
