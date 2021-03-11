package HW_210305;
//Имеется целое число < 10
//Вывести какому дню недели оно соответствует, если при n = 1 - Понедельник.

import java.util.Scanner;

public class Task7_ConsoleEnter {
    public static void main(String[] args) {

        //Ввод числа n
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n (от 1 до 9): ");
        int n = in.nextInt()%7;

        //Вывод дня недели
        switch (n) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("Воскресенье");
        }
    }
}
