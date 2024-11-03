package pkgCMU_CS_303_AGIS;
import java.util.Scanner;

public class CalculatetheEquation {
    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                // Case when both a and b are 0: infinite solutions
                System.out.println("The equation has infinite solutions.");
            } else {
                // Case when a = 0 but b is not 0: no solution
                System.out.println("The equation has no solution.");
            }
        } else {
            // If a is not 0, calculate the solution x = -b / a
            double solution = -b / a;
            System.out.println("The solution of the equation is: x = " + solution);
        }
    }

    // Method to solve a quadratic equation in the form ax^2 + bx + c = 0
    public static void solveQuadraticEquation(double a, double b, double c) {
        // Calculate delta (discriminant)
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // If delta > 0, there are two distinct real roots
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two distinct solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // If delta = 0, there is one double root
            double x = -b / (2 * a);
            System.out.println("The equation has one double solution:");
            System.out.println("x = " + x);
        } else {
            // If delta < 0, there are no real roots (complex roots)
            System.out.println("The equation has no real solution.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. Linear equation (ax + b = 0)");
        System.out.println("2. Quadratic equation (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt(); // Read the user's choice

        if (choice == 1) {
            // Solving a linear equation
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            solveLinearEquation(a, b);
        } else if (choice == 2) {
            // Solving a quadratic equation
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();
            solveQuadraticEquation(a, b, c);
        } else {
            // If an invalid choice is entered
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
