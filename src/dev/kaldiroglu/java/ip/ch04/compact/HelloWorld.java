import dev.kaldiroglu.java.ip.ch04.compact.Selam;

Random random = new Random();

void main() {
    System.out.println("Hello World!");
    saySalam();
}

void saySalam(){
    Selam s = new Selam();
    int limit = random.nextInt(10);
    for(int i = 0; i < limit; i++)
        System.out.println(s.selamSoyle("Oya"));
}