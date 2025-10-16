// NumberClassifier.java

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if zero
        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            // Check positive or negative
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }

            // Check odd or even
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        scanner.close();
    }
}
