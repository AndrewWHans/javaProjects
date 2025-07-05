package queuetestarray;

public class QueueTestArray {

    public static void main(String[] args) {
        AccountQueue inque = new AccountQueue(100);
        inque.enqueue(1001, "Janet Mayer", 2000);
        inque.enqueue(3003, "Lisa Smith", 1000);
        inque.enqueue(2002, "May Bee", 1500);
        for (int i = 0; i < 4; i++) {
            AccountNode temp = inque.dequeue();
            if (temp != null) {
                System.out.println(temp.name);
            }
        }
        return;
    }
}
/*
If your program is implemented correctly, it will display:
Janet Mayer
Lisa Smith
May Bee
 */
