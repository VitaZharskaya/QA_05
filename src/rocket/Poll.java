package rocket;

import java.util.Scanner;

public class Poll {
    public static void main(String[] args) {

        Scanner poll = new Scanner(System.in);
        System.out.println("How many people voted for 9:30pm? ");

        int larks = poll.nextInt();


        System.out.println("How many people voted for 10pm? ");

        int owls = poll.nextInt();

        if (larks > owls){
            System.out.println("Congrats, who voted for 9:30, you won! Meeting time is 9:30pm.");
        }else{
            System.out.println("Congrats, who voted for 10, you won! Meeting time is 10pm.");
        }


    }
}
