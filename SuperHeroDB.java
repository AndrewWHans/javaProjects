/*
Description: Create a SuperHero class and test the SuperHero class to
             SuperHeroTest class. 
             Then create an "app" class to build simple database of 
             SuperHero objects.
Author: Andrew W. Hanson
Date: 09/28/2023
*/
package superherotest;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class SuperHeroDB {
    private ArrayList<String> superHero = new ArrayList<String>();
    
    public SuperHeroDB() {
        
        // open "superheroes.txt" for writing with try-catch block. 
        PrintWriter outStream = null;
        try {
            outStream = new
                        PrintWriter(new FileOutputStream("superheroes.txt"));
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening superheores.txt for writing.");
            System.exit(0);
        }
        
        // superheroes.txt file successfully opened for writing.
        // build arraylist of SuperHero objects.
        superHero.add("The Incredible Hulk");
        superHero.add("Wonder Woman");
        superHero.add("SuperMan");
        superHero.add("Spider-Man");
        
        // write super heroes in supes to the "superheroes.txt" file, 
        // one line at a time.
        for (String hero: superHero) {
            outStream.println(hero);
        }
        
        // close file
        outStream.close();
        
        // reopen file and print its contents using a try-catch block.
        try {
            Scanner inStream = new Scanner(new FileInputStream("superheroes.txt"));
            
            // superheroes.txt file successfully opened for reading.
            // print its contents.
            while (inStream.hasNextLine()) {
                String line = inStream.nextLine();
                System.out.println(line);
            }
            
            // close file 
            inStream.close();
            
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening superheroes.txt for reading.");
        }
    }
    public static void main(String[] args) {
        // creating a SuperHeroDB object.
        SuperHeroDB db = new SuperHeroDB();
    }
}