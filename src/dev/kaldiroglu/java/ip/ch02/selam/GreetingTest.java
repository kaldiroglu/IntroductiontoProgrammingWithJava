package dev.kaldiroglu.java.ip.ch02.selam;

class GreetingTest {
    public static void main(String[] args) {
        Greeting selamlama = new Greeting();
        selamlama.greetingWord = "Selam";
        String cevap = selamlama.greet("Zeynep");
        System.out.println(cevap);
        System.out.println(selamlama.greetingWord);

        Greeting greeting = new Greeting();
        greeting.greetingWord = "Helloooww";
        String answer = greeting.greet("Tom");
        System.out.println(answer);
        System.out.println(greeting.greetingWord);
    }
}
