import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");

        // Read the first number from the user
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");

        // Read the operator from the user
        String operator = scanner.next();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");

        // Read the second number from the user
        double num2 = scanner.nextDouble();

        // Initialize the result to 0
        double result = 0;

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        // Print the result
        System.out.println("Result: " + result);
    }
}
