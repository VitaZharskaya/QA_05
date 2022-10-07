package rocket;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = a.nextInt();

        for( int i = num; i < num + 10; i++){
            System.out.println(i);
            System.out.println("---");
        }
    }
}
