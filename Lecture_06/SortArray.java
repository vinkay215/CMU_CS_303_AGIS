package Lecture_06;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Import elements:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        Arrays.sort(array);

        System.out.print("Array after sorting: ");
        for (int num : array) System.out.print(num + " ");
    }
}
