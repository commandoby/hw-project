package HW_210423.Task3;

import HW_210423.TextFormater;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationTask3 {
    private static final String ORIGIN_FILE_PATH = "src\\HW_210423\\Task3\\Text.txt";
    private static final String BLACK_LIST_FILE_PATH = "src\\HW_210423\\Task3\\BlackList.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ORIGIN_FILE_PATH));
             BufferedReader readerBL = new BufferedReader(new FileReader(BLACK_LIST_FILE_PATH))) {
            ArrayList<String> sentenceList = new ArrayList<>();
            ArrayList<String> sentenceNotCorrectList = new ArrayList<>();
            ArrayList<String> blackListWords = new ArrayList<>();
            String sentence;

            //writing proposals to an array
            while ((sentence = reader.readLine()) != null) {
                String[] sentences = sentence.split("\n");
                for (String s : sentences) {
                    String[] sentences1 = s.split("\\.");
                    for (String s1 : sentences1) sentenceList.add(s1.trim());
                }
            }

            //writing blacklisted words to an array
            sentence = "";
            while ((sentence = readerBL.readLine()) != null) {
                String[] sentences = sentence.split(" ");
                for (String s : sentences) blackListWords.add(s.trim());
            }

            //search for proposals with blacklisted words
            for (String s : sentenceList) {
                if (TextFormater.isCorrectBLSentence(s, blackListWords)) sentenceNotCorrectList.add(s);
            }

            if (sentenceNotCorrectList.isEmpty()) {
                System.out.println("The text was censored.");
            } else {
                System.out.printf("The text has not been censored.\n" +
                        "There are %d proposals in the text with words from the blacklist:\n", sentenceNotCorrectList.size());
                for (String s : sentenceNotCorrectList) System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
