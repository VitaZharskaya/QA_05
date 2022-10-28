package homeTasks.Task_7;

import homeTasks.Task_5_6.Employee;

public class EmployeeUtils {
    //    поиск сотрудника в массиве по его имени
    public static homeTasks.Task_5_6.Employee findByName(homeTasks.Task_5_6.Employee[] employees, String name) {
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
    public static homeTasks.Task_5_6.Employee findBySubname(Employee[] employees, String subName) {
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

    //    поиск наименьшего количества подчиненных в массиве менеджеров
    public static int getMinNumberOfSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        int min = managers[0].getNumberOfSubordinates();
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < min) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    //    поиск наибольшего количества подчиненных в массиве менеджеров
    public static int getMaxNumberOfSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        int max = managers[0].getNumberOfSubordinates();
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > max) {
                max = managers[i].getNumberOfSubordinates();
            }
        }
        return 0;
    }

    //    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static int getMaxSalaryAddOn(Manager[] managers, Month[] monthArray) {
        if (managers.length == 0) {
            return 0;
        }
        int max = managers[0].getSalary(monthArray);
        for (Manager manager : managers) {
            if (manager.getSalary(monthArray) > max) {
                max = manager.getSalary(monthArray);
            }
        }
        return max;
    }

    //    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static int getMinSalaryAddOn(Manager[] managers, Month[] monthArray) {
        if (managers.length == 0) {
            return 0;
        }
        int min = managers[0].getSalary(monthArray);
        for (Manager manager : managers) {
            if (manager.getSalary(monthArray) < min) {
                min = manager.getSalary(monthArray);
            }
        }
        return min;
    }

}
