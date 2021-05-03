package HW_210507.StreamAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
    private static final String FILE_PATH = "src\\HW_210423\\Task1\\Text.txt";

    public static void main(String[] args) {
        //считываю слова из предыдущего задания
        ArrayList<String> wordList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) wordList.add(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //поиск слов-палиндромов
        wordList.stream().filter(s -> {
            StringBuilder stringBuilder = new StringBuilder(s);
            return s.equals(stringBuilder.reverse().toString());
        }).forEach(System.out::println);
    }
}
