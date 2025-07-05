/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myarrayfindinglargestvalue;

/**
 *
 * @author 15742
 */
import java.util.Random;
public class MyArrayFindingLargestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[]myArray = new int[10];
        for (int i = 0; i <= myArray.length; i++) {
            myArray[i] = rnd.nextInt();
            System.out.println("The numbers in the array is: " + myArray[i]);
            for (int j = 0; j <= 1; j++) {
            int largest = myArray[0];
            if (largest < myArray[i]) {
                largest = myArray[i];
                System.out.println("The largest value in the array is: " + largest);
                break;
            }
            break;
            } // end inside for loop
        
        } // end outside for loop 
       
    } // end main function
    
} // end class
