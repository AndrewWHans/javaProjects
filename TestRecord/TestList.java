package testlist;

public class TestList {

    public static void main(String[] args) {
        AccountList AL = new AccountList();
        AL.addFront(1001, "John Kelly", 999.88);
        AL.addFront(3003, "Jane Smith", 100);
        AL.addFront(2002, "James Smith", 200);
        AL.addFront(4004, "John Smith", 1300);
        System.out.println("Before operation:");
        AL.listAll();
        AL.updateBalance(1001, 2000);
        System.out.println("\n After operation:");
        AL.listAll();
    }
}
/*
if your classes are implemented correctly, you should see:
Before operation:
4004 John Smith 1300.0
2002 James Smith 200.0
3003 Jane Smith 100.0
1001 John Kelly 999.88
After operation:
4004 John Smith 1300.0
2002 James Smith 200.0
3003 Jane Smith 100.0
1001 John Kelly 2000.0
 */
