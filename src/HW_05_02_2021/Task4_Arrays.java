package HW_05_02_2021;
//Создать и заполнить массив случайными числами
//Отсортировать массив по возрастанию, используя метод сортировки пузырьком

import java.util.Random;

public class Task4_Arrays {
    public static void main(String[] args) {

        //Создаём массив размером от 10 до 15 и заполняем его числами от 0 до 100
        Random r = new Random();
        int[] array = new int[r.nextInt(5)+10];
        System.out.print("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }

        //Сортировка массива пузырьковым методом
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[array.length - i - 1]) {
                    int a = array[array.length - i - 1];
                    array[array.length - i - 1] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.print("\nМассив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
