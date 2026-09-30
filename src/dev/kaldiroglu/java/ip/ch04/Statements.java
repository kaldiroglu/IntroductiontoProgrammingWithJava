package dev.kaldiroglu.java.ip.ch04;

public class Statements {

    public static void main(String[] args) {
        // Each statement is on its own line: Good and usual!
        int i = 5;
        i++;
        System.out.println("i: " + i);

        // These are ok but repeats the same method call!
        char lastChar1 = getString().charAt(getString().length() - 1);
        System.out.println("Last char: " + lastChar1);

        String lastTwoChars1 = getString().substring(getString().length() - 2, getString().length());
        System.out.println("Last two chars: " + lastTwoChars1);

        // These are much better!
        String string = getString();
        int length = getString().length();
        char lastChar2 = string.charAt(length - 1);
        System.out.println("Last char: " + lastChar2);

        String lastTwoChars2 = string.substring(length - 2, length);
        System.out.println("Last two chars: " + lastTwoChars2);

        // Many statements are on one line: Not good! Confusing!
        int j = 4; j++; System.out.println("j: " + j);

        // One statement lies on many lines: Not good and unusual! Confusing!
        int
                k
                =
                14
                ;

        System
                .
                out
                .
                println("k: " + k)
                ;

    }

    static String getString(){
        return "I love Java :)";
    }
}
