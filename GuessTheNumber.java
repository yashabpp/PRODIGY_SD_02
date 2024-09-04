import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Initialize the number of attempts
        int attempts = 0;

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user to guess the number
            System.out.print("Guess the number (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            // Check if the guess is correct
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in "
                        + attempts + " attempts.");
                break;
            }
            // Provide feedback if the guess is too high
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
            // Provide feedback if the guess is too low
            else {
                System.out.println("Too low! Try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}




















