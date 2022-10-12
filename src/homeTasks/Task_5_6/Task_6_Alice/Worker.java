package homeTasks.Task_5_6.Task_6_Alice;

import java.util.Arrays;

public class Worker {
    private String name;
    private int age;
    private String country;
    private int salary;
    private String degree;

    public Worker (String name, int age, String country, int salary, String degree) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getSalary() {
        return salary;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "\n" + "Worker --- " + "name: " + name + ", age: " + age + ", country: " + country + ", salary: " + salary + ", degree: " + degree;
    }

    public static Worker[] sortByName(Worker[] workers) {
        String[] arr = new String[workers.length]; // создаем новый массив из имен
        for (int i = 0; i < workers.length; i++) {
            arr[i] = workers[i].name;
        }
        Arrays.sort(arr);                           // сортируем этот новый массив
        for (int i = 0; i < workers.length; i++) {  // сравниваем элементы массивов и расставляем рабочих по тем местам, что и имена в новом массиве
            for (int j = 0; j < workers.length; j++) {
                if(arr[i].equals(workers[j].name)){
                    workers[i] = workers[j];

                }
            }
        }
        return workers;
    }

    public static Worker[] sortByAge(Worker[] workers) {
        int[] arr = new int[workers.length]; // создаем новый массив из имен
        for (int i = 0; i < workers.length; i++) {
            arr[i] = workers[i].age;
        }
        Arrays.sort(arr);                           // сортируем этот новый массив
        for (int i = 0; i < workers.length; i++) {  // сравниваем элементы массивов и расставляем рабочих по тем местам, что и имена в новом массиве
            for (int j = 0; j < workers.length; j++) {
                if(arr[i] == (workers[j].age)){
                    workers[i] = workers[j];
                }
            }
        }
        return workers;
    }

}
