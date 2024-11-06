package Lecture_05;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do {
            System.out.print("Enter the number you guessed (1-50):");
            userGuess = scanner.nextInt();
            if (userGuess != randomNumber) {
                System.out.println("Good luck next time");
            }
        } while (userGuess != randomNumber);

        System.out.println("You guessed correctly, congratulations" + randomNumber);
        scanner.close();
    }
}
