/*
Description: Create a class named Pizza that stores information about a single pizza.

Author: Andrew Hanson

Date: 09/14/2023
 */

package pizzatest;

import java.util.Scanner;

public class PizzaTest {
    
    public static void main(String[] args) {
        
        // create scanner object, then prompt user if user wants pizza, user chooses
        // between yes and no.
        Scanner scn = new Scanner(System.in);
     
        System.out.println("-----------------------------");
        System.out.println("Welcome to the Pizza Tester!");
        System.out.println("----------------------------- \n");
        System.out.println("Would you like to have a pizza? (yes/no)");
        String option = scn.nextLine();
        
        // if yes, execute statements within if statement. Will prompt for 
        // what pizza size, asking how much toppings.
        // Once user is finished with order, display the total order of pizza.
        if (option.equals("yes")){
            System.out.println("What pizza size would you like?" + 
                               " There is small, medium, and large.");
            String pizzaSize = scn.nextLine();
            
            if (pizzaSize.equals("small")) {
                System.out.println("How much cheese toppings would you like?");
                int cheeseTopping = scn.nextInt();
                System.out.println("How much pepperoni toppings would you like?");
                int pepperoniTopping = scn.nextInt();
                System.out.println("How much ham toppings would you like?");
                int hamTopping = scn.nextInt();
                // create pizza constructor.
                Pizza pizza = new Pizza(pizzaSize, cheeseTopping, pepperoniTopping, hamTopping);
                System.out.println("The total order of this pizza is: \n" + pizza.toString());
            }
            
            else if (pizzaSize.equals("medium")) {
                System.out.println("How much cheese toppings would you like?");
                int cheeseTopping = scn.nextInt();
                System.out.println("How much pepperoni toppings would you like?");
                int pepperoniTopping = scn.nextInt();
                System.out.println("How much ham toppings would you like?");
                int hamTopping = scn.nextInt(); 
                // create pizza constructor.
                Pizza pizza = new Pizza(pizzaSize, cheeseTopping, pepperoniTopping, hamTopping);
                System.out.println("\nThe total order of this pizza is: \n" + pizza.toString());
            }
            
            else if (pizzaSize.equals("large")) {
                System.out.println("How much cheese toppings would you like?");
                int cheeseTopping = scn.nextInt();
                System.out.println("How much pepperoni toppings would you like?");
                int pepperoniTopping = scn.nextInt();
                System.out.println("How much ham toppings would you like?");
                int hamTopping = scn.nextInt();
                // create pizza constructor.
                Pizza pizza = new Pizza(pizzaSize, cheeseTopping, pepperoniTopping, hamTopping);
                System.out.println("The total order of this pizza is: \n" + pizza.toString());
            }  
            
        }
        // if user types no, execute nothing and lead program to end.
        else if (option.equals("no")) {
            System.out.println("Program end!\nThank you come again!");
        }
        
    }
    
}