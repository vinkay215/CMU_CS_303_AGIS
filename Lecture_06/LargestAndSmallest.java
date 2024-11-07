package Lecture_06;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Import elements:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        int largest = array[0];
        int smallest = array[0];
        for (int num : array) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Biggest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
