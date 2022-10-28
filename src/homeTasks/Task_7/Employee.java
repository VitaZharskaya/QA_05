package homeTasks.Task_7;

public class Employee {
   private String name;
   private int age;
   private char gender;
   private int salaryPerDay;

    public Employee(String name, int age, char gender, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (Month month : monthArray) {
            salary += month.getWorkingDays() * getSalaryPerDay();
        }
        return salary;
    }
}
