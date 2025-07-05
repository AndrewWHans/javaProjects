/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myarraycalculatingsumandaverage;

/**
 *
 * @author 15742
 */
import java.util.Scanner;
public class MyArrayCalculatingSumAndAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[]myArray = new int[10];
        int addedSum = 0, averageOfNums = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Please enter a value: ");
            myArray[i] = scn.nextInt();
            addedSum = addedSum + myArray[i];
            System.out.println("The sum is: " + addedSum);
            averageOfNums = addedSum / 10;
            System.out.println("The average is: " + averageOfNums);
        } 
    }
    
}
