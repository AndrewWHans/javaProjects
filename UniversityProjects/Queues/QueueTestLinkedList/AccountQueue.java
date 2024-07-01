package queuetestlinkedlist;

public class AccountQueue {

    private AccountNode qFront;
    private AccountNode qRear;

    // constructor
    public AccountQueue() {
        // setting front and rear to null.
        qFront = null;
        qRear = null;

    }

    private boolean isEmpty() {
        if (qFront == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int act_number, String name, double balance) {
        AccountNode n = new AccountNode(act_number, name, balance);
        // enqueue, add AccountNode n to the back of the queue
        if (isEmpty()==true) {
            qFront = qRear = n;
        } 
        else {
            qRear.next = n;
            qRear = n;
        }
    }

    public AccountNode dequeue() {
        if (isEmpty() == false) {
        // dequeue (remove and return the AccountNode in front of the queue
            AccountNode temp = qFront;
            qFront = qFront.next;
            if (qFront == null) {
                qRear = null;
            }
            return temp;
        } 
        else return null;
    }
}