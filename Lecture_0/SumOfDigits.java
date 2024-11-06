package cmu_303;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
