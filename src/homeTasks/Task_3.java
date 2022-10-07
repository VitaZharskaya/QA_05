package homeTasks;

import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {


//    Задача №1
//
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);


//        Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.


        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array2[0];

        for (int i = 0; i < array2.length; i++) {

            if (array2[i] > max) {
                max = array2[i];
            }
        }
        System.out.println(max);


//        Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array3[0];

        for (int i = 0; i < array3.length; i++) {

            if (array3[i] < min) {
                min = array3[i];
            }
        }
        System.out.println(min);


//        Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double summ = 0;

        for (int i = 0; i < array4.length; i++) {
            summ = summ + array4[i];
        }
        System.out.println(summ / array4.length);


//        Задача №5
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum5 = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum5 = sum5 + array5[i][j];
            }
        }
        System.out.println(sum5);


//        Задача №6
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.


        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max6 = array6[0][0];
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j] > max6) {
                    max6 = array6[i][j];
                }
            }
        }
        System.out.println(max6);


//        Задача №7
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.


        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);


        int a = 15;

        for (int i = 0; i < a; i++) {
            System.out.println("");
            for (int j = 0; j < a; j++) {

                System.out.print("[ ]");
            }
        }
        System.out.println();
        System.out.println();

        //extra task 2
        //Создать массив строк из любой строчки песни/текста (длина массива не менее 5 элементов).
        // Любыми доступными знаниями выстроить элементы массива в алфавитном порядке. Вывести на печать


        String[] song = {"One", "Two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        for (int i = 0; i < song.length; i++) {
            song[i] = song[i].toLowerCase();
        }
        Arrays.sort(song);
        System.out.println(Arrays.toString(song));

//        Extra Задача №3
//        Создать массив строк из любой строчки песни/текста (длина массива не менее 10 элементов).
//        Любыми доступными знаниями подсчитать и вывести на печать каждую букву что встречается в массиве.
//        (Пример а = 5, b = 4, если = 0 можно не выводить на печать).
        String s = "";
        for (int i = 0; i < song.length; i++) {
            s = s + song[i];
        }
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        // System.out.println(arr);

        for (int i = 'a'; i < 'z'; i++) {
            int num = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == i) {
                    num++;
                }
            }
            if (num != 0) {
                System.out.println((char) i + " = " + num);
            }
        }
    }
}
