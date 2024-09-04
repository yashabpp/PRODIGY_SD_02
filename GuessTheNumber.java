import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in "
                        + attempts + " attempts.");
                break;
            }

            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Too low! Try again.");
            }
        }

        scanner.close();
    }
}


















