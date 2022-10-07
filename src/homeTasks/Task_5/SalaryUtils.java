package homeTasks.Task_5;

public class SalaryUtils {
    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum = sum + employeeArray[i].getSalary();
        }
        return sum;
    }
}
