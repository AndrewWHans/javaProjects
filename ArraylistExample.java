/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistexample;

/**
 *
 * @author 15742
 */
import java.util.ArrayList; // import arraylist

public class ArraylistExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new arraylist of string with initial capacity of 10.
        ArrayList<String> items = new ArrayList<String>();
        
        // adding items into arraylist
        
        items.add ("red"); // appends item to list
        items.add(0, "yellow"); // insert "yellow" at index 0
        
        // print header
        System.out.println("Display list contents with counter-controlled loop:");
        
        // display colors in list
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
        
        // display colors using enhanced for loop for in the display method
        
        display(items, "Display list contents with enhanced for statement:");
        
        items.add("green"); // add "green" to end of list.
        items.add("yellow"); // add "yellow" to end of list.
        // display items with the new elements.
        
        display(items, "List with two new elements:");
        
        items.remove("yellow"); // remove first yellow.
        display(items, "Remove first instance of yellow: ");
        
        items.remove(1); // removes item at index 1.
        display(items, "Remove second list element (green): ");
        
        // check if a value is in the list.
        System.out.printf("\"red\" is %sin the list%n",
        items.contains("red") ? "": "not ");
        
        // display number of elements in the list.
        System.out.println("Size: " + items.size());
            
    }
    
    public static void display(ArrayList<String> items, String header) {
        System.out.println(header); // display header
        
        // display each element in items
        for (String item : items) {
        System.out.println(item);
        }
        
        System.out.println();
    }   
}
    

