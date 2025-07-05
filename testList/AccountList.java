package testlist;

public class AccountList {

    Account head;

    // Constructor for AccountList class,
    // If list is done, set head equal to null.
    public AccountList() {
        this.head = null;
    }

    // Method to add an account to the front of a linked list.
    public void addFront(int v, String n, double b) {
        Account newAccount = new Account(v, n, b);
        newAccount.next = head;
        head = newAccount;
    }

    // Method to display information of all accounts in the linked list.
    public void listAll() {
        Account current = head;
        while (current != null) {
            System.out.println(current.account_number + " " + current.name + " " + current.balance);
            current = current.next;
        }
    }

    public void insert_in_order_balance(int v, String n, double b) {
        Account newAccount = new Account(v, n, b);

        if (head == null || b > head.balance) {
            newAccount.next = head;
            head = newAccount;
            return;
        }

        Account current = head;
        while (current.next != null && current.next.balance > b) {
            current = current.next;
        }

        newAccount.next = current.next;
        current.next = newAccount;
    }

    public void remove(String name) {
        if (head == null) {
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Account current = head;
        while (current.next != null && current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to update the balance of an account based on the account number.
    public boolean updateBalance(int act, double newb) {
        Account current = head;
        while (current != null) {
            if (current.account_number == act) {
                current.balance = newb;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}