package dev.kaldiroglu.java.ip.ch05.hospital;

import java.util.Date;

public class  Hospital {
    String name;
    Doctor[] doctors;
    Patient[] patients;
    // ...

    public boolean appointment(Date appointmentDate) {
        boolean success = false;
        //...
        return success;
    }

    public Receipt receive(int payment) {
        Receipt receipt = null;
        // ...
        return receipt;
    }
}
