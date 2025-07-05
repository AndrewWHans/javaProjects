/*
Description: Create a tester for testing the creature Dragon class and it's
             implemented interfaces. 

Author: Andrew W. Hanson
Date: 11/30/2023
 */
package creaturetest;

import java.util.Scanner;

public class CreatureTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Grabbing the user's input for the first Dragon
        System.out.println("Enter the initial location (x y) for Andrew's Dragon:");
        int andrewX = getUserInput(scanner, "Enter x coordinate: ");
        int andrewY = getUserInput(scanner, "Enter y coordinate: ");
        Dragon andrew = new Dragon(andrewX, andrewY, 100, 50);

        // Grabbing the user's input for the second Dragon
        System.out.println("Enter the initial location (x y) for Doom's Dragon:");
        int doomX = getUserInput(scanner, "Enter x coordinate: ");
        int doomY = getUserInput(scanner, "Enter y coordinate: ");
        int doomFireBreath = getUserInput(scanner, "Enter fire breathing value: ");
        int doomClaws = getUserInput(scanner, "Enter claws value: ");
        Dragon doom = new Dragon(doomX, doomY, doomFireBreath, doomClaws);

        // Grabbing the user's input for the third Dragon
        System.out.println("Enter the initial location (x y) for Draco's Dragon:");
        int dracoX = getUserInput(scanner, "Enter x coordinate: ");
        int dracoY = getUserInput(scanner, "Enter y coordinate: ");
        int dracoFireBreath = getUserInput(scanner, "Enter fire breathing value: ");
        int dracoClaws = getUserInput(scanner, "Enter claws value: ");
        Dragon draco = new Dragon(dracoX, dracoY, dracoFireBreath, dracoClaws);

        // Displaying the dragon information by calling the created method.
        displayDragonInfo(andrew);
        displayDragonInfo(doom);
        displayDragonInfo(draco);
    }

    // Created method using a try-catch block
    // to determine whether or not the user's input is 
    // valid or not valid.
    private static int getUserInput(Scanner scanner, String prompt) {
        int userInput = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println(prompt);
                userInput = Integer.parseInt(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return userInput;
    }
    // Method to create the dragon's information.
    private static void displayDragonInfo(Dragon dragon) {
        System.out.println(dragon.toString());
        System.out.println();
    }
}