package homeTasks.Task_5_6;


import static homeTasks.Task_5_6.EmployeeUtils.*;
import static homeTasks.Task_5_6.SalaryUtils.getSum;

public class Main {
    public static void main(String[] args) {

        Employee vita = new Employee("Vita", 'F', 1995, 10000);
        Employee vasya = new Employee("Vasya", 'M', 1986, 10100);
        Employee katya = new Employee("Katya", 'M', 1915, 12200);

        Employee[] employees = new Employee[]{vita,vasya,katya};

        System.out.println(vita.getName());
        System.out.println(vita.getAge());
        System.out.printf("name: %s, sex: %s, age: %s." + "\n", vita.getName(), vita.getSex(), vita.getAge());


        System.out.println(findByName(employees, "Katya")); // как лучше оформить, если мы захотим вызвать имя, а объект == null?
        System.out.println(findBySubname(employees, "ya").getName()); // как сделать так, чтобы выводилось несколько сотрудников?
        System.out.println(getAllEmployeesSalary(employees));
        System.out.println(getMinSalary(employees));
        System.out.println(getMaxSalary(employees));
        System.out.println(vita.isSameName(vasya));
        System.out.println(getSum(employees));
    }
}
