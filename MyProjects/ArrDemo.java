package arrdemo;

public class ArrDemo {

    // printArray method
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } // end print method

    public void arrayDemo() {
        int[] myArray = new int[5]; // default values
        //printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9; // updated index 2 position
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]); // will access last element

        System.out.println();
        int[] arr = {5, 1, 8, 10};
        printArray(arr);
    }

    public static void main(String[] args) {
        ArrDemo arrDemo = new ArrDemo();
        //arrDemo.arrayDemo();
        arrDemo.printArray(new int[]{5, 1, 2, 9, 10});
    }

}
