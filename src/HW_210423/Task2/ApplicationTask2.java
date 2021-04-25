package HW_210423.Task2;

import HW_210423.TextFormater;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationTask2 {
    private static final String ORIGIN_FILE_PATH = "src\\HW_210423\\Task2\\Text.txt";
    private static final String NEW_FILE_PATH = "src\\HW_210423\\Task2\\TextNew.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ORIGIN_FILE_PATH));
             FileWriter writer = new FileWriter(NEW_FILE_PATH)) {
            ArrayList<String> sentenceList = new ArrayList<>();
            ArrayList<String> sentenceCorrectList = new ArrayList<>();
            String sentence;

            //writing proposals to an array
            while ((sentence = reader.readLine()) != null) {
                String[] sentences = sentence.split("\\.");
                for (String s : sentences) {
                    if (!s.isEmpty()) sentenceList.add(s.trim());
                }
            }

            //search for correct proposals
            for (String s : sentenceList) {
                if (TextFormater.isCorrectSentence(s)) sentenceCorrectList.add(s);
            }

            //writing correct proposals to a file
            for (String s : sentenceCorrectList) {
                writer.write(s);
                writer.write('\n');
            }
            System.out.println("Correct proposals added to \"TextNew.txt\"");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
