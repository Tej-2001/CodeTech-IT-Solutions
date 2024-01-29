package codetechIT;

		import java.util.Random;
		import java.util.Scanner;

		public class NumberGuessingGame {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Random random = new Random();

		        int lowerBound = 1;
		        int upperBound = 100;
		        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

		        int maxAttempts = 10;
		        int attempts = 0;

		        while (attempts < maxAttempts) {
		            System.out.print("Enter your guess: ");
		            int userGuess = sc.nextInt();
		            attempts++;

		            if (userGuess == numberToGuess) {
		                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
		                break;
		            } else if (userGuess < numberToGuess) {
		                System.out.println("Too low. Try again.");
		            } else {
		                System.out.println("Too high. Try again.");
		            }

		            if (attempts == maxAttempts) {
		                System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
		            }
		        }

		        // Close the scanner
		        sc.close();
		    }
		

	}


