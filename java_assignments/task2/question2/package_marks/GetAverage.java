package task2.question2.package_marks;

import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {
        // Scanner obj
        Scanner input = new Scanner(System.in);
        double javaMark, networkingMark, mathMark, average; // my variables

        // getting input
        System.out.println("\nThis program gets the average marks of the requested units.");
        System.out.println("Enter marks for Java Programming: ");
        javaMark = input.nextInt(); // get java marks

        System.out.println("Enter marks for Networking: ");
        networkingMark = input.nextInt(); // get networking marks

        System.out.println("Enter marks for Maths: ");
        mathMark = input.nextInt(); // get maths marks

        average = (javaMark + networkingMark + mathMark) / 3; // Getting the average

        // output the inputs
        System.out.println("\nMarks for Java Programming is: " + javaMark);
        System.out.println("Marks for Networking: " + networkingMark);
        System.out.println("Marks for Maths: " + mathMark);

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
