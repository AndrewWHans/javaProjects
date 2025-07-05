/*
Description: Class to play the game Xfactor.
             Create a XfactorGame class implementing the game Xfactor,
             Xfactor must defeat all the zombies in Forest R before "it"
             runs out of "lives" 
Author: Michael R. Scheessele, Modified by: Andrew W. Hanson 
Date: November 2, 2022. Modified on date: 10/26/2023
 */
package xfactorplay;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class XfactorGame { // Xnode is an "inner class". 

    private class Xnode {

        private int xcoord;
        private int ycoord;
        private int power;
        private Xnode nextX;

        public Xnode() {
            xcoord = 0;
            ycoord = 0;
            power = 10; // enough to defeat 2 zombies in Forest R
            nextX = null; // X currently has just this one life
        }
    } // end of Xnode inner class

    private final int MAXROWS = 100;
    private final int MAXCOLS = 100;

    private Xnode X; // hero xFactor
    private char[][] ForestR = new char[MAXROWS][MAXCOLS];
    private int zombieCount = 0;
    private int round;
    private Random random = new Random();

    public XfactorGame() {
        X = new Xnode(); // X is ALIVE

        // For each row in ForestR, put a character 'Z' in every 2nd column,
        // starting from element 1 of the row: 1,3,5,7...,95,97,99.
        for (int row = 0; row < MAXROWS; row++) {
            for (int col = 1; col < MAXCOLS; col += 2) {
                ForestR[row][col] = 'Z';
                zombieCount++;
            }
        }
    }

    public void play() {
        while (zombieCount > 0 && X != null) {
            playRound();
        }
    }
    
    // Method to play round and debate if zombie is present or gone, 
    // or if hero X lose life or not, or gain more land in ForestR 
    // obtaining more power. 
    private void playRound() {
        round++;
        int xcoord = random.nextInt(MAXROWS);
        int ycoord = random.nextInt(MAXCOLS);

        // X "jumps" to ForestR[xcoord][ycoord]
        if (ForestR[xcoord][ycoord] == 'Z') { // zombie present
            if (X.power < 5) { // there goes X's current life.
                X = X.nextX;
            }
            else 
            { // adios zombie
                ForestR[xcoord][ycoord] = 'X'; // X marks the spot
                X.power -= 5; // zombie elimination is costly
                zombieCount--;
            }
        } 
        else 
        {
            ForestR[xcoord][ycoord] = 'X'; // X marks some more territory
            X.power += 2; // X is getting strong
            if (X.power > 20) { // Create a new 'life' for X
                Xnode newX = new Xnode();
                newX.nextX = X;
                X = newX;
            }
        }
    }
    // Method to print the output of the stats 
    public void outputStats() {
        System.out.println("Game Over!");
        System.out.println("Rounds Played: " + round);
        System.out.println("Starting Number of Zombies: " + (MAXROWS * MAXCOLS) / 2);
        System.out.println("Ending Number of Zombies: " + zombieCount);
        System.out.println("Ending Number of X 'Lives': " + countXLives());
    }
    // Method to print the output of the stats to file
    public void outputStatsToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Game Over!");
            writer.println("Rounds Played: " + round);
            writer.println("Starting Number of Zombies: " + (MAXROWS * MAXCOLS) / 2);
            writer.println("Ending Number of Zombies: " + zombieCount);
            writer.println("Ending Number of X 'Lives': " + countXLives());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to count how many lives the hero X has.
    private int countXLives() {
        int count = 0;
        Xnode currentNode = X;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.nextX;
        }
        return count;
    }
}