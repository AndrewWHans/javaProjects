/*
Description: Class to play the game Xfactor.
             Create a XfactorGame class implementing the game Xfactor,
             Xfactor must defeat all the zombies in Forest R before "it"
             runs out of "lives" 
Author: Michael R. Scheessele, Modified by: Andrew W. Hanson 
Date: November 2, 2022. Modified on date: 10/26/2023
 */

package xfactorplay;

public class XfactorPlay {
    
    public static void main(String[] args) {
        
        // creating constructor to call class XfactorGame
        XfactorGame game = new XfactorGame();
        game.play();
        game.outputStats();
        game.outputStatsToFile("XfactorLog.txt");
        System.out.println("XfactorLog.txt file created.");
    }
}