/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymanipulations;

import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {
        // sort a doubleArray into ascending order.
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.println("doubleArray: ");
        
        
        for (double value : doubleArray) {
            System.out.println(value);
        }
        
        // fill in a 10 element array with 7s.
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7); // fills array with 7
        display(filledIntArray, "filledIntArray");
        
        // copying array intArray into array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length]; // getting same length as previous array made.
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        display(intArray, "intArray");
        display(intArrayCopy, "intArrayCopy");
        
        // comparing intArray and intArrayCopy for equality.
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",(b ? "==" : "!="));
        
        // compare intArray and filledIntArray for equality 
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n",(b ? "==" : "!="));
        
        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);
        
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        }
        else{
            System.out.println("5 is not found in intArray.");
        }
        
        // searching intArray for the value 8763.
        location = Arrays.binarySearch(intArray, 8763);
        
        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        }
        else{
            System.out.println("8763 not found in intArray.");
        }
        
    }
    
    // outputs all values in each array.
    
    public static void display(int[] array, String description){
        System.out.println(description);
        
        for (int value : array) {
            System.out.println(value);
        }
        
    }
    
    
}
