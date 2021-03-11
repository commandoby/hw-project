package HW_210305;
//Создать двумерный массив, размер которого вводится с консоли
//Вывести массив в консоль заменив чётные числа 0, а нечётные - 1

import java.util.Random;
import java.util.Scanner;

public class Task5_Arrays {
    public static void main(String[] args) {

        //Создаём двмерный массив и заполняем его случайными числами от 0 до 9
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите колличество строк массива: ");
        int a = sc.nextInt();
        System.out.print("Введите размер каждой строки массива: ");
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10);
            }
        }

        //Выводим в консоль массив замиив числа на 0 и 1
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] % 2);
            }
            System.out.println("");
        }
    }
}
