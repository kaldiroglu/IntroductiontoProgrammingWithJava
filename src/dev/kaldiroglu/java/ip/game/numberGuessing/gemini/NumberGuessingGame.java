package dev.kaldiroglu.java.ip.game.numberGuessing.gemini;

/**
 * Gemini 2.5 Pro 12062025
 * A number guessing game where the computer tries to guess a 4-digit number
 * held by the player.
 *
 * ### How the Code Works
 * This program is a great example for teaching several fundamental Java concepts:
 * 1. **`compact` Method**: This is the entry point of the application. The game loop runs here, controlling the flow from start to finish.
 * 2. **`Scanner` Class**: It's used to read the player's input (`+` and `-` counts) from the console, making the game interactive.
 * 3. **Arrays (`int[]`)**: As requested, the code uses a basic integer array to store the list of all possible numbers. With each guess, this array is filtered and replaced by a new, smaller array.
 * 4. **Methods**: The logic is broken down into several helper methods, which is a core principle of clean code:
 *     - `generateInitialCandidates()`: This method prepares for the game by creating an array of every possible valid 4-digit number.
 *     - `isValidNumber()`: A simple but important method that checks if a number follows the "no repeating digits" rule.
 *     - `filterCandidates()`: This is the brain of the computer's strategy. It removes numbers from the `possibleNumbers` array that don't match the feedback given by the player.
 *     - `evaluateGuess()`: This method allows the computer to "think." It compares its guess against a potential answer to see if the feedback (`+` and `-`) would match what the player provided.
 *     - `toDigits()`: A small utility function that makes it easier to work with the individual digits of a number.
 *
 * ### How to Run the Game
 * 1. Save the code in a file named . `NumberGuessingGame.java`
 * 2. Open a terminal or command prompt.
 * 3. Compile the code using the Java compiler: `javac NumberGuessingGame.java`
 * 4. Run the compiled program: `java NumberGuessingGame`
 *
 * The game will start, and you can begin playing by following the on-screen instructions.
 * I hope this code is perfect for your training session. Let me know if you have any other questions
 */

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Generate an array containing all possible valid numbers.
        int[] possibleNumbers = generateInitialCandidates();

        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;

        System.out.println("Hello! Let's play a number guessing game.");
        System.out.println("Please think of a 4-digit number with no repeating digits (e.g., 1234).");
        System.out.println("The first digit cannot be zero.");
        System.out.println("I will try to guess it. After each guess, please provide your feedback.");
        System.out.println("Enter '+' for each correct digit in the correct position.");
        System.out.println("Enter '-' for each correct digit in the wrong position.");
        System.out.println("----------------------------------------------------------");

        while (possibleNumbers.length > 0) {
            guessCount++;
            // The computer makes a guess, taking the first available number from the list.
            int currentGuess = possibleNumbers[0];

            System.out.println("My guess #" + guessCount + " is: " + currentGuess);

            // Get feedback from the player.
            System.out.print("Enter the number of pluses (+): ");
            int pluses = scanner.nextInt();

            if (pluses == 4) {
                System.out.println("Success! I guessed your number " + currentGuess + " in " + guessCount + " tries.");
                break;
            }

            System.out.print("Enter the number of minuses (-): ");
            int minuses = scanner.nextInt();

            // Filter the list of possible numbers based on the player's feedback.
            possibleNumbers = filterCandidates(possibleNumbers, currentGuess, pluses, minuses);

            if (possibleNumbers.length == 0) {
                System.out.println("I can't find any number that matches your feedback. Please double-check your responses.");
            }
        }

        scanner.close();
    }

    /**
     * Generates an array of all valid 4-digit numbers.
     * A number is valid if it has no repeating digits and does not start with 0.
     */
    private static int[] generateInitialCandidates() {
        // First, count how many valid numbers exist to determine the array size.
        int count = 0;
        for (int i = 1023; i <= 9876; i++) {
            if (isValidNumber(i)) {
                count++;
            }
        }

        // Create and fill the array with the valid numbers.
        int[] candidates = new int[count];
        int index = 0;
        for (int i = 1023; i <= 9876; i++) {
            if (isValidNumber(i)) {
                candidates[index++] = i;
            }
        }
        return candidates;
    }

    /**
     * Checks if a 4-digit number is valid (i.e., has no repeating digits).
     * The number is assumed to be between 1000 and 9999.
     */
    private static boolean isValidNumber(int number) {
        boolean[] digitsSeen = new boolean[10];
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digitsSeen[digit]) {
                return false; // A digit is repeated.
            }
            digitsSeen[digit] = true;
            temp /= 10;
        }
        return true; // No repeating digits found.
    }

    /**
     * Filters the candidates array based on the player's feedback (+ and -).
     * It returns a new, smaller array containing only the numbers that are still possible.
     */
    private static int[] filterCandidates(int[] currentCandidates, int guess, int correctPluses, int correctMinuses) {
        // Count how many candidates will remain to size the new array.
        int newCount = 0;
        for (int candidate : currentCandidates) {
            int[] score = evaluateGuess(guess, candidate);
            if (score[0] == correctPluses && score[1] == correctMinuses) {
                newCount++;
            }
        }

        // Create the new array and fill it with the remaining valid candidates.
        int[] newCandidates = new int[newCount];
        int index = 0;
        for (int candidate : currentCandidates) {
            int[] score = evaluateGuess(guess, candidate);
            if (score[0] == correctPluses && score[1] == correctMinuses) {
                newCandidates[index++] = candidate;
            }
        }
        return newCandidates;
    }

    /**
     * Compares a guess with a potential secret number to calculate the plus and minus score.
     *
     * @return An array where index 0 is the count of pluses and index 1 is the count of minuses.
     */
    private static int[] evaluateGuess(int guess, int secretNumber) {
        int[] guessDigits = toDigits(guess);
        int[] secretDigits = toDigits(secretNumber);

        int pluses = 0;
        int minuses = 0;

        // Calculate pluses (correct digit in the correct position).
        for (int i = 0; i < 4; i++) {
            if (guessDigits[i] == secretDigits[i]) {
                pluses++;
            }
        }

        // Calculate total matches (correct digits regardless of position).
        int totalMatches = 0;
        for (int guessDigit : guessDigits) {
            for (int secretDigit : secretDigits) {
                if (guessDigit == secretDigit) {
                    totalMatches++;
                }
            }
        }

        // Minuses are the total matches minus the pluses.
        minuses = totalMatches - pluses;

        return new int[]{pluses, minuses};
    }

    /**
     * A helper method to convert a 4-digit number into an array of its digits.
     */
    private static int[] toDigits(int number) {
        int[] digits = new int[4];
        digits[0] = number / 1000;
        digits[1] = (number / 100) % 10;
        digits[2] = (number / 10) % 10;
        digits[3] = number % 10;
        return digits;
    }
}