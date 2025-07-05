/*

Description: 
Create and test a BankAccount class.

Author: Andrew W. Hanson

Date: 09/07/2023

*/

package bankaccounttest;

import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // asks user if they have a bankcard.
        System.out.println("Do you have a bankcard?");     
        String hasBankCard = scn.nextLine();
        
        // if user types yes then execute statements inside if statement,
        // will ask user account name, initial checking and saving balance.
        if (hasBankCard.equals("yes")) {

            System.out.println("Please enter your account name: ");
            String name = scn.nextLine();
            
            
            System.out.println("Enter initial checking balance: ");
            double inChking = scn.nextDouble();

            System.out.println("Enter initial savings balance: ");
            double inSaving = scn.nextDouble();

            // creating the BankAccount object with parameters
            BankAccount account = new BankAccount(name, inChking, inSaving, true);

            // consume newline
            scn.nextLine();

            // ask whether to deposit or withdraw
            System.out.println("Would you like to deposit or withdraw? (deposit/withdraw)");
            String type = scn.nextLine();

            // user types deposit, executes if statement,
            // asks to deposit either checking or savings
            if (type.equals("deposit")) {
                
                // will ask the user to deposit to check or saving.
                System.out.println("Would you like to deposit to checking or savings? (checking/savings)");
                String accountType = scn.nextLine();

                // asks user how much to add for checking, then display 
                // the checking balance
                if (accountType.equals("checking")) {
                    
                    System.out.println("How much would you like to add to your checking?");
                    double depositAmount = scn.nextDouble();
                    account.depositCking(depositAmount);
                    System.out.println("Deposit successful. Your checking balance is now: " + account.getCkingBal());
                    
                } 
                // ask user how much to add for savings, then display saving balance 
                else if (accountType.equals("savings")) {
                    
                    // ask user how much to add for savings, then displays
                    // the new savings amount.
                    System.out.println("How much would you like to add to your savings?");
                    double depositAmount = scn.nextDouble();
                    account.depositSaving(depositAmount);
                    System.out.println("Deposit successful. Your savings balance is now: " + account.getSavingBal());
                   
                }
            }
            // if the user typed "withdraw" instead of depositing to either checking or savings.
            // prompts user if withdraw from checking or savings, if chosen checking or savings then 
            // will ask how much to withdraw, and will display the amount after the withdrawal.
            else if (type.equals("withdraw")) {
                System.out.println("Would you like to withdraw from checking or savings? (checking/savings)");
                String accountType = scn.nextLine();

                if (accountType.equals("checking")) {   
                    
                    System.out.println("How much would you like to withdraw from checking?");
                    double withdrawAmount = scn.nextDouble();
                    account.withdrawCking(withdrawAmount);
                    System.out.println("Withdrawal successful. Your checking balance is now: " + account.getCkingBal());
                    
                } 
                else if (accountType.equals("savings")) {
                    
                    System.out.println("How much would you like to withdraw from savings?");
                    double withdrawAmount = scn.nextDouble();
                    account.withdrawSaving(withdrawAmount);
                    System.out.println("Withdrawal successful. Your savings balance is now: " + account.getSavingBal());
                    
                }
            }
        }
        
    }
}