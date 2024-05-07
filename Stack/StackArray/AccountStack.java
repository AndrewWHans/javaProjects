package stacktestarray;

// array implementation of stack 
public class AccountStack {

    private AccountNode[] mystack;
    private int size;
    private int current_index;

    public AccountStack(int size) {
        mystack = new AccountNode[size]; // initializing the array
        this.size = size;
        this.current_index = 0;
    }

    private boolean isFull() {
        if (current_index == size) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty() {
        if (current_index == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean push(AccountNode n) {

        if (isFull()) {
            return false;
        }
        mystack[current_index] = n;
        current_index++;
        return true;
    }

    public AccountNode pop() {
        if (isEmpty()) {
            return null;
        }
        current_index--;
        return mystack[current_index];
    }
}
