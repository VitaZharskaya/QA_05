package homeTasks.Task_7;

import static homeTasks.Task_7.EmployeeUtils.*;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Peter", 35, 'M',200,1);
        Manager m2 = new Manager("Tom", 30, 'M',400, 6);
        Manager m3 = new Manager("Sam", 28, 'M', 230, 5);

        Manager[] managers = new Manager[] {m1, m2, m3};
        System.out.println(getMinSalaryAddOn(managers, MonthUtils.threeMonths));
        System.out.println(getMaxSalaryAddOn(managers, MonthUtils.threeMonths));

    }
}
