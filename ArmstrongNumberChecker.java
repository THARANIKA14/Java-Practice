import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is Armstrong
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Find the number of digits

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add the digit raised to the power of the number of digits
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber; // Check if the sum equals the original number
    }
}
