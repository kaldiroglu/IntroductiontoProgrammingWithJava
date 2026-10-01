package dev.kaldiroglu.java.ip.ch04.compact;

public class Hello{

    String world = "world";

    public String sayHello(String whom) {
        String greeting;
        if (whom != "")
            greeting = "Hello " + whom + " :)";
        else
            greeting = "Hello " + world + " :)";
        return greeting;
    }
}