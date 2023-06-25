import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the number of guesses
        int guesses = 0;

        // Loop until the user guesses the correct number
        while (guesses < 10) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // Check if the guess is correct
            if (guess == randomNumber) {
                System.out.println("You guessed the correct number!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Increment the number of guesses
            guesses++;
        }

        // If the user ran out of guesses, print the correct number
        if (guesses == 10) {
            System.out.println("You ran out of guesses! The correct number was " + randomNumber);
        }
    }
}