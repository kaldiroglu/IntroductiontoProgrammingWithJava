package dev.kaldiroglu.java.ip.ch05.hospital;

public class Patient {
    // Attributes or properties
    String id;
    String name;
    char sex;
    int age;
    String[] illnesses;
    Doctor doctor;


    // Behaviors or operations
    public void takeMedication(Prescription prescription) {
        //...
    }

    public void visitedBy(String relative) {
        //...
    }
}
