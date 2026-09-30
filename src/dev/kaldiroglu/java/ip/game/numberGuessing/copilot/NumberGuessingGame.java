package dev.kaldiroglu.java.ip.game.numberGuessing.copilot;

/*
    Copilot 13092025
 */

import java.util.Arrays;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int DIGITS = 4;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Think of a 4-digit number with no repeating digits and not starting with 0.");
        System.out.println("I will try to guess your number!");
        System.out.println("For each guess, respond with:");
        System.out.println("  + for each digit in the correct position");
        System.out.println("  - for each digit in the wrong position");
        System.out.println("  Example: If I guess 1234 and your number is 5174, respond with: +1-1");
        System.out.println("Press Enter when you're ready...");
        scanner.nextLine();

        playGame();
    }

    public static void playGame() {
        int[] possibleNumbers = generateAllValidNumbers();
        int remainingCount = possibleNumbers.length;
        boolean[] isValid = new boolean[possibleNumbers.length];
        Arrays.fill(isValid, true);

        int guessCount = 0;

        while (remainingCount > 0) {
            guessCount++;

            // Find the first valid number to guess
            int currentGuess = -1;
            for (int i = 0; i < possibleNumbers.length; i++) {
                if (isValid[i]) {
                    currentGuess = possibleNumbers[i];
                    break;
                }
            }

            if (currentGuess == -1) {
                System.out.println("No valid numbers remaining. There might be an error in the responses.");
                return;
            }

            // Make the guess
            System.out.println("\nGuess #" + guessCount + ": " + formatNumber(currentGuess));
            System.out.print("Your response (e.g., +2-1 or +4): ");
            String response = scanner.nextLine().trim();

            // Check if we won
            if (response.equals("+4")) {
                System.out.println("\nYES! I guessed your number: " + formatNumber(currentGuess));
                System.out.println("It took me " + guessCount + " guesses!");
                return;
            }

            // Parse the response
            int[] feedback = parseResponse(response);
            if (feedback == null) {
                System.out.println("Invalid response format. Please use format like +2-1 or +4");
                guessCount--; // Don't count invalid responses
                continue;
            }

            int correctPosition = feedback[0];
            int wrongPosition = feedback[1];

            // Filter out invalid possibilities based on the response
            remainingCount = 0;
            for (int i = 0; i < possibleNumbers.length; i++) {
                if (isValid[i]) {
                    int[] result = evaluateGuess(currentGuess, possibleNumbers[i]);
                    if (result[0] == correctPosition && result[1] == wrongPosition) {
                        remainingCount++;
                    } else {
                        isValid[i] = false;
                    }
                }
            }

            System.out.println("Remaining possibilities: " + remainingCount);

            if (remainingCount == 0) {
                System.out.println("No valid numbers remaining. Please check your responses.");
                return;
            }
        }
    }

    // Generate all valid 4-digit numbers (no repeating digits, not starting with 0)
    public static int[] generateAllValidNumbers() {
        int[] tempNumbers = new int[10000]; // Maximum possible size
        int count = 0;

        for (int num = 1023; num <= 9876; num++) {
            if (isValidNumber(num)) {
                tempNumbers[count] = num;
                count++;
            }
        }

        // Create array with exact size
        int[] validNumbers = new int[count];
        System.arraycopy(tempNumbers, 0, validNumbers, 0, count);

        return validNumbers;
    }

    // Check if a number is valid (4 digits, no repeating digits, doesn't start with 0)
    public static boolean isValidNumber(int number) {
        if (number < 1000 || number > 9999) {
            return false;
        }

        int[] digits = getDigits(number);

        // Check for repeating digits
        for (int i = 0; i < DIGITS; i++) {
            for (int j = i + 1; j < DIGITS; j++) {
                if (digits[i] == digits[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Convert number to array of digits
    public static int[] getDigits(int number) {
        int[] digits = new int[DIGITS];
        for (int i = DIGITS - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Evaluate a guess against the target number
    public static int[] evaluateGuess(int guess, int target) {
        int[] guessDigits = getDigits(guess);
        int[] targetDigits = getDigits(target);

        int correctPosition = 0;
        int wrongPosition = 0;

        boolean[] usedInTarget = new boolean[DIGITS];
        boolean[] usedInGuess = new boolean[DIGITS];

        // First pass: count correct positions
        for (int i = 0; i < DIGITS; i++) {
            if (guessDigits[i] == targetDigits[i]) {
                correctPosition++;
                usedInTarget[i] = true;
                usedInGuess[i] = true;
            }
        }

        // Second pass: count wrong positions
        for (int i = 0; i < DIGITS; i++) {
            if (!usedInGuess[i]) {
                for (int j = 0; j < DIGITS; j++) {
                    if (!usedInTarget[j] && guessDigits[i] == targetDigits[j]) {
                        wrongPosition++;
                        usedInTarget[j] = true;
                        break;
                    }
                }
            }
        }

        return new int[]{correctPosition, wrongPosition};
    }

    // Parse user response like "+2-1" into [2, 1]
    public static int[] parseResponse(String response) {
        if (response == null || response.isEmpty()) {
            return null;
        }

        int correctPosition = 0;
        int wrongPosition = 0;

        int i = 0;
        while (i < response.length()) {
            char c = response.charAt(i);
            if (c == '+') {
                i++;
                if (i < response.length() && Character.isDigit(response.charAt(i))) {
                    correctPosition = Character.getNumericValue(response.charAt(i));
                    i++;
                } else {
                    correctPosition = 1; // Default to 1 if no number follows
                }
            } else if (c == '-') {
                i++;
                if (i < response.length() && Character.isDigit(response.charAt(i))) {
                    wrongPosition = Character.getNumericValue(response.charAt(i));
                    i++;
                } else {
                    wrongPosition = 1; // Default to 1 if no number follows
                }
            } else {
                i++;
            }
        }

        // Validate the response
        if (correctPosition + wrongPosition > 4) {
            return null;
        }

        return new int[]{correctPosition, wrongPosition};
    }

    // Format number for display
    public static String formatNumber(int number) {
        return String.format("%04d", number);
    }
}
