package Lecture_07;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String input = "  Hello    World   ";
        String result = removeExtraSpaces(input);
        System.out.println("Result: \"" + result + "\"");
    }

    public static String removeExtraSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        // Trim leading and trailing spaces, then replace multiple spaces with a single space
        return str.trim().replaceAll("\\s+", " ");
    }
}
