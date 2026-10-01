package org.javaturk.ipj.project.solution.stack.linter;

import org.javaturk.ipj.project.solution.stack.Stack;
import java.util.Map;

public class Linter {
    private static Map<Character, Character> openingAndClosingBgraces = Map.of('{', '}', '[', ']', '(', ')');
//    private static Map<Character, Character> closinAndOpeningBgraces = Map.of('}', '{', ']', '[', ')', '(');


    void check(String text) throws SyntaxError1, SyntaxError2, SyntaxError3 {
        text = text.strip();
        char[] chars = convertToCharArray(text);
        Stack stack = new Stack(chars.length);
        for (char c : chars) {
//            stack.showElements(); // If you want to see the content of the stack before processing it!
            String stringC = String.valueOf(c);
            if (isOpeningBrace(c)) {
                stack.push(stringC);
            }
           else if (isClosingBrace(c)) { // Now pop the stack to check if it has a matching opening brace.
                if(stack.isEmpty()) // If the stack is empty then the closing brace does not have a corresponding opening brace in the stack.
                    throw new SyntaxError2(stringC + " (SyntaxError2)");
                else {
                    char shouldBeOpeningBrace = stack.pop().charAt(0); // This should be an opening brace and should match the closing brace.
                    if (!isOpeningBrace(shouldBeOpeningBrace))
                        throw new SyntaxError3( stringC + "-" + String.valueOf(shouldBeOpeningBrace) + " (SyntaxError3)");
                    else { // Ok, the stack has the opening brace and now check if it matches the closing brace!
                        char correspondingClosingBrace = openingAndClosingBgraces.get(shouldBeOpeningBrace);
                        if(c != correspondingClosingBrace)
//                            throw new SyntaxError3( stringC + ": expected " + closinAndOpeningBgraces.get(c) + " but found " + String.valueOf(shouldBeOpeningBrace) + " (SyntaxError3)");
                            throw new SyntaxError3( String.valueOf(shouldBeOpeningBrace)  + " can not be closed by " + stringC + " (SyntaxError3)");

                    }
                }
            }
        }
        // All chars are processed and if the stack is not empty that means it still has some opening braces that are not closed!
        // Get the first unclosed opening brace to give error!
        if(!stack.isEmpty()) {
            char openingBrace = stack.pop().charAt(0);
            throw new SyntaxError1(String.valueOf(openingBrace) + " (SyntaxError1)");
        }
    }

    private char[] convertToCharArray(String text) {
        int length = text.length();
        char[] chars = new char[length];
        text.getChars(0, length, chars, 0);
        return chars;
    }


    private boolean isOpeningBrace(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean isClosingBrace(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    static class SyntaxError1 extends Exception {
        private static final String message = "Opening brace does not have a corresponding closing brace: ";

        public SyntaxError1(String msg) {
            super(message + msg);
        }
    }

    static class SyntaxError2 extends Exception {
        private static final String message = "Closing brace does not have a corresponding opening brace: ";

        public SyntaxError2(String msg) {
            super(message + msg);
        }
    }

    static class SyntaxError3 extends Exception {
        private static final String message = "Closing brace does not match opening brace: ";

        public SyntaxError3(String msg) {
            super(message + msg);
        }
    }
}
