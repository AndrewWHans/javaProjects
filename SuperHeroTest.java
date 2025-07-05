/*
Description: Create a SuperHero class and test the SuperHero class to
             SuperHeroTest class. 
             Then create an "app" class to build simple database of 
             SuperHero objects.
Author: Andrew W. Hanson
Date: 09/28/2023
*/

package superherotest;

public class SuperHeroTest {

    public static void main(String[] args) {
        // create and initalizing SuperHero objects
        // and testing the methods created in the class.
        SuperHero hero1 = new SuperHero("Superman", "Flight");
        SuperHero hero2 = new SuperHero("Spider Man", "Web slinging");

        // getting and printing all the details of each superhero.
        System.out.println("\nSuperhero 1:");
        System.out.println("Name: " + hero1.getName());
        System.out.println("Superpower: " + hero1.getSuperPower());
        System.out.println("ID Number: " + hero1.getIdNumber());

        System.out.println("\nSuperhero 2:");
        System.out.println("Name: " + hero2.getName());
        System.out.println("Superpower: " + hero2.getSuperPower());
        System.out.println("ID Number: " + hero2.getIdNumber());

        // testing the methods of the class by 
        // updating the name and superpower of hero2.
        hero2.setName("The Fantastic Spider Man");
        hero2.setSuperPower("Wall crawling");

        // print the updated details of hero2.
        System.out.println("\nUpdated Superhero 2:");
        System.out.println("Name: " + hero2.getName());
        System.out.println("Superpower: " + hero2.getSuperPower());
        System.out.println("ID Number: " + hero2.getIdNumber());
        
    }
}