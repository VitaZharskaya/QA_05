package homeTasks.Task_5_6.Task_6_Alice;

import java.util.Arrays;

import static homeTasks.Task_5_6.Task_6_Alice.Worker.sortByAge;
import static homeTasks.Task_5_6.Task_6_Alice.Worker.sortByName;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Matt", 32, "USA", 8000, "Bachelor");
        Worker w2 = new Worker("Michael", 30, "Canada", 12000, "Bachelor");
        Worker w3 = new Worker("Carol", 42,"China", 11000, "Associate");
        Worker w4 = new Worker("Nick", 28, "Poland", 7000, "High School");
        Worker w5 = new Worker("Linda", 65,"Lebanon", 15000, "Master");
        Worker w6 = new Worker("Leo", 32, "Belarus", 8500, "Bachelor");
        Worker w7 = new Worker("Patrick", 37,"UK", 9000, "Bachelor");
        Worker w8 = new Worker("Chris", 25, "USA", 7000, "Associate");
        Worker w9 = new Worker("Laura", 36,"Armenia", 18000, "PhD");
        Worker w10 = new Worker("Eva", 19, "Finland", 6000, "High School");

        Worker[] allWorkers = {w1, w2, w3, w4, w5, w6, w7, w8, w9, w10};
       System.out.println(Arrays.toString(sortByName(allWorkers)));
        System.out.println(Arrays.toString(sortByAge(allWorkers)));

    }
}
