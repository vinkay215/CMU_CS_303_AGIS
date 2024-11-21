package Lecture_07;

public class LongestWordFinder {
    public static void main(String[] args) {
        String input = "I love programming";
        String longestWord = findLongestWord(input);
        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        
        // Split the string into words
        String[] words = str.split("\\s+");
        String longestWord = words[0];

        // Compare each word with the current longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}

