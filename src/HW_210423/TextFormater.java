package HW_210423;

import java.util.ArrayList;

public class TextFormater {
    //palindrome search method
    public static boolean IsPalindrome(String word) {
        StringBuilder wordSB = new StringBuilder(word);
        if (wordSB.length() <= 2) {
            return false;
        }
        return word.compareTo(wordSB.reverse().toString()) == 0;
    }

    //method of finding correct proposals
    public static boolean IsCorrectProposal(String proposal) {
        char[] proposalChar = proposal.toCharArray();
        StringBuilder word = new StringBuilder();
        int wordLength = 0;
        for (char ch : proposalChar) {
            if (ch != ' ' && ch != '.' && ch != ',' && ch != '-' && ch != '!') {
                word.append(ch);
            } else {
                if (!word.isEmpty()) {
                    wordLength++;
                }
                if (IsPalindrome(word.toString())) {
                    return true;
                }
                word = new StringBuilder();
            }
        }
        return wordLength >= 3 && wordLength <= 5;
    }

    //blacklisted word search method
    public static boolean IsBLWord (String word, ArrayList<String> blackListWords) {
        for (String s : blackListWords) {
            if (word.compareToIgnoreCase(s) == 0) {
                return true;
            }
        }
        return false;
    }

    //method to search for proposals without blacklisted words
    public static boolean IsCorrectBLProposal(String proposal, ArrayList<String> blackListWords) {
        char[] proposalChar = proposal.toCharArray();
        StringBuilder word = new StringBuilder();
        int proposalLength = 0;
        for (char ch : proposalChar) {
            if (ch == ' ' || ch == '.' || ch == ',' || ch == '-' || ch == '!') {
                if (!word.isEmpty()) {
                    if (IsBLWord(word.toString(), blackListWords)) {
                        return true;
                    }
                    word = new StringBuilder();
                }
            } else {
                word.append(ch);
                proposalLength++;
            }
        }
        if (IsBLWord(word.toString(), blackListWords)) {
            return true;
        }
        return false;
    }
}
