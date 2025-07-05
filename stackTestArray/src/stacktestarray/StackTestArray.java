package stacktestarray;

public class StackTestArray {
    public static void main(String[] args)
    {
	AccountStack instac = new AccountStack(50);

	AccountNode n1 = new AccountNode(2002, "Janet Smith", 100.99);
	AccountNode n2 = new AccountNode(1001, "Alex Bush", 99.88);
	AccountNode n3 = new AccountNode(3003, "John Rosa", 5.55);
	
	instac.push(n1);
	instac.push(n2);
	instac.push(n3);
	System.out.println(instac.pop().name);
        System.out.println(instac.pop().name);
	System.out.println(instac.pop().name);
    }
}
/* if your classes are correctly implemented, it will display:

John Rosa
Alex Bush
Janet Smith

*/
