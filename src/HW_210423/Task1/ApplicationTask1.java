package HW_210423.Task1;

import HW_210423.TextFormater;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationTask1 {
    private static final String ORIGIN_FILE_PATH = "src\\HW_210423\\Task1\\Text.txt";
    private static final String NEW_FILE_PATH = "src\\HW_210423\\Task1\\TextNew.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ORIGIN_FILE_PATH));
             FileWriter writer = new FileWriter(NEW_FILE_PATH)) {
            ArrayList<String> wordList = new ArrayList<>();
            ArrayList<String> wordListPalindrome = new ArrayList<>();
            String line;

            //writing words to an array
            while ((line = reader.readLine()) != null) wordList.add(line);

            //search for palindromes
            for (String s : wordList) {
                if (TextFormater.isPalindrome(s)) wordListPalindrome.add(s);
            }

            //writing palindromes to a file
            for (String s : wordListPalindrome) {
                writer.write(s);
                writer.write('\n');
            }
            System.out.println("Palindromes added to \"TextNew.txt\"");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
