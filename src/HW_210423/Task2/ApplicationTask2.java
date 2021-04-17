package HW_210423.Task2;

import HW_210423.TextFormater;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationTask2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\HW_210423\\Task2\\Text.txt");
             FileWriter writer = new FileWriter("src\\HW_210423\\Task2\\TextNew.txt")) {
            ArrayList<String> proposalList = new ArrayList<>();
            ArrayList<String> proposalCorrectList = new ArrayList<>();
            StringBuilder proposal = new StringBuilder();
            int letter;

            //writing proposals to an array
            while ((letter = reader.read()) != -1) {
                if (letter == '\n' || letter == '\r' || letter == '.') {
                    if (letter == '.') {
                        proposal.append('.');
                    }
                    proposalList.add(proposal.toString());
                    proposal = new StringBuilder();
                } else {
                    if (!(letter == ' ' && proposal.isEmpty())) {
                        proposal.append((char) letter);
                    }
                }
            }

            //search for correct proposals
            for (String s : proposalList) {
                if (TextFormater.IsCorrectProposal(s)) {
                    proposalCorrectList.add(s);
                }
            }

            //writing correct proposals to a file
            for (String s : proposalCorrectList) {
                writer.write(s);
                writer.write('\n');
            }
            System.out.println("Correct proposals added to \"TextNew.txt\"");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
