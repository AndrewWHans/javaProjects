/*
Description: Create a SuperHero class and test the SuperHero class to
             SuperHeroTest class. 
             Then create an "app" class to build simple database of 
             SuperHero objects.
Author: Andrew W. Hanson
Date: 09/28/2023
 */
package superherotest;

public class SuperHero {

    // providing instance variables
    private String name;
    private String superPower;
    private int idNum;
    private static int idCounter = 0; // belong class itself

    // creating a constructor for SuperHero class.
    public SuperHero(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
        idNum = ++idCounter;
        System.out.printf("SuperHero constructed: %s %s; count = %d%n",
                name, superPower, idNum);
    }

    // providing set and get methods for Name, SuperPower, and IDNum.
    public void setName(String name) {
        this.name = name;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getIdNumber() {
        return idNum;
    }
}