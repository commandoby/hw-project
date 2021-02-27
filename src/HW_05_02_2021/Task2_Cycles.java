package HW_05_02_2021;
//Написать программу, которая выведет в консоль звёздочки квадратом 5х4.

public class Task2_Cycles {
    public static void main(String[] args) {
        for (var i = 0; i < 4; i++) {
            for (var j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
