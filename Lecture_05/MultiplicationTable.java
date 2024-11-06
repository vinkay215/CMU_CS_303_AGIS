package Lecture_05;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers to create a multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i; 
            System.out.println(number + " x " + i + " = " + result);  
        }

        scanner.close();  
    }
}
