package task4;

import java.util.Scanner;

public class PrimeNumberChecker {
    // static Scanner obj
    static Scanner input = new Scanner(System.in);

    // [main] method that displays prime numbers between 1 to 500.
    public static void main(String[] args) {
        String primeNumberString = "";

        for (int i = 1; i <= 500; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the Prime number to the String
                primeNumberString = primeNumberString + i + ", ";
            }
        }
        System.out.println("Prime numbers from 1 to 500 are :");
        System.out.println(primeNumberString);

        checkIfPrime();
    }

    /**
     * Write a method named checkIfPrime, which takes an integer as an
     * argument and returns true if the argument is a prime number
     */

    static void checkIfPrime() {

        System.out.println("\n\nEnter any number to check if it is prime: ");
        int number = input.nextInt();

        boolean isNotPrime = false;
        for (int i : new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                89, 97 }) {
            // condition for nonprime number
            if (number % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if (!isNotPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
