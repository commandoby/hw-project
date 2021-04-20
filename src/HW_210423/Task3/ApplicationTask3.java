package HW_210423.Task3;

import HW_210423.TextFormater;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationTask3 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\HW_210423\\Task3\\Text.txt");
             FileReader readerBL = new FileReader("src\\HW_210423\\Task3\\BlackList.txt")) {
            ArrayList<String> proposalList = new ArrayList<>();
            ArrayList<String> proposalNotCorrectList = new ArrayList<>();
            ArrayList<String> blackListWords = new ArrayList<>();
            StringBuilder proposal = new StringBuilder();
            int letter;

            //writing proposals to an array
            while ((letter = reader.read()) != -1) {
                proposal.append((char) letter);
            }
            for (String s : proposal.toString().split("\n")) {
                for (String s1 : s.split("\\.")) {
                    if (!s1.isEmpty()) {
                        proposalList.add(s1.trim());
                    }
                }
            }

            //writing blacklisted words to an array
            proposal = new StringBuilder();
            while ((letter = readerBL.read()) != -1) {
                proposal.append((char) letter);
            }
            for (String s : proposal.toString().split(" ")) {
                blackListWords.add(s);
            }

            //search for proposals with blacklisted words
            for (String s : proposalList) {
                if (TextFormater.IsCorrectBLProposal(s, blackListWords)) {
                    proposalNotCorrectList.add(s);
                }
            }

            if (proposalNotCorrectList.isEmpty()) {
                System.out.println("The text was censored.");
            } else {
                System.out.printf("The text has not been censored.\n" +
                        "There are %d proposals in the text with words from the blacklist:\n", proposalNotCorrectList.size());
                for (String s : proposalNotCorrectList) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
