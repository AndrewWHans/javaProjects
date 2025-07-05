/*
Description: Create a java class named LinkedList and a java main tester 
             called LinkedListTest to test the methods that are 
             within LinkedList class
Author: Andrew W. Hanson
Date: October 24, 2023 
*/

package linkedlisttest;

public class LinkedListTest {
    public static void main(String[] args) {
        // creating a LinkedList method
        LinkedList list = new LinkedList();

        // Adding items to the front of the list
        list.addFront("Peaches");
        list.addFront("Hot dogs");
        
        
        System.out.println("List after adding items to the front:");
        list.outputList();
        System.out.println();
        
        // Check if the list contains a specific item
        System.out.println("The list contains 'Peaches': " + list.contains("Peaches"));
        System.out.println("The list contains 'Pringles': " + list.contains("Pringles"));
        System.out.println();
        
        // Remove items from the front of the list
        list.deleteFront();
        System.out.println("List after deleting from the front:");
        list.outputList();
        System.out.println();

        // Add items to the back of the list
        list.addBack("Chicken");
        list.addBack("Bananas");
        System.out.println("List after adding to the back:");
        list.outputList();
        System.out.println();

        // Remove items from the back of the list
        list.deleteBack();
        System.out.println("List after deleting from the back:");
        list.outputList();
        System.out.println();

        // Get the size of the list
        System.out.println("Size of the list: " + list.size());

        // Clear the list
        list.clear();
        System.out.println("List after clearing:");
        list.outputList();
        // Check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}