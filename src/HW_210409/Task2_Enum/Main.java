package HW_210409.Task2_Enum;

public class Main {
    public static void main(String[] args) {
        System.out.printf("There are %s letters in English:\n", Alphabet.values().length);
        getLetterPosition();
    }

    public static void getLetterPosition() {
        for (Alphabet i : Alphabet.values()) {
            int letterPosition = i.ordinal();
            System.out.println(i.toString() + " - " + ++letterPosition);
        }
    }
}
