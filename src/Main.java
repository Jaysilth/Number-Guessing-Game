import java.util.Random;
import java.util.Scanner;

public class Main {

    // comments in code were enhanced with the use of chat-gpt to make code clearer to anyone
    public static void main(String[] args) {

        // Java Number Guessing Game

        // Create Random object for generating the secret number
        Random random = new Random();

        // Create Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Stores the user's guess
        int guess;

        // Counts how many attempts the user has made
        int attempts = 0;

        // Minimum possible number
        int min = 1;

        // Maximum possible number
        int max = 100;

        // Generate a random number between min and max (inclusive)
        int randomNumber = random.nextInt(min, max + 1);

        // Display game instructions
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d:\n", min, max);

        // Loop continues until the user guesses the correct number
        do {
            // Ask the user to enter a guess
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();

            // Increase attempt count
            attempts++;

            // Check if guess is too low
            if (guess < randomNumber) {
                System.out.println("Too low, try again.");

            }
            // Check if guess is too high
            else if (guess > randomNumber) {
                System.out.println("Too high, try again.");

            }
            // Correct guess
            else {
                System.out.println("Correct! The number was: " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != randomNumber); // Repeat until guessed correctly

        // Close the scanner to free system resources
        scanner.close();
    }
}
