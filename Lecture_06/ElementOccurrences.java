package Lecture_06;
import java.util.Scanner;

public class ElementOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Import elements:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : array) {
            if (num == target) count++;
        }

        System.out.println("Number of occurrences of " + target + "to be: " + count);
    }
}
