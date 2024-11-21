package Lecture_07;

import java.util.Arrays;

public class WordSplitter {
    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = input.split("\\s+");
        System.out.println(Arrays.toString(words));
    }
}
