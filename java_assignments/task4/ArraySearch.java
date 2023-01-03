package task4;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the values
        int[] values = new int[15];

        // Prompt the user to enter the values
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            values[i] = scanner.nextInt();
        }

        // Print the values stored in the array
        System.out.println("Values stored in the array:");
        for (int value : values) {
            System.out.println(value);
        }

        // Prompt the user to enter a number to search for
        System.out.print("Enter a number to search for: ");
        int search = scanner.nextInt();

        // Search for the number in the array
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (values[i] == search) {
                index = i;
                break;
            }
        }

        // Print the result of the search
        if (index >= 0) {
            System.out.println("The number was found at index " + index + ".");
        } else {
            System.out.println("The number was not found in this array.");
        }
    }
}
