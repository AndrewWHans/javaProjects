package resizinganarray;

public class ResizingAnArray {
    
    public void printArray(int[] arr, String message) {
        System.out.println(message + ": "); // printing message
        for (int i = 0; i < arr.length; i++) { // traverse array
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity]; // create temp for new capacity
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    
    public static void main(String[] args) {
        ResizingAnArray test = new ResizingAnArray();
        int[] arr = new int[] {5, 3, 9, 6, 1};
        test.printArray(arr, "Original Array");
        System.out.println("The size of the original array: " + arr.length);
        
        int[] resizedArr = test.resize(arr, 15);
        test.printArray(resizedArr, "Resized Array");
        System.out.println("The size of the resized array: " + resizedArr.length);
    }
}