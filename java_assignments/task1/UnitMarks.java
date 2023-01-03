import java.util.Scanner;

public class UnitMarks {
  public static void main(String[] args) {
    // Create a Scanner object for reading user input
    Scanner scanner = new Scanner(System.in);
    
    // Initialize the sum of the unit marks to 0
    double sum = 0;
    
    // Prompt the user to enter the marks for each unit
    for (int i = 1; i <= 5; i++) {
      System.out.print("Enter mark for unit " + i + ": ");
      double mark = scanner.nextDouble();
      sum += mark;
    }
    
    // Calculate the average
    double average = sum / 5;
    
    // Display the average to two decimal places
    System.out.printf("Average: %.2f", average);
  }
}
