package Lecture_06;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Import elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + (double) sum / n);
    }
}
