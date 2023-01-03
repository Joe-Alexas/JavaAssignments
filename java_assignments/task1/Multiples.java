public class Multiples {
    public static void main(String[] args) {
        // Loop through the range of numbers from 71 to 150
        for (int i = 71; i <= 150; i++) {
            // Check if the number is a multiple of 2, 3, or 7
            
            if (i % 2 == 0) {
                // If it is a multiple, print it
                System.out.println(i + " is a multiple of 2");
            }
            // Check if the number is a multiple of 2, 3, or 7
            if (i % 3 == 0) {
                // If it is a multiple, print it
                System.out.println(i + " is a multiple of 3");
            }
            // Check if the number is a multiple of 2, 3, or 7
            if (i % 7 == 0) {
                // If it is a multiple, print it
                System.out.println(i + " is a multiple of 7");
            }
        }
    }
}
