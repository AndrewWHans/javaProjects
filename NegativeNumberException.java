/*
Description: Creating a user-defined class called NegativeNumberException
             Class should extend (inherit from) the Java provided
             Exception class.
             
Author: Andrew W. Hanson
Date: 11/26/2023
*/

package myexceptiontest;

// Negative number class is a subclass of 'Exception', where the 'Exception'
// class gives multiple methods that are useful for handling exceptions. 
// The constructor in the 'NegativeNumberException' class allows to create a 
// exception object so the user can create a custom message.

public class NegativeNumberException extends Exception {
    
    public NegativeNumberException (String message) {
        super(message);
    }
}