package testlist;

public class Account {
    int account_number;
    String name;
    double balance;
    Account next;
    
    public Account(int account_number, String name, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
        this.next = null;
    }
}
