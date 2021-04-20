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
        ArrayList<String> wordList = new ArrayList<>();
        for (String s : proposal.split(",")) {
            for (String s1 : s.split(" ")) {
                if (!s1.isEmpty()) {
                    wordList.add(s1);
                }
            }
        }
        for (String s : wordList) {
            if (IsPalindrome(s)) {
                return true;
            }
        }
        return wordList.size() >= 3 && wordList.size() <= 5;
    }

    //method to search for proposals without blacklisted words
    public static boolean IsCorrectBLProposal(String word, ArrayList<String> blackListWords) {
        for (String s : blackListWords) {
            if (word.matches("(.*)" + s + "(.*)")) {
                return true;
            }
        }
        return false;
    }
}
