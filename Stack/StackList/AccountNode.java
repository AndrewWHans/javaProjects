package stacktestlist;

public class AccountNode
{
    public int account_number;
    public String name;
    public double balance;
    public AccountNode next;
    
    public AccountNode(int v, String n, double b)
    {
	this.account_number = v;
	this.name = n;
	this.balance = b;
        this.next = null;
    }
}