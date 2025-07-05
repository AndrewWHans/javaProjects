// Description: LinkedList.java is adapted from LinkedList2.java in Chapter 15
// source code from Absolute Java, 6th ed. (2016) by Walter Savitch.
// Modified by: Michael R. Scheessele
// Modified by: Andrew W. Hanson, 10/19/2023
// Mods: I cleaned up some and removed some functionality so that it could
// be added by students.
// Date: October 15th, 2022
package linkedlisttest;

public class LinkedList {

    // Node is the private "inner class" for the "LinkedList" class.
    private class Node {

        // Instance variables for Node class.
        private String item;
        private Node link;

        // No-parameter Node constructor.
        public Node() {
            item = null;
            link = null;
        }

        // Two-parameter Node constructor.
        public Node(String newItem, Node linkValue) {
            item = newItem;
            link = linkValue;
        }
    } //End of Node inner class
    // Reference to the "head" of the linked list.
    private Node head;

    // Constructor creates an empty linked list.
    public LinkedList() {
        head = null;
    }

    // Adds a node at the front of the list with the specified data.
    // The added node will be the first node in the list.
    // Input: The (String) name of the item.
    // Output: None.
    // NOTE: Student adds code here.
    public void addFront(String itemName) {
        head = new Node(itemName, head);
    }

    // Removes node at the front of the list.
    // Input: None.
    // Output: true, if the list contains at least one item prior to deletion.
    // false, if empty list.
    // NOTE: Student adds code here.
    public boolean deleteFront() {
        if (head != null) {
            head = head.link;
            return true;
        }
        return false;
    }

    // Adds a node at the back of the list with the specified data.
    // The added node will be the last node in the list.
    // Input: The (String) name of the item.
    // Output: None.
    // NOTE: Student adds code here.
    public void addBack(String itemName) {
        if (head == null) {
            head = new Node(itemName, head);
            return;
        } 
        Node position = head;
        while (position.link != null) {
            position = position.link;
        }
        position.link = new Node(itemName, position.link);
    }

    // Removes node at the back of the list.
    // Input: None.
    // Output: true, if the list contains at least one item prior to deletion.
    // false, if empty list.
    // NOTE: Student adds code here.
    public boolean deleteBack() {
        if (head == null) {
            // empty list, nothing to delete
            return false;
        }

        if (head.link == null) {
            head = null;
            // list had one item which gets deleted
            return true;
        }

        Node position = head;
        while (position.link.link != null) {
            position = position.link;
        }
        position.link = null;

        return true;
    }

    // Output the list.
    // Input: None.
    // Output: None.
    // NOTE: Student adds code here.
    public void outputList() {
        Node position = head;
        while (position != null) {
            System.out.println(position.item);
            position = position.link;
        }
    }

    // Returns the number of nodes (items) in the list.
    // Input: None.
    // Output: Number of nodes in the list.
    public int size() {
        int count = 0;
        Node position = head;
        while (position != null) {
            count++;
            position = position.link;
        }
        return count;
    }

    // Checks whether the linked list contains an item.
    // Input: (String) Name of the item to be searched for.
    // Output: true if the list contains item, false otherwise.
    public boolean contains(String item) {
        return (find(item) != null);
    }

    // Finds the first node containing the target item, and returns a
    // reference to that node. If target is not in the list, null is returned.
    // Input: target is the item to be searched for in the linked list.
    // Output: Reference to the first node (item) in the list matching target.
    // If no matches, return null.
    private Node find(String target) {
        Node position = head;
        String itemAtPosition;
        while (position != null) {
            itemAtPosition = position.item;
            if (itemAtPosition.equals(target)) {
                return position;
            }
            position = position.link;
        }
        return null; //target was not found
    }

    // Checks whether linked list is empty.
    // Input: None.
    // Output: Returns true if linked list is empty; returns false otherwise.
    public boolean isEmpty() {
        return (head == null);
    }

    // Makes the linked list empty.
    // Input: None.
    // Output: None.
    public void clear() {
        head = null;
    }

    //For two lists to be equal they must contain the same data items in
    //the same order.
    // Input: The otherObject to be compared to "this" object.
    // Output: true, if the two objects are equal; false otherwise.
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            LinkedList otherList = (LinkedList) otherObject;
            if (size() != otherList.size()) {
                return false;
            }
            Node position = head;
            Node otherPosition = otherList.head;
            while (position != null) {
                if ((!(position.item.equals(otherPosition.item)))) {
                    return false;
                }
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true; //A mismatch was not found
        }
    }
}