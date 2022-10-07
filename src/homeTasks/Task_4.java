package homeTasks;

//Задача №1
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0


import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(j + "  " );
            }
            System.out.println();
        }


        System.out.println("\n"+"\t"+"Задача №2");



        for(int i = 10; i > 0; i--){
            for (int k = 0; k < 10 - i; k++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }




        System.out.println("\n"+"\t"+"Задача №3");

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
                for (int k = 9 - i; k >= 0; k--) {

                    System.out.print(k + " ");
                }
                 for (int x = 1; x < 10-i; x++){
                     System.out.print(x + " ");
                 }


            System.out.println();
        }


        System.out.println("\n"+"\t"+"Задача №3");




        String s = "9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9";
        System.out.println(s);
        for (int i = 0; i < s.length()/2; i = i + 2){
           char a = s.charAt(i);
            s = s.replace(a, ' ');

            System.out.println(s.replace(a,' '));
        }


//        String s1 = "acadabrabra";
//
//        String [] arr = s1.split("a");
//
//        System.out.println(Arrays.toString(arr));


        add(5,6);
        subtract(9,7);
        multiply(34,5);
        division(5,0);

    }


    public static void add (int first, int second){
       int result = first + second;
        System.out.println(result);
    }

    public static void subtract (int first, int second){
        int result = first - second;
        System.out.println(result);
    }

    public static void multiply (int first, int second){
        int result = first * second;
        System.out.println(result);
    }

    public static void division ( int first, int second){
        if ( second != 0 ) {
            double result = 1.0 * first / second;
            System.out.println(result);
        }else{
            System.out.println("Incorrect input. Can't divide by 0. Try again");
        }
    }
}
