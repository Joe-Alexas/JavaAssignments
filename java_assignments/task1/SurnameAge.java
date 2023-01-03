import java.util.Scanner;

public class SurnameAge {
  public static void main(String[] args) {
    // Create a Scanner object for reading user input
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter their surname
    System.out.print("Enter your surname: ");
    
    // Read the surname from the user
    String surname = scanner.nextLine();
    
    // Get the number of characters in the surname
    int surnameLength = surname.length();
    
    // Prompt the user to enter their age
    System.out.print("Enter your age: ");
    
    // Read the age from the user
    int age = scanner.nextInt();
    
    // Determine if the age is even or odd
    String evenOrOdd;
    if (age % 2 == 0) {
      evenOrOdd = "even";
    } else {
      evenOrOdd = "odd";
    }
    
    // Print the results
    System.out.println("Your surname has " + surnameLength + " characters.");
    System.out.println("Your age is " + evenOrOdd + ".");
  }
}
