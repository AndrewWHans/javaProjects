package testhash;

public class account {

    public int account_number;
    public String name;
    public double balance;
    public account next;

    public account(int account_number, String name, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
        this.next = null;
    }
}
