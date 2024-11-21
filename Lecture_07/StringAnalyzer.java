package Lecture_07;

public class StringAnalyzer {
    public static long countOccurrences(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }

    public static void main(String[] args) {
        System.out.println("The number of 'o' occurrences in 'hello world' is " + countOccurrences("hello world", 'o'));
    }
}



