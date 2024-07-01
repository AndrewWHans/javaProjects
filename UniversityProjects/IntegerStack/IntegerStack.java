package stacktest;

public class IntegerStack {

    private int[] myStack;
    private int size;
    private int current_index;

    public IntegerStack(int size) {
        myStack = new int[size];
        this.size = size;
        this.current_index = 0;
    } // end constructor

    // methods for stack
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

    public boolean push(int value) {
        if (isFull() == false) {
            myStack[current_index] = value;
            current_index++;
            return true;
        } else {
            return false;
        }
    }

    public Integer pop() {
        if (isEmpty() == false) {
            Integer result = new Integer(myStack[current_index - 1]);
            current_index--;
            return result;
        } else {
            return null;
        }
    }

}
