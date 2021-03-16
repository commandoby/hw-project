package HW_210319;
/*Создайте класс Calculator, который будет производит математические действия
над двумя операндами и выводить результат операций в консоль.
В классе должны быть: поля-операнды; геттеры и сеттеры для полей;
конструктор, в котором инициализируются поля; методы для математических операций (не менее трех операций).
Протестируйте работу Вашего класса.*/

import java.util.Scanner;

public class Task2_OOP {
    public static void main(String[] args) {
        //Объявляем операнды
        int operandOne;
        int operandTwo;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый операнд: ");
        operandOne = in.nextInt();
        System.out.print("Введите второй операнд: ");
        operandTwo = in.nextInt();
        //Создаём объект Calculanor
        Calculator operationOne = new Calculator(operandOne, operandTwo);
        operationOne.addition();
        operationOne.subtraction();
        operationOne.multiplication();
        operationOne.division();
    }
}
