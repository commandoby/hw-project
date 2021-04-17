package HW_210423;

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
            if (ch != ' ' && ch != '.' && ch != ',' && ch != '-') {
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
}
