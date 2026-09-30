package org.javaturk.ipj.ch06.numbers;

public class HypotenuseCalculator {

    void main(){
        int x = 3;
        int y = 4;

        double hypotenuse = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse: " + hypotenuse);
        x = 9;
        y = 21;


        hypotenuse = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
