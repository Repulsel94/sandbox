package org.example.inheritance;

public interface Animal {

    String variable1 = "Hello There";

    void eat();
    void reproduce();
    void breathe();

    //public is implied and is not needed
    public default String walk() {
        return "I'm walking";
    }
}
