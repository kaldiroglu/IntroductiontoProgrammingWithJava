package dev.kaldiroglu.java.ip.ch10.loop;

class ListCharacters {
    public static void main(String[] args) {
    	
        for(char c = 0; c < 65535; c++)
            System.out.println("value: " + (int)c + " character: " + c);
    }
}
