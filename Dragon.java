/*
Description: Create a class called Dragon that inherits from MagicForestObject
             and implements the interfaces FireBreath and Glide.
Author: Andrew W. Hanson
Date: 11/30/2023
 */
package creaturetest;

public class Dragon extends MagicForestObject implements FireBreath, Glide {
    private int fireBreathing;
    private int claws;

    // Creating a Dragon no argument constructor
    Dragon() {
        super();
        fireBreathing = 100; // considering it is burning.
        claws = 50; // considering the dragon can slash with it's claws.
    }

    // Creating a Dragon four argument constructor
    Dragon(int x, int y, int fireBreathing, int claws) {
        super(x, y);
        if (fireBreathing < 0) {
            fireBreathing = 0;
        }
        if (claws < 0) {
            claws = 0;
        }

        this.fireBreathing = fireBreathing;
        this.claws = claws;
    }

    // Set and get methods for instance variables
    public void setFireBreath(int fireBreathing) {
        if (fireBreathing < 0) {
            fireBreathing = 0;
        }

        this.fireBreathing = fireBreathing;
    }

    public void setClaws(int claws) {
        if (claws < 0) {
            claws = 0;
        }

        this.claws = claws;
    }

    public int getFireBreath() {
        return fireBreathing;
    }

    public int getClaws() {
        return claws;
    }

    // Overriding the vocalize, fire, glide, and toString methods
    @Override
    public void vocalize() {
        System.out.println("RAAAWR!!!!");
    }

    @Override
    public void fire() {
        System.out.println("Crackling, sputter, pop, snap!");
    }

    @Override
    public void glide() {
        System.out.println("Woosh!");
    }

    @Override
    public String toString() {
        return "\nLocation: (" + getX() + ", " + getY() + ")" + "\n" +
                "FireBreathing: " + getFireBreath() + "\n" +
                "Claws: " + getClaws();
    }
}