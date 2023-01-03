package task2.question3.leap_year;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // calling the method
        determineLeapYr();
    }

    // the method to determine leap year
    static void determineLeapYr() {
        Scanner input = new Scanner(System.in);
        // getting the year
        System.out.println("\nThis program determines if the year is leap or not.");
        System.out.println("Enter year :");

        // create and init year
        var year = input.nextInt();

        // if the modulus of [year] by 4 is [0]
        if ((year % 4) == 0) {
            // then it is a leap year
            System.out.println(year + " is a leap year");
        } else {
            // otherwise, not a leap yr
            System.out.println(year + " is not a leap year");
        }
    }
}
