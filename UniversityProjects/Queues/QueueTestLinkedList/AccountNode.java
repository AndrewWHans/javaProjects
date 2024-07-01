package queuetestlinkedlist;

public class AccountNode {

    public int account_number;
    public String name;
    public double balance;
    public AccountNode next;

    public AccountNode(int account_number, String name, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
        this.next = null;
    }
}
