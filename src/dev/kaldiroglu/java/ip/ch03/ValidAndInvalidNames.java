package dev.kaldiroglu.java.ip.ch03;

public class ValidAndInvalidNames {

    public static void main(String[] args) {
        int sayı, Sayı, mädchen, weiß, değer, رجل, אדם, 男, $price;  // Valid
        int sum_$, $$_100, super_duper_price, _l_prc; // Valid but Java developers may condemn you!
        // These all cause compiler error!
//		int 48liler;
//		int all/clear;
//		int kaybol-buradan;
//		int true;
//		int true?;
//		int _;  // Compiler error after Java 9

    }
}
