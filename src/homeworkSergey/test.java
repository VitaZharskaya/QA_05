package homeworkSergey;


import static homeworkSergey.Helper.*;

public class test {
    public static void main(String[] args) {

        Manager manager = new Manager("vita", 10000, 5);
        Director director = new Director("Bob", 14000, 8);
        Director director2 = new Director("Boba", 15000, 10);
        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());
        System.out.println(director2.getSalary());
        searchByName(new Manager[]{manager, director, director2},"vita");

    }
}
