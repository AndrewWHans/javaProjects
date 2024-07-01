package testhash;

public class TestHash {

    public static void main(String[] args) {
        hashtable ht = new hashtable(100);
        ht.insert(2002, "Janet Smith", 100.99);
        ht.insert(1001, "Alex Bush", 99.88);
        ht.insert(3003, "John Rosa", 5.55);
        account n;
        n = ht.search(1001, "Alex Bush");
        if (n != null) {
            System.out.println("the balalnc of account 1001 is "
                    + n.balance);
        } else {
            System.out.println("could not find account 1001");
        }
        ht.remove(1001, "Alex Bush");
        n = ht.search(1001, "Alex Bush");
        if (n != null) {
            System.out.println("the balalnc of account 1001 is "
                    + n.balance);
        } else {
            System.out.println("could not find account 1001");
        }
    }
}
/*
// if your hashtable is corrected implemented,
// you should see the following result:
the balalnc of account 1001 is 99.88
could not find account 1001
 */
