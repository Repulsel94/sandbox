package org.example.inheritance;

public class Hagfish extends Fish {

    public Hagfish() {
        this.hasScales = true;
    }


    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public String walk() {
        return super.walk();
    }
}
