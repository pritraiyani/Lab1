package com.ontariotechu.sofe3980U;

import java.util.Scanner;

/**
 * Main program
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Binary Calculator!");

        // Get the first binary number from the user
        System.out.print("Enter the first binary number: ");
        String binary1Input = scanner.nextLine();
        Binary binary1 = new Binary(binary1Input);

        // Get the second binary number from the user
        System.out.print("Enter the second binary number: ");
        String binary2Input = scanner.nextLine();
        Binary binary2 = new Binary(binary2Input);

        boolean continueProgram = true;

        while (continueProgram) {
            // Display operation menu
            System.out.println("\nChoose an operation to perform:");
            System.out.println("1. ADD");
            System.out.println("2. AND");
            System.out.println("3. OR");
            System.out.println("4. MULTIPLY");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice (1-5): ");

            // Get user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Binary sum = Binary.add(binary1, binary2);
                    System.out.println("Result of ADD: " + sum.getValue());
                    break;
                case 2:
                    Binary andResult = Binary.and(binary1, binary2);
                    System.out.println("Result of AND: " + andResult.getValue());
                    break;
                case 3:
                    Binary orResult = Binary.or(binary1, binary2);
                    System.out.println("Result of OR: " + orResult.getValue());
                    break;
                case 4:
                    Binary multiplyResult = Binary.multiply(binary1, binary2);
                    System.out.println("Result of MULTIPLY: " + multiplyResult.getValue());
                    break;
                case 5:
                    System.out.println("Exiting the Binary Calculator. Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-5).");
            }
        }

        scanner.close();
    }
}
