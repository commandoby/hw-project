package HW_210305;
//Создать зубчатый массив со случайным числом ячеек в строках и заполнить случайными числами

import java.util.Random;

public class Task6_Arrays {
    public static void main(String[] args) {

        //Создаём зубчатый массив и заполняем его
        Random r = new Random();
        int[][] array = new int[10][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[r.nextInt(10) + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10);
            }
        }

        //Вывод массива в консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
