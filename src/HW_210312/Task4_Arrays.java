package HW_210312;
//Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
//Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4_Arrays {
    public static void main(String[] args) {
        //Объявляем значение n
        int n;
        int nArray2 = 0; //Переменная для счётчика размера второго массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n больше 3: ");
        n = in.nextInt();
        for (; n <= 3; ) {
            System.out.print("Вы ввели неверное число. Пожалуйста, введите число более 3: ");
            n = in.nextInt();
        }
        //Создаём массив 1
        Random r = new Random();
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(n);
            if (array1[i] % 2 == 0) {
                nArray2 += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
        //Создаём массив 2
        int[] array2 = new int[nArray2];
        int b = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[b] = array1[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
