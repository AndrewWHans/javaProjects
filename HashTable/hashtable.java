package testhash;

public class hashtable {

    private account[] array;
    private int size;

    public hashtable(int n) {
        size = getPrime(n);
        array = new account[size];
        for (int i = 0; i < size; i++) {
            array[i] = null; //create empty linkedlists
        }
    }

    public void insert(int act, String n, double b) {
        account temp = new account(act, n, b);
        int index = hash_code_map(act, n) % size;
        if (array[index] == null) {
            array[index] = temp;
        } else {
            temp.next = array[index];
            array[index] = temp;
        }
    }

    public void remove(int act, String n) {
        int index = hash_code_map(act, n) % size;

        if (array[index] == null) {
            return; // do nothing if slot is empty
        }

        account current = array[index];
        account prev = null;

        while (current != null) {
            if (current.account_number == act && current.name.equals(n)) {
                if (prev == null) {
                    // If the found account is the first node
                    array[index] = current.next;
                } else {
                    // If the found account is not the first node
                    prev.next = current.next;
                }
                return; // account removed successfully
            }
            prev = current;
            current = current.next;
        }
    }

    public account search(int act, String name) {
        int index = hash_code_map(act, name) % size;

        account current = array[index];

        while (current != null) {
            if (current.account_number == act && current.name.equals(name)) {
                return current; // returns the found account
            }
            current = current.next;
        }

        return null; // the account is not found
    }

    private int getPrime(int n) {
        boolean done = false;
        int i = n + 1;
        while (done == false) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime == true) {
                done = true;
            } else {
                i = i + 1;
            }
        }
        return i;
    }

    private int hash_code_map(int act, String name) {
        int sum = 0;
        for (int i = 0; i != name.length(); i++) {
            sum = sum + (int) (name.charAt(i));
//sum = sum + name.charAt(i); // this also works
        }
        return sum + act;
    }
}
