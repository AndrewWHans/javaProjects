
package stacktest;

public class StackTest {

    public static void main(String[] args) {
        IntegerStack yag = new IntegerStack(100);
        yag.push(919);
        yag.push(666);
        yag.push(-314);
        
        for (int i = 1; i <= 4; i++) {
            System.out.println(yag.pop());
        }
        
    }
    
}
