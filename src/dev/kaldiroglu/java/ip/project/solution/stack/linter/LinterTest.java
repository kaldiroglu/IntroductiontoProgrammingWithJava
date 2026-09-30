package dev.kaldiroglu.java.ip.project.solution.stack.linter;

public class LinterTest {

    public static void main(String[] args) {
        Linter linter = new Linter();
        try {
            linter.check("()"); // OK
            linter.check("{([])}"); // OK
//            linter.check("{([([{}])])} {([])} {([([{()}])])} {([{}])}"); // OK
//            linter.check("public class Example{int f(String[] array){ return array.length();}}"); // OK
//            linter.check("(var x = {y: [1, 2, 3]})"); // OK Example in the book.
//            linter.check(""); // OK
//            linter.check("{"); // SyntaxError1
//            linter.check("{("); // SyntaxError1
//            linter.check("[]("); // SyntaxError1
//            linter.check("public class Example{int f(String[] array){ return array.length();}"); // SyntaxError1
//            linter.check("}"); // SyntaxError2
//            linter.check("{}]"); // SyntaxError2
//            linter.check("var x = {y: [1, 2, 3]})"); // SyntaxError2 Example in the book.
//            linter.check("(}"); // SyntaxError3
//            linter.check("(var x = {y: [1, 2, 3]}]"); // Closing brace does not match opening brace: ( can not be closed by ] (SyntaxError3)
//            linter.check("public class Example{int f(String[] array){return array.length();})"); // Closing brace does not match opening brace: { can not be closed by ) (SyntaxError3)
        } catch (Linter.SyntaxError1 | Linter.SyntaxError2 | Linter.SyntaxError3 e) {
            System.out.println(e.getMessage());
        }
        // Closing brace does not match opening brace: ]: expected [ but found ( (SyntaxError3)
    }
}
