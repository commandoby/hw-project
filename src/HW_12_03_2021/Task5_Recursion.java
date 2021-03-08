package HW_12_03_2021;
//Дано натуральное число n>1. Используя рекурсию, необходимо проверить, является ли оно простым.
//Программа должна вывести фразу «Is number <your number> simple - YES», если число простое и
//«Is number <your number> simple - NO», если число составное.
//Для вывода информации используйте метод printf.


import java.util.Scanner;

public class Task5_Recursion {
    public static void main(String[] args) {
        //Ввод числа n
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n больше 1: ");
        n = in.nextInt();
        for (; n <= 1; ) {
            System.out.print("Вы ввели неверное число. Пожалуйста введите число n>1: ");
            n = in.nextInt();
        }
        //Вызов метода расчёта простого числа и вывод ответа
        boolean answer = simple(n, 2);
        if (answer) {
            System.out.printf("Is number %d simple - YES", n);
        } else {
            System.out.printf("Is number %d simple - NO", n);
        }
    }
    //Расчет простого числа
    static boolean simple(int n, int a) {
        if (n == a) {
            return true;
        } else {
            if (n % a == 0) {
                return false;
            } else {
                return simple(n, ++a);
            }
        }
    }
}
