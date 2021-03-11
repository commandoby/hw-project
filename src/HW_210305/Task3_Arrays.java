package HW_210305;
//Создать массив из n вещественных элементов
//Вычислить сумму отрицательных элементов
//Вычислить произведение элементов между максимальным и минимальным элементами

import java.util.Random;

public class Task3_Arrays {
    public static void main(String[] args) {

        //Создаём массив размером от 10 до 15 и заполняем его числами от -10,0 до 10,0
        Random r = new Random();
        double[] array = new double[r.nextInt(5)+10];
        for (int i =0; i < array.length; i++) {
            array[i] = (double)(r.nextInt(200)-100)/10;
            System.out.print(array[i] + ", ");
        }

        //Находим сумму отрицательных чисел
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        System.out.println("\nСумма отрицательный чисел: " + sum);

        //Находим максимальное и минимальное значение
        int pos1 = 0;
        int pos2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[pos1]) {
                pos1 = i;
            }
            if (array[i] > array[pos2]) {
                pos2 = i;
            }
        }
        System.out.println("Минимальное значение: " + array[pos1] + "; Максимальное значение: " + array[pos2]);

        //Определяем произведение значений между максимальным и минимальным значением.
        if (pos1 > pos2) {
            int a = pos1;
            pos1 = pos2;
            pos2 = a;
        }
        double comp = 1.0;
        for (int i = pos1 + 1; i < pos2; i++) {
            comp *= array[i];
        }
        if (pos2 - pos1 == 1) {
            System.out.println("Промежуточные значения отсутствуют");
        } else {
            System.out.println("Произведение промежуточных чисел: " + comp);
        }
    }
}
