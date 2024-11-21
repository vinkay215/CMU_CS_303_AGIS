package Lecture_07;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Java is fun";
        int wordCount = countWords(input);
        System.out.println("The number of words: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
