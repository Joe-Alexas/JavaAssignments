import java.util.Scanner;

public class TriangleArea {

    static double myBase, myHeight, myArea;

    //[main] method
    public static void main(String[] args) {

        // Creating an obj of this class to allow me use the non-static methods
        TriangleArea triangle = new TriangleArea();

        // calling the non-static method
        triangle.get_baseANDheight();
        triangle.getArea();
        triangle.outputArea();

    }

    // METHOD 1
    // this method asks the user to enter the base and the height
    void get_baseANDheight() {


        try (// Scanner object
            Scanner input = new Scanner(System.in)) {
            // prompt user
            System.out.println("Enter the base of the triangle: ");
            myBase = input.nextDouble(); // store the input

            System.out.println("Enter the height of the triangle: ");
            myHeight = input.nextDouble(); // store the input
        }

    }

    // METHOD 2
    // method gets the area of the rectangle
    void getArea() {

        // doing calculations
        myArea = 0.5 * myBase * myHeight;
    }

    // METHOD 3
    // method to output area
    void outputArea() {

        // output the area
        System.out.println("The area of our triangle is: " + myArea);
    }
}
