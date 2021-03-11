package HW_210305;
//Имеется прямоугольное отверстие размерами a и b.
//Определить, закроет ли его круг с радиусом r.
//Вывести результат на экран.

import java.util.Scanner;

public class Task1_ConsoleEnter {
    public static void main(String[] args) {

        //Передача объекта System.in в конструктор класса Scanner?
        Scanner in = new Scanner(System.in);

        //Ввод данных
        System.out.print("Введите длину прямоугольника: ");
        int a = in.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int b = in.nextInt();
        System.out.print("Введите радиус круга: ");
        int r = in.nextInt();

        //Расчёт и вывод
        if (Math.sqrt(a * a + b * b) <= 2 * r) {
            System.out.println("Круг полностью закрывает прямоугольник");
        } else {
            System.out.println("Круг не закрывает прямоугольник");
        }
    }
}
