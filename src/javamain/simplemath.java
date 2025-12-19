import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input. Exiting.");
            return;
        }
        double a = in.nextDouble();

        System.out.print("Enter second number: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input. Exiting.");
            return;
        }
        double b = in.nextDouble();

        double sum = a + b;
        double diff = a - b;
        double prod = a * b;

        System.out.println();
        System.out.printf("Addition:       %.6f%n", sum);
        System.out.printf("Subtraction:    %.6f%n", diff);
        System.out.printf("Multiplication: %.6f%n", prod);

        if (b == 0.0) {
            System.out.println("Division:       Error (division by zero)");
        } else {
            double quot = a / b;
            System.out.printf("Division:       %.6f%n", quot);
        }

        in.close();
    }
}
