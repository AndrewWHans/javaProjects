package stacktestlist;

public class AccountStack {
    private AccountNode top;

    public AccountStack() {
        top = null;
    }
	
    private boolean isEmpty()
    {
        if(top==null) return true;
	else return false;
    }
	
    public void push(AccountNode n)
    {
        n.next = top;
        top = n;
    }
	
    public AccountNode pop()
    {
        if (isEmpty()==false) {
            AccountNode result = top;
            top = top.next;
            result.next = null;
            return new AccountNode(result.account_number, result.name, result.balance);
        }
        else return null;
    }
}