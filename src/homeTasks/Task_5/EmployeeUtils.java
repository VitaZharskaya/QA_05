package homeTasks.Task_5;

import java.util.Objects;

public class EmployeeUtils {
    //    поиск сотрудника в массиве по его имени
    public static Employee findByName(Employee[] employees, String name) {
        if (employees.length == 0) {
            return null;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    //    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubname(Employee[] employees, String subName) {
        if (employees.length == 0) {
            return null;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(subName)) {
                return employees[i];
            }
        }
        return null;
    }


    //    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getAllEmployeesSalary(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }


    //    поиск наименьшей зарплаты в массиве
    public static int getMinSalary(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    //    поиск наибольшей зарплаты в массиве
    public static int getMaxSalary(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

}
