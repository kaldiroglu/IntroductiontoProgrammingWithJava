import dev.kaldiroglu.java.ip.hw.ch04.name.A;
import dev.kaldiroglu.java.ip.hw.ch04.name.B;
import dev.kaldiroglu.java.ip.hw.ch04.name.C;

String allNames;

void main(){
    gatherNames();
    IO.println("Names: " + allNames);
}

void gatherNames(){
    A a = new A();
    allNames = a.name();

    B b = new B();
    allNames = allNames + b.name();

    C c = new C();
    allNames = allNames + c.name();
}