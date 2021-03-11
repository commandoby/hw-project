package HW_210312;
//Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//Необходимо определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task2_Cycles {
    public static void main(String[] args) {
        int ameba = 1;
        int hour = 0;
        for (int i = 0; i < 8; i++) {
            ameba *= 2;
            hour += 3;
            System.out.printf("Через %d часа(ов) будет %d амёб. \n", hour, ameba);
        }
    }
}
