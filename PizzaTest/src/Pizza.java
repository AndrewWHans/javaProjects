package pizzatest;

/*
Description: Create a class named Pizza that stores information about a single pizza.

Author: Andrew Hanson

Date: 09/14/2023
 */

public class Pizza {
    // instance variables
    private String sizeOfPizza;
    private int numCheeseTop;
    private int numPepTop;
    private int numHamTop;
    
    // creating constructor pizza and setting the parameters of the instance variables
    public Pizza(String sizeOfPizza, int numCheeseTop, int numPepTop, int numHamTop) {
        this.sizeOfPizza = sizeOfPizza;
        this.numCheeseTop = numCheeseTop;
        this.numPepTop = numPepTop;
        this.numHamTop = numHamTop;
    }
    // multiple methods of get and set for the pizza's size, types of toppings,
    // calculated cost and toString()
    public String getSizeOfPizza() {
        return sizeOfPizza;
    }
    
    public void setSizeOfPizza(String sizeOfPizza) {
        this.sizeOfPizza = sizeOfPizza;
    }
    
    public int getNumCheeseTop() {
        return numCheeseTop;
    }
    
    public void setCheeseTop(int numCheeseTop){
        this.numCheeseTop = numCheeseTop;
    }
    
    public int getNumPepTop() {
        return numPepTop;
    }
    
    public void setPepTop(int pepperoniTop) {
        this.numPepTop = pepperoniTop;
    }
    
    public int getNumHamTop() {
        return numHamTop;
    }
    
    public void setHamTop(int hamTop) {
        this.numHamTop = hamTop;
    }
    
    public double calcCost() {  
        double baseCalculatedCost = 0.0;
        
       // if and else if statements to consider the size of the pizza and determining
       // how much each size will be with the amount of toppings.
       if (sizeOfPizza.equals("small")) {
           baseCalculatedCost = 10.0;
       }
       
       else if (sizeOfPizza.equals("medium")) {
           baseCalculatedCost = 12.0;
       }
       
       else if (sizeOfPizza.equals("large")) {
           baseCalculatedCost = 14.0;
       }
       
       return baseCalculatedCost + (numCheeseTop + numPepTop + numHamTop) * 2; 
    }
    
    public String toString() {
        return "The size of the pizza is: " + sizeOfPizza + "\n" +
                "The number of cheese toppings is: " + numCheeseTop + "\n" + 
                "The number of pepperoni toppings:" + numPepTop + "\n" + 
                "the number of ham toppings: " + numHamTop + "\n" + "The total cost is: $" + calcCost();
    } 
}