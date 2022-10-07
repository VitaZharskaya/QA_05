package homeTasks;

public class Task_2 {
    public static void main(String[] args) {

//        Задача №1
//        Необходимо создать две целочисленные переменные (a, b),
//        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//        a == b - если переменные равны
//        a < b - если переменная a меньше b
//        a > b - если переменная b меньше a

        int a = 5;
        int b = 8;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }


//      Задача №2
//      Необходимо создать две целочисленные переменные (a, b),
//      присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//      maybe a and b are even - если сумма переменных четная
//      some variable is odd - если сумма переменных нечетная

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }


//      Задача №3
//
//      Необходимо создать целочисленную переменную,
//      присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
//      больше 10 - если переменная больше 10
//      меньше 100 - если переменная меньше 100
//      результат деления на 2 больше 20 - если это соответствует истине
//      значение переменной между 5 и 40 включительно - если это правда
//      значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        int x = 945;

        if (x > 10) {
            System.out.println("больше 10");
        }
        if (x < 100) {
            System.out.println("меньше 100");
        }
        if (x / 2.0 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (x >= 5 && x <= 40) {
            System.out.println(x);
        }
        if (!(x >= 5 && x <= 40)) {
            System.out.println("значение переменной меньше 5 или больше 40");
        }


//      Задача №4
//
//      Необходимо вывести числа от 0 до 15.

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }


//      Задача №5
//
//      Необходимо вывести все положительные степени числа 5 которые меньше 10000,
//      вывести результат возведения в степень.

        for (int i = 5; i < 10000; i *= 5) {
            System.out.println(i);
        }


//      Задача №6
//
//      Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//              Реализовать 2 варианта:
//      использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//      без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }


        for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
    }
}