/*
Description: A tester class for the user-defined class, NegativeNumberException
             To test the NegativeNumberException class thoroughly with it's
             extend to the Java-provided Exception class.
Author: Andrew W. Hanson
Date: 11/26/2023
*/

package myexceptiontest;

public class MyExceptionTest {

    public static void main(String[] args) throws NegativeNumberException {
        
        try {
            // Test with a non negative number.
            int number1 = 5;
            System.out.println("Testing with a non-negative number:");
            if (number1 < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            }
            else {
                System.out.println("The number is: " + number1);
            }
        
        // Test with a negative number.
        int number2 = -3;
        System.out.println("Testing with a negative number:");
        if (number2 < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        else {
            System.out.println("The number is: " + number2);
        }
        
        } catch (NegativeNumberException nne) {
            System.out.println("Caught an exception: " + nne.getMessage());
        }      
    }
}