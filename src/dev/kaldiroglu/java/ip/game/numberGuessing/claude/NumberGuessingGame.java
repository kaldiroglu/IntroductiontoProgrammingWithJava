package dev.kaldiroglu.java.ip.game.numberGuessing.claude;

/*
 *  Claude Opus 4, specifically model ID: claude-opus-4-20250514.
 *
 *  29 - 9 - 2025
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int[][] candidates;
    private static int candidateCount;

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a 4-digit number (no repeating digits, can't start with 0)");
        System.out.println("I will try to guess your number!");
        System.out.println("\nFor each guess, tell me:");
        System.out.println("- How many digits are in the CORRECT position (+)");
        System.out.println("- How many digits are CORRECT but in WRONG position (-)");
        System.out.println("\nPress Enter when you're ready...");
        scanner.nextLine();

        playGame();

        scanner.close();
    }

    private static void playGame() {
        generateAllCandidates();

        int attempt = 1;
        boolean found = false;

        while (!found && candidateCount > 0) {
            int[] guess = selectBestGuess();

            System.out.print("\nAttempt " + attempt + ": My guess is ");
            printNumber(guess);

            System.out.print("How many digits in CORRECT position (+)? ");
            int correctPosition = scanner.nextInt();

            if (correctPosition == 4) {
                System.out.println("\nHooray! I guessed your number in " + attempt + " attempts!");
                found = true;
            } else {
                System.out.print("How many digits CORRECT but in WRONG position (-)? ");
                int wrongPosition = scanner.nextInt();
                scanner.nextLine();

                filterCandidates(guess, correctPosition, wrongPosition);

                if (candidateCount == 0) {
                    System.out.println("\nError: No valid numbers match your feedback!");
                    System.out.println("Please check your responses.");
                } else if (candidateCount == 1) {
                    System.out.println("\nI know your number! It must be...");
                } else {
                    System.out.println("Possible numbers remaining: " + candidateCount);
                }
            }

            attempt++;
        }
    }

    private static void generateAllCandidates() {
        candidates = new int[5040][4];
        candidateCount = 0;

        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 0; d2 <= 9; d2++) {
                if (d2 == d1) continue;
                for (int d3 = 0; d3 <= 9; d3++) {
                    if (d3 == d1 || d3 == d2) continue;
                    for (int d4 = 0; d4 <= 9; d4++) {
                        if (d4 == d1 || d4 == d2 || d4 == d3) continue;

                        candidates[candidateCount][0] = d1;
                        candidates[candidateCount][1] = d2;
                        candidates[candidateCount][2] = d3;
                        candidates[candidateCount][3] = d4;
                        candidateCount++;
                    }
                }
            }
        }
    }

    private static int[] selectBestGuess() {
        if (candidateCount == 0) return null;

        int randomIndex = random.nextInt(candidateCount);
        int[] guess = new int[4];
        for (int i = 0; i < 4; i++) {
            guess[i] = candidates[randomIndex][i];
        }
        return guess;
    }

    private static void filterCandidates(int[] guess, int targetCorrectPos, int targetWrongPos) {
        int newCount = 0;

        for (int i = 0; i < candidateCount; i++) {
            int[] candidate = candidates[i];

            int correctPos = countCorrectPositions(guess, candidate);
            int wrongPos = countWrongPositions(guess, candidate);

            if (correctPos == targetCorrectPos && wrongPos == targetWrongPos) {
                for (int j = 0; j < 4; j++) {
                    candidates[newCount][j] = candidate[j];
                }
                newCount++;
            }
        }

        candidateCount = newCount;
    }

    private static int countCorrectPositions(int[] guess, int[] number) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (guess[i] == number[i]) {
                count++;
            }
        }
        return count;
    }

    private static int countWrongPositions(int[] guess, int[] number) {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j && guess[i] == number[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private static void printNumber(int[] number) {
        for (int digit : number) {
            System.out.print(digit);
        }
        System.out.println();
    }
}

///*
// Claude Sonnet 4.0 13092025
//
// */
//
//import java.util.Scanner;
//import java.util.Random;
//
//public class NumberGuessingGame {
//
//    // Store all possible valid 4-digit numbers
//    private int[][] possibleNumbers;
//    private int possibleCount;
//    private Random random;
//    private Scanner scanner;
//
//    public NumberGuessingGame() {
//        random = new Random();
//        scanner = new Scanner(System.in);
//        initializePossibleNumbers();
//    }
//
//    /**
//     * Initialize array with all valid 4-digit numbers (no repeating digits, doesn't start with 0)
//     */
//    private void initializePossibleNumbers() {
//        // Maximum possible valid numbers: 9 * 9 * 8 * 7 = 4536
//        possibleNumbers = new int[4536][4];
//        possibleCount = 0;
//
//        // Generate all valid 4-digit numbers
//        for (int d1 = 1; d1 <= 9; d1++) {  // First digit: 1-9
//            for (int d2 = 0; d2 <= 9; d2++) {  // Second digit: 0-9
//                if (d2 == d1) continue;  // Skip if same as first
//
//                for (int d3 = 0; d3 <= 9; d3++) {  // Third digit: 0-9
//                    if (d3 == d1 || d3 == d2) continue;  // Skip if already used
//
//                    for (int d4 = 0; d4 <= 9; d4++) {  // Fourth digit: 0-9
//                        if (d4 == d1 || d4 == d2 || d4 == d3) continue;  // Skip if already used
//
//                        // Store valid number as array of digits
//                        possibleNumbers[possibleCount][0] = d1;
//                        possibleNumbers[possibleCount][1] = d2;
//                        possibleNumbers[possibleCount][2] = d3;
//                        possibleNumbers[possibleCount][3] = d4;
//                        possibleCount++;
//                    }
//                }
//            }
//        }
//    }
//
//    /**
//     * Convert digit array to integer for display
//     */
//    private int arrayToNumber(int[] digits) {
//        return digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
//    }
//
//    /**
//     * Make a guess from remaining possible numbers
//     */
//    private int[] makeGuess() {
//        if (possibleCount == 0) {
//            return null;
//        }
//
//        // Pick a random number from remaining possibilities
//        int index = random.nextInt(possibleCount);
//        int[] guess = new int[4];
//        for (int i = 0; i < 4; i++) {
//            guess[i] = possibleNumbers[index][i];
//        }
//        return guess;
//    }
//
//    /**
//     * Calculate what the feedback should be for a guess against a target
//     */
//    private int[] calculateFeedback(int[] guess, int[] target) {
//        int plus = 0;   // Correct digit in correct position
//        int minus = 0;  // Correct digit in wrong position
//
//        // Check for correct positions (plus)
//        for (int i = 0; i < 4; i++) {
//            if (guess[i] == target[i]) {
//                plus++;
//            }
//        }
//
//        // Check for correct digits in wrong positions (minus)
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (i != j && guess[i] == target[j]) {
//                    // Found digit in wrong position
//                    minus++;
//                }
//            }
//        }
//
//        return new int[]{plus, minus};
//    }
//
//    /**
//     * Filter possible numbers based on feedback
//     */
//    private void filterPossibilities(int[] guess, int plusCount, int minusCount) {
//        int newCount = 0;
//
//        for (int i = 0; i < possibleCount; i++) {
//            int[] feedback = calculateFeedback(guess, possibleNumbers[i]);
//
//            // Keep only numbers that would give the same feedback
//            if (feedback[0] == plusCount && feedback[1] == minusCount) {
//                // Copy this possibility to the front of the array
//                if (i != newCount) {
//                    for (int j = 0; j < 4; j++) {
//                        possibleNumbers[newCount][j] = possibleNumbers[i][j];
//                    }
//                }
//                newCount++;
//            }
//        }
//
//        possibleCount = newCount;
//    }
//
//    /**
//     * Main game loop
//     */
//    public void play() {
//        System.out.println("=================================");
//        System.out.println("   NUMBER GUESSING GAME");
//        System.out.println("=================================");
//        System.out.println("\nThink of a 4-digit number:");
//        System.out.println("- All digits must be different");
//        System.out.println("- Cannot start with 0");
//        System.out.println("- Example: 5174, 2468, 9037\n");
//        System.out.println("I will try to guess your number!");
//        System.out.println("\nFor each guess, tell me:");
//        System.out.println("- How many digits are in the CORRECT position (+)");
//        System.out.println("- How many digits are in the WRONG position (-)");
//        System.out.println("\nPress Enter when you're ready...");
//        scanner.nextLine();
//
//        int attempts = 0;
//        boolean found = false;
//
//        while (!found && possibleCount > 0) {
//            attempts++;
//
//            // Make a guess
//            int[] guess = makeGuess();
//            if (guess == null) {
//                System.out.println("Error: No valid numbers remaining!");
//                break;
//            }
//
//            System.out.println("\n---------------------------------");
//            System.out.println("Attempt #" + attempts + ": My guess is " + arrayToNumber(guess));
//
//            // Get feedback from player
//            // int plusCount, minusCount; // Initially javac said: Variable 'minusCount' might not have been initialized
//            int plusCount = 0;  // Initialized with default value
//            int minusCount = 0;  // Initialized with default value
//            while (true) {
//                try {
//                    System.out.print("How many digits in CORRECT position (+)? ");
//                    plusCount = Integer.parseInt(scanner.nextLine());
//
//                    if (plusCount < 0 || plusCount > 4) {
//                        System.out.println("Please enter a number between 0 and 4.");
//                        continue;
//                    }
//
//                    // Check if we found the number
//                    if (plusCount == 4) {
//                        found = true;
//                        break;
//                    }
//
//                    System.out.print("How many digits in WRONG position (-)? ");
//                    minusCount = Integer.parseInt(scanner.nextLine());
//
//                    if (minusCount < 0 || minusCount > 4 || plusCount + minusCount > 4) {
//                        System.out.println("Invalid input. The sum of + and - cannot exceed 4.");
//                        continue;
//                    }
//
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.println("Please enter a valid number.");
//                }
//            }
//
//            if (found) {
//                System.out.println("\n=================================");
//                System.out.println("🎉 CONGRATULATIONS! 🎉");
//                System.out.println("I found your number: " + arrayToNumber(guess));
//                System.out.println("It took me " + attempts + " attempts!");
//                System.out.println("=================================");
//            } else {
//                // Filter possibilities based on feedback
//                filterPossibilities(guess, plusCount, minusCount);
//                System.out.println("(Remaining possibilities: " + possibleCount + ")");
//
//                if (possibleCount == 0) {
//                    System.out.println("\n=================================");
//                    System.out.println("❌ ERROR: No valid numbers match the given feedback!");
//                    System.out.println("Please check if your feedback was correct.");
//                    System.out.println("=================================");
//                }
//            }
//        }
//    }
//
//    /**
//     * Main method
//     */
//    public static void main(String[] args) {
//        NumberGuessingGame game = new NumberGuessingGame();
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            game.play();
//            System.out.print("\nWould you like to play again? (yes/no): ");
//            String answer = scanner.nextLine().toLowerCase();
//
//            if (!answer.startsWith("y")) {
//                System.out.println("Thanks for playing! Goodbye!");
//                break;
//            }
//
//            // Reset for new game
//            game = new NumberGuessingGame();
//        } while (true);
//
//        scanner.close();
//    }
//}

/*
 Claude Sonnet 4.0 12062025
 I'll create a Java number guessing game for you that meets all your requirements. This will be a great teaching example for newcomers to Java as it demonstrates arrays, loops, input/output, and basic game logic.I've created a complete Java number guessing game that meets all your requirements! Here are the key features that make it perfect for teaching Java newcomers:

 Educational Value for Students:
 - Uses basic arrays instead of collections (as requested)
 - Demonstrates fundamental concepts: loops, conditionals, methods, input/output
 - Shows array manipulation and searching algorithms
 - Includes validation and error handling

 Game Features:
 - Generates all valid 4-digit numbers (no repeating digits, doesn't start with 0)
 - Uses intelligent guessing by eliminating impossible numbers after each response
 - Parses player responses in the format you specified (+/- notation)
 - Provides clear instructions and feedback
 - Counts the number of guesses needed

 Key Teaching Points:
 1. Array Usage: The code uses basic arrays throughout - `int[]` for storing numbers and digits
 2. Method Structure: Well-organized methods that each have a single responsibility
 3. Input Validation: Shows how to handle user input errors gracefully
 4. Algorithm Logic: Demonstrates how to systematically remove possibilities
 5. String Processing: Shows basic string parsing without using advanced collections

 How the Game Works:
 1. Computer generates all valid 4-digit numbers (there are 4,536 of them)
 2. Makes intelligent guesses by removing numbers that don't match previous responses
 3. Player responds with +/- notation (e.g., "+2-1" means 2 correct positions, 1 wrong position)
 4. Game continues until the computer guesses correctly (+4 response)

 The code is well-commented and uses clear variable names, making it easy for newcomers to understand the logic flow. It's a great example for teaching arrays, loops, and basic algorithm design!
 */

/*
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Random;

public class NumberGuessingGame {
    private static final int DIGITS = 4;
    private static final Scanner scanner = new Scanner(System.in);
//   private static Random random = new Random();

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

        // Initialize all numbers as valid possibilities
//        for (int i = 0; i < isValid.length; i++) {
//            isValid[i] = true;
//        }
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
//        for (int i = 0; i < count; i++) {
//            validNumbers[i] = tempNumbers[i];
//        }
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
//        if (response == null || response.length() == 0) {
//            return null;
//        }
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
*/
