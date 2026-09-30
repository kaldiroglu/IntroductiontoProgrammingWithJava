package dev.kaldiroglu.java.ip.ch04.selam;

public class Selam{
    String world = "millet";

    public String selamSoyle(String kime) {
        String cumle;
        if (kime != "")
            cumle = "Selam " + kime + " :)";
        else
            cumle = "Selam " + world + " :)";
        return cumle;
    }
}