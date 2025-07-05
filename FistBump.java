/*
Description: Write a recursive function fistBump to find what is the total 
             number of each fist bump that a person has with every other person.
Author: Andrew W. Hanson
Date: 10/09/2023
*/

package fistbump;

import java.util.Scanner;

public class FistBump {

    public static void main(String[] args) {
        // create scanner object and use scn to get number of people.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int numberOfPeople = scn.nextInt();

        int totalFistBump = fistBump(numberOfPeople);
        System.out.println("There are " + numberOfPeople + 
                   " people in the room, and they have fist bumped a total of " 
                   + totalFistBump + " times.");
    }

    public static int fistBump(int n) {
        if (n <= 1) {
            return 0;  // A person can't fist bump with themselves.
        } 
        else {
            // Each person fist bumps with (n-1) other people
            // we recursively calculate for the remaining people.
            return (n - 1) + fistBump(n - 1); // 
        }
    }
}