package dev.kaldiroglu.java.ip.ch10.decision.ifElse;

class IfElseWhile {

    public static void main(String[] args) {

        int i = 10;

        if (false) {
            System.out.println("Selam");
        }
        else if(i > 0){
            System.out.println(i);
            i--;
        }

        System.out.println("*******************");

        i = 10;

        if (false) {
            System.out.println("Selam");
        }
        else while(i > 0){
            System.out.println(i);
            i--;
        }

        System.out.println("*******************");

        i = 10;

        if (false) {
            System.out.println("Selam");
        }
        else for(; i > 0; i--){
            System.out.println(i);
        }
    }
}
