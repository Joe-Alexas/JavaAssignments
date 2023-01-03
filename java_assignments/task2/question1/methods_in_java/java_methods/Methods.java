package task2.question1.methods_in_java.java_methods;

import java.util.Scanner;

public class Methods {

    // return largest num
    static double getLarge(double firstNum, double secondNum, double thirdNum) {
        // Is firstNum > secondNum ?
        if (firstNum > secondNum) {
            // if true, is firstNum > thirdNum
            if (firstNum > thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            // else false, is secondNum > thirdNum
            if (secondNum > thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }

    // return smallest num
    static double getSmall(double firstNum, double secondNum, double thirdNum) {
        // Is firstNum < secondNum ?
        if (firstNum < secondNum) {
            // if true, is firstNum > thirdNum
            if (firstNum < thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            // else false, is secondNum < thirdNum
            if (secondNum < thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }

    public static void main(String[] args) {

        // Creating scanner obj
        Scanner myInput = new Scanner(System.in);

        // Declaring var firstNum, secondNum, thirdNum
        double num1, num2, num3;

        // Assigning input values to var firstNum, secondNum, thirdNum
        System.out.println("\nEnter the value for the first number: ");
        num1 = myInput.nextInt();
        System.out.println("Enter the value for the second number: ");
        num2 = myInput.nextInt();
        System.out.println("Enter the value for the third number: ");
        num3 = myInput.nextInt();

        var smallNum = getSmall(num1, num2, num3);
        var largeNum = getLarge(num1, num2, num3);

        System.out.println("\nThe smallest number: " + smallNum);
        System.out.println("The largest number: " + largeNum);
        System.out.println(largeNum + " is your largest and " + smallNum + " is the smallest number.");
    }
}
