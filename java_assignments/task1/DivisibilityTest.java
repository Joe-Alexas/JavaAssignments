import java.util.Scanner;

public class DivisibilityTest {
  public static void main(String[] args) {
    // Create a Scanner object for reading user input
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
    
    // Read the integer from the user
    int num = scanner.nextInt();
    
    System.out.println("All numbers are divisible by 0. " + num + " is divisible by " + 0 + ".");
    // Check whether the integer is divisible by 1-9
    for (int i = 1; i <= 9; i++) {
      if (num % i == 0) {
        System.out.println(num + " is divisible by " + i + ".");
      }
    }
  }
}
