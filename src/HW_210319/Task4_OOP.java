package HW_210319;
/*Создать класс компьютер со следующими полями: тип процессора, объем оперативной памяти, объем жесткого диска.
И методами: метод для вывода значений всех полей; метод включения компьютера; метод выключения компа (аналогично включению).
При включении может произойти сбой. При вызове метода рандомно загадывается число (0 либо 1), а Вы вводите число с клавиатуры.
Если угадали - комп включается, если нет сгорает. Если комп сгорел, то при попытке его включить нужно выдать сообщение что ему конец.*/

import java.util.Scanner;

public class Task4_OOP {
    public static void main(String[] args) {
        Computer computer = new Computer("i7", 16, 2000);
        Scanner in = new Scanner(System.in);

        while (computer.isWorkingCapacity()) {
            System.out.print("Введите команду (print, on, off): ");
            String instruction = in.next();
            switch (instruction) {
                case "print":
                    computer.printState();
                    break;
                case "on":
                    if (!computer.isState()) {
                        System.out.print("Введите 0 или 1: ");
                        byte enteredNumberOn = in.nextByte();
                        while (enteredNumberOn > 1 || enteredNumberOn < 0) {
                            System.out.print("Вы ввели некорректное число. Пожалуйста, введите 0 или 1: ");
                            enteredNumberOn = in.nextByte();
                        }
                        computer.on(enteredNumberOn);
                    } else {
                        System.out.println("Компьютер уже включён.");
                    }
                    break;
                case "off":
                    if (computer.isState()) {
                        System.out.print("Введите 0 или 1: ");
                        byte enteredNumberOff = in.nextByte();
                        while (enteredNumberOff > 1 || enteredNumberOff < 0) {
                            System.out.print("Вы ввели некорректное число. Пожалуйста, введите 0 или 1: ");
                            enteredNumberOff = in.nextByte();
                        }
                        computer.off(enteredNumberOff);
                    } else {
                        System.out.println("Компьютер уже выключен.");
                    }
                    break;
                default:
                    System.out.println("Вы ввели некорректную команду.");
            }
        }
        System.out.println("Компьютер сгорел. =(");
    }
}
