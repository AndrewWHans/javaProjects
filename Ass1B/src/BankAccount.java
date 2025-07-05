/*

Description: 
Create and test a BankAccount class.

Author: Andrew W. Hanson

Date: 09/07/2023

*/

package bankaccounttest;

public class BankAccount {
    // instance variables
    private String name;
    private double ckingBal;
    private double savingBal;
    private boolean bankCard;
    
    // constructor initializes name with multiple parameters: name, ckingBal, savingBal, and bankCard.
    public BankAccount(String name, double ckingBal, double savingBal, boolean bankCard) {
        this.name = name;
        this.ckingBal = ckingBal;
        this.savingBal = savingBal;
        this.bankCard = bankCard;
    }
    
    // multiple methods regarding depositing check, saving, withdrawing check, saving
    // getting bankcard, get balance of each check and saving, and getting total balance
    public void depositCking(double depositAmount) {
        // makes sure depositAmount is valid.
        if (depositAmount > 0.0) {
            // add to ckingBal
            ckingBal += depositAmount;
        }
    }   
    
    public void depositSaving(double depositAmount){
        // makes sure depositAmount is valid.
        if (depositAmount > 0.0) {
            // add to savingBal
            savingBal += depositAmount;
        }
    }
    
    public void withdrawCking(double withdrawAmount){
        // make sure withdrawAmount is valid.
        if (withdrawAmount > 0.0) {
            // withdraw from the checking
            ckingBal -= withdrawAmount;
        }
    }
    
    public void withdrawSaving(double withdrawAmount) {
        // makes sure withdrawAmount is valid.
        if (withdrawAmount > 0.0) {
            // withdraw from the saving
            savingBal -= withdrawAmount;
        }
    }
    
    public void setBankCard(boolean bankcard) {
        this.bankCard = bankcard;
    }
    
    public String getName() {
        return name;
    }

    public double getCkingBal() {
        return ckingBal;
    }

    public double getSavingBal() { 
        return savingBal;
    }

    public boolean getBankCard() {
        return bankCard; 
    }

    public double getTotalBal() {
        // adding checking and saving balances to get the total balance.
        return ckingBal + savingBal;
    }
    
}