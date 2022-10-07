package homeworkSergey;


public class Helper {

    // поиск сотрудника в массиве по его имени
    public static void searchByName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)){
                System.out.println(employees[i].getName());
            }
        }
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee searchBySubname(Employee[] employees, String subName){
        if(employees.length == 0)
        {
            return null;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(subName)){
                return employees[i];
            }
        }
            return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getAllEmployeesSalary(Employee[] employees) {
        if(employees.length == 0)
        {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    // поиск наименьшей зарплаты в массиве
    public static int getMinSalary(Employee[] employees) {
        if(employees.length == 0)
        {
            return 0;
        }
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < minSalary){
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    // поиск наибольшей зарплаты в массиве
    public static int getMaxSalary(Employee[] employees) {
        if(employees.length == 0)
        {
            return 0;
        }
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if ( employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int getMinNumberOfSubordinates(Manager[] managers) {
        if(managers.length == 0)
        {
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

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int getMaxNumberOfSubordinates(Manager[] managers) {
        if(managers.length == 0)
        {
            return 0;
        }
        int max = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > max) {
                max = manager.getNumberOfSubordinates();
            }
        }
        return max;
    }

    //поиск наибольшей надбавки (разницы между базовой зарплатой и выплатой) в массиве менеджеров
    public static int getMaxSalaryAddition(Manager[] managers) {
        if(managers.length == 0)
        {
            return 0;
        }
        int max = managers[0].getSalary() - managers[0].getBaseSalary();
        for (int i = 0; i < managers.length; i++) {
            if(managers[i].getSalary() - managers[i].getBaseSalary() > max){
                max = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }
        return max;
    }

    //поиск наименьшей надбавки (разницы между базовой зарплатой и выплатой) в массиве менеджеров
    public static int getMinSalaryAddition(Manager[] managers) {
        if(managers.length == 0)
        {
            return 0;
        }
        int min = managers[0].getSalary() - managers[0].getBaseSalary();
        for (int i = 0; i < managers.length; i++) {
            if(managers[i].getSalary() - managers[i].getBaseSalary() < min) {
                min = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }
        return min;
    }
}
