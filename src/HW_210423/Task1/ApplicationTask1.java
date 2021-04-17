package HW_210423.Task1;

import HW_210423.TextFormater;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationTask1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\HW_210423\\Task1\\Text.txt");
             FileWriter writer = new FileWriter("src\\HW_210423\\Task1\\TextNew.txt")) {
            ArrayList<String> wordList = new ArrayList<>();
            ArrayList<String> wordListPalindrome = new ArrayList<>();
            StringBuilder word = new StringBuilder();
            int letter;

            //writing words to an array
            while ((letter = reader.read()) != -1) {
                if (letter == '\n' || letter == '\r') {
                    if (word.length() > 0) {
                        wordList.add(word.toString());
                        word = new StringBuilder();
                    }
                } else {
                    word.append((char) letter);
                }
            }

            //search for palindromes
            for (String s : wordList) {
                if (TextFormater.IsPalindrome(s)) {
                    wordListPalindrome.add(s);
                }
            }

            //writing palindromes to a file
            for (String i : wordListPalindrome) {
                writer.write(i);
                writer.write('\n');
            }
            System.out.println("Palindromes added to \"TextNew.txt\"");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
