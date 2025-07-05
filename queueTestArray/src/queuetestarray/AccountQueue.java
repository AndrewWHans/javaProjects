package queuetestarray;

public class AccountQueue {

    private AccountNode[] myqueue;
    private int size;
    private int head;
    private int tail;
    private int current_size;

    public AccountQueue(int size) {
        // constructor
        // your code goes here
        myqueue = new AccountNode[size];
        this.size = size;
        head = 0;
        tail = 0;
        current_size = 0;
    }

    private boolean isFull() {
        if (current_size == size) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty() {
        if (current_size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean enqueue(int account_number, String name, double balance) {
        AccountNode n = new AccountNode(account_number, name, balance);
        // enqueue, add AccountNode n to the back of the queue
        if (isFull() == false) {  
            myqueue[tail] = n;
            if (tail == size - 1) tail = 0;
            else tail = tail + 1;
            current_size++;
            return true;
        }
         else return false;
    }

    public AccountNode dequeue() {
        if (isEmpty() == false) {
            // dequeue (remove and return the AccountNode in front of the queue
            AccountNode temp = myqueue[head];
            if (head == size - 1) {
                head = 0;
            } else {
                head = head + 1;
            }
            current_size--;
            return temp;
        } else {
            return null;
        }
    }
}
